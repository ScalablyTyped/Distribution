package typings.pulumiAws.amiCopyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.AmiCopyEbsBlockDevice
import typings.pulumiAws.inputMod.ec2.AmiCopyEphemeralBlockDevice
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiCopyArgs extends js.Object {
  /**
    * A longer, human-readable description for the AMI.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Nested block describing an EBS block device that should be
    * attached to created instances. The structure of this block is described below.
    */
  val ebsBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEbsBlockDevice]]]] = js.native
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Nested block describing an ephemeral block device that
    * should be attached to created instances. The structure of this block is described below.
    */
  val ephemeralBlockDevices: js.UndefOr[Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]]] = js.native
  /**
    * The full ARN of the AWS Key Management Service (AWS KMS) CMK to use when encrypting the snapshots of
    * an image during a copy operation. This parameter is only required if you want to use a non-default CMK;
    * if this parameter is not specified, the default CMK for EBS is used
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * A region-unique name for the AMI.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The id of the AMI to copy. This id must be valid in the region
    * given by `sourceAmiRegion`.
    */
  val sourceAmiId: Input[String] = js.native
  /**
    * The region from which the AMI will be copied. This may be the
    * same as the AWS provider region in order to create a copy within the same region.
    */
  val sourceAmiRegion: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object AmiCopyArgs {
  @scala.inline
  def apply(
    sourceAmiId: Input[String],
    sourceAmiRegion: Input[String],
    description: Input[String] = null,
    ebsBlockDevices: Input[js.Array[Input[AmiCopyEbsBlockDevice]]] = null,
    encrypted: Input[Boolean] = null,
    ephemeralBlockDevices: Input[js.Array[Input[AmiCopyEphemeralBlockDevice]]] = null,
    kmsKeyId: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): AmiCopyArgs = {
    val __obj = js.Dynamic.literal(sourceAmiId = sourceAmiId.asInstanceOf[js.Any], sourceAmiRegion = sourceAmiRegion.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (ebsBlockDevices != null) __obj.updateDynamic("ebsBlockDevices")(ebsBlockDevices.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (ephemeralBlockDevices != null) __obj.updateDynamic("ephemeralBlockDevices")(ephemeralBlockDevices.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiCopyArgs]
  }
}

