package typings.reactBigScheduler.anon

import typings.reactBigScheduler.mod.CellUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellUnit extends js.Object {
  var cellUnit: CellUnits
  var endDate: String
  var startDate: String
}

object CellUnit {
  @scala.inline
  def apply(cellUnit: CellUnits, endDate: String, startDate: String): CellUnit = {
    val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellUnit]
  }
}

