package typings.atPulumiAws.ec2AmiCopyMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.ec2.AmiCopyEbsBlockDevice
import typings.atPulumiAws.typesInputMod.ec2.AmiCopyEphemeralBlockDevice
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiCopyState extends js.Object {
  /**
    * Machine architecture for created instances. Defaults to "x8664".
    */
  val architecture: js.UndefOr[Input[String]] = js.undefined
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEbsBlockDevice]]]] = js.undefined
  /**
    * Specifies whether enhanced networking with ENA is enabled. Defaults to `false`.
    */
  val enaSupport: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]] = js.undefined
  /**
    * Path to an S3 object containing an image manifest, e.g. created
    * by the `ec2-upload-bundle` command in the EC2 command line tools.
    */
  val imageLocation: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the kernel image (AKI) that will be used as the paravirtual
    * kernel in created instances.
    */
  val kernelId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The full ARN of the KMS Key to use when encrypting the snapshots of an image during a copy operation. If not specified, then the default AWS KMS Key will be used
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  val manageEbsSnapshots: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of an initrd image (ARI) that will be used when booting the
    * created instances.
    */
  val ramdiskId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
    */
  val rootDeviceName: js.UndefOr[Input[String]] = js.undefined
  val rootSnapshotId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The id of the AMI to copy. This id must be valid in the region
    * given by `sourceAmiRegion`.
    */
  val sourceAmiId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The region from which the AMI will be copied. This may be the
    * same as the AWS provider region in order to create a copy within the same region.
    */
  val sourceAmiRegion: js.UndefOr[Input[String]] = js.undefined
  /**
    * When set to "simple" (the default), enables enhanced networking
    * for created instances. No other value is supported at this time.
    */
  val sriovNetSupport: js.UndefOr[Input[String]] = js.undefined
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Keyword to choose what virtualization mode created instances
    * will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
    * changes the set of further arguments that are required, as described below.
    */
  val virtualizationType: js.UndefOr[Input[String]] = js.undefined
}

object AmiCopyState {
  @scala.inline
  def apply(
    architecture: Input[String] = null,
    description: Input[String] = null,
    ebsBlockDevices: Input[js.Array[Input[AmiCopyEbsBlockDevice]]] = null,
    enaSupport: Input[Boolean] = null,
    encrypted: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]] = null,
    imageLocation: Input[String] = null,
    kernelId: Input[String] = null,
    kmsKeyId: Input[String] = null,
    manageEbsSnapshots: Input[Boolean] = null,
    name: Input[String] = null,
    ramdiskId: Input[String] = null,
    rootDeviceName: Input[String] = null,
    rootSnapshotId: Input[String] = null,
    sourceAmiId: Input[String] = null,
    sourceAmiRegion: Input[String] = null,
    sriovNetSupport: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    virtualizationType: Input[String] = null
  ): AmiCopyState = {
    val __obj = js.Dynamic.literal()
    if (architecture != null) __obj.updateDynamic("architecture")(architecture.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (enaSupport != null) __obj.updateDynamic("enaSupport")(enaSupport.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (imageLocation != null) __obj.updateDynamic("imageLocation")(imageLocation.asInstanceOf[js.Any])
    if (kernelId != null) __obj.updateDynamic("kernelId")(kernelId.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (manageEbsSnapshots != null) __obj.updateDynamic("manageEbsSnapshots")(manageEbsSnapshots.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ramdiskId != null) __obj.updateDynamic("ramdiskId")(ramdiskId.asInstanceOf[js.Any])
    if (rootDeviceName != null) __obj.updateDynamic("rootDeviceName")(rootDeviceName.asInstanceOf[js.Any])
    if (rootSnapshotId != null) __obj.updateDynamic("rootSnapshotId")(rootSnapshotId.asInstanceOf[js.Any])
    if (sourceAmiId != null) __obj.updateDynamic("sourceAmiId")(sourceAmiId.asInstanceOf[js.Any])
    if (sourceAmiRegion != null) __obj.updateDynamic("sourceAmiRegion")(sourceAmiRegion.asInstanceOf[js.Any])
    if (sriovNetSupport != null) __obj.updateDynamic("sriovNetSupport")(sriovNetSupport.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (virtualizationType != null) __obj.updateDynamic("virtualizationType")(virtualizationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyState]
  }
}

