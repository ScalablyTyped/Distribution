package typings
package atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentArgs extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A List of Role Mapping.
    */
  val roleMappings: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AmbiguousRoleResolutionIdentityProvider]
      ]
    ]
  ] = js.undefined
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticatedUnauthenticated]
}

object IdentityPoolRoleAttachmentArgs {
  @scala.inline
  def apply(
    identityPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roles: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticatedUnauthenticated],
    roleMappings: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AmbiguousRoleResolutionIdentityProvider]
      ]
    ] = null
  ): IdentityPoolRoleAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("identityPoolId")(identityPoolId.asInstanceOf[js.Any])
    __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentArgs]
  }
}

