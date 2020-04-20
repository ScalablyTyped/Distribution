package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateBlockDeviceMappingEbs extends js.Object {
  /**
    * Whether the volume should be destroyed on instance termination (Default: `false`). See [Preserving Amazon EBS Volumes on Instance Termination](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/terminating-instances.html#preserving-volumes-on-termination) for more information.
    */
  var deleteOnTermination: js.UndefOr[Input[String]] = js.native
  /**
    * Enables [EBS encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`.
    */
  var encrypted: js.UndefOr[Input[String]] = js.native
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1"`.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) to use when creating the encrypted volume.
    * `encrypted` must be set to `true` when this is set.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the volume in gigabytes.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, or `"io1"`. (Default: `"standard"`).
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateBlockDeviceMappingEbs {
  @scala.inline
  def apply(
    deleteOnTermination: Input[String] = null,
    encrypted: Input[String] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    snapshotId: Input[String] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): LaunchTemplateBlockDeviceMappingEbs = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateBlockDeviceMappingEbs]
  }
}

