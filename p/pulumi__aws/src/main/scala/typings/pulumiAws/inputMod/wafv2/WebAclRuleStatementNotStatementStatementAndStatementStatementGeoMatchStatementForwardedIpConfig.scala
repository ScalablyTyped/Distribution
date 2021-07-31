package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: Input[String]
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: Input[String]
}
object WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
  
  @scala.inline
  def apply(fallbackBehavior: Input[String], headerName: Input[String]): WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfigMutableBuilder[Self <: WebAclRuleStatementNotStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFallbackBehavior(value: Input[String]): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderName(value: Input[String]): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
  }
}
