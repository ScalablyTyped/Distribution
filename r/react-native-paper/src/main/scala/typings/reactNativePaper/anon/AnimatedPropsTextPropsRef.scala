package typings.reactNativePaper.anon

import org.scalablytyped.runtime.Instantiable0
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.Animated.AnimatedComponent
import typings.reactNative.mod.Animated.LegacyRef
import typings.reactNative.mod.Animated.TAugmentRef
import typings.reactNative.mod.Animated.WithAnimatedValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.Text
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.reactNativePaper.reactNativePaperStrings.`no-hide-descendants`
import typings.reactNativePaper.reactNativePaperStrings.all
import typings.reactNativePaper.reactNativePaperStrings.assertive
import typings.reactNativePaper.reactNativePaperStrings.auto
import typings.reactNativePaper.reactNativePaperStrings.balanced
import typings.reactNativePaper.reactNativePaperStrings.clip
import typings.reactNativePaper.reactNativePaperStrings.email
import typings.reactNativePaper.reactNativePaperStrings.full
import typings.reactNativePaper.reactNativePaperStrings.head
import typings.reactNativePaper.reactNativePaperStrings.highQuality
import typings.reactNativePaper.reactNativePaperStrings.link
import typings.reactNativePaper.reactNativePaperStrings.middle
import typings.reactNativePaper.reactNativePaperStrings.no
import typings.reactNativePaper.reactNativePaperStrings.none
import typings.reactNativePaper.reactNativePaperStrings.normal
import typings.reactNativePaper.reactNativePaperStrings.phoneNumber
import typings.reactNativePaper.reactNativePaperStrings.polite
import typings.reactNativePaper.reactNativePaperStrings.simple
import typings.reactNativePaper.reactNativePaperStrings.tail
import typings.reactNativePaper.reactNativePaperStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native.react-native.Animated.AnimatedProps<react-native.react-native.TextProps & react.react.RefAttributes<react-native.react-native.Text>> & {  visible :boolean | undefined,   children :string | number | undefined,   size :number | undefined,   style :react-native.react-native.StyleProp<react-native.react-native.TextStyle> | undefined,   ref :react.react.RefObject<react-native.react-native.Animated.AnimatedComponent<new (): react-native.react-native.Text>> | undefined,   theme :react-native-paper.react-native-paper/lib/typescript/types.<global>.ReactNativePaper.Theme} */
trait AnimatedPropsTextPropsRef extends StObject {
  
  var accessibilityActions: js.UndefOr[
    WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
  ] = js.undefined
  
  var accessibilityElementsHidden: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var accessibilityHint: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
  
  var accessibilityIgnoresInvertColors: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var accessibilityLabel: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLabelledBy: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[String | js.Array[String]]]) | String | js.Array[String] | (TAugmentRef[js.UndefOr[String | js.Array[String]]])
  ] = js.undefined
  
  var accessibilityLanguage: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
  
  var accessibilityLiveRegion: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
  ] = js.undefined
  
  var accessibilityRole: js.UndefOr[
    WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
  ] = js.undefined
  
  var accessibilityState: js.UndefOr[
    WithAnimatedValue[js.UndefOr[typings.reactNative.mod.AccessibilityState]] | typings.reactNative.mod.AccessibilityState | TAugmentRef[js.UndefOr[typings.reactNative.mod.AccessibilityState]]
  ] = js.undefined
  
  var accessibilityValue: js.UndefOr[
    WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
  ] = js.undefined
  
  var accessibilityViewIsModal: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var accessible: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var adjustsFontSizeToFit: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var allowFontScaling: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var android_hyphenationFrequency: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[normal | none | full]]) | normal | none | full | (TAugmentRef[js.UndefOr[normal | none | full]])
  ] = js.undefined
  
  /**
    * Content of the `Badge`.
    */
  var children: (js.UndefOr[
    WithAnimatedValue[js.UndefOr[ReactNode]] | ReactNode | TAugmentRef[js.UndefOr[ReactNode]]
  ]) & (js.UndefOr[String | Double])
  
  var dataDetectorType: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[Null | phoneNumber | link | email | none | all]]) | Null | phoneNumber | link | email | none | all | (TAugmentRef[js.UndefOr[Null | phoneNumber | link | email | none | all]])
  ] = js.undefined
  
  var ellipsizeMode: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[head | middle | tail | clip]]) | head | middle | tail | clip | (TAugmentRef[js.UndefOr[head | middle | tail | clip]])
  ] = js.undefined
  
  var importantForAccessibility: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
  ] = js.undefined
  
  var key: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[typings.react.mod.Key | Null]]) | typings.react.mod.Key | Null | (TAugmentRef[js.UndefOr[typings.react.mod.Key | Null]])
  ] = js.undefined
  
  var lineBreakMode: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[head | middle | tail | clip]]) | head | middle | tail | clip | (TAugmentRef[js.UndefOr[head | middle | tail | clip]])
  ] = js.undefined
  
  var maxFontSizeMultiplier: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[Double | Null]]) | Double | Null | (TAugmentRef[js.UndefOr[Double | Null]])
  ] = js.undefined
  
  var minimumFontScale: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
  
  var nativeID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
  
  var numberOfLines: js.UndefOr[WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]] = js.undefined
  
  var onAccessibilityAction: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
  ] = js.undefined
  
  var onAccessibilityEscape: js.UndefOr[
    WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
  ] = js.undefined
  
  var onAccessibilityTap: js.UndefOr[
    WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
  ] = js.undefined
  
  var onLayout: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
  ] = js.undefined
  
  var onLongPress: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onMagicTap: js.UndefOr[
    WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
  ] = js.undefined
  
  var onPress: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onPressIn: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onPressOut: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
  ] = js.undefined
  
  var onTextLayout: js.UndefOr[
    (WithAnimatedValue[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
    ]) | (js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]) | (TAugmentRef[
      js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
    ])
  ] = js.undefined
  
  var ref: (js.UndefOr[
    WithAnimatedValue[js.UndefOr[typings.react.mod.Ref[Text]]] | typings.react.mod.Ref[Text] | TAugmentRef[js.UndefOr[typings.react.mod.Ref[Text]]]
  ]) & js.UndefOr[RefObject[AnimatedComponent[Instantiable0[Text]]]]
  
  var selectable: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var selectionColor: js.UndefOr[
    WithAnimatedValue[js.UndefOr[ColorValue]] | ColorValue | TAugmentRef[js.UndefOr[ColorValue]]
  ] = js.undefined
  
  /**
    * Size of the `Badge`.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var style: (js.UndefOr[
    WithAnimatedValue[js.UndefOr[StyleProp[TextStyle]]] | StyleProp[TextStyle] | TAugmentRef[js.UndefOr[StyleProp[TextStyle]]]
  ]) & js.UndefOr[StyleProp[TextStyle]]
  
  var suppressHighlighting: js.UndefOr[
    WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]
  ] = js.undefined
  
  var testID: js.UndefOr[WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]] = js.undefined
  
  var textBreakStrategy: js.UndefOr[
    (WithAnimatedValue[js.UndefOr[simple | highQuality | balanced]]) | simple | highQuality | balanced | (TAugmentRef[js.UndefOr[simple | highQuality | balanced]])
  ] = js.undefined
  
  /**
    * @optional
    */
  var theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  
  /**
    * Whether the badge is visible
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object AnimatedPropsTextPropsRef {
  
  inline def apply(
    children: (js.UndefOr[
      WithAnimatedValue[js.UndefOr[ReactNode]] | ReactNode | TAugmentRef[js.UndefOr[ReactNode]]
    ]) & (js.UndefOr[String | Double]),
    ref: (js.UndefOr[
      WithAnimatedValue[js.UndefOr[typings.react.mod.Ref[Text]]] | typings.react.mod.Ref[Text] | TAugmentRef[js.UndefOr[typings.react.mod.Ref[Text]]]
    ]) & js.UndefOr[RefObject[AnimatedComponent[Instantiable0[Text]]]],
    style: (js.UndefOr[
      WithAnimatedValue[js.UndefOr[StyleProp[TextStyle]]] | StyleProp[TextStyle] | TAugmentRef[js.UndefOr[StyleProp[TextStyle]]]
    ]) & js.UndefOr[StyleProp[TextStyle]],
    theme: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme
  ): AnimatedPropsTextPropsRef = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimatedPropsTextPropsRef]
  }
  
  extension [Self <: AnimatedPropsTextPropsRef](x: Self) {
    
    inline def setAccessibilityActions(
      value: WithAnimatedValue[js.UndefOr[js.Array[AccessibilityActionInfo]]] | js.Array[AccessibilityActionInfo] | TAugmentRef[js.UndefOr[js.Array[AccessibilityActionInfo]]]
    ): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityActionsFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityActions", js.Any.fromFunction1(value))
    
    inline def setAccessibilityActionsNull: Self = StObject.set(x, "accessibilityActions", null)
    
    inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
    
    inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
    
    inline def setAccessibilityElementsHidden(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityElementsHiddenFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityElementsHidden", js.Any.fromFunction1(value))
    
    inline def setAccessibilityElementsHiddenNull: Self = StObject.set(x, "accessibilityElementsHidden", null)
    
    inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
    
    inline def setAccessibilityHint(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityHintFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityHint", js.Any.fromFunction1(value))
    
    inline def setAccessibilityHintNull: Self = StObject.set(x, "accessibilityHint", null)
    
    inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
    
    inline def setAccessibilityIgnoresInvertColors(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityIgnoresInvertColorsFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.Any.fromFunction1(value))
    
    inline def setAccessibilityIgnoresInvertColorsNull: Self = StObject.set(x, "accessibilityIgnoresInvertColors", null)
    
    inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
    
    inline def setAccessibilityLabel(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLabel", js.Any.fromFunction1(value))
    
    inline def setAccessibilityLabelNull: Self = StObject.set(x, "accessibilityLabel", null)
    
    inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
    
    inline def setAccessibilityLabelledBy(
      value: (WithAnimatedValue[js.UndefOr[String | js.Array[String]]]) | String | js.Array[String] | (TAugmentRef[js.UndefOr[String | js.Array[String]]])
    ): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLabelledByFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLabelledBy", js.Any.fromFunction1(value))
    
    inline def setAccessibilityLabelledByNull: Self = StObject.set(x, "accessibilityLabelledBy", null)
    
    inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
    
    inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
    
    inline def setAccessibilityLanguage(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLanguageFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLanguage", js.Any.fromFunction1(value))
    
    inline def setAccessibilityLanguageNull: Self = StObject.set(x, "accessibilityLanguage", null)
    
    inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
    
    inline def setAccessibilityLiveRegion(
      value: (WithAnimatedValue[js.UndefOr[none | polite | assertive]]) | none | polite | assertive | (TAugmentRef[js.UndefOr[none | polite | assertive]])
    ): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityLiveRegionFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityLiveRegion", js.Any.fromFunction1(value))
    
    inline def setAccessibilityLiveRegionNull: Self = StObject.set(x, "accessibilityLiveRegion", null)
    
    inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
    
    inline def setAccessibilityRole(
      value: WithAnimatedValue[js.UndefOr[AccessibilityRole]] | AccessibilityRole | TAugmentRef[js.UndefOr[AccessibilityRole]]
    ): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityRoleFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityRole", js.Any.fromFunction1(value))
    
    inline def setAccessibilityRoleNull: Self = StObject.set(x, "accessibilityRole", null)
    
    inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
    
    inline def setAccessibilityState(
      value: WithAnimatedValue[js.UndefOr[typings.reactNative.mod.AccessibilityState]] | typings.reactNative.mod.AccessibilityState | TAugmentRef[js.UndefOr[typings.reactNative.mod.AccessibilityState]]
    ): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityStateFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityState", js.Any.fromFunction1(value))
    
    inline def setAccessibilityStateNull: Self = StObject.set(x, "accessibilityState", null)
    
    inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
    
    inline def setAccessibilityValue(
      value: WithAnimatedValue[js.UndefOr[AccessibilityValue]] | AccessibilityValue | TAugmentRef[js.UndefOr[AccessibilityValue]]
    ): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityValueFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityValue", js.Any.fromFunction1(value))
    
    inline def setAccessibilityValueNull: Self = StObject.set(x, "accessibilityValue", null)
    
    inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
    
    inline def setAccessibilityViewIsModal(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityViewIsModalFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessibilityViewIsModal", js.Any.fromFunction1(value))
    
    inline def setAccessibilityViewIsModalNull: Self = StObject.set(x, "accessibilityViewIsModal", null)
    
    inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
    
    inline def setAccessible(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
    
    inline def setAccessibleFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "accessible", js.Any.fromFunction1(value))
    
    inline def setAccessibleNull: Self = StObject.set(x, "accessible", null)
    
    inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
    
    inline def setAdjustsFontSizeToFit(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
    
    inline def setAdjustsFontSizeToFitFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "adjustsFontSizeToFit", js.Any.fromFunction1(value))
    
    inline def setAdjustsFontSizeToFitNull: Self = StObject.set(x, "adjustsFontSizeToFit", null)
    
    inline def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
    
    inline def setAllowFontScaling(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "allowFontScaling", js.Any.fromFunction1(value))
    
    inline def setAllowFontScalingNull: Self = StObject.set(x, "allowFontScaling", null)
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAndroid_hyphenationFrequency(
      value: (WithAnimatedValue[js.UndefOr[normal | none | full]]) | normal | none | full | (TAugmentRef[js.UndefOr[normal | none | full]])
    ): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def setAndroid_hyphenationFrequencyFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "android_hyphenationFrequency", js.Any.fromFunction1(value))
    
    inline def setAndroid_hyphenationFrequencyNull: Self = StObject.set(x, "android_hyphenationFrequency", null)
    
    inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
    
    inline def setChildren(
      value: (js.UndefOr[
          WithAnimatedValue[js.UndefOr[ReactNode]] | ReactNode | TAugmentRef[js.UndefOr[ReactNode]]
        ]) & (js.UndefOr[String | Double])
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorType(
      value: (WithAnimatedValue[js.UndefOr[Null | phoneNumber | link | email | none | all]]) | phoneNumber | link | email | none | all | (TAugmentRef[js.UndefOr[Null | phoneNumber | link | email | none | all]])
    ): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "dataDetectorType", js.Any.fromFunction1(value))
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setEllipsizeMode(
      value: (WithAnimatedValue[js.UndefOr[head | middle | tail | clip]]) | head | middle | tail | clip | (TAugmentRef[js.UndefOr[head | middle | tail | clip]])
    ): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "ellipsizeMode", js.Any.fromFunction1(value))
    
    inline def setEllipsizeModeNull: Self = StObject.set(x, "ellipsizeMode", null)
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setImportantForAccessibility(
      value: (WithAnimatedValue[js.UndefOr[auto | yes | no | `no-hide-descendants`]]) | auto | yes | no | `no-hide-descendants` | (TAugmentRef[js.UndefOr[auto | yes | no | `no-hide-descendants`]])
    ): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "importantForAccessibility", js.Any.fromFunction1(value))
    
    inline def setImportantForAccessibilityNull: Self = StObject.set(x, "importantForAccessibility", null)
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setKey(
      value: (WithAnimatedValue[js.UndefOr[typings.react.mod.Key | Null]]) | typings.react.mod.Key | (TAugmentRef[js.UndefOr[typings.react.mod.Key | Null]])
    ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLineBreakMode(
      value: (WithAnimatedValue[js.UndefOr[head | middle | tail | clip]]) | head | middle | tail | clip | (TAugmentRef[js.UndefOr[head | middle | tail | clip]])
    ): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def setLineBreakModeFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "lineBreakMode", js.Any.fromFunction1(value))
    
    inline def setLineBreakModeNull: Self = StObject.set(x, "lineBreakMode", null)
    
    inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    inline def setMaxFontSizeMultiplier(
      value: (WithAnimatedValue[js.UndefOr[Double | Null]]) | Double | (TAugmentRef[js.UndefOr[Double | Null]])
    ): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeMultiplierFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "maxFontSizeMultiplier", js.Any.fromFunction1(value))
    
    inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
    
    inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
    
    inline def setMinimumFontScale(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
    
    inline def setMinimumFontScaleFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "minimumFontScale", js.Any.fromFunction1(value))
    
    inline def setMinimumFontScaleNull: Self = StObject.set(x, "minimumFontScale", null)
    
    inline def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
    
    inline def setNativeID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
    
    inline def setNativeIDFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "nativeID", js.Any.fromFunction1(value))
    
    inline def setNativeIDNull: Self = StObject.set(x, "nativeID", null)
    
    inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
    
    inline def setNumberOfLines(value: WithAnimatedValue[js.UndefOr[Double]] | Double | TAugmentRef[js.UndefOr[Double]]): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
    
    inline def setNumberOfLinesFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "numberOfLines", js.Any.fromFunction1(value))
    
    inline def setNumberOfLinesNull: Self = StObject.set(x, "numberOfLines", null)
    
    inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
    
    inline def setOnAccessibilityAction(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]]) | (js.Function1[/* event */ AccessibilityActionEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]]])
    ): Self = StObject.set(x, "onAccessibilityAction", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityActionFunction1(value: (/* event */ AccessibilityActionEvent) | Any | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionNull: Self = StObject.set(x, "onAccessibilityAction", null)
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = StObject.set(x, "onAccessibilityEscape", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityEscapeFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityEscapeNull: Self = StObject.set(x, "onAccessibilityEscape", null)
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = StObject.set(x, "onAccessibilityTap", value.asInstanceOf[js.Any])
    
    inline def setOnAccessibilityTapFunction0(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityTapNull: Self = StObject.set(x, "onAccessibilityTap", null)
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnLayout(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]]) | (js.Function1[/* event */ LayoutChangeEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]]])
    ): Self = StObject.set(x, "onLayout", value.asInstanceOf[js.Any])
    
    inline def setOnLayoutFunction1(value: Any | (/* event */ LayoutChangeEvent) | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
    
    inline def setOnLayoutNull: Self = StObject.set(x, "onLayout", null)
    
    inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
    
    inline def setOnLongPress(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onLongPress", value.asInstanceOf[js.Any])
    
    inline def setOnLongPressFunction1(value: Any | (/* event */ GestureResponderEvent) | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
    
    inline def setOnLongPressNull: Self = StObject.set(x, "onLongPress", null)
    
    inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
    
    inline def setOnMagicTap(
      value: WithAnimatedValue[js.UndefOr[js.Function0[Unit]]] | js.Function0[Unit] | TAugmentRef[js.UndefOr[js.Function0[Unit]]]
    ): Self = StObject.set(x, "onMagicTap", value.asInstanceOf[js.Any])
    
    inline def setOnMagicTapFunction0(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
    
    inline def setOnMagicTapFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction1(value))
    
    inline def setOnMagicTapNull: Self = StObject.set(x, "onMagicTap", null)
    
    inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
    
    inline def setOnPress(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPress", value.asInstanceOf[js.Any])
    
    inline def setOnPressFunction1(value: Any | (/* event */ GestureResponderEvent) | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressIn(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPressIn", value.asInstanceOf[js.Any])
    
    inline def setOnPressInFunction1(value: Any | (/* event */ GestureResponderEvent) | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
    
    inline def setOnPressInNull: Self = StObject.set(x, "onPressIn", null)
    
    inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
    
    inline def setOnPressNull: Self = StObject.set(x, "onPress", null)
    
    inline def setOnPressOut(
      value: (WithAnimatedValue[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]]) | (js.Function1[/* event */ GestureResponderEvent, Unit]) | (TAugmentRef[js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]]])
    ): Self = StObject.set(x, "onPressOut", value.asInstanceOf[js.Any])
    
    inline def setOnPressOutFunction1(value: Any | (/* event */ GestureResponderEvent) | LegacyRef[Any] | Null => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
    
    inline def setOnPressOutNull: Self = StObject.set(x, "onPressOut", null)
    
    inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnTextLayout(
      value: (WithAnimatedValue[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
        ]) | (js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]) | (TAugmentRef[
          js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]]
        ])
    ): Self = StObject.set(x, "onTextLayout", value.asInstanceOf[js.Any])
    
    inline def setOnTextLayoutFunction1(
      value: Any | LegacyRef[Any] | (/* event */ NativeSyntheticEvent[TextLayoutEventData]) | Null => Unit
    ): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
    
    inline def setOnTextLayoutNull: Self = StObject.set(x, "onTextLayout", null)
    
    inline def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
    
    inline def setRef(
      value: (js.UndefOr[
          WithAnimatedValue[js.UndefOr[typings.react.mod.Ref[Text]]] | typings.react.mod.Ref[Text] | TAugmentRef[js.UndefOr[typings.react.mod.Ref[Text]]]
        ]) & js.UndefOr[RefObject[AnimatedComponent[Instantiable0[Text]]]]
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setSelectable(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "selectable", js.Any.fromFunction1(value))
    
    inline def setSelectableNull: Self = StObject.set(x, "selectable", null)
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(
      value: WithAnimatedValue[js.UndefOr[ColorValue]] | ColorValue | TAugmentRef[js.UndefOr[ColorValue]]
    ): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "selectionColor", js.Any.fromFunction1(value))
    
    inline def setSelectionColorNull: Self = StObject.set(x, "selectionColor", null)
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(
      value: (js.UndefOr[
          WithAnimatedValue[js.UndefOr[StyleProp[TextStyle]]] | StyleProp[TextStyle] | TAugmentRef[js.UndefOr[StyleProp[TextStyle]]]
        ]) & js.UndefOr[StyleProp[TextStyle]]
    ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setSuppressHighlighting(value: WithAnimatedValue[js.UndefOr[Boolean]] | Boolean | TAugmentRef[js.UndefOr[Boolean]]): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def setSuppressHighlightingFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "suppressHighlighting", js.Any.fromFunction1(value))
    
    inline def setSuppressHighlightingNull: Self = StObject.set(x, "suppressHighlighting", null)
    
    inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    inline def setTestID(value: WithAnimatedValue[js.UndefOr[String]] | String | TAugmentRef[js.UndefOr[String]]): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "testID", js.Any.fromFunction1(value))
    
    inline def setTestIDNull: Self = StObject.set(x, "testID", null)
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setTextBreakStrategy(
      value: (WithAnimatedValue[js.UndefOr[simple | highQuality | balanced]]) | simple | highQuality | balanced | (TAugmentRef[js.UndefOr[simple | highQuality | balanced]])
    ): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyFunction1(value: /* instance */ (Any | LegacyRef[Any]) | Null => Unit): Self = StObject.set(x, "textBreakStrategy", js.Any.fromFunction1(value))
    
    inline def setTextBreakStrategyNull: Self = StObject.set(x, "textBreakStrategy", null)
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setTheme(value: typings.reactNativePaper.typescriptTypesMod.global.ReactNativePaper.Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
