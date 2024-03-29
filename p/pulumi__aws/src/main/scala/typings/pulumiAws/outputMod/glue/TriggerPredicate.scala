package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerPredicate extends StObject {
  
  /**
    * A list of the conditions that determine when the trigger will fire. Defined below.
    */
  var conditions: js.Array[TriggerPredicateCondition]
  
  /**
    * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
    */
  var logical: js.UndefOr[String] = js.undefined
}
object TriggerPredicate {
  
  inline def apply(conditions: js.Array[TriggerPredicateCondition]): TriggerPredicate = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicate]
  }
  
  extension [Self <: TriggerPredicate](x: Self) {
    
    inline def setConditions(value: js.Array[TriggerPredicateCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: TriggerPredicateCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setLogical(value: String): Self = StObject.set(x, "logical", value.asInstanceOf[js.Any])
    
    inline def setLogicalUndefined: Self = StObject.set(x, "logical", js.undefined)
  }
}
