package typings.reactPowerTooltip.toolTipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipProps extends js.Object {
  var animation: js.UndefOr[AnimationType] = js.native
  var arrowAlign: js.UndefOr[ArrowAlignType] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var color: js.UndefOr[String] = js.native
  var flat: js.UndefOr[Boolean] = js.native
  var fontFamily: js.UndefOr[String] = js.native
  var fontSize: js.UndefOr[String] = js.native
  var fontWeight: js.UndefOr[String] = js.native
  var hoverBackground: js.UndefOr[String] = js.native
  var lineSeparated: js.UndefOr[Boolean | String] = js.native
  var moveDown: js.UndefOr[String] = js.native
  var moveLeft: js.UndefOr[String] = js.native
  var moveRight: js.UndefOr[String] = js.native
  var moveUp: js.UndefOr[String] = js.native
  var position: js.UndefOr[PositionType] = js.native
  var show: Boolean = js.native
  var static: js.UndefOr[Boolean] = js.native
  var textAlign: js.UndefOr[String] = js.native
  var zIndex: js.UndefOr[String] = js.native
}

object TooltipProps {
  @scala.inline
  def apply(show: Boolean): TooltipProps = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  @scala.inline
  implicit class TooltipPropsOps[Self <: TooltipProps] (val x: Self) extends AnyVal {
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
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: AnimationType): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setArrowAlign(value: ArrowAlignType): Self = this.set("arrowAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrowAlign: Self = this.set("arrowAlign", js.undefined)
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    @scala.inline
    def setHoverBackground(value: String): Self = this.set("hoverBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverBackground: Self = this.set("hoverBackground", js.undefined)
    @scala.inline
    def setLineSeparated(value: Boolean | String): Self = this.set("lineSeparated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineSeparated: Self = this.set("lineSeparated", js.undefined)
    @scala.inline
    def setMoveDown(value: String): Self = this.set("moveDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveDown: Self = this.set("moveDown", js.undefined)
    @scala.inline
    def setMoveLeft(value: String): Self = this.set("moveLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveLeft: Self = this.set("moveLeft", js.undefined)
    @scala.inline
    def setMoveRight(value: String): Self = this.set("moveRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveRight: Self = this.set("moveRight", js.undefined)
    @scala.inline
    def setMoveUp(value: String): Self = this.set("moveUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoveUp: Self = this.set("moveUp", js.undefined)
    @scala.inline
    def setPosition(value: PositionType): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setZIndex(value: String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

