package typings.rmcCalendar.dataTypesMod.Models

import typings.react.mod.ReactNode
import typings.rmcCalendar.singleMonthMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthData extends js.Object {
  
  var component: js.UndefOr[ReactNode] = js.native
  
  var componentRef: js.UndefOr[default] = js.native
  
  var firstDate: Date = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var lastDate: Date = js.native
  
  var title: String = js.native
  
  var updateLayout: js.UndefOr[js.Function] = js.native
  
  var weeks: js.Array[js.Array[CellData]] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object MonthData {
  
  @scala.inline
  def apply(firstDate: Date, lastDate: Date, title: String, weeks: js.Array[js.Array[CellData]]): MonthData = {
    val __obj = js.Dynamic.literal(firstDate = firstDate.asInstanceOf[js.Any], lastDate = lastDate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], weeks = weeks.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthData]
  }
  
  @scala.inline
  implicit class MonthDataOps[Self <: MonthData] (val x: Self) extends AnyVal {
    
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
    def setFirstDate(value: Date): Self = this.set("firstDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastDate(value: Date): Self = this.set("lastDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeeksVarargs(value: js.Array[CellData]*): Self = this.set("weeks", js.Array(value :_*))
    
    @scala.inline
    def setWeeks(value: js.Array[js.Array[CellData]]): Self = this.set("weeks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponent(value: ReactNode): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setComponentRef(value: default): Self = this.set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentRef: Self = this.set("componentRef", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setUpdateLayout(value: js.Function): Self = this.set("updateLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateLayout: Self = this.set("updateLayout", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
