package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import typings.recharts.rechartsStrings.centric
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.recharts.mod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, baseValue, maxBarSize, style, className, children, reverseStackOrder */ @js.native
trait PieChartProps extends EventAttributes {
  
  var barCategoryGap: js.UndefOr[Double | String] = js.native
  
  var barGap: js.UndefOr[Double | String] = js.native
  
  var barSize: js.UndefOr[Double | String] = js.native
  
  var baseValue: js.UndefOr[BaseValueType] = js.native
  
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var compact: js.UndefOr[Boolean] = js.native
  
  var cx: js.UndefOr[Double | String] = js.native
  
  var cy: js.UndefOr[Double | String] = js.native
  
  var data: js.UndefOr[js.Array[js.Object]] = js.native
  
  var endAngle: js.UndefOr[Double] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var innerRadius: js.UndefOr[Double | String] = js.native
  
  var layout: js.UndefOr[centric] = js.native
  
  var margin: js.UndefOr[PartialMargin] = js.native
  
  var maxBarSize: js.UndefOr[Double] = js.native
  
  var outerRadius: js.UndefOr[Double | String] = js.native
  
  var reverseStackOrder: js.UndefOr[Boolean] = js.native
  
  var stackOffset: js.UndefOr[StackOffsetType] = js.native
  
  var startAngle: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[js.Object] = js.native
  
  var syncId: js.UndefOr[String | Double] = js.native
  
  var throttleDelay: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PieChartProps {
  
  @scala.inline
  def apply(): PieChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieChartProps]
  }
  
  @scala.inline
  implicit class PieChartPropsMutableBuilder[Self <: PieChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBarCategoryGap(value: Double | String): Self = StObject.set(x, "barCategoryGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarCategoryGapUndefined: Self = StObject.set(x, "barCategoryGap", js.undefined)
    
    @scala.inline
    def setBarGap(value: Double | String): Self = StObject.set(x, "barGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarGapUndefined: Self = StObject.set(x, "barGap", js.undefined)
    
    @scala.inline
    def setBarSize(value: Double | String): Self = StObject.set(x, "barSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarSizeUndefined: Self = StObject.set(x, "barSize", js.undefined)
    
    @scala.inline
    def setBaseValue(value: BaseValueType): Self = StObject.set(x, "baseValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseValueUndefined: Self = StObject.set(x, "baseValue", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCompact(value: Boolean): Self = StObject.set(x, "compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactUndefined: Self = StObject.set(x, "compact", js.undefined)
    
    @scala.inline
    def setCx(value: Double | String): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
    
    @scala.inline
    def setCy(value: Double | String): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
    
    @scala.inline
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInnerRadius(value: Double | String): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
    
    @scala.inline
    def setLayout(value: centric): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMargin(value: PartialMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    @scala.inline
    def setMaxBarSize(value: Double): Self = StObject.set(x, "maxBarSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBarSizeUndefined: Self = StObject.set(x, "maxBarSize", js.undefined)
    
    @scala.inline
    def setOuterRadius(value: Double | String): Self = StObject.set(x, "outerRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterRadiusUndefined: Self = StObject.set(x, "outerRadius", js.undefined)
    
    @scala.inline
    def setReverseStackOrder(value: Boolean): Self = StObject.set(x, "reverseStackOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseStackOrderUndefined: Self = StObject.set(x, "reverseStackOrder", js.undefined)
    
    @scala.inline
    def setStackOffset(value: StackOffsetType): Self = StObject.set(x, "stackOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackOffsetUndefined: Self = StObject.set(x, "stackOffset", js.undefined)
    
    @scala.inline
    def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSyncId(value: String | Double): Self = StObject.set(x, "syncId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncIdUndefined: Self = StObject.set(x, "syncId", js.undefined)
    
    @scala.inline
    def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
