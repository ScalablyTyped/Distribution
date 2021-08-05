package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: Input[String]
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ]
  ] = js.undefined
}
object WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement {
  
  inline def apply(arn: Input[String]): WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement]
  }
  
  extension [Self <: WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatement](x: Self) {
    
    inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfig(
      value: Input[
          WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
        ]
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    inline def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
