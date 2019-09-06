package typings.reactDashNativeDashElements.reactDashNativeDashElementsMod

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.reactDashNative.reactDashNativeMod.ImageSourcePropType
import typings.reactDashNative.reactDashNativeMod.ImageStyle
import typings.reactDashNative.reactDashNativeMod.StatusBarStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.center
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.left
import typings.reactDashNativeDashElements.reactDashNativeDashElementsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait HeaderProps extends js.Object {
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[ComponentClass[_, ComponentState]] = js.undefined
  /**
    * Sets backgroundColor of the parent component
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /**
    * Background image source
    */
  var backgroundImage: js.UndefOr[ImageSourcePropType] = js.undefined
  /**
    * Styles for the background image in the container
    */
  var backgroundImageStyle: js.UndefOr[ImageStyle] = js.undefined
  /**
    * Sets the color of the status bar text.
    *
    * @default 'default'
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.undefined
  /**
    * Configuration object for default component (text: string, ...props for React Native Text component) valid React Element	define your center component here
    */
  var centerComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styles for the container surrounding the title
    */
  var centerContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Styling for main container
    */
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon) or a valid React Element	define your left component here
    */
  var leftComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for container around the leftComponent
    */
  var leftContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Determines the alignment of the title
    *
    * @default 'center'
    */
  var placement: js.UndefOr[left | center | right] = js.undefined
  /**
    * Configuration object for default component (icon: string, ...props for React Native Elements Icon component) or a valid React Element	define your right component here
    */
  var rightComponent: js.UndefOr[HeaderSubComponent] = js.undefined
  /**
    * Styling for container around the rightComponent
    */
  var rightContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  /**
    * Accepts all props for StatusBar
    */
  var statusBarProps: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StatusBarProperties */ js.Any
  ] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    ViewComponent: ComponentClass[_, ComponentState] = null,
    backgroundColor: String = null,
    backgroundImage: ImageSourcePropType = null,
    backgroundImageStyle: ImageStyle = null,
    barStyle: StatusBarStyle = null,
    centerComponent: HeaderSubComponent = null,
    centerContainerStyle: StyleProp[ViewStyle] = null,
    containerStyle: StyleProp[ViewStyle] = null,
    leftComponent: HeaderSubComponent = null,
    leftContainerStyle: StyleProp[ViewStyle] = null,
    linearGradientProps: js.Object = null,
    placement: left | center | right = null,
    rightComponent: HeaderSubComponent = null,
    rightContainerStyle: StyleProp[ViewStyle] = null,
    statusBarProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify StatusBarProperties */ js.Any = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal()
    if (ViewComponent != null) __obj.updateDynamic("ViewComponent")(ViewComponent)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (backgroundImageStyle != null) __obj.updateDynamic("backgroundImageStyle")(backgroundImageStyle)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle)
    if (centerComponent != null) __obj.updateDynamic("centerComponent")(centerComponent.asInstanceOf[js.Any])
    if (centerContainerStyle != null) __obj.updateDynamic("centerContainerStyle")(centerContainerStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (leftComponent != null) __obj.updateDynamic("leftComponent")(leftComponent.asInstanceOf[js.Any])
    if (leftContainerStyle != null) __obj.updateDynamic("leftContainerStyle")(leftContainerStyle.asInstanceOf[js.Any])
    if (linearGradientProps != null) __obj.updateDynamic("linearGradientProps")(linearGradientProps)
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (rightComponent != null) __obj.updateDynamic("rightComponent")(rightComponent.asInstanceOf[js.Any])
    if (rightContainerStyle != null) __obj.updateDynamic("rightContainerStyle")(rightContainerStyle.asInstanceOf[js.Any])
    if (statusBarProps != null) __obj.updateDynamic("statusBarProps")(statusBarProps)
    __obj.asInstanceOf[HeaderProps]
  }
}

