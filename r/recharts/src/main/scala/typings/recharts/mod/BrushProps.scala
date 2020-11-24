package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrushProps extends js.Object {
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var data: js.UndefOr[js.Array[_]] = js.native
  
  var dataKey: js.UndefOr[DataKey] = js.native
  
  var endIndex: js.UndefOr[Double] = js.native
  
  var fill: js.UndefOr[String] = js.native
  
  var gap: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var leaveTimeOut: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[RechartsFunction] = js.native
  
  var padding: js.UndefOr[PartialMargin] = js.native
  
  var startIndex: js.UndefOr[Double] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.native
  
  var travellerWidth: js.UndefOr[Double] = js.native
  
  var updateId: js.UndefOr[String | Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object BrushProps {
  
  @scala.inline
  def apply(): BrushProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrushProps]
  }
  
  @scala.inline
  implicit class BrushPropsOps[Self <: BrushProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[_]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    
    @scala.inline
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setGap(value: Double): Self = this.set("gap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGap: Self = this.set("gap", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLeaveTimeOut(value: Double): Self = this.set("leaveTimeOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaveTimeOut: Self = this.set("leaveTimeOut", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPadding(value: PartialMargin): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: /* value */ js.Any => js.Any): Self = this.set("tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTickFormatter: Self = this.set("tickFormatter", js.undefined)
    
    @scala.inline
    def setTravellerWidth(value: Double): Self = this.set("travellerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTravellerWidth: Self = this.set("travellerWidth", js.undefined)
    
    @scala.inline
    def setUpdateId(value: String | Double): Self = this.set("updateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateId: Self = this.set("updateId", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
