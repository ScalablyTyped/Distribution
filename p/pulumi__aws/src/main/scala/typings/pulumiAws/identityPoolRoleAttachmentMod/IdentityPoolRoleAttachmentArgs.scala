package typings.pulumiAws.identityPoolRoleAttachmentMod

import typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoleMapping
import typings.pulumiAws.inputMod.cognito.IdentityPoolRoleAttachmentRoles
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  val roles: Input[IdentityPoolRoleAttachmentRoles] = js.native
}

object IdentityPoolRoleAttachmentArgs {
  @scala.inline
  def apply(
    identityPoolId: Input[String],
    roles: Input[IdentityPoolRoleAttachmentRoles],
    roleMappings: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]] = null
  ): IdentityPoolRoleAttachmentArgs = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentArgs]
  }
}

