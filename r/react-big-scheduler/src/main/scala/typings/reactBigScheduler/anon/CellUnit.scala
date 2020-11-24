package typings.reactBigScheduler.anon

import typings.reactBigScheduler.mod.CellUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellUnit extends js.Object {
  
  var cellUnit: CellUnits = js.native
  
  var endDate: String = js.native
  
  var startDate: String = js.native
}
object CellUnit {
  
  @scala.inline
  def apply(cellUnit: CellUnits, endDate: String, startDate: String): CellUnit = {
    val __obj = js.Dynamic.literal(cellUnit = cellUnit.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellUnit]
  }
  
  @scala.inline
  implicit class CellUnitOps[Self <: CellUnit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCellUnit(value: CellUnits): Self = this.set("cellUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
  }
}
