package typings.steelseries.mod

import typings.std.RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OdometerParams extends StObject {
  
  var _context: js.UndefOr[RenderingContext] = js.undefined
  
  var decimalBackColor: js.UndefOr[String] = js.undefined
  
  var decimalForeColor: js.UndefOr[String] = js.undefined
  
  var decimals: js.UndefOr[Double] = js.undefined
  
  var digits: js.UndefOr[Double] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
  
  var valueBackColor: js.UndefOr[String] = js.undefined
  
  var valueForeColor: js.UndefOr[String] = js.undefined
  
  var wobbleFactor: js.UndefOr[Double] = js.undefined
}
object OdometerParams {
  
  inline def apply(): OdometerParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OdometerParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OdometerParams] (val x: Self) extends AnyVal {
    
    inline def setDecimalBackColor(value: String): Self = StObject.set(x, "decimalBackColor", value.asInstanceOf[js.Any])
    
    inline def setDecimalBackColorUndefined: Self = StObject.set(x, "decimalBackColor", js.undefined)
    
    inline def setDecimalForeColor(value: String): Self = StObject.set(x, "decimalForeColor", value.asInstanceOf[js.Any])
    
    inline def setDecimalForeColorUndefined: Self = StObject.set(x, "decimalForeColor", js.undefined)
    
    inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
    
    inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
    
    inline def setDigits(value: Double): Self = StObject.set(x, "digits", value.asInstanceOf[js.Any])
    
    inline def setDigitsUndefined: Self = StObject.set(x, "digits", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueBackColor(value: String): Self = StObject.set(x, "valueBackColor", value.asInstanceOf[js.Any])
    
    inline def setValueBackColorUndefined: Self = StObject.set(x, "valueBackColor", js.undefined)
    
    inline def setValueForeColor(value: String): Self = StObject.set(x, "valueForeColor", value.asInstanceOf[js.Any])
    
    inline def setValueForeColorUndefined: Self = StObject.set(x, "valueForeColor", js.undefined)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWobbleFactor(value: Double): Self = StObject.set(x, "wobbleFactor", value.asInstanceOf[js.Any])
    
    inline def setWobbleFactorUndefined: Self = StObject.set(x, "wobbleFactor", js.undefined)
    
    inline def set_context(value: RenderingContext): Self = StObject.set(x, "_context", value.asInstanceOf[js.Any])
    
    inline def set_contextUndefined: Self = StObject.set(x, "_context", js.undefined)
  }
}
