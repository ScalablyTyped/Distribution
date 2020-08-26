package typings.reactToolbox.listItemMod

import typings.react.mod.ReactNode
import typings.reactToolbox.listItemActionsMod.ListItemActionsTheme
import typings.reactToolbox.listItemContentMod.ListItemContentTheme
import typings.reactToolbox.listItemLayoutMod.ListItemLayoutTheme
import typings.reactToolbox.listItemTextMod.ListItemTextTheme
import typings.reactToolbox.mod.ReactToolbox.Props
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemProps extends Props {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * If true, the item is displayed as disabled and is not clickable.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If true, the item displays a ripple effect on click. By default it's inherited from the parent element.
    */
  var ripple: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    * @default false
    */
  var theme: js.UndefOr[
    ListItemTheme with ListItemActionsTheme with ListItemContentTheme with ListItemLayoutTheme with ListItemTextTheme
  ] = js.native
  /**
    * In case you want to provide the item as a link, you can pass this property to specify the href.
    */
  var to: js.UndefOr[String] = js.native
}

object ListItemProps {
  @scala.inline
  def apply(): ListItemProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemProps]
  }
  @scala.inline
  implicit class ListItemPropsOps[Self <: ListItemProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setTheme(
      value: ListItemTheme with ListItemActionsTheme with ListItemContentTheme with ListItemLayoutTheme with ListItemTextTheme
    ): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
  
}

