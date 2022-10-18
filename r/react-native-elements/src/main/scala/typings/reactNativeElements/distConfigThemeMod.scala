package typings.reactNativeElements

import typings.reactNativeElements.anon.PartialAccessoryProps
import typings.reactNativeElements.anon.PartialAvatarPropsActiveOpacity
import typings.reactNativeElements.anon.PartialBadgeProps
import typings.reactNativeElements.anon.PartialBottomSheetProps
import typings.reactNativeElements.anon.PartialButtonGroupProps
import typings.reactNativeElements.anon.PartialButtonProps
import typings.reactNativeElements.anon.PartialCardProps
import typings.reactNativeElements.anon.PartialCheckBoxProps
import typings.reactNativeElements.anon.PartialDividerProps
import typings.reactNativeElements.anon.PartialFABProps
import typings.reactNativeElements.anon.PartialFullTheme
import typings.reactNativeElements.anon.PartialHeaderProps
import typings.reactNativeElements.anon.PartialIconProps
import typings.reactNativeElements.anon.PartialImageProps
import typings.reactNativeElements.anon.PartialLinearProgressProp
import typings.reactNativeElements.anon.PartialListItemAccordionP
import typings.reactNativeElements.anon.PartialListItemProps
import typings.reactNativeElements.anon.PartialOverlayProps
import typings.reactNativeElements.anon.PartialPricingCardProps
import typings.reactNativeElements.anon.PartialSliderProps
import typings.reactNativeElements.anon.PartialSocialIconProps
import typings.reactNativeElements.anon.PartialSpeedDialActionPro
import typings.reactNativeElements.anon.PartialSpeedDialProps
import typings.reactNativeElements.anon.PartialSwipeRatingProps
import typings.reactNativeElements.anon.PartialSwitchProps
import typings.reactNativeElements.anon.PartialTabItemProps
import typings.reactNativeElements.anon.PartialTabProps
import typings.reactNativeElements.anon.PartialTabViewPropsAnimationConfig
import typings.reactNativeElements.anon.PartialTapRatingProps
import typings.reactNativeElements.anon.PartialTextProps
import typings.reactNativeElements.anon.PartialTilePropsAccessibilityActions
import typings.reactNativeElements.anon.PartialTooltipProps
import typings.reactNativeElements.anon.PartialViewProps
import typings.reactNativeElements.anon.RecursivePartialColorsDisabled
import typings.reactNativeElements.anon.RecursivePartialFullThemeAvatarAccessory
import typings.reactNativeElements.distConfigColorsMod.Colors
import typings.reactNativeElements.distInputInputMod.InputProps
import typings.reactNativeElements.distSearchbarSearchBarMod.SearchBarProps
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeMod {
  
  object default {
    
    @JSImport("react-native-elements/dist/config/theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-elements/dist/config/theme", "default.colors")
    @js.native
    def colors: Colors = js.native
    inline def colors_=(x: Colors): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("colors")(x.asInstanceOf[js.Any])
  }
  
  trait FullTheme extends StObject {
    
    var AirbnbRating: PartialSwipeRatingProps
    
    var Avatar: PartialAvatarPropsActiveOpacity
    
    var AvatarAccessory: PartialAccessoryProps
    
    var Badge: PartialBadgeProps
    
    var BottomSheet: PartialBottomSheetProps
    
    var Button: PartialButtonProps
    
    var ButtonGroup: PartialButtonGroupProps
    
    var Card: PartialCardProps
    
    var CardDivider: PartialDividerProps
    
    var CardFeaturedSubtitle: PartialTextProps
    
    var CardFeaturedTitle: PartialTextProps
    
    var CardImage: PartialImageProps
    
    var CardTitle: PartialTextProps
    
    var CheckBox: PartialCheckBoxProps
    
    var Divider: PartialDividerProps
    
    var FAB: PartialFABProps
    
    var Header: PartialHeaderProps
    
    var Icon: PartialIconProps
    
    var Image: PartialImageProps
    
    var Input: Partial[InputProps]
    
    var LinearProgress: PartialLinearProgressProp
    
    var ListItem: PartialListItemProps
    
    var ListItemAccordion: PartialListItemAccordionP
    
    var ListItemButtonGroup: PartialButtonGroupProps
    
    var ListItemCheckBox: PartialCheckBoxProps
    
    var ListItemChevron: PartialIconProps
    
    var ListItemContent: PartialViewProps
    
    var ListItemInput: Partial[InputProps]
    
    var ListItemSubtitle: PartialTextProps
    
    var ListItemTitle: PartialTextProps
    
    var Overlay: PartialOverlayProps
    
    var PricingCard: PartialPricingCardProps
    
    var Rating: PartialTapRatingProps
    
    var SearchBar: Partial[SearchBarProps]
    
    var Slider: PartialSliderProps
    
    var SocialIcon: PartialSocialIconProps
    
    var SpeedDial: PartialSpeedDialProps
    
    var SpeedDialAction: PartialSpeedDialActionPro
    
    var Switch: PartialSwitchProps
    
    var Tab: PartialTabProps
    
    var TabItem: PartialTabItemProps
    
    var TabView: PartialTabViewPropsAnimationConfig
    
    var TabViewItem: PartialViewProps
    
    var Text: PartialTextProps
    
    var Tile: PartialTilePropsAccessibilityActions
    
    var Tooltip: PartialTooltipProps
    
    var colors: RecursivePartialColorsDisabled
  }
  object FullTheme {
    
    inline def apply(
      AirbnbRating: PartialSwipeRatingProps,
      Avatar: PartialAvatarPropsActiveOpacity,
      AvatarAccessory: PartialAccessoryProps,
      Badge: PartialBadgeProps,
      BottomSheet: PartialBottomSheetProps,
      Button: PartialButtonProps,
      ButtonGroup: PartialButtonGroupProps,
      Card: PartialCardProps,
      CardDivider: PartialDividerProps,
      CardFeaturedSubtitle: PartialTextProps,
      CardFeaturedTitle: PartialTextProps,
      CardImage: PartialImageProps,
      CardTitle: PartialTextProps,
      CheckBox: PartialCheckBoxProps,
      Divider: PartialDividerProps,
      FAB: PartialFABProps,
      Header: PartialHeaderProps,
      Icon: PartialIconProps,
      Image: PartialImageProps,
      Input: Partial[InputProps],
      LinearProgress: PartialLinearProgressProp,
      ListItem: PartialListItemProps,
      ListItemAccordion: PartialListItemAccordionP,
      ListItemButtonGroup: PartialButtonGroupProps,
      ListItemCheckBox: PartialCheckBoxProps,
      ListItemChevron: PartialIconProps,
      ListItemContent: PartialViewProps,
      ListItemInput: Partial[InputProps],
      ListItemSubtitle: PartialTextProps,
      ListItemTitle: PartialTextProps,
      Overlay: PartialOverlayProps,
      PricingCard: PartialPricingCardProps,
      Rating: PartialTapRatingProps,
      SearchBar: Partial[SearchBarProps],
      Slider: PartialSliderProps,
      SocialIcon: PartialSocialIconProps,
      SpeedDial: PartialSpeedDialProps,
      SpeedDialAction: PartialSpeedDialActionPro,
      Switch: PartialSwitchProps,
      Tab: PartialTabProps,
      TabItem: PartialTabItemProps,
      TabView: PartialTabViewPropsAnimationConfig,
      TabViewItem: PartialViewProps,
      Text: PartialTextProps,
      Tile: PartialTilePropsAccessibilityActions,
      Tooltip: PartialTooltipProps,
      colors: RecursivePartialColorsDisabled
    ): FullTheme = {
      val __obj = js.Dynamic.literal(AirbnbRating = AirbnbRating.asInstanceOf[js.Any], Avatar = Avatar.asInstanceOf[js.Any], AvatarAccessory = AvatarAccessory.asInstanceOf[js.Any], Badge = Badge.asInstanceOf[js.Any], BottomSheet = BottomSheet.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], ButtonGroup = ButtonGroup.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CardDivider = CardDivider.asInstanceOf[js.Any], CardFeaturedSubtitle = CardFeaturedSubtitle.asInstanceOf[js.Any], CardFeaturedTitle = CardFeaturedTitle.asInstanceOf[js.Any], CardImage = CardImage.asInstanceOf[js.Any], CardTitle = CardTitle.asInstanceOf[js.Any], CheckBox = CheckBox.asInstanceOf[js.Any], Divider = Divider.asInstanceOf[js.Any], FAB = FAB.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], LinearProgress = LinearProgress.asInstanceOf[js.Any], ListItem = ListItem.asInstanceOf[js.Any], ListItemAccordion = ListItemAccordion.asInstanceOf[js.Any], ListItemButtonGroup = ListItemButtonGroup.asInstanceOf[js.Any], ListItemCheckBox = ListItemCheckBox.asInstanceOf[js.Any], ListItemChevron = ListItemChevron.asInstanceOf[js.Any], ListItemContent = ListItemContent.asInstanceOf[js.Any], ListItemInput = ListItemInput.asInstanceOf[js.Any], ListItemSubtitle = ListItemSubtitle.asInstanceOf[js.Any], ListItemTitle = ListItemTitle.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], PricingCard = PricingCard.asInstanceOf[js.Any], Rating = Rating.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], Slider = Slider.asInstanceOf[js.Any], SocialIcon = SocialIcon.asInstanceOf[js.Any], SpeedDial = SpeedDial.asInstanceOf[js.Any], SpeedDialAction = SpeedDialAction.asInstanceOf[js.Any], Switch = Switch.asInstanceOf[js.Any], Tab = Tab.asInstanceOf[js.Any], TabItem = TabItem.asInstanceOf[js.Any], TabView = TabView.asInstanceOf[js.Any], TabViewItem = TabViewItem.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Tile = Tile.asInstanceOf[js.Any], Tooltip = Tooltip.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[FullTheme]
    }
    
    extension [Self <: FullTheme](x: Self) {
      
      inline def setAirbnbRating(value: PartialSwipeRatingProps): Self = StObject.set(x, "AirbnbRating", value.asInstanceOf[js.Any])
      
      inline def setAvatar(value: PartialAvatarPropsActiveOpacity): Self = StObject.set(x, "Avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarAccessory(value: PartialAccessoryProps): Self = StObject.set(x, "AvatarAccessory", value.asInstanceOf[js.Any])
      
      inline def setBadge(value: PartialBadgeProps): Self = StObject.set(x, "Badge", value.asInstanceOf[js.Any])
      
      inline def setBottomSheet(value: PartialBottomSheetProps): Self = StObject.set(x, "BottomSheet", value.asInstanceOf[js.Any])
      
      inline def setButton(value: PartialButtonProps): Self = StObject.set(x, "Button", value.asInstanceOf[js.Any])
      
      inline def setButtonGroup(value: PartialButtonGroupProps): Self = StObject.set(x, "ButtonGroup", value.asInstanceOf[js.Any])
      
      inline def setCard(value: PartialCardProps): Self = StObject.set(x, "Card", value.asInstanceOf[js.Any])
      
      inline def setCardDivider(value: PartialDividerProps): Self = StObject.set(x, "CardDivider", value.asInstanceOf[js.Any])
      
      inline def setCardFeaturedSubtitle(value: PartialTextProps): Self = StObject.set(x, "CardFeaturedSubtitle", value.asInstanceOf[js.Any])
      
      inline def setCardFeaturedTitle(value: PartialTextProps): Self = StObject.set(x, "CardFeaturedTitle", value.asInstanceOf[js.Any])
      
      inline def setCardImage(value: PartialImageProps): Self = StObject.set(x, "CardImage", value.asInstanceOf[js.Any])
      
      inline def setCardTitle(value: PartialTextProps): Self = StObject.set(x, "CardTitle", value.asInstanceOf[js.Any])
      
      inline def setCheckBox(value: PartialCheckBoxProps): Self = StObject.set(x, "CheckBox", value.asInstanceOf[js.Any])
      
      inline def setColors(value: RecursivePartialColorsDisabled): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setDivider(value: PartialDividerProps): Self = StObject.set(x, "Divider", value.asInstanceOf[js.Any])
      
      inline def setFAB(value: PartialFABProps): Self = StObject.set(x, "FAB", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: PartialHeaderProps): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: PartialIconProps): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setImage(value: PartialImageProps): Self = StObject.set(x, "Image", value.asInstanceOf[js.Any])
      
      inline def setInput(value: Partial[InputProps]): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
      
      inline def setLinearProgress(value: PartialLinearProgressProp): Self = StObject.set(x, "LinearProgress", value.asInstanceOf[js.Any])
      
      inline def setListItem(value: PartialListItemProps): Self = StObject.set(x, "ListItem", value.asInstanceOf[js.Any])
      
      inline def setListItemAccordion(value: PartialListItemAccordionP): Self = StObject.set(x, "ListItemAccordion", value.asInstanceOf[js.Any])
      
      inline def setListItemButtonGroup(value: PartialButtonGroupProps): Self = StObject.set(x, "ListItemButtonGroup", value.asInstanceOf[js.Any])
      
      inline def setListItemCheckBox(value: PartialCheckBoxProps): Self = StObject.set(x, "ListItemCheckBox", value.asInstanceOf[js.Any])
      
      inline def setListItemChevron(value: PartialIconProps): Self = StObject.set(x, "ListItemChevron", value.asInstanceOf[js.Any])
      
      inline def setListItemContent(value: PartialViewProps): Self = StObject.set(x, "ListItemContent", value.asInstanceOf[js.Any])
      
      inline def setListItemInput(value: Partial[InputProps]): Self = StObject.set(x, "ListItemInput", value.asInstanceOf[js.Any])
      
      inline def setListItemSubtitle(value: PartialTextProps): Self = StObject.set(x, "ListItemSubtitle", value.asInstanceOf[js.Any])
      
      inline def setListItemTitle(value: PartialTextProps): Self = StObject.set(x, "ListItemTitle", value.asInstanceOf[js.Any])
      
      inline def setOverlay(value: PartialOverlayProps): Self = StObject.set(x, "Overlay", value.asInstanceOf[js.Any])
      
      inline def setPricingCard(value: PartialPricingCardProps): Self = StObject.set(x, "PricingCard", value.asInstanceOf[js.Any])
      
      inline def setRating(value: PartialTapRatingProps): Self = StObject.set(x, "Rating", value.asInstanceOf[js.Any])
      
      inline def setSearchBar(value: Partial[SearchBarProps]): Self = StObject.set(x, "SearchBar", value.asInstanceOf[js.Any])
      
      inline def setSlider(value: PartialSliderProps): Self = StObject.set(x, "Slider", value.asInstanceOf[js.Any])
      
      inline def setSocialIcon(value: PartialSocialIconProps): Self = StObject.set(x, "SocialIcon", value.asInstanceOf[js.Any])
      
      inline def setSpeedDial(value: PartialSpeedDialProps): Self = StObject.set(x, "SpeedDial", value.asInstanceOf[js.Any])
      
      inline def setSpeedDialAction(value: PartialSpeedDialActionPro): Self = StObject.set(x, "SpeedDialAction", value.asInstanceOf[js.Any])
      
      inline def setSwitch(value: PartialSwitchProps): Self = StObject.set(x, "Switch", value.asInstanceOf[js.Any])
      
      inline def setTab(value: PartialTabProps): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
      
      inline def setTabItem(value: PartialTabItemProps): Self = StObject.set(x, "TabItem", value.asInstanceOf[js.Any])
      
      inline def setTabView(value: PartialTabViewPropsAnimationConfig): Self = StObject.set(x, "TabView", value.asInstanceOf[js.Any])
      
      inline def setTabViewItem(value: PartialViewProps): Self = StObject.set(x, "TabViewItem", value.asInstanceOf[js.Any])
      
      inline def setText(value: PartialTextProps): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      inline def setTile(value: PartialTilePropsAccessibilityActions): Self = StObject.set(x, "Tile", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: PartialTooltipProps): Self = StObject.set(x, "Tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? react-native-elements.react-native-elements/dist/config/theme.RecursivePartial<T[P]>}
    }}}
    */
  @js.native
  trait RecursivePartial[T] extends StObject
  
  type ReplaceTheme = js.Function1[/* updates */ RecursivePartialFullThemeAvatarAccessory, Unit]
  
  type Theme[T] = PartialFullTheme & T
  
  type UpdateTheme = js.Function1[/* updates */ RecursivePartialFullThemeAvatarAccessory, Unit]
}
