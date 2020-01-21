package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceEbsBlockDevice extends js.Object {
  /**
    * If the root block device will be deleted on termination.
    */
  var deleteOnTermination: Boolean = js.native
  /**
    * The physical name of the device.
    */
  var deviceName: String = js.native
  /**
    * If the EBS volume is encrypted.
    */
  var encrypted: Boolean = js.native
  /**
    * `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
    */
  var iops: Double = js.native
  var kmsKeyId: String = js.native
  /**
    * The ID of the snapshot.
    */
  var snapshotId: String = js.native
  var volumeId: String = js.native
  /**
    * The size of the volume, in GiB.
    */
  var volumeSize: Double = js.native
  /**
    * The type of the volume.
    */
  var volumeType: String = js.native
}

object GetInstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): GetInstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination.asInstanceOf[js.Any], deviceName = deviceName.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetInstanceEbsBlockDevice]
  }
}

