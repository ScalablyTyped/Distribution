package typings.pulumiAws.getResolverRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetResolverRulesArgs extends js.Object {
  
  /**
    * When the desired resolver rules are shared with another AWS account, the account ID of the account that the rules are shared with.
    */
  val ownerId: js.UndefOr[String] = js.native
  
  /**
    * The ID of the outbound resolver endpoint for the desired resolver rules.
    */
  val resolverEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The rule type of the desired resolver rules. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[String] = js.native
  
  /**
    * Whether the desired resolver rules are shared and, if so, whether the current account is sharing the rules with another account, or another account is sharing the rules with the current account. Valid values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[String] = js.native
}
object GetResolverRulesArgs {
  
  @scala.inline
  def apply(): GetResolverRulesArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverRulesArgs]
  }
  
  @scala.inline
  implicit class GetResolverRulesArgsOps[Self <: GetResolverRulesArgs] (val x: Self) extends AnyVal {
    
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
