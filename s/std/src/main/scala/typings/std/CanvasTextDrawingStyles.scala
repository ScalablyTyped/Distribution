package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasTextDrawingStyles extends js.Object {
  var direction: CanvasDirection = js.native
  var font: java.lang.String = js.native
  var textAlign: CanvasTextAlign = js.native
  var textBaseline: CanvasTextBaseline = js.native
}

object CanvasTextDrawingStyles {
  @scala.inline
  def apply(
    direction: CanvasDirection,
    font: java.lang.String,
    textAlign: CanvasTextAlign,
    textBaseline: CanvasTextBaseline
  ): CanvasTextDrawingStyles = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
  @scala.inline
  implicit class CanvasTextDrawingStylesOps[Self <: CanvasTextDrawingStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirection(value: CanvasDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: java.lang.String): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: CanvasTextAlign): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBaseline(value: CanvasTextBaseline): Self = this.set("textBaseline", value.asInstanceOf[js.Any])
  }
  
}

