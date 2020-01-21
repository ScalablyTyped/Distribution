package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1DeletePageCellRequest")
@js.native
class V1DeletePageCellRequest () extends js.Object {
  /**
    * The column of the cell to clear. Always an integer between 0 and 4, inclusive. Column 0 is the leftmost column.
    */
  var column: js.UndefOr[String] = js.native
  /**
    * The row of the cell to clear. Always an integer between 0 and 4, inclusive. Row 0 is the top row.
    */
  var row: js.UndefOr[String] = js.native
}

