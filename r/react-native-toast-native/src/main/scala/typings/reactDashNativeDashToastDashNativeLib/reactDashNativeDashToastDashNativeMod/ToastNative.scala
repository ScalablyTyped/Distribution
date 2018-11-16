package typings
package reactDashNativeDashToastDashNativeLib.reactDashNativeDashToastDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastNative extends js.Object {
  var BOTTOM: js.Any = js.native
  var CENTER: js.Any = js.native
  var LONG: js.Any = js.native
  // Toast duration constants
  var SHORT: js.Any = js.native
  // Toast gravity constants
  var TOP: js.Any = js.native
  def show(): scala.Unit = js.native
  def show(message: java.lang.String): scala.Unit = js.native
  def show(message: java.lang.String, duration: js.Any, position: js.Any, styles: Style): scala.Unit = js.native
}

