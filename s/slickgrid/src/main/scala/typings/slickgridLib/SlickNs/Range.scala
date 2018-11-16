package typings
package slickgridLib.SlickNs

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
  def this(fromRow: scala.Double, fromCell: scala.Double) = this()
  /**
  		* A structure containing a range of cells.
  		* @constructor
  		* @param fromRow {Integer} Starting row.
  		* @param fromCell {Integer} Starting cell.
  		* @param toRow {Integer} Optional. Ending row. Defaults to <code>fromRow</code>.
  		* @param toCell {Integer} Optional. Ending cell. Defaults to <code>fromCell</code>.
  		**/
  def this(fromRow: scala.Double, fromCell: scala.Double, toRow: scala.Double) = this()
  /**
  		* A structure containing a range of cells.
  		* @constructor
  		* @param fromRow {Integer} Starting row.
  		* @param fromCell {Integer} Starting cell.
  		* @param toRow {Integer} Optional. Ending row. Defaults to <code>fromRow</code>.
  		* @param toCell {Integer} Optional. Ending cell. Defaults to <code>fromCell</code>.
  		**/
  def this(fromRow: scala.Double, fromCell: scala.Double, toRow: scala.Double, toCell: scala.Double) = this()
  /***
  		* @property fromCell
  		* @type {Integer}
  		*/
  var fromCell: scala.Double = js.native
  /***
  		* @property fromRow
  		* @type {Integer}
  		*/
  var fromRow: scala.Double = js.native
  /***
  		* @property toCell
  		* @type {Integer}
  		*/
  var toCell: scala.Double = js.native
  /***
  		* @property toRow
  		* @type {Integer}
  		*/
  var toRow: scala.Double = js.native
  /***
  		* Returns whether a range contains a given cell.
  		* @method contains
  		* @param row {Integer}
  		* @param cell {Integer}
  		* @return {Boolean}
  		*/
  def contains(row: scala.Double, cell: scala.Double): scala.Boolean = js.native
  /***
  		* Returns whether a range represents a single cell.
  		* @method isSingleCell
  		* @return {Boolean}
  		*/
  def isSingleCell(): scala.Boolean = js.native
  /***
  		* Returns whether a range represents a single row.
  		* @method isSingleRow
  		* @return {Boolean}
  		*/
  def isSingleRow(): scala.Boolean = js.native
}

