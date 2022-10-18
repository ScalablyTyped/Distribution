package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
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
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TargetedEvent
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distInputInputMod.InputProps
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarProps
import typings.reactNativeElements.reactNativeElementsStrings.`no-hide-descendants`
import typings.reactNativeElements.reactNativeElementsStrings.assertive
import typings.reactNativeElements.reactNativeElementsStrings.auto
import typings.reactNativeElements.reactNativeElementsStrings.no
import typings.reactNativeElements.reactNativeElementsStrings.none
import typings.reactNativeElements.reactNativeElementsStrings.polite
import typings.reactNativeElements.reactNativeElementsStrings.yes
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.Theme<react-native-elements.react-native-elements/dist/list/ListItemBase.ListItemProps> */
trait ThemeListItemPropsAccessibilityActions extends StObject {
  
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
  
  var Component: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      typings.react.mod.Component[js.Object, js.Object, js.Object]
    ])
  ] = js.undefined
  
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
  
  var ViewComponent: js.UndefOr[
    TypeofComponent & (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
      Component[js.Object, js.Object, js.Object]
    ])
  ] = js.undefined
  
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
    * Determines what the opacity of the wrapped view should be when touch is active.
    */
  var activeOpacity: js.UndefOr[Double] = js.undefined
  
  var bottomDivider: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Any] = js.undefined
  
  var colors: js.UndefOr[RecursivePartialColors] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Delay in ms, from onPressIn, before onLongPress is called.
    */
  var delayLongPress: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay in ms, from the start of the touch, before onPressIn is called.
    */
  var delayPressIn: js.UndefOr[Double] = js.undefined
  
  /**
    * Delay in ms, from the release of the touch, before onPressOut is called.
    */
  var delayPressOut: js.UndefOr[Double] = js.undefined
  
  /**
    * If true, disable all interactions for this component.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var disabledStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * This defines how far your touch can start away from the button.
    * This is added to pressRetentionOffset when moving off of the button.
    * NOTE The touch area never extends past the parent view bounds and
    * the Z-index of sibling views always takes precedence if a touch hits
    * two overlapping views.
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
  
  var linearGradientProps: js.UndefOr[Any] = js.undefined
  
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
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "blur" occurs, meaning the element lost focus.
    * Some platforms may not have the concept of blur.
    */
  var onBlur: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  /**
    * When `accessible` is true (which is the default) this may be called when
    * the OS-specific concept of "focus" occurs. Some platforms may not have
    * the concept of focus.
    */
  var onFocus: js.UndefOr[js.Function1[/* e */ NativeSyntheticEvent[TargetedEvent], Unit]] = js.undefined
  
  /**
    *
    * Called immediately after the underlay is hidden
    */
  var onHideUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoked on mount and layout changes with
    * {nativeEvent: {layout: {x, y, width, height}}}
    */
  var onLayout: js.UndefOr[js.Function1[/* event */ LayoutChangeEvent, Unit]] = js.undefined
  
  var onLongPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * When accessible is true, the system will invoke this function when the user performs the magic tap gesture.
    * @platform ios
    */
  var onMagicTap: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Called when the touch is released,
    * but not if cancelled (e.g. by a scroll that steals the responder lock).
    */
  var onPress: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressIn: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  var onPressOut: js.UndefOr[js.Function1[/* event */ GestureResponderEvent, Unit]] = js.undefined
  
  /**
    * Called immediately after the underlay is shown
    */
  var onShowUnderlay: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var pad: js.UndefOr[Double] = js.undefined
  
  /**
    * When the scroll view is disabled, this defines how far your
    * touch may move off of the button, before deactivating the button.
    * Once deactivated, try moving it back and you'll see that the button
    * is once again reactivated! Move it back and forth several times
    * while the scroll view is disabled. Ensure you pass in a constant
    * to reduce memory allocations.
    */
  var pressRetentionOffset: js.UndefOr[Insets] = js.undefined
  
  /**
    * @see https://reactnative.dev/docs/view#style
    */
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  /**
    * Used to locate this view in end-to-end tests.
    */
  var testID: js.UndefOr[String] = js.undefined
  
  var topDivider: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, doesn't play a system sound on touch.
    *
    * @platform android
    */
  var touchSoundDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The color of the underlay that will show through when the touch is active.
    */
  var underlayColor: js.UndefOr[ColorValue] = js.undefined
}
object ThemeListItemPropsAccessibilityActions {
  
  inline def apply(): ThemeListItemPropsAccessibilityActions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeListItemPropsAccessibilityActions]
  }
  
  extension [Self <: ThemeListItemPropsAccessibilityActions](x: Self) {
    
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
    
    inline def setActiveOpacity(value: Double): Self = StObject.set(x, "activeOpacity", value.asInstanceOf[js.Any])
    
    inline def setActiveOpacityUndefined: Self = StObject.set(x, "activeOpacity", js.undefined)
    
    inline def setAirbnbRating(value: PartialSwipeRatingProps): Self = StObject.set(x, "AirbnbRating", value.asInstanceOf[js.Any])
    
    inline def setAirbnbRatingUndefined: Self = StObject.set(x, "AirbnbRating", js.undefined)
    
    inline def setAvatar(value: PartialAvatarProps): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessory(value: PartialAccessoryProps): Self = StObject.set(x, "AvatarAccessory", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessoryUndefined: Self = StObject.set(x, "AvatarAccessory", js.undefined)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
    
    inline def setBadge(value: PartialBadgeProps): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "Badge", js.undefined)
    
    inline def setBottomDivider(value: Boolean): Self = StObject.set(x, "bottomDivider", value.asInstanceOf[js.Any])
    
    inline def setBottomDividerUndefined: Self = StObject.set(x, "bottomDivider", js.undefined)
    
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
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setColors(value: RecursivePartialColors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
    
    inline def setContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
    
    inline def setContainerStyleNull: Self = StObject.set(x, "containerStyle", null)
    
    inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
    
    inline def setDelayLongPress(value: Double): Self = StObject.set(x, "delayLongPress", value.asInstanceOf[js.Any])
    
    inline def setDelayLongPressUndefined: Self = StObject.set(x, "delayLongPress", js.undefined)
    
    inline def setDelayPressIn(value: Double): Self = StObject.set(x, "delayPressIn", value.asInstanceOf[js.Any])
    
    inline def setDelayPressInUndefined: Self = StObject.set(x, "delayPressIn", js.undefined)
    
    inline def setDelayPressOut(value: Double): Self = StObject.set(x, "delayPressOut", value.asInstanceOf[js.Any])
    
    inline def setDelayPressOutUndefined: Self = StObject.set(x, "delayPressOut", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
    
    inline def setDisabledStyleNull: Self = StObject.set(x, "disabledStyle", null)
    
    inline def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDivider(value: PartialDividerProps): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
    
    inline def setFAB(value: PartialFABProps): Self = StObject.set(x, "FAB", value.asInstanceOf[js.Any])
    
    inline def setFABUndefined: Self = StObject.set(x, "FAB", js.undefined)
    
    inline def setHeader(value: PartialHeaderProps): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setHitSlop(value: Insets): Self = StObject.set(x, "hitSlop", value.asInstanceOf[js.Any])
    
    inline def setHitSlopUndefined: Self = StObject.set(x, "hitSlop", js.undefined)
    
    inline def setIcon(value: PartialIconProps): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImage(value: PartialImageProps): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setImportantForAccessibility(value: auto | yes | no | `no-hide-descendants`): Self = StObject.set(x, "importantForAccessibility", value.asInstanceOf[js.Any])
    
    inline def setImportantForAccessibilityUndefined: Self = StObject.set(x, "importantForAccessibility", js.undefined)
    
    inline def setInput(value: Partial[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
    inline def setLinearGradientProps(value: Any): Self = StObject.set(x, "linearGradientProps", value.asInstanceOf[js.Any])
    
    inline def setLinearGradientPropsUndefined: Self = StObject.set(x, "linearGradientProps", js.undefined)
    
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
    
    inline def setOnAccessibilityAction(value: /* event */ AccessibilityActionEvent => Unit): Self = StObject.set(x, "onAccessibilityAction", js.Any.fromFunction1(value))
    
    inline def setOnAccessibilityActionUndefined: Self = StObject.set(x, "onAccessibilityAction", js.undefined)
    
    inline def setOnAccessibilityEscape(value: () => Unit): Self = StObject.set(x, "onAccessibilityEscape", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityEscapeUndefined: Self = StObject.set(x, "onAccessibilityEscape", js.undefined)
    
    inline def setOnAccessibilityTap(value: () => Unit): Self = StObject.set(x, "onAccessibilityTap", js.Any.fromFunction0(value))
    
    inline def setOnAccessibilityTapUndefined: Self = StObject.set(x, "onAccessibilityTap", js.undefined)
    
    inline def setOnBlur(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnFocus(value: /* e */ NativeSyntheticEvent[TargetedEvent] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnHideUnderlay(value: () => Unit): Self = StObject.set(x, "onHideUnderlay", js.Any.fromFunction0(value))
    
    inline def setOnHideUnderlayUndefined: Self = StObject.set(x, "onHideUnderlay", js.undefined)
    
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
    
    inline def setOnShowUnderlay(value: () => Unit): Self = StObject.set(x, "onShowUnderlay", js.Any.fromFunction0(value))
    
    inline def setOnShowUnderlayUndefined: Self = StObject.set(x, "onShowUnderlay", js.undefined)
    
    inline def setOverlay(value: PartialOverlayProps): Self = StObject.set(x, "Overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "Overlay", js.undefined)
    
    inline def setPad(value: Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
    
    inline def setPressRetentionOffset(value: Insets): Self = StObject.set(x, "pressRetentionOffset", value.asInstanceOf[js.Any])
    
    inline def setPressRetentionOffsetUndefined: Self = StObject.set(x, "pressRetentionOffset", js.undefined)
    
    inline def setPricingCard(value: PartialPricingCardProps): Self = StObject.set(x, "PricingCard", value.asInstanceOf[js.Any])
    
    inline def setPricingCardUndefined: Self = StObject.set(x, "PricingCard", js.undefined)
    
    inline def setRating(value: PartialTapRatingProps): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
    
    inline def setRatingUndefined: Self = StObject.set(x, "Rating", js.undefined)
    
    inline def setSearchBar(value: Partial[SearchBarProps]): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
    
    inline def setSearchBarUndefined: Self = StObject.set(x, "SearchBar", js.undefined)
    
    inline def setSlider(value: PartialSliderProps): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
    
    inline def setSliderUndefined: Self = StObject.set(x, "Slider", js.undefined)
    
    inline def setSocialIcon(value: PartialSocialIconProps): Self = StObject.set(x, "SocialIcon", value.asInstanceOf[js.Any])
    
    inline def setSocialIconUndefined: Self = StObject.set(x, "SocialIcon", js.undefined)
    
    inline def setSpeedDial(value: PartialSpeedDialProps): Self = StObject.set(x, "SpeedDial", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialAction(value: PartialSpeedDialActionPro): Self = StObject.set(x, "SpeedDialAction", value.asInstanceOf[js.Any])
    
    inline def setSpeedDialActionUndefined: Self = StObject.set(x, "SpeedDialAction", js.undefined)
    
    inline def setSpeedDialUndefined: Self = StObject.set(x, "SpeedDial", js.undefined)
    
    inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
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
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTile(value: PartialTileProps): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
    
    inline def setTooltip(value: PartialTooltipProps): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setTopDivider(value: Boolean): Self = StObject.set(x, "topDivider", value.asInstanceOf[js.Any])
    
    inline def setTopDividerUndefined: Self = StObject.set(x, "topDivider", js.undefined)
    
    inline def setTouchSoundDisabled(value: Boolean): Self = StObject.set(x, "touchSoundDisabled", value.asInstanceOf[js.Any])
    
    inline def setTouchSoundDisabledUndefined: Self = StObject.set(x, "touchSoundDisabled", js.undefined)
    
    inline def setUnderlayColor(value: ColorValue): Self = StObject.set(x, "underlayColor", value.asInstanceOf[js.Any])
    
    inline def setUnderlayColorUndefined: Self = StObject.set(x, "underlayColor", js.undefined)
    
    inline def setViewComponent(
      value: TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])
    ): Self = StObject.set(x, "ViewComponent", value.asInstanceOf[js.Any])
    
    inline def setViewComponentUndefined: Self = StObject.set(x, "ViewComponent", js.undefined)
  }
}
