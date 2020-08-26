package typings.pulumiAws.getResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResolverRulesResult extends js.Object {
  /**
    * The provider-assigned unique ID for this managed resource.
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
  def apply(id: String, resolverRuleIds: js.Array[String]): GetResolverRulesResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resolverRuleIds = resolverRuleIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResolverRulesResult]
  }
  @scala.inline
  implicit class GetResolverRulesResultOps[Self <: GetResolverRulesResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolverRuleIdsVarargs(value: String*): Self = this.set("resolverRuleIds", js.Array(value :_*))
    @scala.inline
    def setResolverRuleIds(value: js.Array[String]): Self = this.set("resolverRuleIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    @scala.inline
    def setResolverEndpointId(value: String): Self = this.set("resolverEndpointId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("resolverEndpointId", js.undefined)
    @scala.inline
    def setRuleType(value: String): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuleType: Self = this.set("ruleType", js.undefined)
    @scala.inline
    def setShareStatus(value: String): Self = this.set("shareStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShareStatus: Self = this.set("shareStatus", js.undefined)
  }
  
}

