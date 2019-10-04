package typings.atPulumiAws.route53GetResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRulesArgs extends js.Object {
  /**
    * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
    */
  val ownerId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the outbound resolver endpoint for the desired resolver rules.
    */
  val resolverEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[String] = js.undefined
  /**
    * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[String] = js.undefined
}

object GetResolverRulesArgs {
  @scala.inline
  def apply(
    ownerId: String = null,
    resolverEndpointId: String = null,
    ruleType: String = null,
    shareStatus: String = null
  ): GetResolverRulesArgs = {
    val __obj = js.Dynamic.literal()
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId)
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType)
    if (shareStatus != null) __obj.updateDynamic("shareStatus")(shareStatus)
    __obj.asInstanceOf[GetResolverRulesArgs]
  }
}

