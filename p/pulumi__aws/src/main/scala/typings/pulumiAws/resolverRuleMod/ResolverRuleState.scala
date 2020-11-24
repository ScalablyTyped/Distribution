package typings.pulumiAws.resolverRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.route53.ResolverRuleTargetIp
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverRuleState extends js.Object {
  
  /**
    * The ARN (Amazon Resource Name) for the resolver rule.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * DNS queries for this domain name are forwarded to the IP addresses that are specified using `targetIp`.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  
  /**
    * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * When a rule is shared with another AWS account, the account ID of the account that the rule is shared with.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `targetIp`.
    * This argument should only be specified for `FORWARD` type rules.
    */
  val resolverEndpointId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
    */
  val ruleType: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether the rules is shared and, if so, whether the current account is sharing the rule with another account, or another account is sharing the rule with the current account.
    * Values are `NOT_SHARED`, `SHARED_BY_ME` or `SHARED_WITH_ME`
    */
  val shareStatus: js.UndefOr[Input[String]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
    * This argument should only be specified for `FORWARD` type rules.
    */
  val targetIps: js.UndefOr[Input[js.Array[Input[ResolverRuleTargetIp]]]] = js.native
}
object ResolverRuleState {
  
  @scala.inline
  def apply(): ResolverRuleState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverRuleState]
  }
  
  @scala.inline
  implicit class ResolverRuleStateOps[Self <: ResolverRuleState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: Input[String]): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("ownerId", js.undefined)
    
    @scala.inline
    def setResolverEndpointId(value: Input[String]): Self = this.set("resolverEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolverEndpointId: Self = this.set("resolverEndpointId", js.undefined)
    
    @scala.inline
    def setRuleType(value: Input[String]): Self = this.set("ruleType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleType: Self = this.set("ruleType", js.undefined)
    
    @scala.inline
    def setShareStatus(value: Input[String]): Self = this.set("shareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareStatus: Self = this.set("shareStatus", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTargetIpsVarargs(value: Input[ResolverRuleTargetIp]*): Self = this.set("targetIps", js.Array(value :_*))
    
    @scala.inline
    def setTargetIps(value: Input[js.Array[Input[ResolverRuleTargetIp]]]): Self = this.set("targetIps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIps: Self = this.set("targetIps", js.undefined)
  }
}
