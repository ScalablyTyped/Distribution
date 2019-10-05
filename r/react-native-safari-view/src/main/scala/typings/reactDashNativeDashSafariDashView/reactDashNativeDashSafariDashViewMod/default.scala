package typings.reactDashNativeDashSafariDashView.reactDashNativeDashSafariDashViewMod

import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-safari-view", JSImport.Default)
@js.native
object default extends js.Object {
  def addEventListener(event: String, listener: js.Function0[Unit]): EmitterSubscription = js.native
  /**
    * Dismisses the currently active Safari View
    */
  def dismiss(): Unit = js.native
  /**
    * Checks if Safari View is available on the device
    */
  def isAvailable(): js.Promise[Boolean] = js.native
  def removeEventListener(event: String, listener: js.Function0[Unit]): Unit = js.native
  /**
    * Displays a Safari View with the provided URL
    *
    */
  def show(options: SafariViewOptions): js.Promise[Boolean] = js.native
}

