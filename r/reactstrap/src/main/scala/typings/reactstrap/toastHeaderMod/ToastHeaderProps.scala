package typings.reactstrap.toastHeaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import typings.reactstrap.mod.CSSModule
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastHeaderProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var charCode: js.UndefOr[String | Double] = js.native
  var close: js.UndefOr[ReactNode] = js.native
  var closeAriaLabel: js.UndefOr[String] = js.native
  var cssModule: js.UndefOr[CSSModule] = js.native
  var icon: js.UndefOr[String | ReactNode] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.native
  var wrapTag: js.UndefOr[String | ReactType[_]] = js.native
}

object ToastHeaderProps {
  @scala.inline
  def apply(): ToastHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToastHeaderProps]
  }
  @scala.inline
  implicit class ToastHeaderPropsOps[Self <: ToastHeaderProps] (val x: Self) extends AnyVal {
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
    def setCharCode(value: String | Double): Self = this.set("charCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharCode: Self = this.set("charCode", js.undefined)
    @scala.inline
    def setClose(value: ReactNode): Self = this.set("close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setCloseAriaLabel(value: String): Self = this.set("closeAriaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseAriaLabel: Self = this.set("closeAriaLabel", js.undefined)
    @scala.inline
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
    @scala.inline
    def setIcon(value: String | ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setTag(value: String | ReactType[_]): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setToggle(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("toggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToggle: Self = this.set("toggle", js.undefined)
    @scala.inline
    def setWrapTag(value: String | ReactType[_]): Self = this.set("wrapTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapTag: Self = this.set("wrapTag", js.undefined)
  }
  
}

