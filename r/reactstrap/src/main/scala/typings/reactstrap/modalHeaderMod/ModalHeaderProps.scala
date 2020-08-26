package typings.reactstrap.modalHeaderMod

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
trait ModalHeaderProps
  extends HTMLAttributes[HTMLElement]
     with /* key */ StringDictionary[js.Any] {
  var cssModule: js.UndefOr[CSSModule] = js.native
  var tag: js.UndefOr[String | ReactType[_]] = js.native
  var toggle: js.UndefOr[MouseEventHandler[_]] = js.native
  var wrapTag: js.UndefOr[String | ReactType[_]] = js.native
}

object ModalHeaderProps {
  @scala.inline
  def apply(): ModalHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModalHeaderProps]
  }
  @scala.inline
  implicit class ModalHeaderPropsOps[Self <: ModalHeaderProps] (val x: Self) extends AnyVal {
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
    def setCssModule(value: CSSModule): Self = this.set("cssModule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssModule: Self = this.set("cssModule", js.undefined)
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

