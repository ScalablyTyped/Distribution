package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
  */
trait ScopedResourceSelectorRequirement extends StObject {
  
  /**
    * Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
    */
  var operator: String
  
  /**
    * The name of the scope that the selector applies to.
    */
  var scopeName: String
  
  /**
    * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
    */
  var values: js.Array[String]
}
object ScopedResourceSelectorRequirement {
  
  inline def apply(operator: String, scopeName: String, values: js.Array[String]): ScopedResourceSelectorRequirement = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedResourceSelectorRequirement]
  }
  
  extension [Self <: ScopedResourceSelectorRequirement](x: Self) {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
