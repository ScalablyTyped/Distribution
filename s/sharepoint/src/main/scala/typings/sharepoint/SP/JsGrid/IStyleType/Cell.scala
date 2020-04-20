package typings.sharepoint.SP.JsGrid.IStyleType

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell
  extends typings.sharepoint.SP.JsGrid.IStyleType {
  /** -> CSS background-color */
  var backgroundColor: js.Any
  /** -> CSS font-family */
  var font: js.Any
  /** -> CSS font-size */
  var fontSize: js.Any
  /** -> CSS font-style */
  var fontStyle: js.Any
  /** -> CSS font-weight */
  var fontWeight: js.Any
  /** -> CSS text-align */
  var textAlign: js.Any
  /** -> CSS color */
  var textColor: js.Any
}

object Cell {
  @scala.inline
  def apply(
    backgroundColor: js.Any,
    font: js.Any,
    fontSize: js.Any,
    fontStyle: js.Any,
    fontWeight: js.Any,
    textAlign: js.Any,
    textColor: js.Any
  ): Cell = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cell]
  }
}

