package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchEventInit
  extends StObject
     with EventModifierInit {
  
  /* standard dom */
  var changedTouches: js.UndefOr[js.Array[Touch]] = js.undefined
  
  /* standard dom */
  var targetTouches: js.UndefOr[js.Array[Touch]] = js.undefined
  
  /* standard dom */
  var touches: js.UndefOr[js.Array[Touch]] = js.undefined
}
object TouchEventInit {
  
  inline def apply(): TouchEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchEventInit]
  }
  
  extension [Self <: TouchEventInit](x: Self) {
    
    inline def setChangedTouches(value: js.Array[Touch]): Self = StObject.set(x, "changedTouches", value.asInstanceOf[js.Any])
    
    inline def setChangedTouchesUndefined: Self = StObject.set(x, "changedTouches", js.undefined)
    
    inline def setChangedTouchesVarargs(value: Touch*): Self = StObject.set(x, "changedTouches", js.Array(value*))
    
    inline def setTargetTouches(value: js.Array[Touch]): Self = StObject.set(x, "targetTouches", value.asInstanceOf[js.Any])
    
    inline def setTargetTouchesUndefined: Self = StObject.set(x, "targetTouches", js.undefined)
    
    inline def setTargetTouchesVarargs(value: Touch*): Self = StObject.set(x, "targetTouches", js.Array(value*))
    
    inline def setTouches(value: js.Array[Touch]): Self = StObject.set(x, "touches", value.asInstanceOf[js.Any])
    
    inline def setTouchesUndefined: Self = StObject.set(x, "touches", js.undefined)
    
    inline def setTouchesVarargs(value: Touch*): Self = StObject.set(x, "touches", js.Array(value*))
  }
}
