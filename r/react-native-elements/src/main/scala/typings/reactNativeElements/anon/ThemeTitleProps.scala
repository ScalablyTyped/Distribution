package typings.reactNativeElements.anon

import typings.react.mod.ReactNode
import typings.reactNative.mod.AccessibilityActionEvent
import typings.reactNative.mod.AccessibilityActionInfo
import typings.reactNative.mod.AccessibilityRole
import typings.reactNative.mod.AccessibilityState
import typings.reactNative.mod.AccessibilityValue
import typings.reactNative.mod.ColorValue
import typings.reactNative.mod.GestureResponderEvent
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextLayoutEventData
import typings.reactNative.mod.TextStyle
import typings.reactNativeElements.distInputInputMod.InputProps
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarProps
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.all
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.balanced
import typings.reactNativeElements.reactNativeElementsStrings.clip
import typings.reactNativeElements.reactNativeElementsStrings.email
import typings.reactNativeElements.reactNativeElementsStrings.full
import typings.reactNativeElements.reactNativeElementsStrings.head
import typings.reactNativeElements.reactNativeElementsStrings.highQuality
import typings.reactNativeElements.reactNativeElementsStrings.link
import typings.reactNativeElements.reactNativeElementsStrings.middle
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.normal
import typings.reactNativeElements.reactNativeElementsStrings.phoneNumber
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.simple
import typings.reactNativeElements.reactNativeElementsStrings.tail
import typings.reactNativeElements.reactNativeElementsStrings.yes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.Theme<react-native-elements.react-native-elements/dist/list/ListItemTitle.TitleProps> */
trait ThemeTitleProps extends StObject {
  
  var AirbnbRating: js.UndefOr[PartialSwipeRatingProps] = js.undefined
  
  var Avatar: js.UndefOr[PartialAvatarProps] = js.undefined
  
  var AvatarAccessory: js.UndefOr[PartialAccessoryProps] = js.undefined
  
  var Badge: js.UndefOr[PartialBadgeProps] = js.undefined
  
  var BottomSheet: js.UndefOr[PartialBottomSheetProps] = js.undefined
  
  var Button: js.UndefOr[PartialButtonProps] = js.undefined
  
  var ButtonGroup: js.UndefOr[PartialButtonGroupProps] = js.undefined
  
  var Card: js.UndefOr[PartialCardProps] = js.undefined
  
  var CardDivider: js.UndefOr[PartialDividerProps] = js.undefined
  
  var CardFeaturedSubtitle: js.UndefOr[PartialTextProps] = js.undefined
  
  var CardFeaturedTitle: js.UndefOr[PartialTextProps] = js.undefined
  
  var CardImage: js.UndefOr[PartialImageProps] = js.undefined
  
  var CardTitle: js.UndefOr[PartialTextProps] = js.undefined
  
  var CheckBox: js.UndefOr[PartialCheckBoxProps] = js.undefined
  
  var Divider: js.UndefOr[PartialDividerProps] = js.undefined
  
  var FAB: js.UndefOr[PartialFABProps] = js.undefined
  
  var Header: js.UndefOr[PartialHeaderProps] = js.undefined
  
  var Icon: js.UndefOr[PartialIconProps] = js.undefined
  
  var Image: js.UndefOr[PartialImageProps] = js.undefined
  
  var Input: js.UndefOr[Partial[InputProps]] = js.undefined
  
  var LinearProgress: js.UndefOr[PartialLinearProgressProp] = js.undefined
  
  var ListItem: js.UndefOr[PartialListItemProps] = js.undefined
  
  var ListItemAccordion: js.UndefOr[PartialListItemAccordionP] = js.undefined
  
  var ListItemButtonGroup: js.UndefOr[PartialButtonGroupProps] = js.undefined
  
  var ListItemCheckBox: js.UndefOr[PartialCheckBoxProps] = js.undefined
  
  var ListItemChevron: js.UndefOr[PartialIconProps] = js.undefined
  
  var ListItemContent: js.UndefOr[PartialViewProps] = js.undefined
  
  var ListItemInput: js.UndefOr[Partial[InputProps]] = js.undefined
  
  var ListItemSubtitle: js.UndefOr[PartialTextProps] = js.undefined
  
  var ListItemTitle: js.UndefOr[PartialTextProps] = js.undefined
  
  var Overlay: js.UndefOr[PartialOverlayProps] = js.undefined
  
  var PricingCard: js.UndefOr[PartialPricingCardProps] = js.undefined
  
  var Rating: js.UndefOr[PartialTapRatingProps] = js.undefined
  
  var SearchBar: js.UndefOr[Partial[SearchBarProps]] = js.undefined
  
  var Slider: js.UndefOr[PartialSliderProps] = js.undefined
  
  var SocialIcon: js.UndefOr[PartialSocialIconProps] = js.undefined
  
  var SpeedDial: js.UndefOr[PartialSpeedDialProps] = js.undefined
  
  var SpeedDialAction: js.UndefOr[PartialSpeedDialActionPro] = js.undefined
  
  var Switch: js.UndefOr[PartialSwitchProps] = js.undefined
  
  var Tab: js.UndefOr[PartialTabProps] = js.undefined
  
  var TabItem: js.UndefOr[PartialTabItemProps] = js.undefined
  
  var TabView: js.UndefOr[PartialTabViewProps] = js.undefined
  
  var TabViewItem: js.UndefOr[PartialViewProps] = js.undefined
  
  var Text: js.UndefOr[PartialTextProps] = js.undefined
  
  var Tile: js.UndefOr[PartialTileProps] = js.undefined
  
  var Tooltip: js.UndefOr[PartialTooltipProps] = js.undefined
  
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
  
  var colors: js.UndefOr[RecursivePartialColors] = js.undefined
  
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
  
  var right: js.UndefOr[Boolean] = js.undefined
  
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
object ThemeTitleProps {
  
  inline def apply(): ThemeTitleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeTitleProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeTitleProps] (val x: Self) extends AnyVal {
    
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
    
    inline def setAirbnbRating(value: PartialSwipeRatingProps): Self = StObject.set(x, "AirbnbRating", value.asInstanceOf[js.Any])
    
    inline def setAirbnbRatingUndefined: Self = StObject.set(x, "AirbnbRating", js.undefined)
    
    inline def setAllowFontScaling(value: Boolean): Self = StObject.set(x, "allowFontScaling", value.asInstanceOf[js.Any])
    
    inline def setAllowFontScalingUndefined: Self = StObject.set(x, "allowFontScaling", js.undefined)
    
    inline def setAndroid_hyphenationFrequency(value: normal | none | full): Self = StObject.set(x, "android_hyphenationFrequency", value.asInstanceOf[js.Any])
    
    inline def setAndroid_hyphenationFrequencyUndefined: Self = StObject.set(x, "android_hyphenationFrequency", js.undefined)
    
    inline def setAvatar(value: PartialAvatarProps): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessory(value: PartialAccessoryProps): Self = StObject.set(x, "AvatarAccessory", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessoryUndefined: Self = StObject.set(x, "AvatarAccessory", js.undefined)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
    
    inline def setBadge(value: PartialBadgeProps): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    inline def setBottomSheet(value: PartialBottomSheetProps): Self = StObject.set(x, "BottomSheet", value.asInstanceOf[js.Any])
    
    inline def setBottomSheetUndefined: Self = StObject.set(x, "BottomSheet", js.undefined)
    
    inline def setButton(value: PartialButtonProps): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
    
    inline def setButtonGroup(value: PartialButtonGroupProps): Self = StObject.set(x, "ButtonGroup", value.asInstanceOf[js.Any])
    
    inline def setButtonGroupUndefined: Self = StObject.set(x, "ButtonGroup", js.undefined)
    
    inline def setButtonUndefined: Self = StObject.set(x, "Button", js.undefined)
    
    inline def setCard(value: PartialCardProps): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
    
    inline def setCardDivider(value: PartialDividerProps): Self = StObject.set(x, "CardDivider", value.asInstanceOf[js.Any])
    
    inline def setCardDividerUndefined: Self = StObject.set(x, "CardDivider", js.undefined)
    
    inline def setCardFeaturedSubtitle(value: PartialTextProps): Self = StObject.set(x, "CardFeaturedSubtitle", value.asInstanceOf[js.Any])
    
    inline def setCardFeaturedSubtitleUndefined: Self = StObject.set(x, "CardFeaturedSubtitle", js.undefined)
    
    inline def setCardFeaturedTitle(value: PartialTextProps): Self = StObject.set(x, "CardFeaturedTitle", value.asInstanceOf[js.Any])
    
    inline def setCardFeaturedTitleUndefined: Self = StObject.set(x, "CardFeaturedTitle", js.undefined)
    
    inline def setCardImage(value: PartialImageProps): Self = StObject.set(x, "CardImage", value.asInstanceOf[js.Any])
    
    inline def setCardImageUndefined: Self = StObject.set(x, "CardImage", js.undefined)
    
    inline def setCardTitle(value: PartialTextProps): Self = StObject.set(x, "CardTitle", value.asInstanceOf[js.Any])
    
    inline def setCardTitleUndefined: Self = StObject.set(x, "CardTitle", js.undefined)
    
    inline def setCardUndefined: Self = StObject.set(x, "Card", js.undefined)
    
    inline def setCheckBox(value: PartialCheckBoxProps): Self = StObject.set(x, "CheckBox", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxUndefined: Self = StObject.set(x, "CheckBox", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColors(value: RecursivePartialColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setDataDetectorType(value: phoneNumber | link | email | none | all): Self = StObject.set(x, "dataDetectorType", value.asInstanceOf[js.Any])
    
    inline def setDataDetectorTypeNull: Self = StObject.set(x, "dataDetectorType", null)
    
    inline def setDataDetectorTypeUndefined: Self = StObject.set(x, "dataDetectorType", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDivider(value: PartialDividerProps): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
    
    inline def setEllipsizeMode(value: head | middle | tail | clip): Self = StObject.set(x, "ellipsizeMode", value.asInstanceOf[js.Any])
    
    inline def setEllipsizeModeUndefined: Self = StObject.set(x, "ellipsizeMode", js.undefined)
    
    inline def setFAB(value: PartialFABProps): Self = StObject.set(x, "FAB", value.asInstanceOf[js.Any])
    
    inline def setFABUndefined: Self = StObject.set(x, "FAB", js.undefined)
    
    inline def setHeader(value: PartialHeaderProps): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setIcon(value: PartialIconProps): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImage(value: PartialImageProps): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setInput(value: Partial[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setLineBreakMode(value: head | middle | tail | clip): Self = StObject.set(x, "lineBreakMode", value.asInstanceOf[js.Any])
    
    inline def setLineBreakModeUndefined: Self = StObject.set(x, "lineBreakMode", js.undefined)
    
    inline def setLinearProgress(value: PartialLinearProgressProp): Self = StObject.set(x, "LinearProgress", value.asInstanceOf[js.Any])
    
    inline def setLinearProgressUndefined: Self = StObject.set(x, "LinearProgress", js.undefined)
    
    inline def setListItem(value: PartialListItemProps): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
    
    inline def setListItemAccordion(value: PartialListItemAccordionP): Self = StObject.set(x, "ListItemAccordion", value.asInstanceOf[js.Any])
    
    inline def setListItemAccordionUndefined: Self = StObject.set(x, "ListItemAccordion", js.undefined)
    
    inline def setListItemButtonGroup(value: PartialButtonGroupProps): Self = StObject.set(x, "ListItemButtonGroup", value.asInstanceOf[js.Any])
    
    inline def setListItemButtonGroupUndefined: Self = StObject.set(x, "ListItemButtonGroup", js.undefined)
    
    inline def setListItemCheckBox(value: PartialCheckBoxProps): Self = StObject.set(x, "ListItemCheckBox", value.asInstanceOf[js.Any])
    
    inline def setListItemCheckBoxUndefined: Self = StObject.set(x, "ListItemCheckBox", js.undefined)
    
    inline def setListItemChevron(value: PartialIconProps): Self = StObject.set(x, "ListItemChevron", value.asInstanceOf[js.Any])
    
    inline def setListItemChevronUndefined: Self = StObject.set(x, "ListItemChevron", js.undefined)
    
    inline def setListItemContent(value: PartialViewProps): Self = StObject.set(x, "ListItemContent", value.asInstanceOf[js.Any])
    
    inline def setListItemContentUndefined: Self = StObject.set(x, "ListItemContent", js.undefined)
    
    inline def setListItemInput(value: Partial[InputProps]): Self = StObject.set(x, "ListItemInput", value.asInstanceOf[js.Any])
    
    inline def setListItemInputUndefined: Self = StObject.set(x, "ListItemInput", js.undefined)
    
    inline def setListItemSubtitle(value: PartialTextProps): Self = StObject.set(x, "ListItemSubtitle", value.asInstanceOf[js.Any])
    
    inline def setListItemSubtitleUndefined: Self = StObject.set(x, "ListItemSubtitle", js.undefined)
    
    inline def setListItemTitle(value: PartialTextProps): Self = StObject.set(x, "ListItemTitle", value.asInstanceOf[js.Any])
    
    inline def setListItemTitleUndefined: Self = StObject.set(x, "ListItemTitle", js.undefined)
    
    inline def setListItemUndefined: Self = StObject.set(x, "ListItem", js.undefined)
    
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
    
    inline def setOverlay(value: PartialOverlayProps): Self = StObject.set(x, "Overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "Overlay", js.undefined)
    
    inline def setPricingCard(value: PartialPricingCardProps): Self = StObject.set(x, "PricingCard", value.asInstanceOf[js.Any])
    
    inline def setPricingCardUndefined: Self = StObject.set(x, "PricingCard", js.undefined)
    
    inline def setRating(value: PartialTapRatingProps): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "Rating", js.undefined)
    
    inline def setRight(value: Boolean): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setSearchBar(value: Partial[SearchBarProps]): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "SearchBar", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setSelectionColor(value: ColorValue): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    inline def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    inline def setSlider(value: PartialSliderProps): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setSocialIcon(value: PartialSocialIconProps): Self = StObject.set(x, "SocialIcon", value.asInstanceOf[js.Any])
    
    inline def setSocialIconUndefined: Self = StObject.set(x, "SocialIcon", js.undefined)
    
    inline def setSpeedDial(value: PartialSpeedDialProps): Self = StObject.set(x, "SpeedDial", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialAction(value: PartialSpeedDialActionPro): Self = StObject.set(x, "SpeedDialAction", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialActionUndefined: Self = StObject.set(x, "SpeedDialAction", js.undefined)
    
    inline def setSpeedDialUndefined: Self = StObject.set(x, "SpeedDial", js.undefined)
    
    inline def setStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setSuppressHighlighting(value: Boolean): Self = StObject.set(x, "suppressHighlighting", value.asInstanceOf[js.Any])
    
    inline def setSuppressHighlightingUndefined: Self = StObject.set(x, "suppressHighlighting", js.undefined)
    
    inline def setSwitch(value: PartialSwitchProps): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
    
    inline def setSwitchUndefined: Self = StObject.set(x, "Switch", js.undefined)
    
    inline def setTab(value: PartialTabProps): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
    
    inline def setTabItem(value: PartialTabItemProps): Self = StObject.set(x, "TabItem", value.asInstanceOf[js.Any])
    
    inline def setTabItemUndefined: Self = StObject.set(x, "TabItem", js.undefined)
    
    inline def setTabUndefined: Self = StObject.set(x, "Tab", js.undefined)
    
    inline def setTabView(value: PartialTabViewProps): Self = StObject.set(x, "TabView", value.asInstanceOf[js.Any])
    
    inline def setTabViewItem(value: PartialViewProps): Self = StObject.set(x, "TabViewItem", value.asInstanceOf[js.Any])
    
    inline def setTabViewItemUndefined: Self = StObject.set(x, "TabViewItem", js.undefined)
    
    inline def setTabViewUndefined: Self = StObject.set(x, "TabView", js.undefined)
    
    inline def setTestID(value: String): Self = StObject.set(x, "testID", value.asInstanceOf[js.Any])
    
    inline def setTestIDUndefined: Self = StObject.set(x, "testID", js.undefined)
    
    inline def setText(value: PartialTextProps): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategy(value: simple | highQuality | balanced): Self = StObject.set(x, "textBreakStrategy", value.asInstanceOf[js.Any])
    
    inline def setTextBreakStrategyUndefined: Self = StObject.set(x, "textBreakStrategy", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTile(value: PartialTileProps): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
    
    inline def setTooltip(value: PartialTooltipProps): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
  }
}
