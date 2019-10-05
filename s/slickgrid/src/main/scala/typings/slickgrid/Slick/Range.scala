package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Range")
@js.native
class Range protected () extends js.Object {
  /**
  		* A structure containing a range of cells.
  		* @constructor
  		* @param fromRow {Integer} Starting row.
  		* @param fromCell {Integer} Starting cell.
  		* @param toRow {Integer} Optional. Ending row. Defaults to <code>fromRow</code>.
  		* @param toCell {Integer} Optional. Ending cell. Defaults to <code>fromCell</code>.
  		**/
  def this(fromRow: Double, fromCell: Double) = this()
  def this(fromRow: Double, fromCell: Double, toRow: Double) = this()
  def this(fromRow: Double, fromCell: Double, toRow: Double, toCell: Double) = this()
  /***
  		* @property fromCell
  		* @type {Integer}
  		*/
  var fromCell: Double = js.native
  /***
  		* @property fromRow
  		* @type {Integer}
  		*/
  var fromRow: Double = js.native
  /***
  		* @property toCell
  		* @type {Integer}
  		*/
  var toCell: Double = js.native
  /***
  		* @property toRow
  		* @type {Integer}
  		*/
  var toRow: Double = js.native
  /***
  		* Returns whether a range contains a given cell.
  		* @method contains
  		* @param row {Integer}
  		* @param cell {Integer}
  		* @return {Boolean}
  		*/
  def contains(row: Double, cell: Double): Boolean = js.native
  /***
  		* Returns whether a range represents a single cell.
  		* @method isSingleCell
  		* @return {Boolean}
  		*/
  def isSingleCell(): Boolean = js.native
  /***
  		* Returns whether a range represents a single row.
  		* @method isSingleRow
  		* @return {Boolean}
  		*/
  def isSingleRow(): Boolean = js.native
}

