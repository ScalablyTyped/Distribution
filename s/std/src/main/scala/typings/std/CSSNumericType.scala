package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSNumericType extends StObject {
  
  /* standard dom */
  var angle: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var flex: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var length: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var percent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var percentHint: js.UndefOr[CSSNumericBaseType] = js.undefined
  
  /* standard dom */
  var resolution: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var time: js.UndefOr[Double] = js.undefined
}
object CSSNumericType {
  
  inline def apply(): CSSNumericType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSNumericType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSNumericType] (val x: Self) extends AnyVal {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setFlex(value: Double): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentHint(value: CSSNumericBaseType): Self = StObject.set(x, "percentHint", value.asInstanceOf[js.Any])
    
    inline def setPercentHintUndefined: Self = StObject.set(x, "percentHint", js.undefined)
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
