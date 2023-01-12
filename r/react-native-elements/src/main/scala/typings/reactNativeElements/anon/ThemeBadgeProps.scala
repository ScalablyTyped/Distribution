package typings.reactNativeElements.anon

import org.scalablytyped.runtime.Instantiable1
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import typings.reactNativeElements.distInputInputMod.InputProps
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarProps
import typings.reactNativeElements.reactNativeElementsStrings.error
import typings.reactNativeElements.reactNativeElementsStrings.primary
import typings.reactNativeElements.reactNativeElementsStrings.success
import typings.reactNativeElements.reactNativeElementsStrings.warning
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-native-elements.react-native-elements/dist/config/theme.Theme<react-native-elements.react-native-elements/dist/badge/Badge.BadgeProps> */
trait ThemeBadgeProps extends StObject {
  
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
  
  var badgeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var colors: js.UndefOr[RecursivePartialColors] = js.undefined
  
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  
  var onPress: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  var status: js.UndefOr[primary | success | warning | error] = js.undefined
  
  var textProps: js.UndefOr[TextProps] = js.undefined
  
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  
  var value: js.UndefOr[ReactNode] = js.undefined
}
object ThemeBadgeProps {
  
  inline def apply(): ThemeBadgeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeBadgeProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeBadgeProps] (val x: Self) extends AnyVal {
    
    inline def setAirbnbRating(value: PartialSwipeRatingProps): Self = StObject.set(x, "AirbnbRating", value.asInstanceOf[js.Any])
    
    inline def setAirbnbRatingUndefined: Self = StObject.set(x, "AirbnbRating", js.undefined)
    
    inline def setAvatar(value: PartialAvatarProps): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessory(value: PartialAccessoryProps): Self = StObject.set(x, "AvatarAccessory", value.asInstanceOf[js.Any])
    
    inline def setAvatarAccessoryUndefined: Self = StObject.set(x, "AvatarAccessory", js.undefined)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "Avatar", js.undefined)
    
    inline def setBadge(value: PartialBadgeProps): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "badgeStyle", value.asInstanceOf[js.Any])
    
    inline def setBadgeStyleNull: Self = StObject.set(x, "badgeStyle", null)
    
    inline def setBadgeStyleUndefined: Self = StObject.set(x, "badgeStyle", js.undefined)
    
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
    
    inline def setDivider(value: PartialDividerProps): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
    
    inline def setDividerUndefined: Self = StObject.set(x, "Divider", js.undefined)
    
    inline def setFAB(value: PartialFABProps): Self = StObject.set(x, "FAB", value.asInstanceOf[js.Any])
    
    inline def setFABUndefined: Self = StObject.set(x, "FAB", js.undefined)
    
    inline def setHeader(value: PartialHeaderProps): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setIcon(value: PartialIconProps): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
    
    inline def setImage(value: PartialImageProps): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "Image", js.undefined)
    
    inline def setInput(value: Partial[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
    
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
    
    inline def setOnPress(value: /* repeated */ Any => Any): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOverlay(value: PartialOverlayProps): Self = StObject.set(x, "Overlay", value.asInstanceOf[js.Any])
    
    inline def setOverlayUndefined: Self = StObject.set(x, "Overlay", js.undefined)
    
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
    
    inline def setStatus(value: primary | success | warning | error): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
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
    
    inline def setText(value: PartialTextProps): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextProps(value: TextProps): Self = StObject.set(x, "textProps", value.asInstanceOf[js.Any])
    
    inline def setTextPropsUndefined: Self = StObject.set(x, "textProps", js.undefined)
    
    inline def setTextStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    inline def setTextStyleNull: Self = StObject.set(x, "textStyle", null)
    
    inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
    
    inline def setTile(value: PartialTileProps): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
    
    inline def setTileUndefined: Self = StObject.set(x, "Tile", js.undefined)
    
    inline def setTooltip(value: PartialTooltipProps): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "Tooltip", js.undefined)
    
    inline def setValue(value: ReactNode): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
