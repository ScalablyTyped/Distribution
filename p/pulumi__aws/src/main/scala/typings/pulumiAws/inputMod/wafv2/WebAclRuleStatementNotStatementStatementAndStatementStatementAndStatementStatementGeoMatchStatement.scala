package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement extends js.Object {
  
  /**
    * An array of two-character country codes, for example, [ "US", "CN" ], from the alpha-2 country ISO codes of the `ISO 3166` international standard. See the [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_GeoMatchStatement.html) for valid values.
    */
  var countryCodes: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The configuration for inspecting IP addresses in an HTTP header that you specify, instead of using the IP address that's reported by the web request origin. See Forwarded IP Config below for details.
    */
  var forwardedIpConfig: js.UndefOr[
    Input[
      WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig
    ]
  ] = js.native
}
object WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement {
  
  @scala.inline
  def apply(countryCodes: Input[js.Array[Input[String]]]): WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement = {
    val __obj = js.Dynamic.literal(countryCodes = countryCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement]
  }
  
  @scala.inline
  implicit class WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementOps[Self <: WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountryCodesVarargs(value: Input[String]*): Self = this.set("countryCodes", js.Array(value :_*))
    
    @scala.inline
    def setCountryCodes(value: Input[js.Array[Input[String]]]): Self = this.set("countryCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardedIpConfig(
      value: Input[
          WebAclRuleStatementNotStatementStatementAndStatementStatementAndStatementStatementGeoMatchStatementForwardedIpConfig
        ]
    ): Self = this.set("forwardedIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedIpConfig: Self = this.set("forwardedIpConfig", js.undefined)
  }
}
