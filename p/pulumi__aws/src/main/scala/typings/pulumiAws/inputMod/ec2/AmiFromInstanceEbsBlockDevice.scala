package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmiFromInstanceEbsBlockDevice extends js.Object {
  /**
    * Boolean controlling whether the EBS volumes created to
    * support each created instance will be deleted once that instance is terminated.
    */
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The path at which the device is exposed to created instances.
    */
  var deviceName: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean controlling whether the created EBS volumes will be encrypted. Can't be used with `snapshotId`.
    */
  var encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Number of I/O operations per second the
    * created volumes will support.
    */
  var iops: js.UndefOr[Input[Double]] = js.native
  /**
    * The id of an EBS snapshot that will be used to initialize the created
    * EBS volumes. If set, the `volumeSize` attribute must be at least as large as the referenced
    * snapshot.
    */
  var snapshotId: js.UndefOr[Input[String]] = js.native
  /**
    * The size of created volumes in GiB.
    * If `snapshotId` is set and `volumeSize` is omitted then the volume will have the same size
    * as the selected snapshot.
    */
  var volumeSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The type of EBS volume to create. Can be one of "standard" (the
    * default), "io1" or "gp2".
    */
  var volumeType: js.UndefOr[Input[String]] = js.native
}

object AmiFromInstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Input[Boolean] = null,
    deviceName: Input[String] = null,
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    snapshotId: Input[String] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): AmiFromInstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (snapshotId != null) __obj.updateDynamic("snapshotId")(snapshotId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmiFromInstanceEbsBlockDevice]
  }
}

