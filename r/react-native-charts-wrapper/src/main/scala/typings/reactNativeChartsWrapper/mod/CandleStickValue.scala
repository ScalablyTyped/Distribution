package typings.reactNativeChartsWrapper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CandleStickValue extends StObject {
  
  var close: Double = js.native
  
  var marker: js.UndefOr[String] = js.native
  
  var open: Double = js.native
  
  var shadowH: Double = js.native
  
  var shadowL: Double = js.native
  
  var x: js.UndefOr[Double] = js.native
}
object CandleStickValue {
  
  @scala.inline
  def apply(close: Double, open: Double, shadowH: Double, shadowL: Double): CandleStickValue = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], shadowH = shadowH.asInstanceOf[js.Any], shadowL = shadowL.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandleStickValue]
  }
  
  @scala.inline
  implicit class CandleStickValueMutableBuilder[Self <: CandleStickValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: Double): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setOpen(value: Double): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowH(value: Double): Self = StObject.set(x, "shadowH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShadowL(value: Double): Self = StObject.set(x, "shadowL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
  }
}
