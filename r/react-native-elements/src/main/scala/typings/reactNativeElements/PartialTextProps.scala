package typings.reactNativeElements

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityStates
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.balanced
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.clip
import typings.reactNativeElements.reactNativeElementsStrings.head
import typings.reactNativeElements.reactNativeElementsStrings.highQuality
import typings.reactNativeElements.reactNativeElementsStrings.middle
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.simple
import typings.reactNativeElements.reactNativeElementsStrings.tail
import typings.reactNativeElements.reactNativeElementsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.TextProps> */
trait PartialTextProps extends js.Object {
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  var accessibilityStates: js.UndefOr[js.Array[AccessibilityStates]] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var h1: js.UndefOr[Boolean] = js.undefined
  var h1Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var h2: js.UndefOr[Boolean] = js.undefined
  var h2Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var h3: js.UndefOr[Boolean] = js.undefined
  var h3Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var h4: js.UndefOr[Boolean] = js.undefined
  var h4Style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  var minimumFontScale: js.UndefOr[Double] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selectionColor: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  var testID: js.UndefOr[String] = js.undefined
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
}

object PartialTextProps {
  @scala.inline
  def apply(
    accessibilityActions: js.Array[AccessibilityActionInfo] = null,
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityState: AccessibilityState = null,
    accessibilityStates: js.Array[AccessibilityStates] = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessibilityValue: AccessibilityValue = null,
    accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined,
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    ellipsizeMode: head | middle | tail | clip = null,
    h1: js.UndefOr[Boolean] = js.undefined,
    h1Style: StyleProp[TextStyle] = null,
    h2: js.UndefOr[Boolean] = js.undefined,
    h2Style: StyleProp[TextStyle] = null,
    h3: js.UndefOr[Boolean] = js.undefined,
    h3Style: StyleProp[TextStyle] = null,
    h4: js.UndefOr[Boolean] = js.undefined,
    h4Style: StyleProp[TextStyle] = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    lineBreakMode: head | middle | tail | clip = null,
    maxFontSizeMultiplier: Int | Double = null,
    minimumFontScale: Int | Double = null,
    nativeID: String = null,
    numberOfLines: Int | Double = null,
    onAccessibilityAction: /* event */ AccessibilityActionEvent => Unit = null,
    onAccessibilityEscape: () => Unit = null,
    onAccessibilityTap: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    style: StyleProp[TextStyle] = null,
    suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    textBreakStrategy: simple | highQuality | balanced = null
  ): PartialTextProps = {
    val __obj = js.Dynamic.literal()
    if (accessibilityActions != null) __obj.updateDynamic("accessibilityActions")(accessibilityActions.asInstanceOf[js.Any])
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityState != null) __obj.updateDynamic("accessibilityState")(accessibilityState.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (accessibilityValue != null) __obj.updateDynamic("accessibilityValue")(accessibilityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityViewIsModal)) __obj.updateDynamic("accessibilityViewIsModal")(accessibilityViewIsModal.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(h1)) __obj.updateDynamic("h1")(h1.asInstanceOf[js.Any])
    if (h1Style != null) __obj.updateDynamic("h1Style")(h1Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h2)) __obj.updateDynamic("h2")(h2.asInstanceOf[js.Any])
    if (h2Style != null) __obj.updateDynamic("h2Style")(h2Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h3)) __obj.updateDynamic("h3")(h3.asInstanceOf[js.Any])
    if (h3Style != null) __obj.updateDynamic("h3Style")(h3Style.asInstanceOf[js.Any])
    if (!js.isUndefined(h4)) __obj.updateDynamic("h4")(h4.asInstanceOf[js.Any])
    if (h4Style != null) __obj.updateDynamic("h4Style")(h4Style.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (maxFontSizeMultiplier != null) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.asInstanceOf[js.Any])
    if (minimumFontScale != null) __obj.updateDynamic("minimumFontScale")(minimumFontScale.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (numberOfLines != null) __obj.updateDynamic("numberOfLines")(numberOfLines.asInstanceOf[js.Any])
    if (onAccessibilityAction != null) __obj.updateDynamic("onAccessibilityAction")(js.Any.fromFunction1(onAccessibilityAction))
    if (onAccessibilityEscape != null) __obj.updateDynamic("onAccessibilityEscape")(js.Any.fromFunction0(onAccessibilityEscape))
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialTextProps]
  }
}

