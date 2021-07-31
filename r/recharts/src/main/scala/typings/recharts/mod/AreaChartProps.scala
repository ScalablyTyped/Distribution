package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.recharts.mod.EventAttributes because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined onMouseOver, onMouseOut, onTouchEnd, onTouchMove, onTouchStart, onTouchCancel */ trait AreaChartProps
  extends StObject
     with CategoricalChartWrapper[LayoutType] {
  
  var onMouseOut: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseOver: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchCancel: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchEnd: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchStart: js.UndefOr[RechartsFunction] = js.undefined
}
object AreaChartProps {
  
  @scala.inline
  def apply(): AreaChartProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaChartProps]
  }
  
  @scala.inline
  implicit class AreaChartPropsMutableBuilder[Self <: AreaChartProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnMouseOut(value: RechartsFunction): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    @scala.inline
    def setOnMouseOver(value: RechartsFunction): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    @scala.inline
    def setOnTouchCancel(value: RechartsFunction): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    @scala.inline
    def setOnTouchEnd(value: RechartsFunction): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    @scala.inline
    def setOnTouchMove(value: RechartsFunction): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    @scala.inline
    def setOnTouchStart(value: RechartsFunction): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
