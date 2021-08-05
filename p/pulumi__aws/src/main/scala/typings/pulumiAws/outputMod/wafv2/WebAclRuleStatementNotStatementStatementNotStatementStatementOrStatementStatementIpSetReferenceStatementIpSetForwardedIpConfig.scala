package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: String
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: String
  
  /**
    * - The position in the header to search for the IP address. Valid values include: `FIRST`, `LAST`, or `ANY`. If `ANY` is specified and the header contains more than 10 IP addresses, AWS WAFv2 inspects the last 10.
    */
  var position: String
}
object WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig {
  
  inline def apply(fallbackBehavior: String, headerName: String, position: String): WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig]
  }
  
  extension [Self <: WebAclRuleStatementNotStatementStatementNotStatementStatementOrStatementStatementIpSetReferenceStatementIpSetForwardedIpConfig](x: Self) {
    
    inline def setFallbackBehavior(value: String): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
