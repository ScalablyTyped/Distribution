package typings.pulumiAws.routingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoutingRule extends js.Object {
  /**
    * A condition that must be met for the specified redirect to be applied.
    * If not included, the rule is applied to all requests.
    */
  var Condition: js.UndefOr[typings.pulumiAws.routingRulesMod.Condition] = js.native
  /**
    * Provides instructions for redirecting the request. You can redirect requests to another host or another page,
    * or you can specify another protocol to use.
    */
  var Redirect: typings.pulumiAws.routingRulesMod.Redirect = js.native
}

object RoutingRule {
  @scala.inline
  def apply(Redirect: Redirect): RoutingRule = {
    val __obj = js.Dynamic.literal(Redirect = Redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoutingRule]
  }
  @scala.inline
  implicit class RoutingRuleOps[Self <: RoutingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedirect(value: Redirect): Self = this.set("Redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: Condition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
  }
  
}

