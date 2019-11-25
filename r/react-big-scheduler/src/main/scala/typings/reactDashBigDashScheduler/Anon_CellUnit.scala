package typings.reactDashBigDashScheduler

import typings.reactDashBigDashScheduler.reactDashBigDashSchedulerMod.CellUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CellUnit extends js.Object {
  var cellUnit: CellUnits
  var endDate: String
  var startDate: String
}

object Anon_CellUnit {
  @scala.inline
  def apply(cellUnit: CellUnits, endDate: String, startDate: String): Anon_CellUnit = {
    val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CellUnit]
  }
}

