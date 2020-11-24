package typings.pulumiAws.outputMod.wafv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: String = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
  ] = js.native
}
object RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement {
  
  @scala.inline
  def apply(arn: String): RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement]
  }
  
  @scala.inline
  implicit class RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementOps[Self <: RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatement] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfig(
      value: RuleGroupRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ): Self = this.set("ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpSetForwardedIpConfig: Self = this.set("ipSetForwardedIpConfig", js.undefined)
  }
}
