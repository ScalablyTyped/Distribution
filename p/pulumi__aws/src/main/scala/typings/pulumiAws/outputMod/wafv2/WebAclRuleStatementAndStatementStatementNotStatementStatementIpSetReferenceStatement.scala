package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: String
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
  ] = js.undefined
}
object WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement {
  
  inline def apply(arn: String): WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement]
  }
  
  extension [Self <: WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatement](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfig(
      value: WebAclRuleStatementAndStatementStatementNotStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
