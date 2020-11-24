package typings.pulumiAws.inputMod.cognito

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolRoleAttachmentRoleMapping extends js.Object {
  
  /**
    * Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
    */
  var ambiguousRoleResolution: js.UndefOr[Input[String]] = js.native
  
  /**
    * A string identifying the identity provider, for example, "graph.facebook.com" or "cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id".
    */
  var identityProvider: Input[String] = js.native
  
  /**
    * The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
    */
  var mappingRules: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]]]] = js.native
  
  /**
    * The role mapping type.
    */
  var `type`: Input[String] = js.native
}
object IdentityPoolRoleAttachmentRoleMapping {
  
  @scala.inline
  def apply(identityProvider: Input[String], `type`: Input[String]): IdentityPoolRoleAttachmentRoleMapping = {
    val __obj = js.Dynamic.literal(identityProvider = identityProvider.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentRoleMapping]
  }
  
  @scala.inline
  implicit class IdentityPoolRoleAttachmentRoleMappingOps[Self <: IdentityPoolRoleAttachmentRoleMapping] (val x: Self) extends AnyVal {
    
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
    def setIdentityProvider(value: Input[String]): Self = this.set("identityProvider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmbiguousRoleResolution(value: Input[String]): Self = this.set("ambiguousRoleResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmbiguousRoleResolution: Self = this.set("ambiguousRoleResolution", js.undefined)
    
    @scala.inline
    def setMappingRulesVarargs(value: Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]*): Self = this.set("mappingRules", js.Array(value :_*))
    
    @scala.inline
    def setMappingRules(value: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMappingMappingRule]]]): Self = this.set("mappingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMappingRules: Self = this.set("mappingRules", js.undefined)
  }
}
