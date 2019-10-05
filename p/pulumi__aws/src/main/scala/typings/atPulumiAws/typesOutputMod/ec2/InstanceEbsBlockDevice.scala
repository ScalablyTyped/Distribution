package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceEbsBlockDevice extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: String
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: Boolean
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1"`.
    */
  var iops: Double
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: String
  var volumeId: String
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`,
    * or `"io1"`. (Default: `"standard"`).
    */
  var volumeType: String
}

object InstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): InstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, snapshotId = snapshotId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination)
    __obj.asInstanceOf[InstanceEbsBlockDevice]
  }
}

