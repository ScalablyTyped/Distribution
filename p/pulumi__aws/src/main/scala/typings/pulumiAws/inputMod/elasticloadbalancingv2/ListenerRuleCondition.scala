package typings.pulumiAws.inputMod.elasticloadbalancingv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleCondition extends StObject {
  
  /**
    * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
    */
  var hostHeader: js.UndefOr[Input[ListenerRuleConditionHostHeader]] = js.undefined
  
  /**
    * HTTP headers to match. HTTP Header block fields documented below.
    */
  var httpHeader: js.UndefOr[Input[ListenerRuleConditionHttpHeader]] = js.undefined
  
  /**
    * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
    */
  var httpRequestMethod: js.UndefOr[Input[ListenerRuleConditionHttpRequestMethod]] = js.undefined
  
  /**
    * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `queryString` condition.
    */
  var pathPattern: js.UndefOr[Input[ListenerRuleConditionPathPattern]] = js.undefined
  
  /**
    * Query strings to match. Query String block fields documented below.
    */
  var queryStrings: js.UndefOr[Input[js.Array[Input[ListenerRuleConditionQueryString]]]] = js.undefined
  
  /**
    * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `httpHeader` condition instead.
    */
  var sourceIp: js.UndefOr[Input[ListenerRuleConditionSourceIp]] = js.undefined
}
object ListenerRuleCondition {
  
  inline def apply(): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerRuleCondition]
  }
  
  extension [Self <: ListenerRuleCondition](x: Self) {
    
    inline def setHostHeader(value: Input[ListenerRuleConditionHostHeader]): Self = StObject.set(x, "hostHeader", value.asInstanceOf[js.Any])
    
    inline def setHostHeaderUndefined: Self = StObject.set(x, "hostHeader", js.undefined)
    
    inline def setHttpHeader(value: Input[ListenerRuleConditionHttpHeader]): Self = StObject.set(x, "httpHeader", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaderUndefined: Self = StObject.set(x, "httpHeader", js.undefined)
    
    inline def setHttpRequestMethod(value: Input[ListenerRuleConditionHttpRequestMethod]): Self = StObject.set(x, "httpRequestMethod", value.asInstanceOf[js.Any])
    
    inline def setHttpRequestMethodUndefined: Self = StObject.set(x, "httpRequestMethod", js.undefined)
    
    inline def setPathPattern(value: Input[ListenerRuleConditionPathPattern]): Self = StObject.set(x, "pathPattern", value.asInstanceOf[js.Any])
    
    inline def setPathPatternUndefined: Self = StObject.set(x, "pathPattern", js.undefined)
    
    inline def setQueryStrings(value: Input[js.Array[Input[ListenerRuleConditionQueryString]]]): Self = StObject.set(x, "queryStrings", value.asInstanceOf[js.Any])
    
    inline def setQueryStringsUndefined: Self = StObject.set(x, "queryStrings", js.undefined)
    
    inline def setQueryStringsVarargs(value: Input[ListenerRuleConditionQueryString]*): Self = StObject.set(x, "queryStrings", js.Array(value :_*))
    
    inline def setSourceIp(value: Input[ListenerRuleConditionSourceIp]): Self = StObject.set(x, "sourceIp", value.asInstanceOf[js.Any])
    
    inline def setSourceIpUndefined: Self = StObject.set(x, "sourceIp", js.undefined)
  }
}
