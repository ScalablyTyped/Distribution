package typings.storybookReactNative.anon

import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.storybookReactNative.storybookReactNativeStrings.`no-hide-descendants`
import typings.storybookReactNative.storybookReactNativeStrings.assertive
import typings.storybookReactNative.storybookReactNativeStrings.auto
import typings.storybookReactNative.storybookReactNativeStrings.balanced
import typings.storybookReactNative.storybookReactNativeStrings.button
import typings.storybookReactNative.storybookReactNativeStrings.clip
import typings.storybookReactNative.storybookReactNativeStrings.head
import typings.storybookReactNative.storybookReactNativeStrings.highQuality
import typings.storybookReactNative.storybookReactNativeStrings.middle
import typings.storybookReactNative.storybookReactNativeStrings.no
import typings.storybookReactNative.storybookReactNativeStrings.none
import typings.storybookReactNative.storybookReactNativeStrings.polite
import typings.storybookReactNative.storybookReactNativeStrings.radiobutton_checked
import typings.storybookReactNative.storybookReactNativeStrings.radiobutton_unchecked
import typings.storybookReactNative.storybookReactNativeStrings.simple
import typings.storybookReactNative.storybookReactNativeStrings.tail
import typings.storybookReactNative.storybookReactNativeStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-native.react-native.TextProps & react.react.RefAttributes<react-native.react-native.Text>, 'style' | 'allowFontScaling' | 'ellipsizeMode' | 'lineBreakMode' | 'numberOfLines' | 'onLayout' | 'onPress' | 'onLongPress' | 'testID' | 'nativeID' | 'maxFontSizeMultiplier' | 'adjustsFontSizeToFit' | 'minimumFontScale' | 'suppressHighlighting' | 'selectable' | 'selectionColor' | 'textBreakStrategy' | 'accessible' | 'accessibilityLabel' | 'accessibilityRole' | 'accessibilityStates' | 'accessibilityHint' | 'accessibilityComponentType' | 'accessibilityLiveRegion' | 'importantForAccessibility' | 'accessibilityElementsHidden' | 'accessibilityTraits' | 'onAccessibilityTap' | 'onMagicTap' | 'accessibilityIgnoresInvertColors'> */
trait PickTextPropsRefAttribute extends js.Object {
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  var accessibilityHint: js.UndefOr[String] = js.undefined
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  var accessibilityStates: js.UndefOr[js.Any] = js.undefined
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  var accessible: js.UndefOr[Boolean] = js.undefined
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  var maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined
  var minimumFontScale: js.UndefOr[Double] = js.undefined
  var nativeID: js.UndefOr[String] = js.undefined
  var numberOfLines: js.UndefOr[Double] = js.undefined
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

object PickTextPropsRefAttribute {
  @scala.inline
  def apply(
    accessibilityComponentType: none | button | radiobutton_checked | radiobutton_unchecked = null,
    accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined,
    accessibilityHint: String = null,
    accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined,
    accessibilityLabel: String = null,
    accessibilityLiveRegion: none | polite | assertive = null,
    accessibilityRole: AccessibilityRole = null,
    accessibilityStates: js.Any = null,
    accessibilityTraits: AccessibilityTrait | js.Array[AccessibilityTrait] = null,
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    ellipsizeMode: head | middle | tail | clip = null,
    importantForAccessibility: auto | yes | no | `no-hide-descendants` = null,
    lineBreakMode: head | middle | tail | clip = null,
    maxFontSizeMultiplier: js.UndefOr[Double] = js.undefined,
    minimumFontScale: js.UndefOr[Double] = js.undefined,
    nativeID: String = null,
    numberOfLines: js.UndefOr[Double] = js.undefined,
    onAccessibilityTap: () => Unit = null,
    onLayout: /* event */ LayoutChangeEvent => Unit = null,
    onLongPress: /* event */ GestureResponderEvent => Unit = null,
    onMagicTap: () => Unit = null,
    onPress: /* event */ GestureResponderEvent => Unit = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selectionColor: String = null,
    style: js.UndefOr[Null | StyleProp[TextStyle]] = js.undefined,
    suppressHighlighting: js.UndefOr[Boolean] = js.undefined,
    testID: String = null,
    textBreakStrategy: simple | highQuality | balanced = null
  ): PickTextPropsRefAttribute = {
    val __obj = js.Dynamic.literal()
    if (accessibilityComponentType != null) __obj.updateDynamic("accessibilityComponentType")(accessibilityComponentType.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityElementsHidden)) __obj.updateDynamic("accessibilityElementsHidden")(accessibilityElementsHidden.get.asInstanceOf[js.Any])
    if (accessibilityHint != null) __obj.updateDynamic("accessibilityHint")(accessibilityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(accessibilityIgnoresInvertColors)) __obj.updateDynamic("accessibilityIgnoresInvertColors")(accessibilityIgnoresInvertColors.get.asInstanceOf[js.Any])
    if (accessibilityLabel != null) __obj.updateDynamic("accessibilityLabel")(accessibilityLabel.asInstanceOf[js.Any])
    if (accessibilityLiveRegion != null) __obj.updateDynamic("accessibilityLiveRegion")(accessibilityLiveRegion.asInstanceOf[js.Any])
    if (accessibilityRole != null) __obj.updateDynamic("accessibilityRole")(accessibilityRole.asInstanceOf[js.Any])
    if (accessibilityStates != null) __obj.updateDynamic("accessibilityStates")(accessibilityStates.asInstanceOf[js.Any])
    if (accessibilityTraits != null) __obj.updateDynamic("accessibilityTraits")(accessibilityTraits.asInstanceOf[js.Any])
    if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustsFontSizeToFit)) __obj.updateDynamic("adjustsFontSizeToFit")(adjustsFontSizeToFit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.get.asInstanceOf[js.Any])
    if (ellipsizeMode != null) __obj.updateDynamic("ellipsizeMode")(ellipsizeMode.asInstanceOf[js.Any])
    if (importantForAccessibility != null) __obj.updateDynamic("importantForAccessibility")(importantForAccessibility.asInstanceOf[js.Any])
    if (lineBreakMode != null) __obj.updateDynamic("lineBreakMode")(lineBreakMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFontSizeMultiplier)) __obj.updateDynamic("maxFontSizeMultiplier")(maxFontSizeMultiplier.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFontScale)) __obj.updateDynamic("minimumFontScale")(minimumFontScale.get.asInstanceOf[js.Any])
    if (nativeID != null) __obj.updateDynamic("nativeID")(nativeID.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfLines)) __obj.updateDynamic("numberOfLines")(numberOfLines.get.asInstanceOf[js.Any])
    if (onAccessibilityTap != null) __obj.updateDynamic("onAccessibilityTap")(js.Any.fromFunction0(onAccessibilityTap))
    if (onLayout != null) __obj.updateDynamic("onLayout")(js.Any.fromFunction1(onLayout))
    if (onLongPress != null) __obj.updateDynamic("onLongPress")(js.Any.fromFunction1(onLongPress))
    if (onMagicTap != null) __obj.updateDynamic("onMagicTap")(js.Any.fromFunction0(onMagicTap))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selectionColor != null) __obj.updateDynamic("selectionColor")(selectionColor.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHighlighting)) __obj.updateDynamic("suppressHighlighting")(suppressHighlighting.get.asInstanceOf[js.Any])
    if (testID != null) __obj.updateDynamic("testID")(testID.asInstanceOf[js.Any])
    if (textBreakStrategy != null) __obj.updateDynamic("textBreakStrategy")(textBreakStrategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickTextPropsRefAttribute]
  }
}

