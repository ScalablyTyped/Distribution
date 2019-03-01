package typings
package stdLib

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("direction")(direction)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("textAlign")(textAlign)
    __obj.updateDynamic("textBaseline")(textBaseline)
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
}

