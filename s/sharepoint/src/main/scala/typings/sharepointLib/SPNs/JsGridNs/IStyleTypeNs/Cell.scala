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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("fontStyle")(fontStyle)
    __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.updateDynamic("textAlign")(textAlign)
    __obj.updateDynamic("textColor")(textColor)
    __obj.asInstanceOf[Cell]
  }
}

