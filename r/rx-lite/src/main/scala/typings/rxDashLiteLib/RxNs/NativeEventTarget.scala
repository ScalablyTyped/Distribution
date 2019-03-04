package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventTarget extends js.Object {
  def off(name: java.lang.String, cb: js.Function1[/* e */ js.Any, _]): scala.Unit
  def on(name: java.lang.String, cb: js.Function1[/* e */ js.Any, _]): scala.Unit
}

object NativeEventTarget {
  @scala.inline
  def apply(
    off: js.Function2[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Unit],
    on: js.Function2[java.lang.String, js.Function1[/* e */ js.Any, _], scala.Unit]
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal(off = off, on = on)
  
    __obj.asInstanceOf[NativeEventTarget]
  }
}

