package typings.reactstrap.dropdownMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.append
import typings.reactstrap.reactstrapStrings.prepend
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var a11y: js.UndefOr[Boolean] = js.native
  var active: js.UndefOr[Boolean] = js.native
  var addonType: js.UndefOr[Boolean | prepend | append] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var direction: js.UndefOr[Direction] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var group: js.UndefOr[Boolean] = js.native
  var inNavbar: js.UndefOr[Boolean] = js.native
  var isOpen: js.UndefOr[Boolean] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  var setActiveFromChild: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  var toggle: js.UndefOr[KeyboardEventHandler[_] | MouseEventHandler[_]] = js.native
}

object DropdownProps {
  @scala.inline
  def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
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
    def setA11y(value: Boolean): Self = this.set("a11y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11y: Self = this.set("a11y", js.undefined)
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAddonType(value: Boolean | prepend | append): Self = this.set("addonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddonType: Self = this.set("addonType", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setDirection(value: Direction): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setInNavbar(value: Boolean): Self = this.set("inNavbar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInNavbar: Self = this.set("inNavbar", js.undefined)
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    @scala.inline
    def setSetActiveFromChild(value: Boolean): Self = this.set("setActiveFromChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetActiveFromChild: Self = this.set("setActiveFromChild", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setToggle(value: KeyboardEvent[_] | (MouseEvent[_, NativeMouseEvent]) => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
  }
  
}

