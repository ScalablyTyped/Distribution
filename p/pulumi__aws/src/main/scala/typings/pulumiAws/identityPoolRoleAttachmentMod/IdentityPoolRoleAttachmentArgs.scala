package typings.pulumiAws.identityPoolRoleAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityPoolRoleAttachmentArgs extends js.Object {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: Input[String] = js.native
  
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]] = js.native
  
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: Input[StringDictionary[Input[String]]] = js.native
}
object IdentityPoolRoleAttachmentArgs {
  
  @scala.inline
  def apply(identityPoolId: Input[String], roles: Input[StringDictionary[Input[String]]]): IdentityPoolRoleAttachmentArgs = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentArgs]
  }
  
  @scala.inline
  implicit class IdentityPoolRoleAttachmentArgsOps[Self <: IdentityPoolRoleAttachmentArgs] (val x: Self) extends AnyVal {
    
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
    def setIdentityPoolId(value: Input[String]): Self = this.set("identityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoles(value: Input[StringDictionary[Input[String]]]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleMappingsVarargs(value: Input[IdentityPoolRoleAttachmentRoleMapping]*): Self = this.set("roleMappings", js.Array(value :_*))
    
    @scala.inline
    def setRoleMappings(value: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]): Self = this.set("roleMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleMappings: Self = this.set("roleMappings", js.undefined)
  }
}
