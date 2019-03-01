package typings
package reactDashDataDashGridLib.AdazzleReactDataGridNs.ReactDataGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a copy paste
  */
trait CellCopyPasteEvent extends js.Object {
  /**
    * The key of the column where the copy paste occurred.
    */
  var cellKey: java.lang.String
  /**
    * The row that was copied from.
    */
  var fromRow: scala.Double
  /**
    * The row that was pasted to.
    */
  var rowIdx: scala.Double
  /**
    * The row that was pasted to.
    */
  var toRow: scala.Double
  /**
    * The value that was pasted.
    */
  var value: js.Any
}

object CellCopyPasteEvent {
  @scala.inline
  def apply(
    cellKey: java.lang.String,
    fromRow: scala.Double,
    rowIdx: scala.Double,
    toRow: scala.Double,
    value: js.Any
  ): CellCopyPasteEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cellKey")(cellKey)
    __obj.updateDynamic("fromRow")(fromRow)
    __obj.updateDynamic("rowIdx")(rowIdx)
    __obj.updateDynamic("toRow")(toRow)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CellCopyPasteEvent]
  }
}

