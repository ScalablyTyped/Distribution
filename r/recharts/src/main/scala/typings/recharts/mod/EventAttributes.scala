package typings.recharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAttributes extends StObject {
  
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseOut: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseOver: js.UndefOr[RechartsFunction] = js.undefined
  
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchCancel: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchEnd: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchMove: js.UndefOr[RechartsFunction] = js.undefined
  
  var onTouchStart: js.UndefOr[RechartsFunction] = js.undefined
}
object EventAttributes {
  
  inline def apply(): EventAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventAttributes]
  }
  
  extension [Self <: EventAttributes](x: Self) {
    
    inline def setOnClick(value: RechartsFunction): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseDown(value: RechartsFunction): Self = StObject.set(x, "onMouseDown", value.asInstanceOf[js.Any])
    
    inline def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
    
    inline def setOnMouseEnter(value: RechartsFunction): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: RechartsFunction): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: RechartsFunction): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setOnMouseOut(value: RechartsFunction): Self = StObject.set(x, "onMouseOut", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
    
    inline def setOnMouseOver(value: RechartsFunction): Self = StObject.set(x, "onMouseOver", value.asInstanceOf[js.Any])
    
    inline def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
    
    inline def setOnMouseUp(value: RechartsFunction): Self = StObject.set(x, "onMouseUp", value.asInstanceOf[js.Any])
    
    inline def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
    
    inline def setOnTouchCancel(value: RechartsFunction): Self = StObject.set(x, "onTouchCancel", value.asInstanceOf[js.Any])
    
    inline def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
    
    inline def setOnTouchEnd(value: RechartsFunction): Self = StObject.set(x, "onTouchEnd", value.asInstanceOf[js.Any])
    
    inline def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
    
    inline def setOnTouchMove(value: RechartsFunction): Self = StObject.set(x, "onTouchMove", value.asInstanceOf[js.Any])
    
    inline def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
    
    inline def setOnTouchStart(value: RechartsFunction): Self = StObject.set(x, "onTouchStart", value.asInstanceOf[js.Any])
    
    inline def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
  }
}
