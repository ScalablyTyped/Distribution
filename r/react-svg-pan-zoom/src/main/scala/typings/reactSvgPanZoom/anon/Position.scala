package typings.reactSvgPanZoom.anon

import typings.reactSvgPanZoom.mod.ToolbarPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Position extends js.Object {
  var SVGAlignX: js.UndefOr[/* "center" */ String] = js.native
  var SVGAlignY: js.UndefOr[/* "center" */ String] = js.native
  var position: js.UndefOr[ToolbarPosition] = js.native
}

object Position {
  @scala.inline
  def apply(): Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Position]
  }
  @scala.inline
  implicit class PositionOps[Self <: Position] (val x: Self) extends AnyVal {
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
    def setSVGAlignX(value: /* "center" */ String): Self = this.set("SVGAlignX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSVGAlignX: Self = this.set("SVGAlignX", js.undefined)
    @scala.inline
    def setSVGAlignY(value: /* "center" */ String): Self = this.set("SVGAlignY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSVGAlignY: Self = this.set("SVGAlignY", js.undefined)
    @scala.inline
    def setPosition(value: ToolbarPosition): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

