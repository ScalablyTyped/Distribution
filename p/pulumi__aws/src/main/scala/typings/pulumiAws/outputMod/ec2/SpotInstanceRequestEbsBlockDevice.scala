package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestEbsBlockDevice extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The name of the block device to mount on the instance.
    */
  var deviceName: String = js.native
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: Boolean = js.native
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1"`.
    */
  var iops: Double = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String = js.native
  /**
    * The Snapshot ID to mount.
    */
  var snapshotId: String = js.native
  var volumeId: String = js.native
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double = js.native
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`,
    * or `"io1"`. (Default: `"gp2"`).
    */
  var volumeType: String = js.native
}

object SpotInstanceRequestEbsBlockDevice {
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
  ): SpotInstanceRequestEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestEbsBlockDevice]
  }
}

