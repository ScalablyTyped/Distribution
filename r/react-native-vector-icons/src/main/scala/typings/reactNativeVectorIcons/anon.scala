package typings.reactNativeVectorIcons

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
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
import typings.reactNativeVectorIcons.iconMod.Icon
import typings.reactNativeVectorIcons.iconMod.ImageSource
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`0`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`1`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`2`
import typings.reactNativeVectorIcons.reactNativeVectorIconsNumbers.`3`
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.`no-hide-descendants`
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.all
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.assertive
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.auto
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.balanced
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.button
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.clip
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.email
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.head
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.highQuality
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.link
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.middle
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.no
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.none
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.phoneNumber
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.polite
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.radiobutton_checked
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.radiobutton_unchecked
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.simple
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.tail
import typings.reactNativeVectorIcons.reactNativeVectorIconsStrings.yes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Brand extends StObject {
    
    var brand: `3` = js.native
    
    var light: `1` = js.native
    
    var regular: `0` = js.native
    
    var solid: `2` = js.native
  }
  object Brand {
    
    @scala.inline
    def apply(brand: `3`, light: `1`, regular: `0`, solid: `2`): Brand = {
      val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Brand]
    }
    
    @scala.inline
    implicit class BrandMutableBuilder[Self <: Brand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrand(value: `3`): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLight(value: `1`): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegular(value: `0`): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolid(value: `2`): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable0[Icon] {
    
    var Button: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.Button] = js.native
    
    var TabBarItem: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItem] = js.native
    
    var TabBarItemIOS: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.TabBarItemIOS] = js.native
    
    var ToolbarAndroid: Instantiable0[typings.reactNativeVectorIcons.iconMod.Icon.ToolbarAndroid] = js.native
    
    def getImageSource(name: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: js.UndefOr[scala.Nothing], color: String): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double): js.Promise[ImageSource] = js.native
    def getImageSource(name: String, size: Double, color: String): js.Promise[ImageSource] = js.native
    
    def getImageSourceSync(name: String): ImageSource = js.native
    def getImageSourceSync(name: String, size: js.UndefOr[scala.Nothing], color: String): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double): ImageSource = js.native
    def getImageSourceSync(name: String, size: Double, color: String): ImageSource = js.native
    
    def getRawGlyphMap(): StringDictionary[Double] = js.native
    
    def hasIcon(name: String): Boolean = js.native
    
    def loadFont(): js.Promise[Unit] = js.native
    def loadFont(file: String): js.Promise[Unit] = js.native
  }
  
  /* Inlined {[ K in react-native-vector-icons.react-native-vector-icons/FontAwesome5.FontAwesome5IconVariants ]:? boolean} & react-native-vector-icons.react-native-vector-icons/Icon.IconProps */
  @js.native
  trait KinFontAwesome5IconVarian extends StObject {
    
    /**
      * Provides an array of custom actions available for accessibility.
      */
    var accessibilityActions: js.UndefOr[js.Array[AccessibilityActionInfo]] = js.native
    
    /**
      * In some cases, we also want to alert the end user of the type of selected component (i.e., that it is a “button”).
      * If we were using native buttons, this would work automatically. Since we are using javascript, we need to
      * provide a bit more context for TalkBack. To do so, you must specify the ‘accessibilityComponentType’ property
      * for any UI component. For instances, we support ‘button’, ‘radiobutton_checked’ and ‘radiobutton_unchecked’ and so on.
      * @platform android
      */
    var accessibilityComponentType: js.UndefOr[none | button | radiobutton_checked | radiobutton_unchecked] = js.native
    
    /**
      * A Boolean value indicating whether the accessibility elements contained within this accessibility element
      * are hidden to the screen reader.
      * @platform ios
      */
    var accessibilityElementsHidden: js.UndefOr[Boolean] = js.native
    
    /**
      * An accessibility hint helps users understand what will happen when they perform an action on the accessibility element when that result is not obvious from the accessibility label.
      */
    var accessibilityHint: js.UndefOr[String] = js.native
    
    /**
      * https://reactnative.dev/docs/accessibility#accessibilityignoresinvertcolorsios
      * @platform ios
      */
    var accessibilityIgnoresInvertColors: js.UndefOr[Boolean] = js.native
    
    /**
      * Overrides the text that's read by the screen reader when the user interacts with the element. By default, the
      * label is constructed by traversing all the children and accumulating all the Text nodes separated by space.
      */
    var accessibilityLabel: js.UndefOr[String] = js.native
    
    /**
      * Indicates to accessibility services whether the user should be notified when this view changes.
      * Works for Android API >= 19 only.
      * See http://developer.android.com/reference/android/view/View.html#attr_android:accessibilityLiveRegion for references.
      * @platform android
      */
    var accessibilityLiveRegion: js.UndefOr[none | polite | assertive] = js.native
    
    /**
      * Accessibility Role tells a person using either VoiceOver on iOS or TalkBack on Android the type of element that is focused on.
      */
    var accessibilityRole: js.UndefOr[AccessibilityRole] = js.native
    
    /**
      * Accessibility State tells a person using either VoiceOver on iOS or TalkBack on Android the state of the element currently focused on.
      */
    var accessibilityState: js.UndefOr[AccessibilityState] = js.native
    
    /**
      * Accessibility traits tell a person using VoiceOver what kind of element they have selected.
      * Is this element a label? A button? A header? These questions are answered by accessibilityTraits.
      * @platform ios
      */
    var accessibilityTraits: js.UndefOr[AccessibilityTrait | js.Array[AccessibilityTrait]] = js.native
    
    /**
      * Represents the current value of a component. It can be a textual description of a component's value, or for range-based components, such as sliders and progress bars,
      * it contains range information (minimum, current, and maximum).
      */
    var accessibilityValue: js.UndefOr[AccessibilityValue] = js.native
    
    /**
      * A Boolean value indicating whether VoiceOver should ignore the elements within views that are siblings of the receiver.
      * @platform ios
      */
    var accessibilityViewIsModal: js.UndefOr[Boolean] = js.native
    
    /**
      * When true, indicates that the view is an accessibility element.
      * By default, all the touchable elements are accessible.
      */
    var accessible: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether font should be scaled down automatically to fit given style constraints.
      */
    var adjustsFontSizeToFit: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether fonts should scale to respect Text Size accessibility settings.
      * The default is `true`.
      */
    var allowFontScaling: js.UndefOr[Boolean] = js.native
    
    var brand: js.UndefOr[Boolean] = js.native
    
    /**
      * Color of the icon
      *
      */
    var color: js.UndefOr[String] = js.native
    
    /**
      * Determines the types of data converted to clickable URLs in the text element.
      * By default no data types are detected.
      */
    var dataDetectorType: js.UndefOr[Null | phoneNumber | link | email | none | all] = js.native
    
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
    var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
    
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
    var importantForAccessibility: js.UndefOr[auto | yes | no | `no-hide-descendants`] = js.native
    
    var light: js.UndefOr[Boolean] = js.native
    
    /**
      * Line Break mode. Works only with numberOfLines.
      * clip is working only for iOS
      */
    var lineBreakMode: js.UndefOr[head | middle | tail | clip] = js.native
    
    /**
      * Specifies largest possible scale a font can reach when allowFontScaling is enabled. Possible values:
      * - null/undefined (default): inherit from the parent node or the global default (0)
      * - 0: no max, ignore parent/global default
      * - >= 1: sets the maxFontSizeMultiplier of this node to this value
      */
    var maxFontSizeMultiplier: js.UndefOr[Double | Null] = js.native
    
    /**
      * Specifies smallest possible scale a font can reach when adjustsFontSizeToFit is enabled. (values 0.01-1.0).
      */
    var minimumFontScale: js.UndefOr[Double] = js.native
    
    /**
      * Name of the icon to show
      *
      * See Icon Explorer app
      * {@link https://github.com/oblador/react-native-vector-icons/tree/master/Examples/IconExplorer}
      */
    var name: String = js.native
    
    /**
      * Used to reference react managed views from native code.
      */
    var nativeID: js.UndefOr[String] = js.native
    
    /**
      * Used to truncate the text with an ellipsis after computing the text
      * layout, including line wrapping, such that the total number of lines
      * does not exceed this number.
      *
      * This prop is commonly used with `ellipsizeMode`.
      */
    var numberOfLines: js.UndefOr[Double] = js.native
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs an accessibility custom action.
      */
    var onAccessibilityAction: js.UndefOr[js.Function1[/* event */ AccessibilityActionEvent, Unit]] = js.native
    
    /**
      * When accessibile is true, the system will invoke this function when the user performs the escape gesture (scrub with two fingers).
      * @platform ios
      */
    var onAccessibilityEscape: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * When `accessible` is true, the system will try to invoke this function when the user performs accessibility tap gesture.
      * @platform ios
      */
    var onAccessibilityTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * Invoked on mount and layout changes with
      *
      * {nativeEvent: { layout: {x, y, width, height}}}.
      */
    var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.native
    
    /**
      * This function is called on long press.
      * e.g., `onLongPress={this.increaseSize}>``
      */
    var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    /**
      * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
      * @platform ios
      */
    var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * This function is called on press.
      * Text intrinsically supports press handling with a default highlight state (which can be disabled with suppressHighlighting).
      */
    var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.native
    
    /**
      * Invoked on Text layout
      */
    var onTextLayout: js.UndefOr[js.Function1[/* event */ NativeSyntheticEvent[TextLayoutEventData], Unit]] = js.native
    
    /**
      * Lets the user select text, to use the native copy and paste functionality.
      */
    var selectable: js.UndefOr[Boolean] = js.native
    
    /**
      * The highlight color of the text.
      */
    var selectionColor: js.UndefOr[ColorValue] = js.native
    
    /**
      * Size of the icon, can also be passed as fontSize in the style object.
      *
      * @default 12
      */
    var size: js.UndefOr[Double] = js.native
    
    var solid: js.UndefOr[Boolean] = js.native
    
    /**
      * @see https://reactnative.dev/docs/text#style
      */
    var style: js.UndefOr[StyleProp[TextStyle]] = js.native
    
    /**
      * When `true`, no visual change is made when text is pressed down. By
      * default, a gray oval highlights the text on press down.
      */
    var suppressHighlighting: js.UndefOr[Boolean] = js.native
    
    /**
      * Used to locate this view in end-to-end tests.
      */
    var testID: js.UndefOr[String] = js.native
    
    /**
      * Set text break strategy on Android API Level 23+
      * default is `highQuality`.
      */
    var textBreakStrategy: js.UndefOr[simple | highQuality | balanced] = js.native
  }
  object KinFontAwesome5IconVarian {
    
    @scala.inline
    def apply(name: String): KinFontAwesome5IconVarian = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KinFontAwesome5IconVarian]
    }
    
    @scala.inline
    implicit class KinFontAwesome5IconVarianMutableBuilder[Self <: KinFontAwesome5IconVarian] (val x: Self) extends AnyVal {
      
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
      def setAdjustsFontSizeToFit(value: Boolean): Self = StObject.set(x, "adjustsFontSizeToFit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustsFontSizeToFitUndefined: Self = StObject.set(x, "adjustsFontSizeToFit", js.undefined)
      
      @scala.inline
      def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
      
      @scala.inline
      def setBrand(value: Boolean): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
      
      @scala.inline
      def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
      
      @scala.inline
      def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
      
      @scala.inline
      def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
      
      @scala.inline
      def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
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
      def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
      
      @scala.inline
      def setOnTextLayout(value: /* event */ NativeSyntheticEvent[TextLayoutEventData] => Unit): Self = StObject.set(x, "onTextLayout", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTextLayoutUndefined: Self = StObject.set(x, "onTextLayout", js.undefined)
      
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
      def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
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
    }
  }
}
