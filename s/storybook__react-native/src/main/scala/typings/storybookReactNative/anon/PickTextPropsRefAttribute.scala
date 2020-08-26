package typings.storybookReactNative.anon

import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.ColorValue
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
@js.native
trait PickTextPropsRefAttribute extends js.Object {
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
  var accessibilityHint: js.UndefOr[String] = js.native
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
  var accessibilityLabel: js.UndefOr[String] = js.native
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
  var accessibilityStates: js.UndefOr[js.Any] = js.native
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
  var accessible: js.UndefOr[Boolean] = js.native
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.native
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
  var minimumFontScale: js.UndefOr[Double] = js.native
  var nativeID: js.UndefOr[String] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selectionColor: js.UndefOr[ColorValue] = js.native
  var style: js.UndefOr[StyleProp[TextStyle]] = js.native
  var suppressHighlighting: js.UndefOr[Boolean] = js.native
  var testID: js.UndefOr[String] = js.native
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
}

object PickTextPropsRefAttribute {
  @scala.inline
  def apply(): PickTextPropsRefAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickTextPropsRefAttribute]
  }
  @scala.inline
  implicit class PickTextPropsRefAttributeOps[Self <: PickTextPropsRefAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = this.set("accessibilityComponentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityComponentType: Self = this.set("accessibilityComponentType", js.undefined)
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = this.set("accessibilityElementsHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityElementsHidden: Self = this.set("accessibilityElementsHidden", js.undefined)
    @scala.inline
    def setAccessibilityHint(value: String): Self = this.set("accessibilityHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityHint: Self = this.set("accessibilityHint", js.undefined)
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = this.set("accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityIgnoresInvertColors: Self = this.set("accessibilityIgnoresInvertColors", js.undefined)
    @scala.inline
    def setAccessibilityLabel(value: String): Self = this.set("accessibilityLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLabel: Self = this.set("accessibilityLabel", js.undefined)
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = this.set("accessibilityLiveRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityLiveRegion: Self = this.set("accessibilityLiveRegion", js.undefined)
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = this.set("accessibilityRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityRole: Self = this.set("accessibilityRole", js.undefined)
    @scala.inline
    def setAccessibilityStates(value: js.Any): Self = this.set("accessibilityStates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityStates: Self = this.set("accessibilityStates", js.undefined)
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = this.set("accessibilityTraits", js.Array(value :_*))
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = this.set("accessibilityTraits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityTraits: Self = this.set("accessibilityTraits", js.undefined)
    @scala.inline
    def setAccessible(value: Boolean): Self = this.set("accessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessible: Self = this.set("accessible", js.undefined)
    @scala.inline
    def setAdjustsFontSizeToFit(value: Boolean): Self = this.set("adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdjustsFontSizeToFit: Self = this.set("adjustsFontSizeToFit", js.undefined)
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = this.set("ellipsizeMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsizeMode: Self = this.set("ellipsizeMode", js.undefined)
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = this.set("importantForAccessibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportantForAccessibility: Self = this.set("importantForAccessibility", js.undefined)
    @scala.inline
    def setLineBreakMode(value: head | middle | tail | clip): Self = this.set("lineBreakMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineBreakMode: Self = this.set("lineBreakMode", js.undefined)
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = this.set("maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFontSizeMultiplier: Self = this.set("maxFontSizeMultiplier", js.undefined)
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = this.set("maxFontSizeMultiplier", null)
    @scala.inline
    def setMinimumFontScale(value: Double): Self = this.set("minimumFontScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFontScale: Self = this.set("minimumFontScale", js.undefined)
    @scala.inline
    def setNativeID(value: String): Self = this.set("nativeID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNativeID: Self = this.set("nativeID", js.undefined)
    @scala.inline
    def setNumberOfLines(value: Double): Self = this.set("numberOfLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLines: Self = this.set("numberOfLines", js.undefined)
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = this.set("onAccessibilityTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnAccessibilityTap: Self = this.set("onAccessibilityTap", js.undefined)
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = this.set("onLayout", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    @scala.inline
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnLongPress: Self = this.set("onLongPress", js.undefined)
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = this.set("onMagicTap", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMagicTap: Self = this.set("onMagicTap", js.undefined)
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[TextStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = this.set("suppressHighlighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressHighlighting: Self = this.set("suppressHighlighting", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = this.set("textBreakStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextBreakStrategy: Self = this.set("textBreakStrategy", js.undefined)
  }
  
}

