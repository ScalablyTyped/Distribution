package typings.atPulumiAws.cognitoIdentityPoolRoleAttachmentMod

import typings.atPulumiAws.Anon_AmbiguousRoleResolutionIdentityProvider
import typings.atPulumiAws.Anon_AuthenticatedUnauthenticated
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
  val roleMappings: js.UndefOr[Input[js.Array[Input[Anon_AmbiguousRoleResolutionIdentityProvider]]]] = js.undefined
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: js.UndefOr[Input[Anon_AuthenticatedUnauthenticated]] = js.undefined
}

object IdentityPoolRoleAttachmentState {
  @scala.inline
  def apply(
    identityPoolId: Input[String] = null,
    roleMappings: Input[js.Array[Input[Anon_AmbiguousRoleResolutionIdentityProvider]]] = null,
    roles: Input[Anon_AuthenticatedUnauthenticated] = null
  ): IdentityPoolRoleAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (identityPoolId != null) __obj.updateDynamic("identityPoolId")(identityPoolId.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
  }
}

