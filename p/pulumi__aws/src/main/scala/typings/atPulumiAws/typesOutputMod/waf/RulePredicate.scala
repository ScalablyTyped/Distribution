package typings.atPulumiAws.typesOutputMod.waf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulePredicate extends js.Object {
  /**
    * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
    */
  var dataId: String = js.native
  /**
    * Set this to `false` if you want to allow, block, or count requests
    * based on the settings in the specified [wafByteMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_byte_match_set.html), [wafIpset](https://www.terraform.io/docs/providers/aws/r/waf_ipset.html), [aws.waf.SizeConstraintSet](https://www.terraform.io/docs/providers/aws/r/waf_size_constraint_set.html), [aws.waf.SqlInjectionMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_sql_injection_match_set.html) or [aws.waf.XssMatchSet](https://www.terraform.io/docs/providers/aws/r/waf_xss_match_set.html).
    * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
    * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses _except_ `192.0.2.44`.
    */
  var negated: Boolean = js.native
  /**
    * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
    */
  var `type`: String = js.native
}

object RulePredicate {
  @scala.inline
  def apply(dataId: String, negated: Boolean, `type`: String): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
}

