package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleConditionHostHeader extends StObject {
  
  /**
    * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
    */
  var values: Input[js.Array[Input[String]]]
}
object ListenerRuleConditionHostHeader {
  
  @scala.inline
  def apply(values: Input[js.Array[Input[String]]]): ListenerRuleConditionHostHeader = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHostHeader]
  }
  
  @scala.inline
  implicit class ListenerRuleConditionHostHeaderMutableBuilder[Self <: ListenerRuleConditionHostHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
