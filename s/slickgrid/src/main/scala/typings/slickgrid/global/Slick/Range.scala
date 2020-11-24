package typings.slickgrid.global.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Slick.Range")
@js.native
class Range protected ()
  extends typings.slickgrid.Slick.Range {
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
  def this(fromRow: Double, fromCell: Double, toRow: js.UndefOr[scala.Nothing], toCell: Double) = this()
  def this(fromRow: Double, fromCell: Double, toRow: Double, toCell: Double) = this()
}
