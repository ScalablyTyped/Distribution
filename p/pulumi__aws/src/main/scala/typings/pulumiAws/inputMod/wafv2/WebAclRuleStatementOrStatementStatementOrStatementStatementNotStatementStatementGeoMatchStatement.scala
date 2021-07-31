package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement extends StObject {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
    */
  var countryCodes: Input[js.Array[Input[String]]]
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[
    Input[
      WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig
    ]
  ] = js.undefined
}
object WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement {
  
  @scala.inline
  def apply(countryCodes: Input[js.Array[Input[String]]]): WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement = {
    val __obj = js.Dynamic.literal(countryCodes = countryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementMutableBuilder[Self <: WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCodes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodesVarargs(value: Input[String]*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
    
    @scala.inline
    def setForwardedIpConfig(
      value: Input[
          WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementStatementGeoMatchStatementForwardedIpConfig
        ]
    ): Self = StObject.set(x, "forwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedIpConfigUndefined: Self = StObject.set(x, "forwardedIpConfig", js.undefined)
  }
}
