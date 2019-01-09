package typings
package reactDashNativeDashVectorDashIconsLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedbackProps because var conflicts: accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessible, importantForAccessibility, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined background, useForeground- reactDashNativeLib.reactDashNativeMod.TouchableHighlightProps because var conflicts: accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessible, importantForAccessibility, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID. Inlined activeOpacity, onHideUnderlay, onShowUnderlay, underlayColor */ trait IconButtonProps extends IconProps {
  /**
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[scala.Double] = js.undefined
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
    * Background color of the button
    *
    * @default '#007AFF'
    */
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Border radius of the button
    * Set to 0 to disable.
    *
    * @default 5
    */
  var borderRadius: js.UndefOr[scala.Double] = js.undefined
  /**
    * Styles applied to the icon only
    * Good for setting margins or a different color.
    *
    * @default {marginRight: 10}
    */
  var iconStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
    * Only exist here so we can have ViewStyle or TextStyle
    *
    */
  @JSName("style")
  var style_IconButtonProps: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle
  ] = js.undefined
  /**
    * The color of the underlay that will show through when the touch is active.
    */
  var underlayColor: js.UndefOr[java.lang.String] = js.undefined
  var useForeground: js.UndefOr[scala.Boolean] = js.undefined
}

