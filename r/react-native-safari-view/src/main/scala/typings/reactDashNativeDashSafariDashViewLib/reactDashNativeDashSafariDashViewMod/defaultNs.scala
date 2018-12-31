package typings
package reactDashNativeDashSafariDashViewLib.reactDashNativeDashSafariDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safari-view", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def addEventListener(event: java.lang.String, listener: js.Function0[scala.Unit]): reactDashNativeLib.reactDashNativeMod.EmitterSubscription = js.native
  /**
    * Dismisses the currently active Safari View
    */
  def dismiss(): scala.Unit = js.native
  /**
    * Checks if Safari View is available on the device
    */
  def isAvailable(): js.Promise[scala.Boolean] = js.native
  def removeEventListener(event: java.lang.String, listener: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Displays a Safari View with the provided URL
    *
    */
  def show(
    options: reactDashNativeDashSafariDashViewLib.reactDashNativeDashSafariDashViewMod.SafariViewOptions
  ): js.Promise[scala.Boolean] = js.native
}

