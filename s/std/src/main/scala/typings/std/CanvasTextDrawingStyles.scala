package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTextDrawingStyles extends js.Object {
  var direction: CanvasDirection
  var font: java.lang.String
  var textAlign: CanvasTextAlign
  var textBaseline: CanvasTextBaseline
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
}

