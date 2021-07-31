package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TriggerPredicate extends StObject {
  
  /**
    * A list of the conditions that determine when the trigger will fire. Defined below.
    */
  var conditions: Input[js.Array[Input[TriggerPredicateCondition]]]
  
  /**
    * How to handle multiple conditions. Defaults to `AND`. Valid values are `AND` or `ANY`.
    */
  var logical: js.UndefOr[Input[String]] = js.undefined
}
object TriggerPredicate {
  
  @scala.inline
  def apply(conditions: Input[js.Array[Input[TriggerPredicateCondition]]]): TriggerPredicate = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerPredicate]
  }
  
  @scala.inline
  implicit class TriggerPredicateMutableBuilder[Self <: TriggerPredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: Input[js.Array[Input[TriggerPredicateCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: Input[TriggerPredicateCondition]*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setLogical(value: Input[String]): Self = StObject.set(x, "logical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogicalUndefined: Self = StObject.set(x, "logical", js.undefined)
  }
}
