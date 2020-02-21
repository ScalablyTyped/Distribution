package typings.sharepoint.CUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CUI.Section")
@js.native
class Section protected () extends RibbonComponent {
  /**
    * @param type  2 - OneRow, 3 - TwoRow, 4 - ThreeRow.
    * @param alignment 0 - Top, 2  - Middle,
    */
  def this(ribbon: Ribbon, id: String, `type`: RowType, alignment: Alignment) = this()
  def getRow(rowIndex: Double): Row = js.native
  def get_alignment(): Double = js.native
  def get_type(): Double = js.native
}

