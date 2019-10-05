package typings.rxDashLite.Rx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeEventTarget extends js.Object {
  def off(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
  def on(name: String, cb: js.Function1[/* e */ js.Any, _]): Unit
}

object NativeEventTarget {
  @scala.inline
  def apply(
    off: (String, js.Function1[/* e */ js.Any, _]) => Unit,
    on: (String, js.Function1[/* e */ js.Any, _]) => Unit
  ): NativeEventTarget = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[NativeEventTarget]
  }
}

