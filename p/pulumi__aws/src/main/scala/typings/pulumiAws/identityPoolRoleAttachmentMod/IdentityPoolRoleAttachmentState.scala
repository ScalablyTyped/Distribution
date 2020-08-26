package typings.pulumiAws.identityPoolRoleAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentityPoolRoleAttachmentState extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: js.UndefOr[Input[String]] = js.native
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]] = js.native
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object IdentityPoolRoleAttachmentState {
  @scala.inline
  def apply(): IdentityPoolRoleAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
  }
  @scala.inline
  implicit class IdentityPoolRoleAttachmentStateOps[Self <: IdentityPoolRoleAttachmentState] (val x: Self) extends AnyVal {
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
    def deleteIdentityPoolId: Self = this.set("identityPoolId", js.undefined)
    @scala.inline
    def setRoleMappingsVarargs(value: Input[IdentityPoolRoleAttachmentRoleMapping]*): Self = this.set("roleMappings", js.Array(value :_*))
    @scala.inline
    def setRoleMappings(value: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]): Self = this.set("roleMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleMappings: Self = this.set("roleMappings", js.undefined)
    @scala.inline
    def setRoles(value: Input[StringDictionary[Input[String]]]): Self = this.set("roles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoles: Self = this.set("roles", js.undefined)
  }
  
}

