package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: String
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
  ] = js.undefined
}
object WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement {
  
  inline def apply(arn: String): WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement]
  }
  
  extension [Self <: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatement](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfig(
      value: WebAclRuleStatementRateBasedStatementScopeDownStatementNotStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
