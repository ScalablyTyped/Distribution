package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig extends StObject {
  
  /**
    * - The match status to assign to the web request if the request doesn't have a valid IP address in the specified position. Valid values include: `MATCH` or `NO_MATCH`.
    */
  var fallbackBehavior: String
  
  /**
    * - The name of the HTTP header to use for the IP address.
    */
  var headerName: String
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig {
  
  inline def apply(fallbackBehavior: String, headerName: String): WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig = {
    val __obj = js.Dynamic.literal(fallbackBehavior = fallbackBehavior.asInstanceOf[js.Any], headerName = headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig]
  }
  
  extension [Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig](x: Self) {
    
    inline def setFallbackBehavior(value: String): Self = StObject.set(x, "fallbackBehavior", value.asInstanceOf[js.Any])
    
    inline def setHeaderName(value: String): Self = StObject.set(x, "headerName", value.asInstanceOf[js.Any])
  }
}
