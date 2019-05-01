package typings
package reactDashNativeDashVectorDashIconsLib.iconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps
  extends reactDashNativeLib.reactDashNativeMod.TextProps {
  /**
    * Color of the icon
    *
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of the icon to show
    *
    * See Icon Explorer app
    * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
    */
  var name: java.lang.String
  /**
    * Size of the icon, can also be passed as fontSize in the style object.
    *
    * @default 12
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object IconProps {
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
    adjustsFontSizeToFit: js.UndefOr[scala.Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    ellipsizeMode: reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip = null,
    importantForAccessibility: reactDashNativeLib.reactDashNativeLibStrings.auto | reactDashNativeLib.reactDashNativeLibStrings.yes | reactDashNativeLib.reactDashNativeLibStrings.no | reactDashNativeLib.reactDashNativeLibStrings.`no-hide-descendants` = null,
    lineBreakMode: reactDashNativeLib.reactDashNativeLibStrings.head | reactDashNativeLib.reactDashNativeLibStrings.middle | reactDashNativeLib.reactDashNativeLibStrings.tail | reactDashNativeLib.reactDashNativeLibStrings.clip = null,
    maxFontSizeMultiplier: scala.Int | scala.Double = null,
    minimumFontScale: scala.Int | scala.Double = null,
    nativeID: java.lang.String = null,
    numberOfLines: scala.Int | scala.Double = null,
    onAccessibilityTap: () => scala.Unit = null,
    onLayout: /* event */ reactDashNativeLib.reactDashNativeMod.LayoutChangeEvent => scala.Unit = null,
    onLongPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    onMagicTap: () => scala.Unit = null,
    onPress: /* event */ reactDashNativeLib.reactDashNativeMod.GestureResponderEvent => scala.Unit = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selectionColor: java.lang.String = null,
    size: scala.Int | scala.Double = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.TextStyle] = null,
    suppressHighlighting: js.UndefOr[scala.Boolean] = js.undefined,
    testID: java.lang.String = null,
    textBreakStrategy: reactDashNativeLib.reactDashNativeLibStrings.simple | reactDashNativeLib.reactDashNativeLibStrings.highQuality | reactDashNativeLib.reactDashNativeLibStrings.balanced = null
  ): IconProps = {
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
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling)
    if (color != null) __obj.updateDynamic("color")(color)
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID)
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting)
    if (testID != null) __obj.updateDynamic("testID")(testID)
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
}

