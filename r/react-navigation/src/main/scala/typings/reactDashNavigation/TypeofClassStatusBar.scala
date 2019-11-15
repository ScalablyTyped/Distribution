package typings.reactDashNavigation

import org.scalablytyped.runtime.Instantiable0
import typings.reactDashNative.reactDashNativeMod.StatusBar
import typings.reactDashNative.reactDashNativeMod.StatusBarAnimation
import typings.reactDashNative.reactDashNativeMod.StatusBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassStatusBar extends Instantiable0[StatusBar] {
  /**
    * The current height of the status bar on the device.
    * @platform android
    */
  var currentHeight: js.UndefOr[Double] = js.native
  /**
    * Set the background color for the status bar
    * @param color Background color.
    * @param animated Animate the style change.
    */
  def setBackgroundColor(color: String): Unit = js.native
  def setBackgroundColor(color: String, animated: Boolean): Unit = js.native
  /**
    * Set the status bar style
    * @param style Status bar style to set
    * @param animated Animate the style change.
    */
  def setBarStyle(style: StatusBarStyle): Unit = js.native
  def setBarStyle(style: StatusBarStyle, animated: Boolean): Unit = js.native
  /**
    * Show or hide the status bar
    * @param hidden The dialog's title.
    * @param animation Optional animation when
    *    changing the status bar hidden property.
    */
  def setHidden(hidden: Boolean): Unit = js.native
  def setHidden(hidden: Boolean, animation: StatusBarAnimation): Unit = js.native
  /**
    * Control the visibility of the network activity indicator
    * @param visible Show the indicator.
    */
  def setNetworkActivityIndicatorVisible(visible: Boolean): Unit = js.native
  /**
    * Control the translucency of the status bar
    * @param translucent Set as translucent.
    */
  def setTranslucent(translucent: Boolean): Unit = js.native
}

