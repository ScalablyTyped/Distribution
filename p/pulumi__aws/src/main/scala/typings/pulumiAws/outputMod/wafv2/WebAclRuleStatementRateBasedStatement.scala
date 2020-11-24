package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementRateBasedStatement extends js.Object {
  
  /**
    * Setting that indicates how to aggregate the request counts. Valid values include: `FORWARDED_IP` or `IP`. Default: `IP`.
    */
  var aggregateKeyType: js.UndefOr[String] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. If `aggregateKeyType` is set to `FORWARDED_IP`, this block is required. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[WebAclRuleStatementRateBasedStatementForwardedIpConfig] = js.native
  
  /**
    * The limit on requests per 5-minute period for a single originating IP address.
    */
  var limit: Double = js.native
  
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
    */
  var scopeDownStatement: js.UndefOr[WebAclRuleStatementRateBasedStatementScopeDownStatement] = js.native
}
object WebAclRuleStatementRateBasedStatement {
  
  @scala.inline
  def apply(limit: Double): WebAclRuleStatementRateBasedStatement = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementRateBasedStatementOps[Self <: WebAclRuleStatementRateBasedStatement] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateKeyType(value: String): Self = this.set("aggregateKeyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateKeyType: Self = this.set("aggregateKeyType", js.undefined)
    
    @scala.inline
    def setForwardedIpConfig(value: WebAclRuleStatementRateBasedStatementForwardedIpConfig): Self = this.set("forwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedIpConfig: Self = this.set("forwardedIpConfig", js.undefined)
    
    @scala.inline
    def setScopeDownStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatement): Self = this.set("scopeDownStatement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeDownStatement: Self = this.set("scopeDownStatement", js.undefined)
  }
}
