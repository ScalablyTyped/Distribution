package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleCondition extends js.Object {
  /**
    * The type of condition. Valid values are `host-header` or `path-pattern`. Must also set `values`.
    */
  var field: js.UndefOr[Input[String]] = js.native
  /**
    * Contains a single `value` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
    */
  var hostHeader: js.UndefOr[Input[ListenerRuleConditionHostHeader]] = js.native
  /**
    * HTTP headers to match. HTTP Header block fields documented below.
    */
  var httpHeader: js.UndefOr[Input[ListenerRuleConditionHttpHeader]] = js.native
  /**
    * Contains a single `value` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
    */
  var httpRequestMethod: js.UndefOr[Input[ListenerRuleConditionHttpRequestMethod]] = js.native
  /**
    * Contains a single `value` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard charaters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query-string` condition.
    */
  var pathPattern: js.UndefOr[Input[ListenerRuleConditionPathPattern]] = js.native
  /**
    * Query strings to match. Query String block fields documented below.
    */
  var queryStrings: js.UndefOr[Input[js.Array[Input[ListenerRuleConditionQueryString]]]] = js.native
  /**
    * Contains a single `value` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http-header` condition instead.
    */
  var sourceIp: js.UndefOr[Input[ListenerRuleConditionSourceIp]] = js.native
  /**
    * Query string pairs or values to match. Query String Value blocks documented below. Multiple `values` blocks can be specified, see example above. Maximum size of each string is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). To search for a literal '\*' or '?' character in a query string, escape the character with a backslash (\\). Only one pair needs to match for the condition to be satisfied.
    */
  var values: js.UndefOr[Input[String]] = js.native
}

object ListenerRuleCondition {
  @scala.inline
  def apply(
    field: Input[String] = null,
    hostHeader: Input[ListenerRuleConditionHostHeader] = null,
    httpHeader: Input[ListenerRuleConditionHttpHeader] = null,
    httpRequestMethod: Input[ListenerRuleConditionHttpRequestMethod] = null,
    pathPattern: Input[ListenerRuleConditionPathPattern] = null,
    queryStrings: Input[js.Array[Input[ListenerRuleConditionQueryString]]] = null,
    sourceIp: Input[ListenerRuleConditionSourceIp] = null,
    values: Input[String] = null
  ): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (hostHeader != null) __obj.updateDynamic("hostHeader")(hostHeader.asInstanceOf[js.Any])
    if (httpHeader != null) __obj.updateDynamic("httpHeader")(httpHeader.asInstanceOf[js.Any])
    if (httpRequestMethod != null) __obj.updateDynamic("httpRequestMethod")(httpRequestMethod.asInstanceOf[js.Any])
    if (pathPattern != null) __obj.updateDynamic("pathPattern")(pathPattern.asInstanceOf[js.Any])
    if (queryStrings != null) __obj.updateDynamic("queryStrings")(queryStrings.asInstanceOf[js.Any])
    if (sourceIp != null) __obj.updateDynamic("sourceIp")(sourceIp.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleCondition]
  }
}

