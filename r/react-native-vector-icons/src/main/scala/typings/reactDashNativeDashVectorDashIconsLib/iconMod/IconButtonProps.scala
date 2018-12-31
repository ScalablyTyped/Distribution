package typings
package reactDashNativeDashVectorDashIconsLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashNativeLib.reactDashNativeMod.TouchableNativeFeedbackProps because Would inherit conflicting mutable fields List(accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessible, importantForAccessibility, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID), reactDashNativeLib.reactDashNativeMod.TouchableHighlightProps because Would inherit conflicting mutable fields List(accessibilityComponentType, accessibilityElementsHidden, accessibilityHint, accessibilityIgnoresInvertColors, accessibilityLabel, accessibilityLiveRegion, accessibilityRole, accessibilityStates, accessibilityTraits, accessible, importantForAccessibility, onAccessibilityTap, onLayout, onLongPress, onMagicTap, onPress, style, testID))*/
trait IconButtonProps extends IconProps {
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
    * Style prop inherited from TextProps and TouchableWithoutFeedbackProperties
    * Only exist here so we can have ViewStyle or TextStyle
    *
    */
  @JSName("style")
  var style_IconButtonProps: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle
  ] = js.undefined
}

