package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackAndroidStatic extends js.Object {
  def addEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): scala.Unit
  def exitApp(): scala.Unit
  def removeEventListener(eventName: BackPressEventName, handler: js.Function0[scala.Unit]): scala.Unit
}

object BackAndroidStatic {
  @scala.inline
  def apply(
    addEventListener: js.Function2[BackPressEventName, js.Function0[scala.Unit], scala.Unit],
    exitApp: js.Function0[scala.Unit],
    removeEventListener: js.Function2[BackPressEventName, js.Function0[scala.Unit], scala.Unit]
  ): BackAndroidStatic = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener, exitApp = exitApp, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[BackAndroidStatic]
  }
}

