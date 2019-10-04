package typings.atPulumiAws.route53GetResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetResolverRulesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val ownerId: js.UndefOr[String] = js.undefined
  val resolverEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the matched resolver rules.
    */
  val resolverRuleIds: js.Array[String]
  val ruleType: js.UndefOr[String] = js.undefined
  val shareStatus: js.UndefOr[String] = js.undefined
}

object GetResolverRulesResult {
  @scala.inline
  def apply(
    id: String,
    resolverRuleIds: js.Array[String],
    ownerId: String = null,
    resolverEndpointId: String = null,
    ruleType: String = null,
    shareStatus: String = null
  ): GetResolverRulesResult = {
    val __obj = js.Dynamic.literal(id = id, resolverRuleIds = resolverRuleIds)
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId)
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId)
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType)
    if (shareStatus != null) __obj.updateDynamic("shareStatus")(shareStatus)
    __obj.asInstanceOf[GetResolverRulesResult]
  }
}

