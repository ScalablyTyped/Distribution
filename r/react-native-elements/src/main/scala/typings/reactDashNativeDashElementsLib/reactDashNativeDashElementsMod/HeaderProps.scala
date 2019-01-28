package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait HeaderProps extends js.Object {
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Background image source
    */
  var backgroundImage: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageURISource] = js.undefined
  /**
    * Styles for the background image in the container
    */
  var backgroundImageStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ImageStyle] = js.undefined
  /**
    * Sets the color of the status bar text.
    *
    * @default 'default'
    */
  var barStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.StatusBarStyle] = js.undefined
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styles for the container surrounding the title
    */
  var centerContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Styling for main container
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for container around the leftComponent
    */
  var leftContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Determines the alignment of the title
    *
    * @default 'center'
    */
  var placement: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.left | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.center | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.right
  ] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for container around the rightComponent
    */
  var rightContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StatusBarProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StatusBarProperties */ js.Any
  ] = js.undefined
}

