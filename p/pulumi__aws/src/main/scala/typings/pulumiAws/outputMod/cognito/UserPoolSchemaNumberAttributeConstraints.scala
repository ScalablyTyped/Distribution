package typings.pulumiAws.outputMod.cognito

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolSchemaNumberAttributeConstraints extends StObject {
  
  /**
    * The maximum value of an attribute that is of the number data type.
    */
  var maxValue: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum value of an attribute that is of the number data type.
    */
  var minValue: js.UndefOr[String] = js.undefined
}
object UserPoolSchemaNumberAttributeConstraints {
  
  inline def apply(): UserPoolSchemaNumberAttributeConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserPoolSchemaNumberAttributeConstraints]
  }
  
  extension [Self <: UserPoolSchemaNumberAttributeConstraints](x: Self) {
    
    inline def setMaxValue(value: String): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: String): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
  }
}
