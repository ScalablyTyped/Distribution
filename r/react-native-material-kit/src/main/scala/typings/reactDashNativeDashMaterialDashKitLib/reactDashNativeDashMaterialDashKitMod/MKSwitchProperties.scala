package typings
package reactDashNativeDashMaterialDashKitLib.reactDashNativeDashMaterialDashKitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MKSwitchProperties
  extends reactDashNativeLib.reactDashNativeMod.TouchableWithoutFeedbackProps {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var offColor: js.UndefOr[java.lang.String] = js.undefined
  var onCheckedChange: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  var onColor: js.UndefOr[java.lang.String] = js.undefined
  var rippleAniDuration: js.UndefOr[scala.Double] = js.undefined
  var rippleColor: js.UndefOr[java.lang.String] = js.undefined
  var thumbAniDuration: js.UndefOr[scala.Double] = js.undefined
  var thumbOffColor: js.UndefOr[java.lang.String] = js.undefined
  var thumbOnColor: js.UndefOr[java.lang.String] = js.undefined
  var thumbRadius: js.UndefOr[scala.Double] = js.undefined
  var trackLength: js.UndefOr[scala.Double] = js.undefined
  var trackSize: js.UndefOr[scala.Double] = js.undefined
}

object MKSwitchProperties {
  @scala.inline
  def apply(
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.AccessibilityTrait | js.Array[reactDashNativeLib.AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    offColor: java.lang.String = null,
    onAccessibilityTap: js.Function0[scala.Unit] = null,
    onCheckedChange: js.Function1[/* checked */ scala.Boolean, scala.Unit] = null,
    onColor: java.lang.String = null,
    onLayout: js.Function1[/* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent, scala.Unit] = null,
    onLongPress: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onMagicTap: js.Function0[scala.Unit] = null,
    onPress: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onPressIn: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    onPressOut: js.Function1[
      /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent, 
      scala.Unit
    ] = null,
    pressRetentionOffset: reactDashNativeLib.reactDashNativeMod.Insets = null,
    rippleAniDuration: scala.Int | scala.Double = null,
    rippleColor: java.lang.String = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    testID: java.lang.String = null,
    thumbAniDuration: scala.Int | scala.Double = null,
    thumbOffColor: java.lang.String = null,
    thumbOnColor: java.lang.String = null,
    thumbRadius: scala.Int | scala.Double = null,
    trackLength: scala.Int | scala.Double = null,
    trackSize: scala.Int | scala.Double = null
  ): MKSwitchProperties = {
    val __obj = js.Dynamic.literal()
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden)
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint)
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors)
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel)
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole)
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates)
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (offColor != null) __obj.updateDynamic("offColor")(offColor)
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(onAccessibilityTap)
    if (onCheckedChange != null) __obj.updateDynamic("onCheckedChange")(onCheckedChange)
    if (onColor != null) __obj.updateDynamic("onColor")(onColor)
    if (onLayout != null) __obj.updateDynamic("onLayout")(onLayout)
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(onLongPress)
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(onMagicTap)
    if (onPress != null) __obj.updateDynamic("onPress")(onPress)
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(onPressIn)
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(onPressOut)
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (rippleAniDuration != null) __obj.updateDynamic("rippleAniDuration")(rippleAniDuration.asInstanceOf[js.Any])
    if (rippleColor != null) __obj.updateDynamic("rippleColor")(rippleColor)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (thumbAniDuration != null) __obj.updateDynamic("thumbAniDuration")(thumbAniDuration.asInstanceOf[js.Any])
    if (thumbOffColor != null) __obj.updateDynamic("thumbOffColor")(thumbOffColor)
    if (thumbOnColor != null) __obj.updateDynamic("thumbOnColor")(thumbOnColor)
    if (thumbRadius != null) __obj.updateDynamic("thumbRadius")(thumbRadius.asInstanceOf[js.Any])
    if (trackLength != null) __obj.updateDynamic("trackLength")(trackLength.asInstanceOf[js.Any])
    if (trackSize != null) __obj.updateDynamic("trackSize")(trackSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKSwitchProperties]
  }
}

