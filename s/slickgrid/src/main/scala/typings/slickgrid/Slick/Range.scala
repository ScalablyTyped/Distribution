package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /***
    * @property fromCell
    * @type {Integer}
    */
  var fromCell: Double
  /***
    * @property fromRow
    * @type {Integer}
    */
  var fromRow: Double
  /***
    * @property toCell
    * @type {Integer}
    */
  var toCell: Double
  /***
    * @property toRow
    * @type {Integer}
    */
  var toRow: Double
  /***
    * Returns whether a range contains a given cell.
    * @method contains
    * @param row {Integer}
    * @param cell {Integer}
    * @return {Boolean}
    */
  def contains(row: Double, cell: Double): Boolean
  /***
    * Returns whether a range represents a single cell.
    * @method isSingleCell
    * @return {Boolean}
    */
  def isSingleCell(): Boolean
  /***
    * Returns whether a range represents a single row.
    * @method isSingleRow
    * @return {Boolean}
    */
  def isSingleRow(): Boolean
}

object Range {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    fromCell: Double,
    fromRow: Double,
    isSingleCell: () => Boolean,
    isSingleRow: () => Boolean,
    toCell: Double,
    toRow: Double
  ): Range = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), fromCell = fromCell.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], isSingleCell = js.Any.fromFunction0(isSingleCell), isSingleRow = js.Any.fromFunction0(isSingleRow), toCell = toCell.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

