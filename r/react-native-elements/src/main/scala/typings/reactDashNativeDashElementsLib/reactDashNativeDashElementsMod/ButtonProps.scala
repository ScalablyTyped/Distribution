package typings
package reactDashNativeDashElementsLib.reactDashNativeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedbackProps because var conflicts: accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessible, delayLongPress, delayPressIn, delayPressOut, disabled, hitSlop, importantForAccessibility, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, onPressIn, onPressOut, pressRetentionOffset, style, testID. Inlined background, useForeground */ trait ButtonProps
  extends reactDashNativeLib.reactDashNativeMod.TouchableOpacityProps {
  /**
    * Specify other touchable such as TouchableOpacity/TouchableNativeFeedback
    *
    * Default is TouchableOpacity on IOS and TouchableNativeFeedback on Android
    */
  var TouchableComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[js.Object, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Specify a different component as the background for the button.
    * Useful for if you want to make a button with a gradient background.
    *
    * @default View
    */
  var ViewComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentClass[_, reactLib.reactMod.ReactNs.ComponentState]
  ] = js.undefined
  /**
    * Determines the type of background drawable that's going to be used to display feedback.
    * It takes an object with type property and extra data depending on the type.
    * It's recommended to use one of the following static methods to generate that dictionary:
    *      1) TouchableNativeFeedback.SelectableBackground() - will create object that represents android theme's
    *         default background for selectable elements (?android:attr/selectableItemBackground)
    *      2) TouchableNativeFeedback.SelectableBackgroundBorderless() - will create object that represent android
    *         theme's default background for borderless selectable elements
    *         (?android:attr/selectableItemBackgroundBorderless). Available on android API level 21+
    *      3) TouchableNativeFeedback.Ripple(color, borderless) - will create object that represents ripple drawable
    *         with specified color (as a string). If property borderless evaluates to true the ripple will render
    *         outside of the view bounds (see native actionbar buttons as an example of that behavior). This background
    *         type is available on Android API level 21+
    */
  var background: js.UndefOr[reactDashNativeLib.BackgroundPropType] = js.undefined
  /**
    * Additional styling for button (background) view component
    *
    * @default null
    */
  var buttonStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Styling for Component container
    *
    * @default null
    */
  var containerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Style of the button when disabled
    */
  var disabledStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * Style of the title when the button is disabled
    */
  var disabledTitleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Icon to show in the button
    */
  var icon: js.UndefOr[IconNode] = js.undefined
  /**
    * Style for the container around the icon
    */
  var iconContainerStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * If to show the icon on the right
    *
    * @default false
    */
  var iconRight: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Object of props to be applied to the linearGradient view(ViewComponent)
    */
  var linearGradientProps: js.UndefOr[js.Object] = js.undefined
  /**
    * Display a loading spinner
    *
    * @default false
    */
  var loading: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Additional props to applied to the ActivityIndicator
    */
  var loadingProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ActivityIndicatorProperties */ js.Any
  ] = js.undefined
  /**
    * Additional style to applied to the ActivityIndicator
    */
  var loadingStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  /**
    * If the button has raised styling
    *
    * @default false
    */
  var raised: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Button title
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Optional props for the title inside the button
    */
  var titleProps: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify TextProperties */ js.Any
  ] = js.undefined
  /**
    * Title styling
    */
  var titleStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle]
  ] = js.undefined
  /**
    * Type of button
    *
    * @default solid
    */
  var `type`: js.UndefOr[
    reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.solid | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.clear | reactDashNativeDashElementsLib.reactDashNativeDashElementsLibStrings.outline
  ] = js.undefined
  var useForeground: js.UndefOr[scala.Boolean] = js.undefined
}

