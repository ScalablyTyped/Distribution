package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopwatchParams
  extends StObject
     with FrameStruct {
  
  var customLayer: js.UndefOr[Any] = js.undefined
  
  var pointerColor: js.UndefOr[ColorDef] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object StopwatchParams {
  
  inline def apply(): StopwatchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopwatchParams]
  }
  
  extension [Self <: StopwatchParams](x: Self) {
    
    inline def setCustomLayer(value: Any): Self = StObject.set(x, "customLayer", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerUndefined: Self = StObject.set(x, "customLayer", js.undefined)
    
    inline def setPointerColor(value: ColorDef): Self = StObject.set(x, "pointerColor", value.asInstanceOf[js.Any])
    
    inline def setPointerColorUndefined: Self = StObject.set(x, "pointerColor", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
