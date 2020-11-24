package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolRoleAttachmentRoleMappingMappingRule extends js.Object {
  
  /**
    * The claim name that must be present in the token, for example, "isAdmin" or "paid".
    */
  var claim: Input[String] = js.native
  
  /**
    * The match condition that specifies how closely the claim value in the IdP token must match Value.
    */
  var matchType: Input[String] = js.native
  
  /**
    * The role ARN.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * A brief string that the claim must match, for example, "paid" or "yes".
    */
  var value: Input[String] = js.native
}
object IdentityPoolRoleAttachmentRoleMappingMappingRule {
  
  @scala.inline
  def apply(claim: Input[String], matchType: Input[String], roleArn: Input[String], value: Input[String]): IdentityPoolRoleAttachmentRoleMappingMappingRule = {
    val __obj = js.Dynamic.literal(claim = claim.asInstanceOf[js.Any], matchType = matchType.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMappingMappingRule]
  }
  
  @scala.inline
  implicit class IdentityPoolRoleAttachmentRoleMappingMappingRuleOps[Self <: IdentityPoolRoleAttachmentRoleMappingMappingRule] (val x: Self) extends AnyVal {
    
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
    def setClaim(value: Input[String]): Self = this.set("claim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchType(value: Input[String]): Self = this.set("matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
