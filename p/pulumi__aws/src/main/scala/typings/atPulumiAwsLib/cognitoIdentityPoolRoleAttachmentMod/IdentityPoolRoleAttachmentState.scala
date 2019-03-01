package typings
package atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityPoolRoleAttachmentState extends js.Object {
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val roles: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticatedUnauthenticated]
  ] = js.undefined
}

object IdentityPoolRoleAttachmentState {
  @scala.inline
  def apply(
    identityPoolId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    roleMappings: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AmbiguousRoleResolutionIdentityProvider]
      ]
    ] = null,
    roles: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticatedUnauthenticated] = null
  ): IdentityPoolRoleAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (identityPoolId != null) __obj.updateDynamic("identityPoolId")(identityPoolId.asInstanceOf[js.Any])
    if (roleMappings != null) __obj.updateDynamic("roleMappings")(roleMappings.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityPoolRoleAttachmentState]
  }
}

