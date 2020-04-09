package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiEbsBlockDevice extends js.Object {
  /**
    * Boolean controlling whether the EBS volumes created to
    * support each created instance will be deleted once that instance is terminated.
    */
  var deleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: String = js.native
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  var encrypted: js.UndefOr[Boolean] = js.native
  /**
    * Number of I/O operations per second the
    * created volumes will support.
    */
  var iops: js.UndefOr[Double] = js.native
  /**
    * The id of an EBS snapshot that will be used to initialize the created
    * EBS volumes. If set, the `volumeSize` attribute must be at least as large as the referenced
    * snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.native
  /**
    * The size of created volumes in GiB.
    * If `snapshotId` is set and `volumeSize` is omitted then the volume will have the same size
    * as the selected snapshot.
    */
  var volumeSize: Double = js.native
  /**
    * The type of EBS volume to create. Can be one of "standard" (the
    * default), "io1" or "gp2".
    */
  var volumeType: js.UndefOr[String] = js.native
}

object AmiEbsBlockDevice {
  @scala.inline
  def apply(
    deviceName: String,
    volumeSize: Double,
    deleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    iops: Int | Double = null,
    snapshotId: String = null,
    volumeType: String = null
  ): AmiEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteOnTermination)) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiEbsBlockDevice]
  }
}

