package typings.reactNativeElements.anon

import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityTrait
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.reactNativeElements.mod.RecursivePartial
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements.RecursivePartial<std.Partial<react-native-elements.react-native-elements.TextProps>> */
trait RecursivePartialPartialTe extends StObject {
  
  var accessibilityActions: js.UndefOr[RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]] = js.undefined
  
  var accessibilityComponentType: js.UndefOr[
    RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityHint: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessibilityLabel: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[RecursivePartial[js.UndefOr[none | polite | assertive]]] = js.undefined
  
  var accessibilityRole: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityRole]]] = js.undefined
  
  var accessibilityState: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityState]]] = js.undefined
  
  var accessibilityTraits: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]] = js.undefined
  
  var accessibilityValue: js.UndefOr[RecursivePartial[js.UndefOr[AccessibilityValue]]] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var accessible: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var adjustsFontSizeToFit: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var allowFontScaling: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var dataDetectorType: js.UndefOr[RecursivePartial[js.UndefOr[Null | phoneNumber | link | email | none | all]]] = js.undefined
  
  var ellipsizeMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.undefined
  
  var h1: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var h1Style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var h2: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var h2Style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var h3: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var h3Style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var h4: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var h4Style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var importantForAccessibility: js.UndefOr[RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]] = js.undefined
  
  var lineBreakMode: js.UndefOr[RecursivePartial[js.UndefOr[head | middle | tail | clip]]] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[RecursivePartial[js.UndefOr[Double | Null]]] = js.undefined
  
  var minimumFontScale: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var nativeID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var numberOfLines: js.UndefOr[RecursivePartial[js.UndefOr[Double]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onLayout: js.UndefOr[RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]] = js.undefined
  
  var onLongPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[RecursivePartial[js.UndefOr[js.Function0[Unit]]]] = js.undefined
  
  var onPress: js.UndefOr[
    RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]
  ] = js.undefined
  
  var onTextLayout: js.UndefOr[
    RecursivePartial[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
    ]
  ] = js.undefined
  
  var selectable: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var selectionColor: js.UndefOr[RecursivePartial[js.UndefOr[ColorValue]]] = js.undefined
  
  var style: js.UndefOr[RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]] = js.undefined
  
  var suppressHighlighting: js.UndefOr[RecursivePartial[js.UndefOr[Boolean]]] = js.undefined
  
  var testID: js.UndefOr[RecursivePartial[js.UndefOr[String]]] = js.undefined
  
  var textBreakStrategy: js.UndefOr[RecursivePartial[js.UndefOr[simple | highQuality | balanced]]] = js.undefined
}
object RecursivePartialPartialTe {
  
  @scala.inline
  def apply(): RecursivePartialPartialTe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecursivePartialPartialTe]
  }
  
  @scala.inline
  implicit class RecursivePartialPartialTeMutableBuilder[Self <: RecursivePartialPartialTe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityActions(value: RecursivePartial[js.UndefOr[js.Array[AccessibilityActionInfo]]]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    @scala.inline
    def setAccessibilityComponentType(value: RecursivePartial[js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked]]): Self = StObject.set(x, "accessibilityComponentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityComponentTypeUndefined: Self = StObject.set(x, "accessibilityComponentType", js.undefined)
    
    @scala.inline
    def setAccessibilityElementsHidden(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    @scala.inline
    def setAccessibilityHint(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    @scala.inline
    def setAccessibilityIgnoresInvertColors(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    @scala.inline
    def setAccessibilityLabel(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    @scala.inline
    def setAccessibilityLiveRegion(value: RecursivePartial[js.UndefOr[none | polite | assertive]]): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    @scala.inline
    def setAccessibilityRole(value: RecursivePartial[js.UndefOr[AccessibilityRole]]): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    @scala.inline
    def setAccessibilityState(value: RecursivePartial[js.UndefOr[AccessibilityState]]): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    @scala.inline
    def setAccessibilityTraits(value: RecursivePartial[js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]]]): Self = StObject.set(x, "accessibilityTraits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityTraitsUndefined: Self = StObject.set(x, "accessibilityTraits", js.undefined)
    
    @scala.inline
    def setAccessibilityValue(value: RecursivePartial[js.UndefOr[AccessibilityValue]]): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    @scala.inline
    def setAccessibilityViewIsModal(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    @scala.inline
    def setAccessible(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    @scala.inline
    def setAdjustsFontSizeToFit(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    @scala.inline
    def setAllowFontScaling(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    @scala.inline
    def setDataDetectorType(value: RecursivePartial[js.UndefOr[Null | phoneNumber | link | email | none | all]]): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    @scala.inline
    def setEllipsizeMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    @scala.inline
    def setH1(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "h1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH1Style(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "h1Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH1StyleUndefined: Self = StObject.set(x, "h1Style", js.undefined)
    
    @scala.inline
    def setH1Undefined: Self = StObject.set(x, "h1", js.undefined)
    
    @scala.inline
    def setH2(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "h2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH2Style(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "h2Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH2StyleUndefined: Self = StObject.set(x, "h2Style", js.undefined)
    
    @scala.inline
    def setH2Undefined: Self = StObject.set(x, "h2", js.undefined)
    
    @scala.inline
    def setH3(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "h3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH3Style(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "h3Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH3StyleUndefined: Self = StObject.set(x, "h3Style", js.undefined)
    
    @scala.inline
    def setH3Undefined: Self = StObject.set(x, "h3", js.undefined)
    
    @scala.inline
    def setH4(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "h4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH4Style(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "h4Style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH4StyleUndefined: Self = StObject.set(x, "h4Style", js.undefined)
    
    @scala.inline
    def setH4Undefined: Self = StObject.set(x, "h4", js.undefined)
    
    @scala.inline
    def setImportantForAccessibility(value: RecursivePartial[js.UndefOr[auto | yes | no | `no-hide-descendants`]]): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    @scala.inline
    def setLineBreakMode(value: RecursivePartial[js.UndefOr[head | middle | tail | clip]]): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    @scala.inline
    def setMaxFontSizeMultiplier(value: RecursivePartial[js.UndefOr[Double | Null]]): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    @scala.inline
    def setMinimumFontScale(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    @scala.inline
    def setNativeID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    @scala.inline
    def setNumberOfLines(value: RecursivePartial[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    @scala.inline
    def setOnAccessibilityAction(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    @scala.inline
    def setOnAccessibilityEscape(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    @scala.inline
    def setOnAccessibilityTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    @scala.inline
    def setOnLayout(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    @scala.inline
    def setOnLongPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    @scala.inline
    def setOnMagicTap(value: RecursivePartial[js.UndefOr[js.Function0[Unit]]]): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    @scala.inline
    def setOnPress(value: RecursivePartial[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnTextLayout(
      value: RecursivePartial[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
        ]
    ): Self = StObject.set(x, "onTextLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    @scala.inline
    def setSelectable(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: RecursivePartial[js.UndefOr[ColorValue]]): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setStyle(value: RecursivePartial[js.UndefOr[StyleProp[TextStyle]]]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSuppressHighlighting(value: RecursivePartial[js.UndefOr[Boolean]]): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    @scala.inline
    def setTestID(value: RecursivePartial[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    @scala.inline
    def setTextBreakStrategy(value: RecursivePartial[js.UndefOr[simple | highQuality | balanced]]): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
  }
}
