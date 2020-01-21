package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PageCell")
@js.native
class V1PageCell () extends js.Object {
  /**
    * The column of the cell. Always an integer between 0 and 4, inclusive.
    */
  var column: js.UndefOr[Double] = js.native
  /**
    * The unique identifier of the entity represented in the cell.
    * Not present for cells with an object_type of PLACEHOLDER.
    */
  var object_id: js.UndefOr[String] = js.native
  /**
    * The type of entity represented in the cell (ITEM, DISCOUNT, CATEGORY, or PLACEHOLDER).
    * See [V1PageCellObjectType](#type-v1pagecellobjecttype) for possible values.
    */
  var object_type: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the page the cell is included on.
    */
  var page_id: js.UndefOr[String] = js.native
  /**
    * For a cell with an object_type of PLACEHOLDER, this value indicates the cell's special behavior. See
    * [V1PageCellPlaceholderType](#type-v1pagecellplaceholdertype) for possible values
    */
  var placeholder_type: js.UndefOr[String] = js.native
  /**
    * The row of the cell. Always an integer between 0 and 4, inclusive.
    */
  var row: js.UndefOr[Double] = js.native
}

