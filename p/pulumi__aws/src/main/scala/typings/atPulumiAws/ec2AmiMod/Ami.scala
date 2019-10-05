package typings.atPulumiAws.ec2AmiMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ec2.AmiEbsBlockDevice
import typings.atPulumiAws.typesOutputMod.ec2.AmiEphemeralBlockDevice
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/ami", "Ami")
@js.native
class Ami protected () extends CustomResource {
  /**
    * Create a Ami resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AmiArgs) = this()
  def this(name: String, args: AmiArgs, opts: CustomResourceOptions) = this()
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: Output[js.UndefOr[String]] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: Output[js.Array[AmiEbsBlockDevice]] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: Output[js.Array[AmiEphemeralBlockDevice]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: Output[String] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: Output[js.UndefOr[String]] = js.native
  val manageEbsSnapshots: Output[Boolean] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: Output[String] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: Output[js.UndefOr[String]] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: Output[js.UndefOr[String]] = js.native
  /**
    * The Snapshot ID for the root volume (for EBS-backed AMIs)
    */
  val rootSnapshotId: Output[String] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: Output[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/ami", "Ami")
@js.native
object Ami extends js.Object {
  /**
    * Get an existing Ami resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Ami = js.native
  def get(name: String, id: Input[ID], state: AmiState): Ami = js.native
  def get(name: String, id: Input[ID], state: AmiState, opts: CustomResourceOptions): Ami = js.native
  /**
    * Returns true if the given object is an instance of Ami.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/ami.Ami */ Boolean = js.native
}

