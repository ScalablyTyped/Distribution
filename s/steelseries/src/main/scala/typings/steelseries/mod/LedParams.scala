package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedParams extends StObject {
  
  var ledColor: js.UndefOr[LedColor] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object LedParams {
  
  inline def apply(): LedParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LedParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LedParams] (val x: Self) extends AnyVal {
    
    inline def setLedColor(value: LedColor): Self = StObject.set(x, "ledColor", value.asInstanceOf[js.Any])
    
    inline def setLedColorUndefined: Self = StObject.set(x, "ledColor", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
