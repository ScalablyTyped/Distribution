package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps
  extends reactDashNativeLib.reactDashNativeMod.ViewProps {
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for inner container
    */
  var innerContainerStyles: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for outer container
    */
  var outerContainerStyles: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: js.UndefOr[reactDashNativeLib.reactDashNativeMod.StatusBarProperties] = js.undefined
}

