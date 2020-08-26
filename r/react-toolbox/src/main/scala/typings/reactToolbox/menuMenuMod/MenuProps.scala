package typings.reactToolbox.menuMenuMod

import typings.react.mod.ReactNode
import typings.reactToolbox.mod.ReactToolbox.Props
import typings.reactToolbox.reactToolboxStrings.auto
import typings.reactToolbox.reactToolboxStrings.bottomLeft
import typings.reactToolbox.reactToolboxStrings.bottomRight
import typings.reactToolbox.reactToolboxStrings.static
import typings.reactToolbox.reactToolboxStrings.topLeft
import typings.reactToolbox.reactToolboxStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuProps extends Props {
  /**
    * If true, the menu will be displayed as opened by default.
    * @default false
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Callback that will be called when the menu is being hidden.
    */
  var onHide: js.UndefOr[js.Function] = js.native
  /**
    * Callback that will be invoked when a menu item is selected.
    */
  var onSelect: js.UndefOr[js.Function] = js.native
  /**
    * Callback that will be invoked when the menu is being shown.
    */
  var onShow: js.UndefOr[js.Function] = js.native
  /**
    * If true the menu wrapper will show an outline with a soft shadow.
    * @default true
    */
  var outline: js.UndefOr[Boolean] = js.native
  /**
    * Determine the position of the menu. With static value the menu will be always shown, auto means that the it will decide the opening direction based on the current position. To force a position use topLeft, topRight, bottomLeft, bottomRight.
    * @default static
    */
  var position: js.UndefOr[auto | static | topLeft | topRight | bottomLeft | bottomRight] = js.native
  /**
    * If true, the menu items will show a ripple effect on click.
    * @default true
    */
  var ripple: js.UndefOr[Boolean] = js.native
  /**
    * If true, the menu will keep a value to highlight the active child item.
    * @default true
    */
  var selectable: js.UndefOr[Boolean] = js.native
  /**
    * Used for selectable menus. Indicates the current selected value so the child item with this value can be highlighted.
    */
  var selected: js.UndefOr[js.Any] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[MenuTheme] = js.native
}

object MenuProps {
  @scala.inline
  def apply(): MenuProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuProps]
  }
  @scala.inline
  implicit class MenuPropsOps[Self <: MenuProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setOnHide(value: js.Function): Self = this.set("onHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setOnSelect(value: js.Function): Self = this.set("onSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    @scala.inline
    def setOnShow(value: js.Function): Self = this.set("onShow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setPosition(value: auto | static | topLeft | topRight | bottomLeft | bottomRight): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRipple(value: Boolean): Self = this.set("ripple", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRipple: Self = this.set("ripple", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: js.Any): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setTheme(value: MenuTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

