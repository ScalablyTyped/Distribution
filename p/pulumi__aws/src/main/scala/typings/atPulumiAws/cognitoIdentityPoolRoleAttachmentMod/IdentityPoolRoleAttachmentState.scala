package typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod

import typings.atPulumiAws.typesInputMod.cognitoNs.IdentityPoolRoleAttachmentRoleMapping
import typings.atPulumiAws.typesInputMod.cognitoNs.IdentityPoolRoleAttachmentRoles
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentState extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: js.UndefOr[Input[String]] = js.undefined
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]]] = js.undefined
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: js.UndefOr[Input[IdentityPoolRoleAttachmentRoles]] = js.undefined
}

object IdentityPoolRoleAttachmentState {
  @scala.inline
  def apply(
    identityPoolId: Input[String] = null,
    roleMappings: Input[js.Array[Input[IdentityPoolRoleAttachmentRoleMapping]]] = null,
    roles: Input[IdentityPoolRoleAttachmentRoles] = null
  ): IdentityPoolRoleAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (identityPoolId != null) __obj.updateDynamic("identityPoolId")(identityPoolId.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
  }
}

