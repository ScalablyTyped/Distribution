package typings.reactNativeSensorManager.mod

import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.StatusBarAnimation
import typings.reactNative.mod.StatusBarProps
import typings.reactNative.mod.StatusBarStyle
import typings.reactNativeSensorManager.anon.ReadonlyStatusBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-sensor-manager", "StatusBar")
@js.native
open class StatusBar protected ()
  extends typings.reactNative.mod.StatusBar {
  def this(props: StatusBarProps) = this()
  def this(props: ReadonlyStatusBarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StatusBarProps, context: Any) = this()
}
/* static members */
object StatusBar {
  
  @JSImport("react-native-sensor-manager", "StatusBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The current height of the status bar on the device.
    * @platform android
    */
  @JSImport("react-native-sensor-manager", "StatusBar.currentHeight")
  @js.native
  def currentHeight: js.UndefOr[Double] = js.native
  inline def currentHeight_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentHeight")(x.asInstanceOf[js.Any])
  
  /**
    * Pop a StatusBar entry from the stack.
    *
    * @param entry Entry returned from `pushStackEntry`.
    */
  inline def popStackEntry(entry: StatusBarProps): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("popStackEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Push a StatusBar entry onto the stack.
    * The return value should be passed to `popStackEntry` when complete.
    *
    * @param props Object containing the StatusBar props to use in the stack entry.
    */
  inline def pushStackEntry(props: StatusBarProps): StatusBarProps = ^.asInstanceOf[js.Dynamic].applyDynamic("pushStackEntry")(props.asInstanceOf[js.Any]).asInstanceOf[StatusBarProps]
  
  /**
    * Replace an existing StatusBar stack entry with new props.
    *
    * @param entry Entry returned from `pushStackEntry` to replace.
    * @param props Object containing the StatusBar props to use in the replacement stack entry.
    */
  inline def replaceStackEntry(entry: StatusBarProps, props: StatusBarProps): StatusBarProps = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceStackEntry")(entry.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[StatusBarProps]
  
  /**
    * Set the background color for the status bar
    * @param color Background color.
    * @param animated Animate the style change.
    */
  inline def setBackgroundColor(color: ColorValue): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundColor")(color.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBackgroundColor(color: ColorValue, animated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBackgroundColor")(color.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Set the status bar style
    * @param style Status bar style to set
    * @param animated Animate the style change.
    */
  inline def setBarStyle(style: StatusBarStyle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBarStyle")(style.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setBarStyle(style: StatusBarStyle, animated: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBarStyle")(style.asInstanceOf[js.Any], animated.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Show or hide the status bar
    * @param hidden The dialog's title.
    * @param animation Optional animation when
    *    changing the status bar hidden property.
    */
  inline def setHidden(hidden: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHidden")(hidden.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setHidden(hidden: Boolean, animation: StatusBarAnimation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setHidden")(hidden.asInstanceOf[js.Any], animation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Control the visibility of the network activity indicator
    * @param visible Show the indicator.
    */
  inline def setNetworkActivityIndicatorVisible(visible: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setNetworkActivityIndicatorVisible")(visible.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Control the translucency of the status bar
    * @param translucent Set as translucent.
    */
  inline def setTranslucent(translucent: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTranslucent")(translucent.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
