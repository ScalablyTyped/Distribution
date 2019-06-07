package typings
package atPulumiAwsLib.ec2AmiFromInstanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
@js.native
class AmiFromInstance protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a AmiFromInstance resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: AmiFromInstanceArgs) = this()
  def this(name: java.lang.String, args: AmiFromInstanceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Machine architecture for created instances. Defaults to "x86_64".
    */
  val architecture: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeleteOnTerminationDeviceNameEncrypted]] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceName]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val manageEbsSnapshots: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val rootSnapshotId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Boolean that overrides the behavior of stopping
    * the instance before snapshotting. This is risky since it may cause a snapshot of an
    * inconsistent filesystem state, but can be used to avoid downtime if the user otherwise
    * guarantees that no filesystem writes will be underway at the time of snapshot.
    */
  val snapshotWithoutReboot: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The id of the instance to use as the basis of the AMI.
    */
  val sourceInstanceId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/amiFromInstance", "AmiFromInstance")
@js.native
object AmiFromInstance extends js.Object {
  /**
    * Get an existing AmiFromInstance resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState
  ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstanceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2AmiFromInstanceMod.AmiFromInstance = js.native
  /**
    * Returns true if the given object is an instance of AmiFromInstance.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/amiFromInstance.AmiFromInstance */ scala.Boolean = js.native
}

