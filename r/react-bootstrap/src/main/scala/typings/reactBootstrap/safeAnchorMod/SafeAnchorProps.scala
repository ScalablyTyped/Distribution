package typings.reactBootstrap.safeAnchorMod

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SafeAnchorProps
  extends AllHTMLAttributes[SafeAnchor]
     with ClassAttributes[SafeAnchor] {
  var componentClass: js.UndefOr[ReactType[_]] = js.native
  @JSName("onClick")
  var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.native
}

object SafeAnchorProps {
  @scala.inline
  def apply(): SafeAnchorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SafeAnchorProps]
  }
  @scala.inline
  implicit class SafeAnchorPropsOps[Self <: SafeAnchorProps] (val x: Self) extends AnyVal {
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
    def setComponentClass(value: ReactType[_]): Self = this.set("componentClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentClass: Self = this.set("componentClass", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[js.Object, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
  
}

