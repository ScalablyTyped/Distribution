package typings
package atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
@js.native
class IdentityPoolRoleAttachment protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a IdentityPoolRoleAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: IdentityPoolRoleAttachmentArgs) = this()
  def this(name: java.lang.String, args: IdentityPoolRoleAttachmentArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  val identityPoolId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A List of Role Mapping.
    */
  val roleMappings: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_AmbiguousRoleResolution]]] = js.native
  /**
    * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN.
    */
  val roles: atPulumiPulumiLib.pulumiMod.Output[atPulumiAwsLib.Anon_Authenticated] = js.native
}

@JSImport("@pulumi/aws/cognito/identityPoolRoleAttachment", "IdentityPoolRoleAttachment")
@js.native
object IdentityPoolRoleAttachment extends js.Object {
  /**
    * Get an existing IdentityPoolRoleAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState
  ): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachmentState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cognitoIdentityPoolRoleAttachmentMod.IdentityPoolRoleAttachment = js.native
}

