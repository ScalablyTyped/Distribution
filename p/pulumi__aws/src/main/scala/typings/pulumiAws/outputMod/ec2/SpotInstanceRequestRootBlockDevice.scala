package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotInstanceRequestRootBlockDevice extends js.Object {
  /**
    * Whether the volume should be destroyed
    * on instance termination (Default: `true`).
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * Enable volume encryption. (Default: `false`). Must be configured to perform drift detection.
    */
  var encrypted: Boolean = js.native
  /**
    * The amount of provisioned
    * [IOPS](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ebs-io-characteristics.html).
    * This is only valid for `volumeType` of `"io1"`, and must be specified if
    * using that type
    */
  var iops: Double = js.native
  /**
    * Amazon Resource Name (ARN) of the KMS Key to use when encrypting the volume. Must be configured to perform drift detection.
    */
  var kmsKeyId: String = js.native
  var volumeId: String = js.native
  /**
    * The size of the volume in gibibytes (GiB).
    */
  var volumeSize: Double = js.native
  /**
    * The type of volume. Can be `"standard"`, `"gp2"`, `"io1"`, `"sc1"`, or `"st1"`. (Default: `"standard"`).
    */
  var volumeType: String = js.native
}

object SpotInstanceRequestRootBlockDevice {
  @scala.inline
  def apply(
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined
  ): SpotInstanceRequestRootBlockDevice = {
    val __obj = js.Dynamic.literal(encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotInstanceRequestRootBlockDevice]
  }
}

