package typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod

import typings.atPulumiAws.Anon_AmbiguousRoleResolutionIdentityProvider
import typings.atPulumiAws.Anon_AuthenticatedUnauthenticated
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentArgs extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: Input[String]
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[Input[js.Array[Input[Anon_AmbiguousRoleResolutionIdentityProvider]]]] = js.undefined
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: Input[Anon_AuthenticatedUnauthenticated]
}

object IdentityPoolRoleAttachmentArgs {
  @scala.inline
  def apply(
    identityPoolId: Input[String],
    roles: Input[Anon_AuthenticatedUnauthenticated],
    roleMappings: Input[js.Array[Input[Anon_AmbiguousRoleResolutionIdentityProvider]]] = null
  ): IdentityPoolRoleAttachmentArgs = {
    val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentArgs]
  }
}

