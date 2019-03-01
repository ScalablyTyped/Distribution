package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackHandlerStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): NativeEventSubscription
  def exitApp(): scala.Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): scala.Unit
}

object BackHandlerStatic {
  @scala.inline
  def apply(
    addEventListener: js.Function2[BackPressEventName, js.Function0[scala.Unit], NativeEventSubscription],
    exitApp: js.Function0[scala.Unit],
    removeEventListener: js.Function2[BackPressEventName, js.Function0[scala.Unit], scala.Unit]
  ): BackHandlerStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("exitApp")(exitApp)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[BackHandlerStatic]
  }
}

