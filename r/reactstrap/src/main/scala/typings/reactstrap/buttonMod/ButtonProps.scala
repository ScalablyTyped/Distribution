package typings.reactstrap.buttonMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonProps
  extends ButtonHTMLAttributes[HTMLButtonElement]
     with /* key */ StringDictionary[js.Any] {
  var active: js.UndefOr[Boolean] = js.native
  var block: js.UndefOr[Boolean] = js.native
  var close: js.UndefOr[Boolean] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var innerRef: js.UndefOr[Ref[HTMLButtonElement]] = js.native
  @JSName("onClick")
  var onClick_ButtonProps: js.UndefOr[MouseEventHandler[_]] = js.native
  var outline: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[String] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setBlock(value: Boolean): Self = this.set("block", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
    @scala.inline
    def setClose(value: Boolean): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setInnerRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = this.set("innerRef", js.Any.fromFunction1(value))
    @scala.inline
    def setInnerRef(value: Ref[HTMLButtonElement]): Self = this.set("innerRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInnerRef: Self = this.set("innerRef", js.undefined)
    @scala.inline
    def setInnerRefNull: Self = this.set("innerRef", null)
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
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

