package typings
package atPulumiAwsLib.s3RoutingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoutingRule extends js.Object {
  /**
    * A condition that must be met for the specified redirect to be applied.
    * If not included, the rule is applied to all requests.
    */
  var Condition: js.UndefOr[Condition] = js.undefined
  /**
    * Provides instructions for redirecting the request. You can redirect requests to another host or another page,
    * or you can specify another protocol to use.
    */
  var Redirect: atPulumiAwsLib.s3RoutingRulesMod.Redirect
}

object RoutingRule {
  @scala.inline
  def apply(Redirect: Redirect, Condition: Condition = null): RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition)
    __obj.asInstanceOf[RoutingRule]
  }
}

