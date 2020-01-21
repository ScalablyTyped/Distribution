package typings.pulumiAws.amiMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.AmiEbsBlockDevice
import typings.pulumiAws.outputMod.ec2.AmiEphemeralBlockDevice
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val architecture: Output_[js.UndefOr[String]] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: Output_[js.Array[AmiEbsBlockDevice]] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: Output_[js.Array[AmiEphemeralBlockDevice]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: Output_[String] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: Output_[js.UndefOr[String]] = js.native
  val manageEbsSnapshots: Output_[Boolean] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: Output_[String] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: Output_[js.UndefOr[String]] = js.native
  /**
    * The Snapshot ID for the root volume (for EBS-backed AMIs)
    */
  val rootSnapshotId: Output_[String] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: Output_[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: Output_[js.UndefOr[String]] = js.native
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

