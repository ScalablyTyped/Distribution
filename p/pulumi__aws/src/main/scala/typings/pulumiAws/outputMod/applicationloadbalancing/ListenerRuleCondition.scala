package typings.pulumiAws.outputMod.applicationloadbalancing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleCondition extends js.Object {
  /**
    * The type of condition. Valid values are `host-header` or `path-pattern`. Must also set `values`.
    */
  var field: String = js.native
  /**
    * Contains a single `values` item which is a list of host header patterns to match. The maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied.
    */
  var hostHeader: ListenerRuleConditionHostHeader = js.native
  /**
    * HTTP headers to match. HTTP Header block fields documented below.
    */
  var httpHeader: js.UndefOr[ListenerRuleConditionHttpHeader] = js.native
  /**
    * Contains a single `values` item which is a list of HTTP request methods or verbs to match. Maximum size is 40 characters. Only allowed characters are A-Z, hyphen (-) and underscore (\_). Comparison is case sensitive. Wildcards are not supported. Only one needs to match for the condition to be satisfied. AWS recommends that GET and HEAD requests are routed in the same way because the response to a HEAD request may be cached.
    */
  var httpRequestMethod: js.UndefOr[ListenerRuleConditionHttpRequestMethod] = js.native
  /**
    * Contains a single `values` item which is a list of path patterns to match against the request URL. Maximum size of each pattern is 128 characters. Comparison is case sensitive. Wildcard charaters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). Only one pattern needs to match for the condition to be satisfied. Path pattern is compared only to the path of the URL, not to its query string. To compare against the query string, use a `query-string` condition.
    */
  var pathPattern: ListenerRuleConditionPathPattern = js.native
  /**
    * Query strings to match. Query String block fields documented below.
    */
  var queryStrings: js.UndefOr[js.Array[ListenerRuleConditionQueryString]] = js.native
  /**
    * Contains a single `values` item which is a list of source IP CIDR notations to match. You can use both IPv4 and IPv6 addresses. Wildcards are not supported. Condition is satisfied if the source IP address of the request matches one of the CIDR blocks. Condition is not satisfied by the addresses in the `X-Forwarded-For` header, use `http-header` condition instead.
    */
  var sourceIp: js.UndefOr[ListenerRuleConditionSourceIp] = js.native
  /**
    * List of exactly one pattern to match. Required when `field` is set.
    */
  var values: String = js.native
}

object ListenerRuleCondition {
  @scala.inline
  def apply(
    field: String,
    hostHeader: ListenerRuleConditionHostHeader,
    pathPattern: ListenerRuleConditionPathPattern,
    values: String,
    httpHeader: ListenerRuleConditionHttpHeader = null,
    httpRequestMethod: ListenerRuleConditionHttpRequestMethod = null,
    queryStrings: js.Array[ListenerRuleConditionQueryString] = null,
    sourceIp: ListenerRuleConditionSourceIp = null
  ): ListenerRuleCondition = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], hostHeader = hostHeader.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    if (httpHeader != null) __obj.updateDynamic("httpHeader")(httpHeader.asInstanceOf[js.Any])
    if (httpRequestMethod != null) __obj.updateDynamic("httpRequestMethod")(httpRequestMethod.asInstanceOf[js.Any])
    if (queryStrings != null) __obj.updateDynamic("queryStrings")(queryStrings.asInstanceOf[js.Any])
    if (sourceIp != null) __obj.updateDynamic("sourceIp")(sourceIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleCondition]
  }
}

