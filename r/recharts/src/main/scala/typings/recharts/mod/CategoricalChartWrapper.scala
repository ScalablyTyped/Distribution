package typings.recharts.mod

import typings.react.mod.ReactNode
import typings.recharts.anon.PartialMargin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoricalChartWrapper[L] extends StObject {
  
  var barCategoryGap: js.UndefOr[Double | String] = js.undefined
  
  var barGap: js.UndefOr[Double | String] = js.undefined
  
  var barSize: js.UndefOr[Double | String] = js.undefined
  
  var baseValue: js.UndefOr[BaseValueType] = js.undefined
  
  var children: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var compact: js.UndefOr[Boolean] = js.undefined
  
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var layout: js.UndefOr[L] = js.undefined
  
  var margin: js.UndefOr[PartialMargin] = js.undefined
  
  var maxBarSize: js.UndefOr[Double] = js.undefined
  
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  
  var reverseStackOrder: js.UndefOr[Boolean] = js.undefined
  
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var syncId: js.UndefOr[String | Double] = js.undefined
  
  var throttleDelay: js.UndefOr[Double] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object CategoricalChartWrapper {
  
  @scala.inline
  def apply[L](): CategoricalChartWrapper[L] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalChartWrapper[L]]
  }
  
  @scala.inline
  implicit class CategoricalChartWrapperMutableBuilder[Self <: CategoricalChartWrapper[?], L] (val x: Self & CategoricalChartWrapper[L]) extends AnyVal {
    
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
    def setData(value: js.Array[js.Object]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: js.Object*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLayout(value: L): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
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
    def setOnClick(value: RechartsFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnMouseDown(value: RechartsFunction): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    @scala.inline
    def setOnMouseEnter(value: RechartsFunction): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    @scala.inline
    def setOnMouseLeave(value: RechartsFunction): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    @scala.inline
    def setOnMouseMove(value: RechartsFunction): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    @scala.inline
    def setOnMouseUp(value: RechartsFunction): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    @scala.inline
    def setReverseStackOrder(value: Boolean): Self = StObject.set(x, "reverseStackOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseStackOrderUndefined: Self = StObject.set(x, "reverseStackOrder", js.undefined)
    
    @scala.inline
    def setStackOffset(value: StackOffsetType): Self = StObject.set(x, "stackOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackOffsetUndefined: Self = StObject.set(x, "stackOffset", js.undefined)
    
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
