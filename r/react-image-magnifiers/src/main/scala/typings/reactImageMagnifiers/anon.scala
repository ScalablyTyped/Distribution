package typings.reactImageMagnifiers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClickMoveLimit extends StObject {
    
    var clickMoveLimit: js.UndefOr[Double] = js.undefined
    
    var doubleTapDurationInMs: js.UndefOr[Double] = js.undefined
    
    var longTouchDurationInMs: js.UndefOr[Double] = js.undefined
    
    var longTouchMoveLimit: js.UndefOr[Double] = js.undefined
    
    var tapDurationInMs: js.UndefOr[Double] = js.undefined
  }
  object ClickMoveLimit {
    
    inline def apply(): ClickMoveLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickMoveLimit]
    }
    
    extension [Self <: ClickMoveLimit](x: Self) {
      
      inline def setClickMoveLimit(value: Double): Self = StObject.set(x, "clickMoveLimit", value.asInstanceOf[js.Any])
      
      inline def setClickMoveLimitUndefined: Self = StObject.set(x, "clickMoveLimit", js.undefined)
      
      inline def setDoubleTapDurationInMs(value: Double): Self = StObject.set(x, "doubleTapDurationInMs", value.asInstanceOf[js.Any])
      
      inline def setDoubleTapDurationInMsUndefined: Self = StObject.set(x, "doubleTapDurationInMs", js.undefined)
      
      inline def setLongTouchDurationInMs(value: Double): Self = StObject.set(x, "longTouchDurationInMs", value.asInstanceOf[js.Any])
      
      inline def setLongTouchDurationInMsUndefined: Self = StObject.set(x, "longTouchDurationInMs", js.undefined)
      
      inline def setLongTouchMoveLimit(value: Double): Self = StObject.set(x, "longTouchMoveLimit", value.asInstanceOf[js.Any])
      
      inline def setLongTouchMoveLimitUndefined: Self = StObject.set(x, "longTouchMoveLimit", js.undefined)
      
      inline def setTapDurationInMs(value: Double): Self = StObject.set(x, "tapDurationInMs", value.asInstanceOf[js.Any])
      
      inline def setTapDurationInMsUndefined: Self = StObject.set(x, "tapDurationInMs", js.undefined)
    }
  }
}
