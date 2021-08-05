package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleConditionHttpHeader extends StObject {
  
  /**
    * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
    */
  var httpHeaderName: Input[String]
  
  /**
    * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
    */
  var values: Input[js.Array[Input[String]]]
}
object ListenerRuleConditionHttpHeader {
  
  inline def apply(httpHeaderName: Input[String], values: Input[js.Array[Input[String]]]): ListenerRuleConditionHttpHeader = {
    val __obj = js.Dynamic.literal(httpHeaderName = httpHeaderName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHttpHeader]
  }
  
  extension [Self <: ListenerRuleConditionHttpHeader](x: Self) {
    
    inline def setHttpHeaderName(value: Input[String]): Self = StObject.set(x, "httpHeaderName", value.asInstanceOf[js.Any])
    
    inline def setValues(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: Input[String]*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
