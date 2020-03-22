package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestRootBlockDevice extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Enables [EBS
    * encryption](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EBSEncryption.html)
    * on the volume (Default: `false`). Cannot be used with `snapshotId`. Must be configured to perform drift detection.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This must be set with a `volumeType` of `"io1"`.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: js.UndefOr[Input[String]] = js.native
  var volumeId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`,
    * or `"io1"`. (Default: `"gp2"`).
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object SpotInstanceRequestRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Input[Boolean] = null,
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    kmsKeyId: Input[String] = null,
    volumeId: Input[String] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): SpotInstanceRequestRootBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestRootBlockDevice]
  }
}

