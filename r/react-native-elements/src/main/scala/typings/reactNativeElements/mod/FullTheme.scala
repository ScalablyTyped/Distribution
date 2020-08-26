package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.PartialAirbnbRatingProps
import typings.reactNativeElements.anon.PartialAvatarProps
import typings.reactNativeElements.anon.PartialBadgeProps
import typings.reactNativeElements.anon.PartialBottomSheetProps
import typings.reactNativeElements.anon.PartialButtonGroupProps
import typings.reactNativeElements.anon.PartialButtonProps
import typings.reactNativeElements.anon.PartialCardProps
import typings.reactNativeElements.anon.PartialCheckBoxProps
import typings.reactNativeElements.anon.PartialDividerProps
import typings.reactNativeElements.anon.PartialHeaderProps
import typings.reactNativeElements.anon.PartialIconProps
import typings.reactNativeElements.anon.PartialIconPropsPartialIm
import typings.reactNativeElements.anon.PartialImageProps
import typings.reactNativeElements.anon.PartialInputProps
import typings.reactNativeElements.anon.PartialListItemProps
import typings.reactNativeElements.anon.PartialOverlayProps
import typings.reactNativeElements.anon.PartialPricingCardProps
import typings.reactNativeElements.anon.PartialRatingProps
import typings.reactNativeElements.anon.PartialSearchBarProps
import typings.reactNativeElements.anon.PartialSliderProps
import typings.reactNativeElements.anon.PartialSocialIconProps
import typings.reactNativeElements.anon.PartialTextProps
import typings.reactNativeElements.anon.PartialTileProps
import typings.reactNativeElements.anon.PartialTooltipProps
import typings.reactNativeElements.anon.RecursivePartialColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullTheme extends js.Object {
  var Accessory: PartialIconPropsPartialIm = js.native
  var AirbnbRating: PartialAirbnbRatingProps = js.native
  var Avatar: PartialAvatarProps = js.native
  var Badge: PartialBadgeProps = js.native
  var BottomSheet: PartialBottomSheetProps = js.native
  var Button: PartialButtonProps = js.native
  var ButtonGroup: PartialButtonGroupProps = js.native
  var Card: PartialCardProps = js.native
  var CheckBox: PartialCheckBoxProps = js.native
  var Divider: PartialDividerProps = js.native
  var Header: PartialHeaderProps = js.native
  var Icon: PartialIconProps = js.native
  var Image: PartialImageProps = js.native
  var Input: PartialInputProps = js.native
  var ListItem: PartialListItemProps = js.native
  var Overlay: PartialOverlayProps = js.native
  var PricingCard: PartialPricingCardProps = js.native
  var Rating: PartialRatingProps = js.native
  var SearchBar: PartialSearchBarProps = js.native
  var Slider: PartialSliderProps = js.native
  var SocialIcon: PartialSocialIconProps = js.native
  var Text: PartialTextProps = js.native
  var Tile: PartialTileProps = js.native
  var Tooltip: PartialTooltipProps = js.native
  var colors: RecursivePartialColors = js.native
}

object FullTheme {
  @scala.inline
  def apply(
    Accessory: PartialIconPropsPartialIm,
    AirbnbRating: PartialAirbnbRatingProps,
    Avatar: PartialAvatarProps,
    Badge: PartialBadgeProps,
    BottomSheet: PartialBottomSheetProps,
    Button: PartialButtonProps,
    ButtonGroup: PartialButtonGroupProps,
    Card: PartialCardProps,
    CheckBox: PartialCheckBoxProps,
    Divider: PartialDividerProps,
    Header: PartialHeaderProps,
    Icon: PartialIconProps,
    Image: PartialImageProps,
    Input: PartialInputProps,
    ListItem: PartialListItemProps,
    Overlay: PartialOverlayProps,
    PricingCard: PartialPricingCardProps,
    Rating: PartialRatingProps,
    SearchBar: PartialSearchBarProps,
    Slider: PartialSliderProps,
    SocialIcon: PartialSocialIconProps,
    Text: PartialTextProps,
    Tile: PartialTileProps,
    Tooltip: PartialTooltipProps,
    colors: RecursivePartialColors
  ): FullTheme = {
    val __obj = js.Dynamic.literal(Accessory = Accessory.asInstanceOf[js.Any], AirbnbRating = AirbnbRating.asInstanceOf[js.Any], Avatar = Avatar.asInstanceOf[js.Any], Badge = Badge.asInstanceOf[js.Any], BottomSheet = BottomSheet.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], ButtonGroup = ButtonGroup.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CheckBox = CheckBox.asInstanceOf[js.Any], Divider = Divider.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], ListItem = ListItem.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], PricingCard = PricingCard.asInstanceOf[js.Any], Rating = Rating.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], Slider = Slider.asInstanceOf[js.Any], SocialIcon = SocialIcon.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Tile = Tile.asInstanceOf[js.Any], Tooltip = Tooltip.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTheme]
  }
  @scala.inline
  implicit class FullThemeOps[Self <: FullTheme] (val x: Self) extends AnyVal {
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
    def setAirbnbRating(value: PartialAirbnbRatingProps): Self = this.set("AirbnbRating", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvatar(value: PartialAvatarProps): Self = this.set("Avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def setBadge(value: PartialBadgeProps): Self = this.set("Badge", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottomSheet(value: PartialBottomSheetProps): Self = this.set("BottomSheet", value.asInstanceOf[js.Any])
    @scala.inline
    def setButton(value: PartialButtonProps): Self = this.set("Button", value.asInstanceOf[js.Any])
    @scala.inline
    def setButtonGroup(value: PartialButtonGroupProps): Self = this.set("ButtonGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def setCard(value: PartialCardProps): Self = this.set("Card", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckBox(value: PartialCheckBoxProps): Self = this.set("CheckBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setDivider(value: PartialDividerProps): Self = this.set("Divider", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: PartialHeaderProps): Self = this.set("Header", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: PartialIconProps): Self = this.set("Icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: PartialImageProps): Self = this.set("Image", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: PartialInputProps): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def setListItem(value: PartialListItemProps): Self = this.set("ListItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlay(value: PartialOverlayProps): Self = this.set("Overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricingCard(value: PartialPricingCardProps): Self = this.set("PricingCard", value.asInstanceOf[js.Any])
    @scala.inline
    def setRating(value: PartialRatingProps): Self = this.set("Rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchBar(value: PartialSearchBarProps): Self = this.set("SearchBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlider(value: PartialSliderProps): Self = this.set("Slider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSocialIcon(value: PartialSocialIconProps): Self = this.set("SocialIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: PartialTextProps): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTile(value: PartialTileProps): Self = this.set("Tile", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: PartialTooltipProps): Self = this.set("Tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setColors(value: RecursivePartialColors): Self = this.set("colors", value.asInstanceOf[js.Any])
  }
  
}

