package typings.reactNativeElements.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.BackgroundPropType
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.mod.IconType
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.all
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.balanced
import typings.reactNativeElements.reactNativeElementsStrings.button
import typings.reactNativeElements.reactNativeElementsStrings.clip
import typings.reactNativeElements.reactNativeElementsStrings.email
import typings.reactNativeElements.reactNativeElementsStrings.head
import typings.reactNativeElements.reactNativeElementsStrings.highQuality
import typings.reactNativeElements.reactNativeElementsStrings.link
import typings.reactNativeElements.reactNativeElementsStrings.middle
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_checked
import typings.reactNativeElements.reactNativeElementsStrings.radiobutton_unchecked
import typings.reactNativeElements.reactNativeElementsStrings.simple
import typings.reactNativeElements.reactNativeElementsStrings.tail
import typings.reactNativeElements.reactNativeElementsStrings.yes
import typings.reactNativeVectorIcons.iconMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.IconProps> */
trait PartialIconProps extends StObject {
  
  var Component: js.UndefOr[ComponentClass[js.Object, ComponentState]] = js.undefined
  
  var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
  
  var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityHint: js.UndefOr[String] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
  
  var accessibilityLabel: js.UndefOr[String] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
  
  var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
  
  var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
  
  var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.undefined
  
  var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
  
  var accessible: js.UndefOr[Boolean] = js.undefined
  
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
  
  var allowFontScaling: js.UndefOr[Boolean] = js.undefined
  
  var background: js.UndefOr[BackgroundPropType] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var brand: js.UndefOr[Boolean] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all] = js.undefined
  
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  
  var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
  
  var hitSlop: js.UndefOr[Insets] = js.undefined
  
  var iconProps: js.UndefOr[IconProps] = js.undefined
  
  var iconStyle: js.UndefOr[TextStyle] = js.undefined
  
  var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
  
  var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
  
  var minimumFontScale: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var nativeID: js.UndefOr[String] = js.undefined
  
  var numberOfLines: js.UndefOr[Double] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onTextLayout: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]] = js.undefined
  
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  
  var raised: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var reverseColor: js.UndefOr[String] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var selectionColor: js.UndefOr[ColorValue] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var solid: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ViewStyle | TextStyle] = js.undefined
  
  var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
  
  var testID: js.UndefOr[String] = js.undefined
  
  var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  
  var touchSoundDisabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
  
  var `type`: js.UndefOr[IconType] = js.undefined
  
  var underlayColor: js.UndefOr[ColorValue] = js.undefined
  
  var useForeground: js.UndefOr[Boolean] = js.undefined
}
object PartialIconProps {
  
  @scala.inline
  def apply(): PartialIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIconProps]
  }
  
  @scala.inline
  implicit class PartialIconPropsMutableBuilder[Self <: PartialIconProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityComponentType(value: none | button | radiobutton_checked | radiobutton_unchecked): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: AccessibilityTrait | js.Array[AccessibilityTrait]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityTraitsVarargs(value: AccessibilityTrait*): Self = StObject.set(x, "accessibilityTraits", js.Array(value :_*))
    
    @scala.inline
    def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundPropType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setComponent(value: ComponentClass[js.Object, ComponentState]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    @scala.inline
    def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    @scala.inline
    def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    @scala.inline
    def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    @scala.inline
    def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    @scala.inline
    def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    @scala.inline
    def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    @scala.inline
    def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    @scala.inline
    def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    @scala.inline
    def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    @scala.inline
    def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
    
    @scala.inline
    def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    @scala.inline
    def setIconProps(value: IconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
    
    @scala.inline
    def setIconStyle(value: TextStyle): Self = StObject.set(x, "iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconStyleUndefined: Self = StObject.set(x, "iconStyle", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
    @scala.inline
    def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    @scala.inline
    def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    @scala.inline
    def setOnTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    @scala.inline
    def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    @scala.inline
    def setRaised(value: Boolean): Self = StObject.set(x, "raised", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaisedUndefined: Self = StObject.set(x, "raised", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColor(value: String): Self = StObject.set(x, "reverseColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseColorUndefined: Self = StObject.set(x, "reverseColor", js.undefined)
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    @scala.inline
    def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
    
    @scala.inline
    def setStyle(value: ViewStyle | TextStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    @scala.inline
    def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchSoundDisabledNull: Self = StObject.set(x, "touchSoundDisabled", null)
    
    @scala.inline
    def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    @scala.inline
    def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
    
    @scala.inline
    def setType(value: IconType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    @scala.inline
    def setUseForeground(value: Boolean): Self = StObject.set(x, "useForeground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseForegroundUndefined: Self = StObject.set(x, "useForeground", js.undefined)
  }
}
