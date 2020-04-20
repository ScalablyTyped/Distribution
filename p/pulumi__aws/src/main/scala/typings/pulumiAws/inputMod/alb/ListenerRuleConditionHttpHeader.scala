package typings.pulumiAws.inputMod.alb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleConditionHttpHeader extends js.Object {
  /**
    * Name of HTTP header to search. The maximum size is 40 characters. Comparison is case insensitive. Only RFC7240 characters are supported. Wildcards are not supported. You cannot use HTTP header condition to specify the host header, use a `host-header` condition instead.
    */
  var httpHeaderName: Input[String] = js.native
  /**
    * List of header value patterns to match. Maximum size of each pattern is 128 characters. Comparison is case insensitive. Wildcard characters supported: * (matches 0 or more characters) and ? (matches exactly 1 character). If the same header appears multiple times in the request they will be searched in order until a match is found. Only one pattern needs to match for the condition to be satisfied. To require that all of the strings are a match, create one condition block per string.
    */
  var values: Input[js.Array[Input[String]]] = js.native
}

object ListenerRuleConditionHttpHeader {
  @scala.inline
  def apply(httpHeaderName: Input[String], values: Input[js.Array[Input[String]]]): ListenerRuleConditionHttpHeader = {
    val __obj = js.Dynamic.literal(httpHeaderName = httpHeaderName.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionHttpHeader]
  }
}

