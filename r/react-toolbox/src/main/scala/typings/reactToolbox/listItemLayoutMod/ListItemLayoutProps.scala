package typings.reactToolbox.listItemLayoutMod

import typings.react.mod.ReactChild
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactToolbox.listItemActionsMod.ListItemActionsTheme
import typings.reactToolbox.listItemContentMod.ListItemContentTheme
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemLayoutProps extends Props {
  /**
    * A string URL to specify an avatar in the left side of the item.
    */
  var avatar: js.UndefOr[String | ReactElement] = js.native
  /**
    * Main text of the item.
    */
  var caption: js.UndefOr[String] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the item is displayed as disabled and it's not clickable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Layout content.
    */
  var itemContent: js.UndefOr[ReactChild] = js.native
  /**
    * A list of elements that are placed on the left side of the item and after the avatar attribute.
    */
  var leftActions: js.UndefOr[js.Array[ReactNode]] = js.native
  /**
    * A string key of a font icon or element to display an icon in the left side of the item.
    */
  var leftIcon: js.UndefOr[String | ReactElement] = js.native
  /**
    * Secondary text to display under the caption.
    */
  var legend: js.UndefOr[String] = js.native
  /**
    * A list of elements that are placed on the right side of the item and after the rightIcon attribute.
    */
  var rightActions: js.UndefOr[js.Array[ReactNode]] = js.native
  /**
    * The same as the leftIcon but in this case the icon is displayed in the right side.
    */
  var rightIcon: js.UndefOr[String | ReactElement] = js.native
  /**
    * If true, the elements in the list will display a hover effect and a pointer cursor. Inherited from the parent.
    * @default false
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Object defining the component class name mappings.
    */
  var theme: js.UndefOr[ListItemLayoutTheme with ListItemContentTheme with ListItemActionsTheme] = js.native
  /**
    * In case you want to provide the item as a link, you can pass this property to specify the href.
    */
  var to: js.UndefOr[String] = js.native
}

object ListItemLayoutProps {
  @scala.inline
  def apply(): ListItemLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemLayoutProps]
  }
  @scala.inline
  implicit class ListItemLayoutPropsOps[Self <: ListItemLayoutProps] (val x: Self) extends AnyVal {
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
    def setAvatar(value: String | ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setItemContent(value: ReactChild): Self = this.set("itemContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemContent: Self = this.set("itemContent", js.undefined)
    @scala.inline
    def setLeftActionsVarargs(value: ReactNode*): Self = this.set("leftActions", js.Array(value :_*))
    @scala.inline
    def setLeftActions(value: js.Array[ReactNode]): Self = this.set("leftActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftActions: Self = this.set("leftActions", js.undefined)
    @scala.inline
    def setLeftIcon(value: String | ReactElement): Self = this.set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeftIcon: Self = this.set("leftIcon", js.undefined)
    @scala.inline
    def setLegend(value: String): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setRightActionsVarargs(value: ReactNode*): Self = this.set("rightActions", js.Array(value :_*))
    @scala.inline
    def setRightActions(value: js.Array[ReactNode]): Self = this.set("rightActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightActions: Self = this.set("rightActions", js.undefined)
    @scala.inline
    def setRightIcon(value: String | ReactElement): Self = this.set("rightIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightIcon: Self = this.set("rightIcon", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setTheme(value: ListItemLayoutTheme with ListItemContentTheme with ListItemActionsTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

