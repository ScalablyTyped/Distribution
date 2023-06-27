package typings.smithyTypes

import typings.smithyTypes.distTypesEndpointsSharedMod.ConditionObject
import typings.smithyTypes.distTypesEndpointsSharedMod.Expression
import typings.smithyTypes.smithyTypesStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointsErrorRuleObjectMod {
  
  trait ErrorRuleObject extends StObject {
    
    var conditions: js.UndefOr[js.Array[ConditionObject]] = js.undefined
    
    var documentation: js.UndefOr[String] = js.undefined
    
    var error: Expression
    
    var `type`: error
  }
  object ErrorRuleObject {
    
    inline def apply(error: Expression): ErrorRuleObject = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("error")
      __obj.asInstanceOf[ErrorRuleObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorRuleObject] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[ConditionObject]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
      
      inline def setConditionsVarargs(value: ConditionObject*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setDocumentation(value: String): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
      
      inline def setDocumentationUndefined: Self = StObject.set(x, "documentation", js.undefined)
      
      inline def setError(value: Expression): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
