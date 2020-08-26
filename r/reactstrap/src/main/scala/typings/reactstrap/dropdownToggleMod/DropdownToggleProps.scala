package typings.reactstrap.dropdownToggleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownToggleProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  @JSName("aria-haspopup")
  var `aria-haspopup_DropdownToggleProps`: js.UndefOr[Boolean] = js.native
  var caret: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var `data-toggle`: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var nav: js.UndefOr[Boolean] = js.native
  @JSName("onClick")
  var onClick_DropdownToggleProps: js.UndefOr[MouseEventHandler[_]] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var split: js.UndefOr[Boolean] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object DropdownToggleProps {
  @scala.inline
  def apply(): DropdownToggleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownToggleProps]
  }
  @scala.inline
  implicit class DropdownTogglePropsOps[Self <: DropdownToggleProps] (val x: Self) extends AnyVal {
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
    def `setAria-haspopup`(value: Boolean): Self = this.set("aria-haspopup", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-haspopup`: Self = this.set("aria-haspopup", js.undefined)
    @scala.inline
    def setCaret(value: Boolean): Self = this.set("caret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaret: Self = this.set("caret", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def `setData-toggle`(value: String): Self = this.set("data-toggle", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteData-toggle`: Self = this.set("data-toggle", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setNav(value: Boolean): Self = this.set("nav", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNav: Self = this.set("nav", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOutline(value: Boolean): Self = this.set("outline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutline: Self = this.set("outline", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSplit(value: Boolean): Self = this.set("split", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSplit: Self = this.set("split", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

