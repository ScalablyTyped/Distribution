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
  var background: js.UndefOr[reactDashNativeLib.reactDashNativeMod.BackgroundPropType] = js.undefined
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

object IconButtonProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    accessibilityComponentType: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.button | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_checked | reactDashNativeLib.reactDashNativeLibStrings.radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityHint: java.lang.String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[scala.Boolean] = js.undefined,
    accessibilityLabel: java.lang.String = null,
    accessibilityLiveRegion: reactDashNativeLib.reactDashNativeLibStrings.none | reactDashNativeLib.reactDashNativeLibStrings.polite | reactDashNativeLib.reactDashNativeLibStrings.assertive = null,
    accessibilityRole: reactDashNativeLib.reactDashNativeMod.AccessibilityRole = null,
    accessibilityStates: js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityState] = null,
    accessibilityTraits: reactDashNativeLib.reactDashNativeMod.AccessibilityTrait | js.Array[reactDashNativeLib.reactDashNativeMod.AccessibilityTrait] = null,
    accessible: js.UndefOr[scala.Boolean] = js.undefined,
    activeOpacity: scala.Int | scala.Double = null,
    adjustsFontSizeToFit: js.UndefOr[scala.Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    background: reactDashNativeLib.reactDashNativeMod.BackgroundPropType = null,
    backgroundColor: java.lang.String = null,
    borderRadius: scala.Int | scala.Double = null,
    color: java.lang.String = null,
    delayLongPress: scala.Int | scala.Double = null,
    delayPressIn: scala.Int | scala.Double = null,
    delayPressOut: scala.Int | scala.Double = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    ellipsizeMode: reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip = null,
    hasTVPreferredFocus: js.UndefOr[scala.Boolean] = js.undefined,
    hitSlop: reactDashNativeLib.reactDashNativeMod.Insets = null,
    iconStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    lineBreakMode: reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip = null,
    maxFontSizeMultiplier: scala.Int | scala.Double = null,
    minimumFontScale: scala.Int | scala.Double = null,
    nativeID: java.lang.String = null,
    numberOfLines: scala.Int | scala.Double = null,
    onAccessibilityTap: () => scala.Unit = null,
    onBlur: /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TargetedEvent] => scala.Unit = null,
    onFocus: /* e */ reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TargetedEvent] => scala.Unit = null,
    onHideUnderlay: () => scala.Unit = null,
    onLayout: /* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent => scala.Unit = null,
    onLongPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onPressIn: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onPressOut: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onShowUnderlay: () => scala.Unit = null,
    pressRetentionOffset: reactDashNativeLib.reactDashNativeMod.Insets = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionColor: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.ViewStyle | reactDashNativeLib.reactDashNativeMod.TextStyle = null,
    suppressHighlighting: js.UndefOr[scala.Boolean] = js.undefined,
    testID: java.lang.String = null,
    textBreakStrategy: reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced = null,
    tvParallaxProperties: reactDashNativeLib.reactDashNativeMod.TVParallaxProperties = null,
    underlayColor: java.lang.String = null,
    useForeground: js.UndefOr[scala.Boolean] = js.undefined
  ): IconButtonProps = {
    val __obj = js.Dynamic.literal(name = name)
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
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (background != null) __obj.updateDynamic("background")(background)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    if (delayLongPress != null) __obj.updateDynamic("delayLongPress")(delayLongPress.asInstanceOf[js.Any])
    if (delayPressIn != null) __obj.updateDynamic("delayPressIn")(delayPressIn.asInstanceOf[js.Any])
    if (delayPressOut != null) __obj.updateDynamic("delayPressOut")(delayPressOut.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTVPreferredFocus)) __obj.updateDynamic("hasTVPreferredFocus")(hasTVPreferredFocus)
    if (hitSlop != null) __obj.updateDynamic("hitSlop")(hitSlop)
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle)
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onHideUnderlay != null) __obj.updateDynamic("onHideUnderlay")(js.Any.fromFunction0(onHideUnderlay))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction1(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction1(onPressOut))
    if (onShowUnderlay != null) __obj.updateDynamic("onShowUnderlay")(js.Any.fromFunction0(onShowUnderlay))
    if (pressRetentionOffset != null) __obj.updateDynamic("pressRetentionOffset")(pressRetentionOffset)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    if (tvParallaxProperties != null) __obj.updateDynamic("tvParallaxProperties")(tvParallaxProperties)
    if (underlayColor != null) __obj.updateDynamic("underlayColor")(underlayColor)
    if (!js.isUndefined(useForeground)) __obj.updateDynamic("useForeground")(useForeground)
    __obj.asInstanceOf[IconButtonProps]
  }
}

