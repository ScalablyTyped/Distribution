package typings.reactFrameComponent.mod

import typings.react.mod.IframeHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameComponentProps extends IframeHTMLAttributes[HTMLIFrameElement] {
  @JSName("children")
  var children_FrameComponentProps: ReactNode = js.native
  var contentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var contentDidUpdate: js.UndefOr[js.Function0[Unit]] = js.native
  var head: js.UndefOr[ReactNode] = js.native
  var initialContent: js.UndefOr[String] = js.native
  var mountTarget: js.UndefOr[String] = js.native
}

object FrameComponentProps {
  @scala.inline
  def apply(): FrameComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameComponentProps]
  }
  @scala.inline
  implicit class FrameComponentPropsOps[Self <: FrameComponentProps] (val x: Self) extends AnyVal {
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
    def setContentDidMount(value: () => Unit): Self = this.set("contentDidMount", js.Any.fromFunction0(value))
    @scala.inline
    def deleteContentDidMount: Self = this.set("contentDidMount", js.undefined)
    @scala.inline
    def setContentDidUpdate(value: () => Unit): Self = this.set("contentDidUpdate", js.Any.fromFunction0(value))
    @scala.inline
    def deleteContentDidUpdate: Self = this.set("contentDidUpdate", js.undefined)
    @scala.inline
    def setHead(value: ReactNode): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setInitialContent(value: String): Self = this.set("initialContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialContent: Self = this.set("initialContent", js.undefined)
    @scala.inline
    def setMountTarget(value: String): Self = this.set("mountTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountTarget: Self = this.set("mountTarget", js.undefined)
  }
  
}

