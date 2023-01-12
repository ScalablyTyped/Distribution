package typings.reactRanger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GetPercentageForValue extends StObject {
    
    def getPercentageForValue(`val`: Double, min: Double, max: Double): Double
    
    def getValueForClientX(clientX: Double, trackDims: js.Object, min: Double, max: Double): Double
  }
  object GetPercentageForValue {
    
    inline def apply(
      getPercentageForValue: (Double, Double, Double) => Double,
      getValueForClientX: (Double, js.Object, Double, Double) => Double
    ): GetPercentageForValue = {
      val __obj = js.Dynamic.literal(getPercentageForValue = js.Any.fromFunction3(getPercentageForValue), getValueForClientX = js.Any.fromFunction4(getValueForClientX))
      __obj.asInstanceOf[GetPercentageForValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetPercentageForValue] (val x: Self) extends AnyVal {
      
      inline def setGetPercentageForValue(value: (Double, Double, Double) => Double): Self = StObject.set(x, "getPercentageForValue", js.Any.fromFunction3(value))
      
      inline def setGetValueForClientX(value: (Double, js.Object, Double, Double) => Double): Self = StObject.set(x, "getValueForClientX", js.Any.fromFunction4(value))
    }
  }
}
