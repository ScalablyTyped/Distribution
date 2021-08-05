package typings.pulumiAws.outputMod.wafv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementRateBasedStatement extends StObject {
  
  /**
    * Setting that indicates how to aggregate the request counts. Valid values include: `FORWARDED_IP` or `IP`. Default: `IP`.
    */
  var aggregateKeyType: js.UndefOr[String] = js.undefined
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. If `aggregateKeyType` is set to `FORWARDED_IP`, this block is required. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[WebAclRuleStatementRateBasedStatementForwardedIpConfig] = js.undefined
  
  /**
    * The limit on requests per 5-minute period for a single originating IP address.
    */
  var limit: Double
  
  /**
    * An optional nested statement that narrows the scope of the rate-based statement to matching web requests. This can be any nestable statement, and you can nest statements at any level below this scope-down statement. See Statement above for details.
    */
  var scopeDownStatement: js.UndefOr[WebAclRuleStatementRateBasedStatementScopeDownStatement] = js.undefined
}
object WebAclRuleStatementRateBasedStatement {
  
  inline def apply(limit: Double): WebAclRuleStatementRateBasedStatement = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementRateBasedStatement]
  }
  
  extension [Self <: WebAclRuleStatementRateBasedStatement](x: Self) {
    
    inline def setAggregateKeyType(value: String): Self = StObject.set(x, "aggregateKeyType", value.asInstanceOf[js.Any])
    
    inline def setAggregateKeyTypeUndefined: Self = StObject.set(x, "aggregateKeyType", js.undefined)
    
    inline def setForwardedIpConfig(value: WebAclRuleStatementRateBasedStatementForwardedIpConfig): Self = StObject.set(x, "forwardedIpConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardedIpConfigUndefined: Self = StObject.set(x, "forwardedIpConfig", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatement(value: WebAclRuleStatementRateBasedStatementScopeDownStatement): Self = StObject.set(x, "scopeDownStatement", value.asInstanceOf[js.Any])
    
    inline def setScopeDownStatementUndefined: Self = StObject.set(x, "scopeDownStatement", js.undefined)
  }
}
