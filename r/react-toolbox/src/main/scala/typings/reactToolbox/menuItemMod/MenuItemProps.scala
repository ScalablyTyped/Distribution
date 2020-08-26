package typings.reactToolbox.menuItemMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemProps extends Props {
  /**
    * The text to include in the menu item. Required.
    */
  var caption: String = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the item will be displayed as disabled and is not selectable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Icon font key string or Element to display in the right side of the option.
    */
  var icon: js.UndefOr[ReactNode] = js.native
  /**
    * Transferred from the Menu component for selectable menus. Indicates if it's the current active option.
    * @default false
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * Displays shortcut text on the right side of the caption attribute.
    */
  var shortcut: js.UndefOr[String] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuItemTheme] = js.native
  /**
    * Passed down to the root element
    */
  var value: js.UndefOr[js.Any] = js.native
}

object MenuItemProps {
  @scala.inline
  def apply(caption: String): MenuItemProps = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemProps]
  }
  @scala.inline
  implicit class MenuItemPropsOps[Self <: MenuItemProps] (val x: Self) extends AnyVal {
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
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setShortcut(value: String): Self = this.set("shortcut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortcut: Self = this.set("shortcut", js.undefined)
    @scala.inline
    def setTheme(value: MenuItemTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

