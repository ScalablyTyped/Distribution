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

