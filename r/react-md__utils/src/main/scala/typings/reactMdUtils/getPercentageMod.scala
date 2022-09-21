package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPercentageMod {
  
  @JSImport("@react-md/utils/types/getPercentage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPercentage(hasMinMaxValueValidate: GetPercentageOptions): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getPercentage")(hasMinMaxValueValidate.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait GetPercentageOptions extends StObject {
    
    /**
      * The max value allowed.
      */
    var max: Double
    
    /**
      * The min value allowed.
      */
    var min: Double
    
    /**
      * Boolean if the min, max, and value options should be validated to make sure
      * they are within the correct range relative to each other.
      *
      * @defaultValue `true`
      */
    var validate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current value
      */
    var value: Double
  }
  object GetPercentageOptions {
    
    inline def apply(max: Double, min: Double, value: Double): GetPercentageOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPercentageOptions]
    }
    
    extension [Self <: GetPercentageOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
