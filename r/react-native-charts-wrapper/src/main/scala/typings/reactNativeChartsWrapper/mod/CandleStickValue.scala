package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandleStickValue extends StObject {
  
  var close: Double
  
  var marker: js.UndefOr[String] = js.undefined
  
  var open: Double
  
  var shadowH: Double
  
  var shadowL: Double
  
  var x: js.UndefOr[Double] = js.undefined
}
object CandleStickValue {
  
  inline def apply(close: Double, open: Double, shadowH: Double, shadowL: Double): CandleStickValue = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], shadowH = shadowH.asInstanceOf[js.Any], shadowL = shadowL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickValue]
  }
  
  extension [Self <: CandleStickValue](x: Self) {
    
    inline def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setShadowH(value: Double): Self = StObject.set(x, "shadowH", value.asInstanceOf[js.Any])
    
    inline def setShadowL(value: Double): Self = StObject.set(x, "shadowL", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
