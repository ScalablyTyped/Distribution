package typings.reactTether.mod.ReactTether

import typings.react.mod.CSSProperties
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactTether.mod.TetherComponent
import typings.std.Element
import typings.tether.mod.ITetherOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherComponentProps
  extends Props[TetherComponent]
     with ITetherOptions {
  var className: js.UndefOr[String] = js.native
  @JSName("constraints")
  var constraints_TetherComponentProps: js.UndefOr[js.Array[Constraints]] = js.native
  var id: js.UndefOr[String] = js.native
  var onRepositioned: js.UndefOr[js.Function0[Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* data */ UpdateEventData, Unit]] = js.native
  var renderElement: js.UndefOr[RenderProp] = js.native
  var renderElementTag: js.UndefOr[String] = js.native
  var renderElementTo: js.UndefOr[Element | String] = js.native
  var renderTarget: js.UndefOr[RenderProp] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object TetherComponentProps {
  @scala.inline
  def apply(attachment: String): TetherComponentProps = {
    val __obj = js.Dynamic.literal(attachment = attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TetherComponentProps]
  }
  @scala.inline
  implicit class TetherComponentPropsOps[Self <: TetherComponentProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setConstraintsVarargs(value: Constraints*): Self = this.set("constraints", js.Array(value :_*))
    @scala.inline
    def setConstraints(value: js.Array[Constraints]): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOnRepositioned(value: () => Unit): Self = this.set("onRepositioned", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnRepositioned: Self = this.set("onRepositioned", js.undefined)
    @scala.inline
    def setOnUpdate(value: /* data */ UpdateEventData => Unit): Self = this.set("onUpdate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setRenderElement(value: /* ref */ RefObject[Element] => ReactNode): Self = this.set("renderElement", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderElement: Self = this.set("renderElement", js.undefined)
    @scala.inline
    def setRenderElementTag(value: String): Self = this.set("renderElementTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderElementTag: Self = this.set("renderElementTag", js.undefined)
    @scala.inline
    def setRenderElementTo(value: Element | String): Self = this.set("renderElementTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderElementTo: Self = this.set("renderElementTo", js.undefined)
    @scala.inline
    def setRenderTarget(value: /* ref */ RefObject[Element] => ReactNode): Self = this.set("renderTarget", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRenderTarget: Self = this.set("renderTarget", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

