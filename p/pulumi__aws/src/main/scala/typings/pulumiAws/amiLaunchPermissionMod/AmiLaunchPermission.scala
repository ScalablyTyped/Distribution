package typings.pulumiAws.amiLaunchPermissionMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/amiLaunchPermission", "AmiLaunchPermission")
@js.native
class AmiLaunchPermission protected () extends CustomResource {
  /**
    * Create a AmiLaunchPermission resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AmiLaunchPermissionArgs) = this()
  def this(name: String, args: AmiLaunchPermissionArgs, opts: CustomResourceOptions) = this()
  /**
    * An AWS Account ID to add launch permissions.
    */
  val accountId: Output_[String] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val imageId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/amiLaunchPermission", "AmiLaunchPermission")
@js.native
object AmiLaunchPermission extends js.Object {
  /**
    * Get an existing AmiLaunchPermission resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AmiLaunchPermission = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AmiLaunchPermission = js.native
  def get(name: String, id: Input[ID], state: AmiLaunchPermissionState): AmiLaunchPermission = js.native
  def get(name: String, id: Input[ID], state: AmiLaunchPermissionState, opts: CustomResourceOptions): AmiLaunchPermission = js.native
  /**
    * Returns true if the given object is an instance of AmiLaunchPermission.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiLaunchPermission.AmiLaunchPermission */ Boolean = js.native
}

