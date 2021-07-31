package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementIpSetReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IP Set that this statement references.
    */
  var arn: Input[String]
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See IPSet Forwarded IP Config below for more details.
    */
  var ipSetForwardedIpConfig: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
    ]
  ] = js.undefined
}
object WebAclRuleStatementOrStatementStatementIpSetReferenceStatement {
  
  @scala.inline
  def apply(arn: Input[String]): WebAclRuleStatementOrStatementStatementIpSetReferenceStatement = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementIpSetReferenceStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementIpSetReferenceStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementIpSetReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfig(
      value: Input[
          WebAclRuleStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig
        ]
    ): Self = StObject.set(x, "ipSetForwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpSetForwardedIpConfigUndefined: Self = StObject.set(x, "ipSetForwardedIpConfig", js.undefined)
  }
}
