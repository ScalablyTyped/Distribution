package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NativeEventTarget extends js.Object {
  def off(name: java.lang.String, cb: js.Function1[/* e */ js.Any, _]): scala.Unit
  def on(name: java.lang.String, cb: js.Function1[/* e */ js.Any, _]): scala.Unit
}

