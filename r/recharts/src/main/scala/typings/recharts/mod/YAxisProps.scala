package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait YAxisProps extends EventAttributes {
  
  var allowDataOverflow: js.UndefOr[Boolean] = js.native
  
  var allowDecimals: js.UndefOr[Boolean] = js.native
  
  var allowDuplicatedCategory: js.UndefOr[Boolean] = js.native
  
  // Rotation of tick labels
  var angle: js.UndefOr[Double] = js.native
  
  var axisLine: js.UndefOr[Boolean | js.Object] = js.native
  
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.native
  
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.native
  
  // X offset of tick label
  var dx: js.UndefOr[Double] = js.native
  
  // Y offset of tick label
  var dy: js.UndefOr[Double] = js.native
  
  // The height of axis which is usually calculated in Chart
  var height: js.UndefOr[Double] = js.native
  
  var hide: js.UndefOr[Boolean] = js.native
  
  var interval: js.UndefOr[AxisInterval] = js.native
  
  // see label section at http://recharts.org/#/en-US/api/YAxis
  var label: js.UndefOr[String | Double | Label | LabelProps] = js.native
  
  var minTickGap: js.UndefOr[Double] = js.native
  
  var mirror: js.UndefOr[Boolean] = js.native
  
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.native
  
  // The orientation of axis
  var orientation: js.UndefOr[left | right] = js.native
  
  var padding: js.UndefOr[YPadding] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
  
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.native
  
  var stroke: js.UndefOr[String] = js.native
  
  var tick: js.UndefOr[Boolean | ContentRenderer[_] | js.Object | ReactElement] = js.native
  
  // The count of ticks
  var tickCount: js.UndefOr[Double] = js.native
  
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.native
  
  var tickLine: js.UndefOr[Boolean | js.Object] = js.native
  
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[Double] = js.native
  
  var tickSize: js.UndefOr[Double] = js.native
  
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[_]] = js.native
  
  var `type`: js.UndefOr[number | category] = js.native
  
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.native
  
  // The width of axis, which need to be set by user
  var width: js.UndefOr[Double] = js.native
  
  // The unique id of y-axis
  var yAxisId: js.UndefOr[String | Double] = js.native
}
object YAxisProps {
  
  @scala.inline
  def apply(): YAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisProps]
  }
  
  @scala.inline
  implicit class YAxisPropsOps[Self <: YAxisProps] (val x: Self) extends AnyVal {
    
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
    def setAllowDataOverflow(value: Boolean): Self = this.set("allowDataOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDataOverflow: Self = this.set("allowDataOverflow", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = this.set("allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDecimals: Self = this.set("allowDecimals", js.undefined)
    
    @scala.inline
    def setAllowDuplicatedCategory(value: Boolean): Self = this.set("allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDuplicatedCategory: Self = this.set("allowDuplicatedCategory", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setAxisLine(value: Boolean | js.Object): Self = this.set("axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLine: Self = this.set("axisLine", js.undefined)
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = this.set("dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKey(value: DataKey): Self = this.set("dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataKey: Self = this.set("dataKey", js.undefined)
    
    @scala.inline
    def setDomain(value: js.Tuple2[AxisDomain, AxisDomain]): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setDx(value: Double): Self = this.set("dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDx: Self = this.set("dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double): Self = this.set("dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDy: Self = this.set("dy", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = this.set("hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    
    @scala.inline
    def setInterval(value: AxisInterval): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setLabel(value: String | Double | Label | LabelProps): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMinTickGap(value: Double): Self = this.set("minTickGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTickGap: Self = this.set("minTickGap", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    
    @scala.inline
    def setName(value: String | Double): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOrientation(value: left | right): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPadding(value: YPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
    
    @scala.inline
    def setScaleFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: ScaleType | RechartsFunction): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = this.set("stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStroke: Self = this.set("stroke", js.undefined)
    
    @scala.inline
    def setTickFunction1(value: _ => ReactNode): Self = this.set("tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTick(value: Boolean | ContentRenderer[_] | js.Object | ReactElement): Self = this.set("tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTick: Self = this.set("tick", js.undefined)
    
    @scala.inline
    def setTickCount(value: Double): Self = this.set("tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickCount: Self = this.set("tickCount", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: /* value */ js.Any => js.Any): Self = this.set("tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTickFormatter: Self = this.set("tickFormatter", js.undefined)
    
    @scala.inline
    def setTickLine(value: Boolean | js.Object): Self = this.set("tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLine: Self = this.set("tickLine", js.undefined)
    
    @scala.inline
    def setTickMargin(value: Double): Self = this.set("tickMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickMargin: Self = this.set("tickMargin", js.undefined)
    
    @scala.inline
    def setTickSize(value: Double): Self = this.set("tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickSize: Self = this.set("tickSize", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setType(value: number | category): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUnit(value: String | Double): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setYAxisId(value: String | Double): Self = this.set("yAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisId: Self = this.set("yAxisId", js.undefined)
  }
}
