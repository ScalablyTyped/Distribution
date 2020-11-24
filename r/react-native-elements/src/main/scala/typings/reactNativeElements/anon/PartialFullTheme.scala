package typings.reactNativeElements.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<react-native-elements.react-native-elements.FullTheme> */
@js.native
trait PartialFullTheme extends js.Object {
  
  var Accessory: js.UndefOr[PartialIconPropsPartialIm] = js.native
  
  var AirbnbRating: js.UndefOr[PartialAirbnbRatingProps] = js.native
  
  var Avatar: js.UndefOr[PartialAvatarProps] = js.native
  
  var Badge: js.UndefOr[PartialBadgeProps] = js.native
  
  var BottomSheet: js.UndefOr[PartialBottomSheetProps] = js.native
  
  var Button: js.UndefOr[PartialButtonProps] = js.native
  
  var ButtonGroup: js.UndefOr[PartialButtonGroupProps] = js.native
  
  var Card: js.UndefOr[PartialCardProps] = js.native
  
  var CardDivider: js.UndefOr[PartialDividerProps] = js.native
  
  var CardFeaturedSubtitle: js.UndefOr[PartialTextProps] = js.native
  
  var CardFeaturedTitle: js.UndefOr[PartialTextProps] = js.native
  
  var CardImage: js.UndefOr[PartialImageProps] = js.native
  
  var CardTitle: js.UndefOr[PartialTextProps] = js.native
  
  var CheckBox: js.UndefOr[PartialCheckBoxProps] = js.native
  
  var Divider: js.UndefOr[PartialDividerProps] = js.native
  
  var Header: js.UndefOr[PartialHeaderProps] = js.native
  
  var Icon: js.UndefOr[PartialIconProps] = js.native
  
  var Image: js.UndefOr[PartialImageProps] = js.native
  
  var Input: js.UndefOr[PartialInputProps] = js.native
  
  var ListItem: js.UndefOr[PartialListItemPropsAccessibilityActions] = js.native
  
  var ListItemButtonGroup: js.UndefOr[PartialButtonGroupProps] = js.native
  
  var ListItemCheckBox: js.UndefOr[PartialCheckBoxProps] = js.native
  
  var ListItemChevron: js.UndefOr[PartialIconProps] = js.native
  
  var ListItemContent: js.UndefOr[PartialViewProperties] = js.native
  
  var ListItemInput: js.UndefOr[PartialInputProps] = js.native
  
  var ListItemSubtitle: js.UndefOr[PartialTextProps] = js.native
  
  var ListItemTitle: js.UndefOr[PartialTextProps] = js.native
  
  var Overlay: js.UndefOr[PartialOverlayProps] = js.native
  
  var PricingCard: js.UndefOr[PartialPricingCardProps] = js.native
  
  var Rating: js.UndefOr[PartialRatingProps] = js.native
  
  var SearchBar: js.UndefOr[PartialSearchBarProps] = js.native
  
  var Slider: js.UndefOr[PartialSliderProps] = js.native
  
  var SocialIcon: js.UndefOr[PartialSocialIconProps] = js.native
  
  var Text: js.UndefOr[PartialTextProps] = js.native
  
  var Tile: js.UndefOr[PartialTileProps] = js.native
  
  var Tooltip: js.UndefOr[PartialTooltipProps] = js.native
  
  var colors: js.UndefOr[RecursivePartialColorsDisabled] = js.native
}
object PartialFullTheme {
  
  @scala.inline
  def apply(): PartialFullTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFullTheme]
  }
  
  @scala.inline
  implicit class PartialFullThemeOps[Self <: PartialFullTheme] (val x: Self) extends AnyVal {
    
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
    def setAccessory(value: PartialIconPropsPartialIm): Self = this.set("Accessory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessory: Self = this.set("Accessory", js.undefined)
    
    @scala.inline
    def setAirbnbRating(value: PartialAirbnbRatingProps): Self = this.set("AirbnbRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAirbnbRating: Self = this.set("AirbnbRating", js.undefined)
    
    @scala.inline
    def setAvatar(value: PartialAvatarProps): Self = this.set("Avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("Avatar", js.undefined)
    
    @scala.inline
    def setBadge(value: PartialBadgeProps): Self = this.set("Badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("Badge", js.undefined)
    
    @scala.inline
    def setBottomSheet(value: PartialBottomSheetProps): Self = this.set("BottomSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomSheet: Self = this.set("BottomSheet", js.undefined)
    
    @scala.inline
    def setButton(value: PartialButtonProps): Self = this.set("Button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButton: Self = this.set("Button", js.undefined)
    
    @scala.inline
    def setButtonGroup(value: PartialButtonGroupProps): Self = this.set("ButtonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonGroup: Self = this.set("ButtonGroup", js.undefined)
    
    @scala.inline
    def setCard(value: PartialCardProps): Self = this.set("Card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("Card", js.undefined)
    
    @scala.inline
    def setCardDivider(value: PartialDividerProps): Self = this.set("CardDivider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardDivider: Self = this.set("CardDivider", js.undefined)
    
    @scala.inline
    def setCardFeaturedSubtitle(value: PartialTextProps): Self = this.set("CardFeaturedSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardFeaturedSubtitle: Self = this.set("CardFeaturedSubtitle", js.undefined)
    
    @scala.inline
    def setCardFeaturedTitle(value: PartialTextProps): Self = this.set("CardFeaturedTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardFeaturedTitle: Self = this.set("CardFeaturedTitle", js.undefined)
    
    @scala.inline
    def setCardImage(value: PartialImageProps): Self = this.set("CardImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardImage: Self = this.set("CardImage", js.undefined)
    
    @scala.inline
    def setCardTitle(value: PartialTextProps): Self = this.set("CardTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardTitle: Self = this.set("CardTitle", js.undefined)
    
    @scala.inline
    def setCheckBox(value: PartialCheckBoxProps): Self = this.set("CheckBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckBox: Self = this.set("CheckBox", js.undefined)
    
    @scala.inline
    def setDivider(value: PartialDividerProps): Self = this.set("Divider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDivider: Self = this.set("Divider", js.undefined)
    
    @scala.inline
    def setHeader(value: PartialHeaderProps): Self = this.set("Header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("Header", js.undefined)
    
    @scala.inline
    def setIcon(value: PartialIconProps): Self = this.set("Icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("Icon", js.undefined)
    
    @scala.inline
    def setImage(value: PartialImageProps): Self = this.set("Image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("Image", js.undefined)
    
    @scala.inline
    def setInput(value: PartialInputProps): Self = this.set("Input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    
    @scala.inline
    def setListItem(value: PartialListItemPropsAccessibilityActions): Self = this.set("ListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("ListItem", js.undefined)
    
    @scala.inline
    def setListItemButtonGroup(value: PartialButtonGroupProps): Self = this.set("ListItemButtonGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemButtonGroup: Self = this.set("ListItemButtonGroup", js.undefined)
    
    @scala.inline
    def setListItemCheckBox(value: PartialCheckBoxProps): Self = this.set("ListItemCheckBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemCheckBox: Self = this.set("ListItemCheckBox", js.undefined)
    
    @scala.inline
    def setListItemChevron(value: PartialIconProps): Self = this.set("ListItemChevron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemChevron: Self = this.set("ListItemChevron", js.undefined)
    
    @scala.inline
    def setListItemContent(value: PartialViewProperties): Self = this.set("ListItemContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemContent: Self = this.set("ListItemContent", js.undefined)
    
    @scala.inline
    def setListItemInput(value: PartialInputProps): Self = this.set("ListItemInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemInput: Self = this.set("ListItemInput", js.undefined)
    
    @scala.inline
    def setListItemSubtitle(value: PartialTextProps): Self = this.set("ListItemSubtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemSubtitle: Self = this.set("ListItemSubtitle", js.undefined)
    
    @scala.inline
    def setListItemTitle(value: PartialTextProps): Self = this.set("ListItemTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItemTitle: Self = this.set("ListItemTitle", js.undefined)
    
    @scala.inline
    def setOverlay(value: PartialOverlayProps): Self = this.set("Overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("Overlay", js.undefined)
    
    @scala.inline
    def setPricingCard(value: PartialPricingCardProps): Self = this.set("PricingCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePricingCard: Self = this.set("PricingCard", js.undefined)
    
    @scala.inline
    def setRating(value: PartialRatingProps): Self = this.set("Rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRating: Self = this.set("Rating", js.undefined)
    
    @scala.inline
    def setSearchBar(value: PartialSearchBarProps): Self = this.set("SearchBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchBar: Self = this.set("SearchBar", js.undefined)
    
    @scala.inline
    def setSlider(value: PartialSliderProps): Self = this.set("Slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlider: Self = this.set("Slider", js.undefined)
    
    @scala.inline
    def setSocialIcon(value: PartialSocialIconProps): Self = this.set("SocialIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialIcon: Self = this.set("SocialIcon", js.undefined)
    
    @scala.inline
    def setText(value: PartialTextProps): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
    
    @scala.inline
    def setTile(value: PartialTileProps): Self = this.set("Tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTile: Self = this.set("Tile", js.undefined)
    
    @scala.inline
    def setTooltip(value: PartialTooltipProps): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooltip: Self = this.set("Tooltip", js.undefined)
    
    @scala.inline
    def setColors(value: RecursivePartialColorsDisabled): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
  }
}
