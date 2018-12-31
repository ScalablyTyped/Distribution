package typings
package atPulumiAwsLib.ec2AmiCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/amiCopy", "AmiCopy")
@js.native
class AmiCopy protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a AmiCopy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: AmiCopyArgs) = this()
  def this(name: java.lang.String, args: AmiCopyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Machine architecture for created instances. Defaults to "x86_64".
    */
  val architecture: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: atPulumiPulumiLib.pulumiMod.Output[
    js.Array[atPulumiAwsLib.Anon_DeviceNameVolumeTypeEncryptedIopsDeleteOnTermination]
  ] = js.native
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
    */
  val encrypted: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: atPulumiPulumiLib.pulumiMod.Output[js.Array[atPulumiAwsLib.Anon_DeviceNameVirtualName]] = js.native
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The full ARN of the KMS Key to use when encrypting the snapshots of an image during a copy operation. If not specified, then the default AWS KMS Key will be used
    */
  val kmsKeyId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val manageEbsSnapshots: atPulumiPulumiLib.pulumiMod.Output[scala.Boolean] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val rootSnapshotId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The id of the AMI to copy. This id must be valid in the region
    * given by `source_ami_region`.
    */
  val sourceAmiId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The region from which the AMI will be copied. This may be the
    * same as the AWS provider region in order to create a copy within the same region.
    */
  val sourceAmiRegion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  val tags: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

@JSImport("@pulumi/aws/ec2/amiCopy", "AmiCopy")
@js.native
object AmiCopy extends js.Object {
  /**
    * Get an existing AmiCopy resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyState
  ): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2AmiCopyMod.AmiCopyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2AmiCopyMod.AmiCopy = js.native
}

