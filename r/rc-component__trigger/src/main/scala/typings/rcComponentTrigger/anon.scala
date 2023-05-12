package typings.rcComponentTrigger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdjustX extends StObject {
    
    var adjustX: js.UndefOr[Boolean | Double] = js.undefined
    
    var adjustY: js.UndefOr[Boolean | Double] = js.undefined
    
    var shiftX: js.UndefOr[Boolean | Double] = js.undefined
    
    var shiftY: js.UndefOr[Boolean | Double] = js.undefined
  }
  object AdjustX {
    
    inline def apply(): AdjustX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdjustX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdjustX] (val x: Self) extends AnyVal {
      
      inline def setAdjustX(value: Boolean | Double): Self = StObject.set(x, "adjustX", value.asInstanceOf[js.Any])
      
      inline def setAdjustXUndefined: Self = StObject.set(x, "adjustX", js.undefined)
      
      inline def setAdjustY(value: Boolean | Double): Self = StObject.set(x, "adjustY", value.asInstanceOf[js.Any])
      
      inline def setAdjustYUndefined: Self = StObject.set(x, "adjustY", js.undefined)
      
      inline def setShiftX(value: Boolean | Double): Self = StObject.set(x, "shiftX", value.asInstanceOf[js.Any])
      
      inline def setShiftXUndefined: Self = StObject.set(x, "shiftX", js.undefined)
      
      inline def setShiftY(value: Boolean | Double): Self = StObject.set(x, "shiftY", value.asInstanceOf[js.Any])
      
      inline def setShiftYUndefined: Self = StObject.set(x, "shiftY", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
