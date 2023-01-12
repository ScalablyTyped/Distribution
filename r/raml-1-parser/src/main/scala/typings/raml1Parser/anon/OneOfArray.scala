package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneOfArray extends StObject {
  
  var oneOf: js.Array[Type | ActionConditions | ConditionsFacets]
}
object OneOfArray {
  
  inline def apply(oneOf: js.Array[Type | ActionConditions | ConditionsFacets]): OneOfArray = {
    val __obj = js.Dynamic.literal(oneOf = oneOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneOfArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneOfArray] (val x: Self) extends AnyVal {
    
    inline def setOneOf(value: js.Array[Type | ActionConditions | ConditionsFacets]): Self = StObject.set(x, "oneOf", value.asInstanceOf[js.Any])
    
    inline def setOneOfVarargs(value: (Type | ActionConditions | ConditionsFacets)*): Self = StObject.set(x, "oneOf", js.Array(value*))
  }
}
