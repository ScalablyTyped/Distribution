package typings.reactNative.mod

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "StatusBar")
@js.native
class StatusBar protected ()
  extends Component[StatusBarProps, js.Object, js.Any] {
  def this(props: StatusBarProps) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: StatusBarProps, context: js.Any) = this()
}
/* static members */
object StatusBar {
  
  @JSImport("react-native", "StatusBar")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The current height of the status bar on the device.
    * @platform android
    */
  @JSImport("react-native", "StatusBar.currentHeight")
  @js.native
  def currentHeight: js.UndefOr[Double] = js.native
  @scala.inline
  def currentHeight_=(x: js.UndefOr[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentHeight")(x.asInstanceOf[js.Any])
  
  /**
    * Pop a StatusBar entry from the stack.
    *
    * @param entry Entry returned from `pushStackEntry`.
    */
  @JSImport("react-native", "StatusBar.popStackEntry")
  @js.native
  def popStackEntry(entry: StatusBarProps): Unit = js.native
  
  /**
    * Push a StatusBar entry onto the stack.
    * The return value should be passed to `popStackEntry` when complete.
    *
    * @param props Object containing the StatusBar props to use in the stack entry.
    */
  @JSImport("react-native", "StatusBar.pushStackEntry")
  @js.native
  def pushStackEntry(props: StatusBarProps): StatusBarProps = js.native
  
  /**
    * Replace an existing StatusBar stack entry with new props.
    *
    * @param entry Entry returned from `pushStackEntry` to replace.
    * @param props Object containing the StatusBar props to use in the replacement stack entry.
    */
  @JSImport("react-native", "StatusBar.replaceStackEntry")
  @js.native
  def replaceStackEntry(entry: StatusBarProps, props: StatusBarProps): StatusBarProps = js.native
  
  /**
    * Set the background color for the status bar
    * @param color Background color.
    * @param animated Animate the style change.
    */
  @JSImport("react-native", "StatusBar.setBackgroundColor")
  @js.native
  def setBackgroundColor(color: ColorValue): Unit = js.native
  @JSImport("react-native", "StatusBar.setBackgroundColor")
  @js.native
  def setBackgroundColor(color: ColorValue, animated: Boolean): Unit = js.native
  
  /**
    * Set the status bar style
    * @param style Status bar style to set
    * @param animated Animate the style change.
    */
  @JSImport("react-native", "StatusBar.setBarStyle")
  @js.native
  def setBarStyle(style: StatusBarStyle): Unit = js.native
  @JSImport("react-native", "StatusBar.setBarStyle")
  @js.native
  def setBarStyle(style: StatusBarStyle, animated: Boolean): Unit = js.native
  
  /**
    * Show or hide the status bar
    * @param hidden The dialog's title.
    * @param animation Optional animation when
    *    changing the status bar hidden property.
    */
  @JSImport("react-native", "StatusBar.setHidden")
  @js.native
  def setHidden(hidden: Boolean): Unit = js.native
  @JSImport("react-native", "StatusBar.setHidden")
  @js.native
  def setHidden(hidden: Boolean, animation: StatusBarAnimation): Unit = js.native
  
  /**
    * Control the visibility of the network activity indicator
    * @param visible Show the indicator.
    */
  @JSImport("react-native", "StatusBar.setNetworkActivityIndicatorVisible")
  @js.native
  def setNetworkActivityIndicatorVisible(visible: Boolean): Unit = js.native
  
  /**
    * Control the translucency of the status bar
    * @param translucent Set as translucent.
    */
  @JSImport("react-native", "StatusBar.setTranslucent")
  @js.native
  def setTranslucent(translucent: Boolean): Unit = js.native
}
