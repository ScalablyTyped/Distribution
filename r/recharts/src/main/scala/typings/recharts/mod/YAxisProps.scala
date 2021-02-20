package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.right
import org.scalablytyped.runtime.StObject
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
  implicit class YAxisPropsMutableBuilder[Self <: YAxisProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDataOverflow(value: Boolean): Self = StObject.set(x, "allowDataOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDataOverflowUndefined: Self = StObject.set(x, "allowDataOverflow", js.undefined)
    
    @scala.inline
    def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    @scala.inline
    def setAllowDuplicatedCategory(value: Boolean): Self = StObject.set(x, "allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDuplicatedCategoryUndefined: Self = StObject.set(x, "allowDuplicatedCategory", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    @scala.inline
    def setAxisLine(value: Boolean | js.Object): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
    
    @scala.inline
    def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataKeyFunction1(value: /* dataObject */ js.Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    @scala.inline
    def setDomain(value: js.Tuple2[AxisDomain, AxisDomain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    @scala.inline
    def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    @scala.inline
    def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInterval(value: AxisInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setLabel(value: String | Double | Label | LabelProps): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setMinTickGap(value: Double): Self = StObject.set(x, "minTickGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinTickGapUndefined: Self = StObject.set(x, "minTickGap", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    @scala.inline
    def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrientation(value: left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPadding(value: YPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    @scala.inline
    def setScale(value: ScaleType | RechartsFunction): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFunction1(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setTick(value: Boolean | ContentRenderer[_] | js.Object | ReactElement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    @scala.inline
    def setTickFormatter(value: /* value */ js.Any => js.Any): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    @scala.inline
    def setTickFunction1(value: _ => ReactNode): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTickLine(value: Boolean | js.Object): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    @scala.inline
    def setTickMargin(value: Double): Self = StObject.set(x, "tickMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickMarginUndefined: Self = StObject.set(x, "tickMargin", js.undefined)
    
    @scala.inline
    def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[_]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: js.Any*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setType(value: number | category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUnit(value: String | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setYAxisId(value: String | Double): Self = StObject.set(x, "yAxisId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYAxisIdUndefined: Self = StObject.set(x, "yAxisId", js.undefined)
  }
}
