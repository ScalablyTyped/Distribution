package typings.reactSpringNative

import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.Insets
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.PointerEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TVParallaxProperties
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactSpringNative.reactSpringNativeStrings.`box-none`
import typings.reactSpringNative.reactSpringNativeStrings.`box-only`
import typings.reactSpringNative.reactSpringNativeStrings.`no-hide-descendants`
import typings.reactSpringNative.reactSpringNativeStrings.all
import typings.reactSpringNative.reactSpringNativeStrings.assertive
import typings.reactSpringNative.reactSpringNativeStrings.auto
import typings.reactSpringNative.reactSpringNativeStrings.balanced
import typings.reactSpringNative.reactSpringNativeStrings.clip
import typings.reactSpringNative.reactSpringNativeStrings.email
import typings.reactSpringNative.reactSpringNativeStrings.full
import typings.reactSpringNative.reactSpringNativeStrings.head
import typings.reactSpringNative.reactSpringNativeStrings.highQuality
import typings.reactSpringNative.reactSpringNativeStrings.link
import typings.reactSpringNative.reactSpringNativeStrings.middle
import typings.reactSpringNative.reactSpringNativeStrings.no
import typings.reactSpringNative.reactSpringNativeStrings.none
import typings.reactSpringNative.reactSpringNativeStrings.normal
import typings.reactSpringNative.reactSpringNativeStrings.phoneNumber
import typings.reactSpringNative.reactSpringNativeStrings.polite
import typings.reactSpringNative.reactSpringNativeStrings.simple
import typings.reactSpringNative.reactSpringNativeStrings.tail
import typings.reactSpringNative.reactSpringNativeStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  /* Inlined react-native.react-native.TextProps & {  children :react.react.ReactNode | undefined} */
  trait TextPropschildrenReactNod extends StObject {
    
    /**
      * Provides an array of custom actions available for accessibility.
      */
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    /**
      * A Boolean value indicating whether the accessibility elements contained within this accessibility element
      * are hidden to the screen reader.
      * @platform ios
      */
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
      */
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    /**
      * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
      * @platform ios
      */
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
      * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
      * @platform android
      */
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Indicates to the accessibility services that the UI component is in
      * a specific language. The provided string should be formatted following
      * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
      * @platform ios
      */
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates to accessibility services whether the user should be notified when this view changes.
      * Works for Android API >= 19 only.
      * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
      * @platform android
      */
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    /**
      * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
      */
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    /**
      * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
      */
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    /**
      * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
      * it contains range information (minimum, current, and maximum).
      */
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    /**
      * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
      * @platform ios
      */
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, indicates that the view is an accessibility element.
      * By default, all the touchable elements are accessible.
      */
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether font should be scaled down automatically to fit given style constraints.
      */
    var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether fonts should scale to respect Text Size accessibility settings.
      * The default is `true`.
      */
    var allowFontScaling: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Hyphenation strategy
      */
    var android_hyphenationFrequency: js.UndefOr[normal | none | full] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Determines the types of data converted to clickable URLs in the text element.
      * By default no data types are detected.
      */
    var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all] = js.undefined
    
    /**
      * Specifies the disabled state of the text view for testing purposes.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This can be one of the following values:
      *
      * - `head` - The line is displayed so that the end fits in the container and the missing text
      * at the beginning of the line is indicated by an ellipsis glyph. e.g., "...wxyz"
      * - `middle` - The line is displayed so that the beginning and end fit in the container and the
      * missing text in the middle is indicated by an ellipsis glyph. "ab...yz"
      * - `tail` - The line is displayed so that the beginning fits in the container and the
      * missing text at the end of the line is indicated by an ellipsis glyph. e.g., "abcd..."
      * - `clip` - Lines are not drawn past the edge of the text container.
      *
      * The default is `tail`.
      *
      * `numberOfLines` must be set in conjunction with this prop.
      *
      * > `clip` is working only for iOS
      */
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    /**
      * Controls how view is important for accessibility which is if it fires accessibility events
      * and if it is reported to accessibility services that query the screen.
      * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
      *
      * Possible values:
      *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
      *      'yes' - The view is important for accessibility.
      *      'no' - The view is not important for accessibility.
      *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
      */
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    /**
      * Line Break mode. Works only with numberOfLines.
      * clip is working only for iOS
      */
    var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.undefined
    
    /**
      * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
      * - null/undefined (default): inherit from the parent node or the global default (0)
      * - 0: no max, ignore parent/global default
      * - >= 1: sets the maxFontSizeMultiplier of this node to this value
      */
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.undefined
    
    /**
      * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
      */
    var minimumFontScale: js.UndefOr[Double] = js.undefined
    
    /**
      * Used to reference react managed views from native code.
      */
    var nativeID: js.UndefOr[String] = js.undefined
    
    /**
      * Used to truncate the text with an ellipsis after computing the text
      * layout, including line wrapping, such that the total number of lines
      * does not exceed this number.
      *
      * This prop is commonly used with `ellipsizeMode`.
      */
    var numberOfLines: js.UndefOr[Double] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
      */
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    /**
      * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
      * @platform ios
      */
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
      * @platform ios
      */
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on mount and layout changes with
      *
      * {nativeEvent: { layout: {x, y, width, height}}}.
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    /**
      * This function is called on long press.
      * e.g., `onLongPress={this.increaseSize}>``
      */
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
      * @platform ios
      */
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * This function is called on press.
      * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
      */
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Invoked on Text layout
      */
    var onTextLayout: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]] = js.undefined
    
    /**
      * Lets the user select text, to use the native copy and paste functionality.
      */
    var selectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The highlight color of the text.
      */
    var selectionColor: js.UndefOr[ColorValue] = js.undefined
    
    /**
      * @see https://reactnative.dev/docs/text#style
      */
    var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    /**
      * When `true`, no visual change is made when text is pressed down. By
      * default, a gray oval highlights the text on press down.
      */
    var suppressHighlighting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * Set text break strategy on Android API Level 23+
      * default is `highQuality`.
      */
    var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.undefined
  }
  object TextPropschildrenReactNod {
    
    inline def apply(): TextPropschildrenReactNod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPropschildrenReactNod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextPropschildrenReactNod] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
      
      inline def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
      
      inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      inline def setAndroid_hyphenationFrequency(value: normal | none | full): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
      
      inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
      
      inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
      
      inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
      
      inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
      
      inline def setMaxFontSizeMultiplier(value: Double): Self = StObject.set(x, "maxFontSizeMultiplier", value.asInstanceOf[js.Any])
      
      inline def setMaxFontSizeMultiplierNull: Self = StObject.set(x, "maxFontSizeMultiplier", null)
      
      inline def setMaxFontSizeMultiplierUndefined: Self = StObject.set(x, "maxFontSizeMultiplier", js.undefined)
      
      inline def setMinimumFontScale(value: Double): Self = StObject.set(x, "minimumFontScale", value.asInstanceOf[js.Any])
      
      inline def setMinimumFontScaleUndefined: Self = StObject.set(x, "minimumFontScale", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNumberOfLines(value: Double): Self = StObject.set(x, "numberOfLines", value.asInstanceOf[js.Any])
      
      inline def setNumberOfLinesUndefined: Self = StObject.set(x, "numberOfLines", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnLongPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onLongPress", js.Any.fromFunction1(value))
      
      inline def setOnLongPressUndefined: Self = StObject.set(x, "onLongPress", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnPress(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
      
      inline def setOnPressIn(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressIn", js.Any.fromFunction1(value))
      
      inline def setOnPressInUndefined: Self = StObject.set(x, "onPressIn", js.undefined)
      
      inline def setOnPressOut(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onPressOut", js.Any.fromFunction1(value))
      
      inline def setOnPressOutUndefined: Self = StObject.set(x, "onPressOut", js.undefined)
      
      inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      inline def setOnTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
      
      inline def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
      
      inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
      
      inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
      
      inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
      
      inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
      
      inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
      
      inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
      
      inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    }
  }
  
  /* Inlined react-native.react-native.ViewProps & {  children :react.react.ReactNode | undefined} */
  trait ViewPropschildrenReactNod extends StObject {
    
    /**
      * Provides an array of custom actions available for accessibility.
      */
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.undefined
    
    /**
      * A Boolean value indicating whether the accessibility elements contained within this accessibility element
      * are hidden to the screen reader.
      * @platform ios
      */
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
      */
    var accessibilityHint: js.UndefOr[String] = js.undefined
    
    /**
      * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
      * @platform ios
      */
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
      * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
      */
    var accessibilityLabel: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the nativeID of the associated label text. When the assistive technology focuses on the component with this props, the text is read aloud.
      * @platform android
      */
    var accessibilityLabelledBy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Indicates to the accessibility services that the UI component is in
      * a specific language. The provided string should be formatted following
      * the BCP 47 specification (https://www.rfc-editor.org/info/bcp47).
      * @platform ios
      */
    var accessibilityLanguage: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates to accessibility services whether the user should be notified when this view changes.
      * Works for Android API >= 19 only.
      * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
      * @platform android
      */
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.undefined
    
    /**
      * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
      */
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.undefined
    
    /**
      * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
      */
    var accessibilityState: js.UndefOr[AccessibilityState] = js.undefined
    
    /**
      * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
      * it contains range information (minimum, current, and maximum).
      */
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.undefined
    
    /**
      * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
      * @platform ios
      */
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When true, indicates that the view is an accessibility element.
      * By default, all the touchable elements are accessible.
      */
    var accessible: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Views that are only used to layout their children or otherwise don't draw anything
      * may be automatically removed from the native hierarchy as an optimization.
      * Set this property to false to disable this optimization and ensure that this View exists in the native view hierarchy.
      */
    var collapsable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this `View` should be focusable with a non-touch input device, eg. receive focus with a hardware keyboard.
      */
    var focusable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * *(Apple TV only)* May be set to true to force the Apple TV focus engine to move focus to this view.
      *
      * @platform ios
      */
    var hasTVPreferredFocus: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This defines how far a touch event can start away from the view.
      * Typical interface guidelines recommend touch targets that are at least
      * 30 - 40 points/density-independent pixels. If a Touchable view has
      * a height of 20 the touchable height can be extended to 40 with
      * hitSlop={{top: 10, bottom: 10, left: 0, right: 0}}
      * NOTE The touch area never extends past the parent view bounds and
      * the Z-index of sibling views always takes precedence if a touch
      * hits two overlapping views.
      */
    var hitSlop: js.UndefOr[Insets] = js.undefined
    
    /**
      * Controls how view is important for accessibility which is if it fires accessibility events
      * and if it is reported to accessibility services that query the screen.
      * Works for Android only. See http://developer.android.com/reference/android/R.attr.html#importantForAccessibility for references.
      *
      * Possible values:
      *      'auto' - The system determines whether the view is important for accessibility - default (recommended).
      *      'yes' - The view is important for accessibility.
      *      'no' - The view is not important for accessibility.
      *      'no-hide-descendants' - The view is not important for accessibility, nor are any of its descendant views.
      */
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.undefined
    
    /**
      * *(Apple TV only)* When set to true, this view will be focusable
      * and navigable using the Apple TV remote.
      *
      * @platform ios
      */
    var isTVSelectable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Used to reference react managed views from native code.
      */
    var nativeID: js.UndefOr[String] = js.undefined
    
    /**
      * Whether this view needs to rendered offscreen and composited with an alpha in order to preserve 100% correct colors and blending behavior.
      * The default (false) falls back to drawing the component and its children
      * with an alpha applied to the paint used to draw each element instead of rendering the full component offscreen and compositing it back with an alpha value.
      * This default may be noticeable and undesired in the case where the View you are setting an opacity on
      * has multiple overlapping elements (e.g. multiple overlapping Views, or text and a background).
      *
      * Rendering offscreen to preserve correct alpha behavior is extremely expensive
      * and hard to debug for non-native developers, which is why it is not turned on by default.
      * If you do need to enable this property for an animation,
      * consider combining it with renderToHardwareTextureAndroid if the view contents are static (i.e. it doesn't need to be redrawn each frame).
      * If that property is enabled, this View will be rendered off-screen once,
      * saved in a hardware texture, and then composited onto the screen with an alpha each frame without having to switch rendering targets on the GPU.
      */
    var needsOffscreenAlphaCompositing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
      */
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.undefined
    
    /**
      * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
      * @platform ios
      */
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
      * @platform ios
      */
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Invoked on mount and layout changes with
      *
      * {nativeEvent: { layout: {x, y, width, height}}}.
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
    
    /**
      * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
      * @platform ios
      */
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Called for every touch move on the View when it is not the responder: does this view want to "claim" touch responsiveness?
      */
    var onMoveShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
      * where the deepest node is called first.
      * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
      * This is desirable in most cases, because it makes sure all controls and buttons are usable.
      *
      * However, sometimes a parent will want to make sure that it becomes responder.
      * This can be handled by using the capture phase.
      * Before the responder system bubbles up from the deepest component,
      * it will do a capture phase, firing on*ShouldSetResponderCapture.
      * So if a parent View wants to prevent the child from becoming responder on a touch start,
      * it should have a onStartShouldSetResponderCapture handler which returns true.
      */
    var onMoveShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onPointerCancel: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerCancelCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDown: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerDownCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnter: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerEnterCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeave: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerLeaveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMove: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerMoveCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUp: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    var onPointerUpCapture: js.UndefOr[js.Function1[/* event */ PointerEvent, Unit]] = js.undefined
    
    /**
      * If the View returns true and attempts to become the responder, one of the following will happen:
      */
    var onResponderEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * The View is now responding for touch events.
      * This is the time to highlight and show the user what is happening
      */
    var onResponderGrant: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * If the view is responding, the following handlers can be called:
      */
    /**
      * The user is moving their finger
      */
    var onResponderMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Something else is the responder right now and will not release it
      */
    var onResponderReject: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * Fired at the end of the touch, ie "touchUp"
      */
    var onResponderRelease: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onResponderStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      * The responder has been taken from the View.
      * Might be taken by other views after a call to onResponderTerminationRequest,
      * or might be taken by the OS without asking (happens with control center/ notification center on iOS)
      */
    var onResponderTerminate: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      *  Something else wants to become responder.
      *  Should this view release the responder? Returning true allows release
      */
    var onResponderTerminationRequest: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * A view can become the touch responder by implementing the correct negotiation methods.
      * There are two methods to ask the view if it wants to become responder:
      */
    /**
      * Does this view want to become responder on the start of a touch?
      */
    var onStartShouldSetResponder: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    /**
      * onStartShouldSetResponder and onMoveShouldSetResponder are called with a bubbling pattern,
      * where the deepest node is called first.
      * That means that the deepest component will become responder when multiple Views return true for *ShouldSetResponder handlers.
      * This is desirable in most cases, because it makes sure all controls and buttons are usable.
      *
      * However, sometimes a parent will want to make sure that it becomes responder.
      * This can be handled by using the capture phase.
      * Before the responder system bubbles up from the deepest component,
      * it will do a capture phase, firing on*ShouldSetResponderCapture.
      * So if a parent View wants to prevent the child from becoming responder on a touch start,
      * it should have a onStartShouldSetResponderCapture handler which returns true.
      */
    var onStartShouldSetResponderCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Boolean]] = js.undefined
    
    var onTouchCancel: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEnd: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchEndCapture: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchMove: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    var onTouchStart: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
    
    /**
      *
      * In the absence of auto property, none is much like CSS's none value. box-none is as if you had applied the CSS class:
      *
      * .box-none {
      *   pointer-events: none;
      * }
      * .box-none * {
      *   pointer-events: all;
      * }
      *
      * box-only is the equivalent of
      *
      * .box-only {
      *   pointer-events: all;
      * }
      * .box-only * {
      *   pointer-events: none;
      * }
      *
      * But since pointerEvents does not affect layout/appearance, and we are already deviating from the spec by adding additional modes,
      * we opt to not include pointerEvents on style. On some platforms, we would need to implement it as a className anyways. Using style or not is an implementation detail of the platform.
      */
    var pointerEvents: js.UndefOr[`box-none` | none | `box-only` | auto] = js.undefined
    
    /**
      *
      * This is a special performance property exposed by RCTView and is useful for scrolling content when there are many subviews,
      * most of which are offscreen. For this property to be effective, it must be applied to a view that contains many subviews that extend outside its bound.
      * The subviews must also have overflow: hidden, as should the containing view (or one of its superviews).
      */
    var removeClippedSubviews: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this view should render itself (and all of its children) into a single hardware texture on the GPU.
      *
      * On Android, this is useful for animations and interactions that only modify opacity, rotation, translation, and/or scale:
      * in those cases, the view doesn't have to be redrawn and display lists don't need to be re-executed. The texture can just be
      * re-used and re-composited with different parameters. The downside is that this can use up limited video memory, so this prop should be set back to false at the end of the interaction/animation.
      */
    var renderToHardwareTextureAndroid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this view should be rendered as a bitmap before compositing.
      *
      * On iOS, this is useful for animations and interactions that do not modify this component's dimensions nor its children;
      * for example, when translating the position of a static view, rasterization allows the renderer to reuse a cached bitmap of a static view
      * and quickly composite it during each frame.
      *
      * Rasterization incurs an off-screen drawing pass and the bitmap consumes memory.
      * Test and measure when using this property.
      */
    var shouldRasterizeIOS: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.undefined
    
    /**
      * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 1.0.
      *
      * @platform ios
      */
    var tvParallaxMagnification: js.UndefOr[Double] = js.undefined
    
    /**
      * *(Apple TV only)* Object with properties to control Apple TV parallax effects.
      *
      * @platform ios
      */
    var tvParallaxProperties: js.UndefOr[TVParallaxProperties] = js.undefined
    
    /**
      * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
      *
      * @platform ios
      */
    var tvParallaxShiftDistanceX: js.UndefOr[Double] = js.undefined
    
    /**
      * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 2.0.
      *
      * @platform ios
      */
    var tvParallaxShiftDistanceY: js.UndefOr[Double] = js.undefined
    
    /**
      * *(Apple TV only)* May be used to change the appearance of the Apple TV parallax effect when this view goes in or out of focus.  Defaults to 0.05.
      *
      * @platform ios
      */
    var tvParallaxTiltAngle: js.UndefOr[Double] = js.undefined
  }
  object ViewPropschildrenReactNod {
    
    inline def apply(): ViewPropschildrenReactNod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewPropschildrenReactNod]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewPropschildrenReactNod] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityActions(value: js.Array[AccessibilityActionInfo]): Self = StObject.set(x, "accessibilityActions", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityActionsUndefined: Self = StObject.set(x, "accessibilityActions", js.undefined)
      
      inline def setAccessibilityActionsVarargs(value: AccessibilityActionInfo*): Self = StObject.set(x, "accessibilityActions", js.Array(value*))
      
      inline def setAccessibilityElementsHidden(value: Boolean): Self = StObject.set(x, "accessibilityElementsHidden", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityElementsHiddenUndefined: Self = StObject.set(x, "accessibilityElementsHidden", js.undefined)
      
      inline def setAccessibilityHint(value: String): Self = StObject.set(x, "accessibilityHint", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityHintUndefined: Self = StObject.set(x, "accessibilityHint", js.undefined)
      
      inline def setAccessibilityIgnoresInvertColors(value: Boolean): Self = StObject.set(x, "accessibilityIgnoresInvertColors", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityIgnoresInvertColorsUndefined: Self = StObject.set(x, "accessibilityIgnoresInvertColors", js.undefined)
      
      inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelUndefined: Self = StObject.set(x, "accessibilityLabel", js.undefined)
      
      inline def setAccessibilityLabelledBy(value: String | js.Array[String]): Self = StObject.set(x, "accessibilityLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLabelledByUndefined: Self = StObject.set(x, "accessibilityLabelledBy", js.undefined)
      
      inline def setAccessibilityLabelledByVarargs(value: String*): Self = StObject.set(x, "accessibilityLabelledBy", js.Array(value*))
      
      inline def setAccessibilityLanguage(value: String): Self = StObject.set(x, "accessibilityLanguage", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLanguageUndefined: Self = StObject.set(x, "accessibilityLanguage", js.undefined)
      
      inline def setAccessibilityLiveRegion(value: none | polite | assertive): Self = StObject.set(x, "accessibilityLiveRegion", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityLiveRegionUndefined: Self = StObject.set(x, "accessibilityLiveRegion", js.undefined)
      
      inline def setAccessibilityRole(value: AccessibilityRole): Self = StObject.set(x, "accessibilityRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityRoleUndefined: Self = StObject.set(x, "accessibilityRole", js.undefined)
      
      inline def setAccessibilityState(value: AccessibilityState): Self = StObject.set(x, "accessibilityState", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityStateUndefined: Self = StObject.set(x, "accessibilityState", js.undefined)
      
      inline def setAccessibilityValue(value: AccessibilityValue): Self = StObject.set(x, "accessibilityValue", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityValueUndefined: Self = StObject.set(x, "accessibilityValue", js.undefined)
      
      inline def setAccessibilityViewIsModal(value: Boolean): Self = StObject.set(x, "accessibilityViewIsModal", value.asInstanceOf[js.Any])
      
      inline def setAccessibilityViewIsModalUndefined: Self = StObject.set(x, "accessibilityViewIsModal", js.undefined)
      
      inline def setAccessible(value: Boolean): Self = StObject.set(x, "accessible", value.asInstanceOf[js.Any])
      
      inline def setAccessibleUndefined: Self = StObject.set(x, "accessible", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCollapsable(value: Boolean): Self = StObject.set(x, "collapsable", value.asInstanceOf[js.Any])
      
      inline def setCollapsableUndefined: Self = StObject.set(x, "collapsable", js.undefined)
      
      inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setHasTVPreferredFocus(value: Boolean): Self = StObject.set(x, "hasTVPreferredFocus", value.asInstanceOf[js.Any])
      
      inline def setHasTVPreferredFocusUndefined: Self = StObject.set(x, "hasTVPreferredFocus", js.undefined)
      
      inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
      
      inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
      
      inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      inline def setIsTVSelectable(value: Boolean): Self = StObject.set(x, "isTVSelectable", value.asInstanceOf[js.Any])
      
      inline def setIsTVSelectableUndefined: Self = StObject.set(x, "isTVSelectable", js.undefined)
      
      inline def setNativeID(value: String): Self = StObject.set(x, "nativeID", value.asInstanceOf[js.Any])
      
      inline def setNativeIDUndefined: Self = StObject.set(x, "nativeID", js.undefined)
      
      inline def setNeedsOffscreenAlphaCompositing(value: Boolean): Self = StObject.set(x, "needsOffscreenAlphaCompositing", value.asInstanceOf[js.Any])
      
      inline def setNeedsOffscreenAlphaCompositingUndefined: Self = StObject.set(x, "needsOffscreenAlphaCompositing", js.undefined)
      
      inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
      
      inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
      
      inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
      
      inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
      
      inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
      
      inline def setOnLayout(value: /* event */ LayoutChangeEvent => Unit): Self = StObject.set(x, "onLayout", js.Any.fromFunction1(value))
      
      inline def setOnLayoutUndefined: Self = StObject.set(x, "onLayout", js.undefined)
      
      inline def setOnMagicTap(value: () => Unit): Self = StObject.set(x, "onMagicTap", js.Any.fromFunction0(value))
      
      inline def setOnMagicTapUndefined: Self = StObject.set(x, "onMagicTap", js.undefined)
      
      inline def setOnMoveShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnMoveShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onMoveShouldSetResponderCapture", js.undefined)
      
      inline def setOnMoveShouldSetResponderUndefined: Self = StObject.set(x, "onMoveShouldSetResponder", js.undefined)
      
      inline def setOnPointerCancel(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerCancelCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerCancelCaptureUndefined: Self = StObject.set(x, "onPointerCancelCapture", js.undefined)
      
      inline def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      inline def setOnPointerDown(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerDownCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerDownCaptureUndefined: Self = StObject.set(x, "onPointerDownCapture", js.undefined)
      
      inline def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      inline def setOnPointerEnter(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerEnterCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerEnterCaptureUndefined: Self = StObject.set(x, "onPointerEnterCapture", js.undefined)
      
      inline def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      inline def setOnPointerLeave(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerLeaveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerLeaveCaptureUndefined: Self = StObject.set(x, "onPointerLeaveCapture", js.undefined)
      
      inline def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      inline def setOnPointerMove(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerMoveCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerMoveCaptureUndefined: Self = StObject.set(x, "onPointerMoveCapture", js.undefined)
      
      inline def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      inline def setOnPointerUp(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCapture(value: /* event */ PointerEvent => Unit): Self = StObject.set(x, "onPointerUpCapture", js.Any.fromFunction1(value))
      
      inline def setOnPointerUpCaptureUndefined: Self = StObject.set(x, "onPointerUpCapture", js.undefined)
      
      inline def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      inline def setOnResponderEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderEnd", js.Any.fromFunction1(value))
      
      inline def setOnResponderEndUndefined: Self = StObject.set(x, "onResponderEnd", js.undefined)
      
      inline def setOnResponderGrant(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderGrant", js.Any.fromFunction1(value))
      
      inline def setOnResponderGrantUndefined: Self = StObject.set(x, "onResponderGrant", js.undefined)
      
      inline def setOnResponderMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderMove", js.Any.fromFunction1(value))
      
      inline def setOnResponderMoveUndefined: Self = StObject.set(x, "onResponderMove", js.undefined)
      
      inline def setOnResponderReject(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderReject", js.Any.fromFunction1(value))
      
      inline def setOnResponderRejectUndefined: Self = StObject.set(x, "onResponderReject", js.undefined)
      
      inline def setOnResponderRelease(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderRelease", js.Any.fromFunction1(value))
      
      inline def setOnResponderReleaseUndefined: Self = StObject.set(x, "onResponderRelease", js.undefined)
      
      inline def setOnResponderStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderStart", js.Any.fromFunction1(value))
      
      inline def setOnResponderStartUndefined: Self = StObject.set(x, "onResponderStart", js.undefined)
      
      inline def setOnResponderTerminate(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onResponderTerminate", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminateUndefined: Self = StObject.set(x, "onResponderTerminate", js.undefined)
      
      inline def setOnResponderTerminationRequest(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onResponderTerminationRequest", js.Any.fromFunction1(value))
      
      inline def setOnResponderTerminationRequestUndefined: Self = StObject.set(x, "onResponderTerminationRequest", js.undefined)
      
      inline def setOnStartShouldSetResponder(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponder", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCapture(value: /* event */ GestureResponderEvent => Boolean): Self = StObject.set(x, "onStartShouldSetResponderCapture", js.Any.fromFunction1(value))
      
      inline def setOnStartShouldSetResponderCaptureUndefined: Self = StObject.set(x, "onStartShouldSetResponderCapture", js.undefined)
      
      inline def setOnStartShouldSetResponderUndefined: Self = StObject.set(x, "onStartShouldSetResponder", js.undefined)
      
      inline def setOnTouchCancel(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      inline def setOnTouchEnd(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCapture(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchEndCapture", js.Any.fromFunction1(value))
      
      inline def setOnTouchEndCaptureUndefined: Self = StObject.set(x, "onTouchEndCapture", js.undefined)
      
      inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      inline def setOnTouchMove(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      inline def setOnTouchStart(value: /* event */ GestureResponderEvent => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      inline def setPointerEvents(value: `box-none` | none | `box-only` | auto): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
      
      inline def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
      
      inline def setRemoveClippedSubviews(value: Boolean): Self = StObject.set(x, "removeClippedSubviews", value.asInstanceOf[js.Any])
      
      inline def setRemoveClippedSubviewsUndefined: Self = StObject.set(x, "removeClippedSubviews", js.undefined)
      
      inline def setRenderToHardwareTextureAndroid(value: Boolean): Self = StObject.set(x, "renderToHardwareTextureAndroid", value.asInstanceOf[js.Any])
      
      inline def setRenderToHardwareTextureAndroidUndefined: Self = StObject.set(x, "renderToHardwareTextureAndroid", js.undefined)
      
      inline def setShouldRasterizeIOS(value: Boolean): Self = StObject.set(x, "shouldRasterizeIOS", value.asInstanceOf[js.Any])
      
      inline def setShouldRasterizeIOSUndefined: Self = StObject.set(x, "shouldRasterizeIOS", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
      
      inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
      
      inline def setTvParallaxMagnification(value: Double): Self = StObject.set(x, "tvParallaxMagnification", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxMagnificationUndefined: Self = StObject.set(x, "tvParallaxMagnification", js.undefined)
      
      inline def setTvParallaxProperties(value: TVParallaxProperties): Self = StObject.set(x, "tvParallaxProperties", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxPropertiesUndefined: Self = StObject.set(x, "tvParallaxProperties", js.undefined)
      
      inline def setTvParallaxShiftDistanceX(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceX", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceXUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceX", js.undefined)
      
      inline def setTvParallaxShiftDistanceY(value: Double): Self = StObject.set(x, "tvParallaxShiftDistanceY", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxShiftDistanceYUndefined: Self = StObject.set(x, "tvParallaxShiftDistanceY", js.undefined)
      
      inline def setTvParallaxTiltAngle(value: Double): Self = StObject.set(x, "tvParallaxTiltAngle", value.asInstanceOf[js.Any])
      
      inline def setTvParallaxTiltAngleUndefined: Self = StObject.set(x, "tvParallaxTiltAngle", js.undefined)
    }
  }
}
