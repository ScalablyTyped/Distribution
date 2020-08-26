package typings.reactMapGl.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLOverlayProps extends BaseControlProps {
  var style: js.UndefOr[CSSProperties] = js.native
  def redraw(opts: HTMLRedrawOptions): Unit = js.native
}

object HTMLOverlayProps {
  @scala.inline
  def apply(redraw: HTMLRedrawOptions => Unit): HTMLOverlayProps = {
    val __obj = js.Dynamic.literal(redraw = js.Any.fromFunction1(redraw))
    __obj.asInstanceOf[HTMLOverlayProps]
  }
  @scala.inline
  implicit class HTMLOverlayPropsOps[Self <: HTMLOverlayProps] (val x: Self) extends AnyVal {
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
    def setRedraw(value: HTMLRedrawOptions => Unit): Self = this.set("redraw", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

