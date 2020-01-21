package typings.pulumiAws.mountTargetMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs/mountTarget", "MountTarget")
@js.native
class MountTarget protected () extends CustomResource {
  /**
    * Create a MountTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MountTargetArgs) = this()
  def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
  /**
    * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
    */
  val dnsName: Output_[String] = js.native
  /**
    * Amazon Resource Name of the file system.
    */
  val fileSystemArn: Output_[String] = js.native
  /**
    * The ID of the file system for which the mount target is intended.
    */
  val fileSystemId: Output_[String] = js.native
  /**
    * The address (within the address range of the specified subnet) at
    * which the file system may be mounted via the mount target.
    */
  val ipAddress: Output_[String] = js.native
  /**
    * The ID of the network interface that Amazon EFS created when it created the mount target.
    */
  val networkInterfaceId: Output_[String] = js.native
  /**
    * A list of up to 5 VPC security group IDs (that must
    * be for the same VPC as subnet specified) in effect for the mount target.
    */
  val securityGroups: Output_[js.Array[String]] = js.native
  /**
    * The ID of the subnet to add the mount target in.
    */
  val subnetId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/efs/mountTarget", "MountTarget")
@js.native
object MountTarget extends js.Object {
  /**
    * Get an existing MountTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): MountTarget = js.native
  def get(name: String, id: Input[ID], state: MountTargetState): MountTarget = js.native
  def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): MountTarget = js.native
  /**
    * Returns true if the given object is an instance of MountTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
}

