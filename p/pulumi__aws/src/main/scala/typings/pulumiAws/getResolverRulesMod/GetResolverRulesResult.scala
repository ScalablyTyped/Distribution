package typings.pulumiAws.getResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulesResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val ownerId: js.UndefOr[String] = js.native
  val resolverEndpointId: js.UndefOr[String] = js.native
  /**
    * The IDs of the matched resolver rules.
    */
  val resolverRuleIds: js.Array[String] = js.native
  val ruleType: js.UndefOr[String] = js.native
  val shareStatus: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolverRuleIds = resolverRuleIds.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (resolverEndpointId != null) __obj.updateDynamic("resolverEndpointId")(resolverEndpointId.asInstanceOf[js.Any])
    if (ruleType != null) __obj.updateDynamic("ruleType")(ruleType.asInstanceOf[js.Any])
    if (shareStatus != null) __obj.updateDynamic("shareStatus")(shareStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulesResult]
  }
}

