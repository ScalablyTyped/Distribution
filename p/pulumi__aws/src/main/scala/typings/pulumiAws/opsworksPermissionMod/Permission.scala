package typings.pulumiAws.opsworksPermissionMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/opsworks/permission", "Permission")
@js.native
class Permission protected () extends CustomResource {
  /**
    * Create a Permission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PermissionArgs) = this()
  def this(name: String, args: PermissionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Whether the user is allowed to use SSH to communicate with the instance
    */
  val allowSsh: Output_[Boolean] = js.native
  
  /**
    * Whether the user is allowed to use sudo to elevate privileges
    */
  val allowSudo: Output_[Boolean] = js.native
  
  /**
    * The users permission level. Mus be one of `deny`, `show`, `deploy`, `manage`, `iamOnly`
    */
  val level: Output_[String] = js.native
  
  /**
    * The stack to set the permissions for
    */
  val stackId: Output_[String] = js.native
  
  /**
    * The user's IAM ARN to set permissions for
    */
  val userArn: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/opsworks/permission", "Permission")
@js.native
object Permission extends js.Object {
  
  /**
    * Get an existing Permission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Permission = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState): Permission = js.native
  def get(name: String, id: Input[ID], state: PermissionState, opts: CustomResourceOptions): Permission = js.native
  
  /**
    * Returns true if the given object is an instance of Permission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/opsworks/permission.Permission */ Boolean = js.native
}
