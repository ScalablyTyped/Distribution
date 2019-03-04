package typings
package sharepointLib.SPNs.JsGridNs.IStyleTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cell
  extends sharepointLib.SPNs.JsGridNs.IStyleType {
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
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor, font = font, fontSize = fontSize, fontStyle = fontStyle, fontWeight = fontWeight, textAlign = textAlign, textColor = textColor)
  
    __obj.asInstanceOf[Cell]
  }
}

