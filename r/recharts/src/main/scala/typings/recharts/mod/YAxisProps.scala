package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.recharts.anon.PartialYPadding
import typings.recharts.rechartsStrings.category
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.number
import typings.recharts.rechartsStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YAxisProps
  extends StObject
     with EventAttributes {
  
  var allowDataOverflow: js.UndefOr[Boolean] = js.undefined
  
  var allowDecimals: js.UndefOr[Boolean] = js.undefined
  
  var allowDuplicatedCategory: js.UndefOr[Boolean] = js.undefined
  
  // Rotation of tick labels
  var angle: js.UndefOr[Double] = js.undefined
  
  var axisLine: js.UndefOr[Boolean | js.Object] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  // The key of data displayed in the axis
  var dataKey: js.UndefOr[DataKey] = js.undefined
  
  var domain: js.UndefOr[js.Tuple2[AxisDomain, AxisDomain]] = js.undefined
  
  // X offset of tick label
  var dx: js.UndefOr[Double] = js.undefined
  
  // Y offset of tick label
  var dy: js.UndefOr[Double] = js.undefined
  
  // The height of axis which is usually calculated in Chart
  var height: js.UndefOr[Double] = js.undefined
  
  var hide: js.UndefOr[Boolean] = js.undefined
  
  var interval: js.UndefOr[AxisInterval] = js.undefined
  
  // see label section at http://recharts.org/#/en-US/api/YAxis
  var label: js.UndefOr[String | Double | Label | LabelProps] = js.undefined
  
  var minTickGap: js.UndefOr[Double] = js.undefined
  
  var mirror: js.UndefOr[Boolean] = js.undefined
  
  // The name of data displayed in the axis
  var name: js.UndefOr[String | Double] = js.undefined
  
  // The orientation of axis
  var orientation: js.UndefOr[left | right] = js.undefined
  
  var padding: js.UndefOr[PartialYPadding] = js.undefined
  
  var reversed: js.UndefOr[Boolean] = js.undefined
  
  var scale: js.UndefOr[ScaleType | RechartsFunction] = js.undefined
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var tick: js.UndefOr[Boolean | ContentRenderer[Any] | js.Object | ReactElement] = js.undefined
  
  // The count of ticks
  var tickCount: js.UndefOr[Double] = js.undefined
  
  // The formatter function of tick
  var tickFormatter: js.UndefOr[TickFormatterFunction] = js.undefined
  
  var tickLine: js.UndefOr[Boolean | js.Object] = js.undefined
  
  // The margin between tick line and the label
  var tickMargin: js.UndefOr[Double] = js.undefined
  
  var tickSize: js.UndefOr[Double] = js.undefined
  
  // Ticks can be any type when the axis is the type of category
  // Ticks must be numbers when the axis is the type of number
  var ticks: js.UndefOr[js.Array[Any]] = js.undefined
  
  var `type`: js.UndefOr[number | category] = js.undefined
  
  // The unit of data displayed in the axis
  var unit: js.UndefOr[String | Double] = js.undefined
  
  // The width of axis, which need to be set by user
  var width: js.UndefOr[Double] = js.undefined
  
  // The unique id of y-axis
  var yAxisId: js.UndefOr[String | Double] = js.undefined
}
object YAxisProps {
  
  inline def apply(): YAxisProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YAxisProps]
  }
  
  extension [Self <: YAxisProps](x: Self) {
    
    inline def setAllowDataOverflow(value: Boolean): Self = StObject.set(x, "allowDataOverflow", value.asInstanceOf[js.Any])
    
    inline def setAllowDataOverflowUndefined: Self = StObject.set(x, "allowDataOverflow", js.undefined)
    
    inline def setAllowDecimals(value: Boolean): Self = StObject.set(x, "allowDecimals", value.asInstanceOf[js.Any])
    
    inline def setAllowDecimalsUndefined: Self = StObject.set(x, "allowDecimals", js.undefined)
    
    inline def setAllowDuplicatedCategory(value: Boolean): Self = StObject.set(x, "allowDuplicatedCategory", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicatedCategoryUndefined: Self = StObject.set(x, "allowDuplicatedCategory", js.undefined)
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setAxisLine(value: Boolean | js.Object): Self = StObject.set(x, "axisLine", value.asInstanceOf[js.Any])
    
    inline def setAxisLineUndefined: Self = StObject.set(x, "axisLine", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDataKey(value: DataKey): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
    
    inline def setDataKeyFunction1(value: /* dataObject */ Any => String | Double | (js.Tuple2[Double, Double]) | Null): Self = StObject.set(x, "dataKey", js.Any.fromFunction1(value))
    
    inline def setDataKeyUndefined: Self = StObject.set(x, "dataKey", js.undefined)
    
    inline def setDomain(value: js.Tuple2[AxisDomain, AxisDomain]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setInterval(value: AxisInterval): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLabel(value: String | Double | Label | LabelProps): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMinTickGap(value: Double): Self = StObject.set(x, "minTickGap", value.asInstanceOf[js.Any])
    
    inline def setMinTickGapUndefined: Self = StObject.set(x, "minTickGap", js.undefined)
    
    inline def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
    
    inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
    
    inline def setName(value: String | Double): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOrientation(value: left | right): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPadding(value: PartialYPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    
    inline def setScale(value: ScaleType | RechartsFunction): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setTick(value: Boolean | ContentRenderer[Any] | js.Object | ReactElement): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setTickCountUndefined: Self = StObject.set(x, "tickCount", js.undefined)
    
    inline def setTickFormatter(value: /* value */ Any => Any): Self = StObject.set(x, "tickFormatter", js.Any.fromFunction1(value))
    
    inline def setTickFormatterUndefined: Self = StObject.set(x, "tickFormatter", js.undefined)
    
    inline def setTickFunction1(value: Any => ReactNode): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
    
    inline def setTickLine(value: Boolean | js.Object): Self = StObject.set(x, "tickLine", value.asInstanceOf[js.Any])
    
    inline def setTickLineUndefined: Self = StObject.set(x, "tickLine", js.undefined)
    
    inline def setTickMargin(value: Double): Self = StObject.set(x, "tickMargin", value.asInstanceOf[js.Any])
    
    inline def setTickMarginUndefined: Self = StObject.set(x, "tickMargin", js.undefined)
    
    inline def setTickSize(value: Double): Self = StObject.set(x, "tickSize", value.asInstanceOf[js.Any])
    
    inline def setTickSizeUndefined: Self = StObject.set(x, "tickSize", js.undefined)
    
    inline def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    inline def setTicks(value: js.Array[Any]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTicksVarargs(value: Any*): Self = StObject.set(x, "ticks", js.Array(value*))
    
    inline def setType(value: number | category): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnit(value: String | Double): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setYAxisId(value: String | Double): Self = StObject.set(x, "yAxisId", value.asInstanceOf[js.Any])
    
    inline def setYAxisIdUndefined: Self = StObject.set(x, "yAxisId", js.undefined)
  }
}
