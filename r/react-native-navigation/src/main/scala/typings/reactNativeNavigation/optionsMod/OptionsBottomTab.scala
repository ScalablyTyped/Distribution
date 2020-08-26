package typings.reactNativeNavigation.optionsMod

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.Insets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsBottomTab extends js.Object {
  /**
    * Show the badge with the animation.
    * #### (Android specific)
    */
  var animateBadge: js.UndefOr[Boolean] = js.native
  /**
    * Set the text in a badge that is overlayed over the component
    */
  var badge: js.UndefOr[String] = js.native
  /**
    * Set the background color of the badge that is overlayed over the component
    */
  var badgeColor: js.UndefOr[String] = js.native
  /**
    * Set true if you want to disable the icon tinting
    * #### (iOS specific)
    */
  var disableIconTint: js.UndefOr[Boolean] = js.native
  /**
    * Set true if you want to disable the text tinting
    * #### (iOS specific)
    */
  var disableSelectedIconTint: js.UndefOr[Boolean] = js.native
  var dotIndicator: js.UndefOr[DotIndicatorOptions] = js.native
  /**
    * Set the text font family
    */
  var fontFamily: js.UndefOr[FontFamily] = js.native
  /**
    * Set the text font size
    */
  var fontSize: js.UndefOr[Double] = js.native
  /**
    * Set the font weight, ignore fontFamily and use the iOS system fonts instead
    * #### (iOS specific)
    */
  var fontWeight: js.UndefOr[FontWeight] = js.native
  /**
    * Set the tab icon
    */
  var icon: js.UndefOr[ImageRequireSource | ImageResource] = js.native
  /**
    * Set the icon tint
    */
  var iconColor: js.UndefOr[Color] = js.native
  /**
    * Set the insets of the icon
    * #### (iOS specific)
    */
  var iconInsets: js.UndefOr[Insets] = js.native
  /**
    * If it's set to false, pressing a tab won't select the tab
    * instead it will emit a bottomTabPressedEvent
    */
  var selectTabOnPress: js.UndefOr[Boolean] = js.native
  /**
    * Set the font size for selected tabs
    * #### (Android specific)
    */
  var selectedFontSize: js.UndefOr[Double] = js.native
  /**
    * Set selected icon image
    * #### (iOS specific)
    */
  var selectedIcon: js.UndefOr[ImageRequireSource] = js.native
  /**
    * Set the selected icon tint
    */
  var selectedIconColor: js.UndefOr[Color] = js.native
  /**
    * Set the selected text color
    */
  var selectedTextColor: js.UndefOr[Color] = js.native
  /**
    * Set a testID to reference the tab in E2E tests
    */
  var testID: js.UndefOr[String] = js.native
  /**
    * Set the text to display below the icon
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Set the text color
    */
  var textColor: js.UndefOr[Color] = js.native
}

object OptionsBottomTab {
  @scala.inline
  def apply(): OptionsBottomTab = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsBottomTab]
  }
  @scala.inline
  implicit class OptionsBottomTabOps[Self <: OptionsBottomTab] (val x: Self) extends AnyVal {
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
    def setAnimateBadge(value: Boolean): Self = this.set("animateBadge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimateBadge: Self = this.set("animateBadge", js.undefined)
    @scala.inline
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    @scala.inline
    def setBadgeColor(value: String): Self = this.set("badgeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeColor: Self = this.set("badgeColor", js.undefined)
    @scala.inline
    def setDisableIconTint(value: Boolean): Self = this.set("disableIconTint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIconTint: Self = this.set("disableIconTint", js.undefined)
    @scala.inline
    def setDisableSelectedIconTint(value: Boolean): Self = this.set("disableSelectedIconTint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableSelectedIconTint: Self = this.set("disableSelectedIconTint", js.undefined)
    @scala.inline
    def setDotIndicator(value: DotIndicatorOptions): Self = this.set("dotIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotIndicator: Self = this.set("dotIndicator", js.undefined)
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setIcon(value: ImageRequireSource | ImageResource): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setIconColor(value: Color): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setIconInsets(value: Insets): Self = this.set("iconInsets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconInsets: Self = this.set("iconInsets", js.undefined)
    @scala.inline
    def setSelectTabOnPress(value: Boolean): Self = this.set("selectTabOnPress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectTabOnPress: Self = this.set("selectTabOnPress", js.undefined)
    @scala.inline
    def setSelectedFontSize(value: Double): Self = this.set("selectedFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedFontSize: Self = this.set("selectedFontSize", js.undefined)
    @scala.inline
    def setSelectedIcon(value: ImageRequireSource): Self = this.set("selectedIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIcon: Self = this.set("selectedIcon", js.undefined)
    @scala.inline
    def setSelectedIconColor(value: Color): Self = this.set("selectedIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIconColor: Self = this.set("selectedIconColor", js.undefined)
    @scala.inline
    def setSelectedTextColor(value: Color): Self = this.set("selectedTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTextColor: Self = this.set("selectedTextColor", js.undefined)
    @scala.inline
    def setTestID(value: String): Self = this.set("testID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestID: Self = this.set("testID", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setTextColor(value: Color): Self = this.set("textColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
  
}

