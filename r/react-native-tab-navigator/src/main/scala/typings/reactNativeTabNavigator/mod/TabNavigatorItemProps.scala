package typings.reactNativeTabNavigator.mod

import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabNavigatorItemProps extends js.Object {
  /**
    * Allow font scaling for title
    */
  var allowFontScaling: js.UndefOr[Boolean] = js.native
  /**
    * Text for Item badge
    */
  var badgeText: js.UndefOr[String | Double] = js.native
  /**
    * onPress method for Item
    */
  var onPress: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Returns Item badge
    */
  var renderBadge: js.UndefOr[js.Function0[Element]] = js.native
  /**
    * Returns Item icon
    */
  var renderIcon: js.UndefOr[js.Function0[Element]] = js.native
  /**
    * Returns selected Item icon
    */
  var renderSelectedIcon: js.UndefOr[js.Function0[Element]] = js.native
  /**
    * Return whether the item is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Styling for selected Item title
    */
  var selectedTitleStyle: js.UndefOr[TextStyle] = js.native
  /**
    * Styling for tab
    */
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  /**
    * Item title
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Styling for Item title
    */
  var titleStyle: js.UndefOr[TextStyle] = js.native
}

object TabNavigatorItemProps {
  @scala.inline
  def apply(): TabNavigatorItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabNavigatorItemProps]
  }
  @scala.inline
  implicit class TabNavigatorItemPropsOps[Self <: TabNavigatorItemProps] (val x: Self) extends AnyVal {
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
    def setAllowFontScaling(value: Boolean): Self = this.set("allowFontScaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFontScaling: Self = this.set("allowFontScaling", js.undefined)
    @scala.inline
    def setBadgeText(value: String | Double): Self = this.set("badgeText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBadgeText: Self = this.set("badgeText", js.undefined)
    @scala.inline
    def setOnPress(value: () => Unit): Self = this.set("onPress", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setRenderBadge(value: () => Element): Self = this.set("renderBadge", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderBadge: Self = this.set("renderBadge", js.undefined)
    @scala.inline
    def setRenderIcon(value: () => Element): Self = this.set("renderIcon", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderIcon: Self = this.set("renderIcon", js.undefined)
    @scala.inline
    def setRenderSelectedIcon(value: () => Element): Self = this.set("renderSelectedIcon", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderSelectedIcon: Self = this.set("renderSelectedIcon", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedTitleStyle(value: TextStyle): Self = this.set("selectedTitleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedTitleStyle: Self = this.set("selectedTitleStyle", js.undefined)
    @scala.inline
    def setTabStyle(value: ViewStyle): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleStyle(value: TextStyle): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleStyle: Self = this.set("titleStyle", js.undefined)
  }
  
}

