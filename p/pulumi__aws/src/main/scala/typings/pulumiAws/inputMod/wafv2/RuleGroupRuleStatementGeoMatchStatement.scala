package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupRuleStatementGeoMatchStatement extends StObject {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
    */
  var countryCodes: Input[js.Array[Input[String]]]
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[Input[RuleGroupRuleStatementGeoMatchStatementForwardedIpConfig]] = js.undefined
}
object RuleGroupRuleStatementGeoMatchStatement {
  
  inline def apply(countryCodes: Input[js.Array[Input[String]]]): RuleGroupRuleStatementGeoMatchStatement = {
    val __obj = js.Dynamic.literal(countryCodes = countryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupRuleStatementGeoMatchStatement]
  }
  
  extension [Self <: RuleGroupRuleStatementGeoMatchStatement](x: Self) {
    
    inline def setCountryCodes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    inline def setCountryCodesVarargs(value: Input[String]*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
    
    inline def setForwardedIpConfig(value: Input[RuleGroupRuleStatementGeoMatchStatementForwardedIpConfig]): Self = StObject.set(x, "forwardedIpConfig", value.asInstanceOf[js.Any])
    
    inline def setForwardedIpConfigUndefined: Self = StObject.set(x, "forwardedIpConfig", js.undefined)
  }
}
