package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceEbsBlockDevice extends js.Object {
  /**
    * If the root block device will be deleted on termination.
    */
  var deleteOnTermination: Boolean
  /**
    * The physical name of the device.
    */
  var deviceName: String
  /**
    * If the EBS volume is encrypted.
    */
  var encrypted: Boolean
  /**
    * `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
    */
  var iops: Double
  var kmsKeyId: String
  /**
    * The ID of the snapshot.
    */
  var snapshotId: String
  var volumeId: String
  /**
    * The size of the volume, in GiB.
    */
  var volumeSize: Double
  /**
    * The type of the volume.
    */
  var volumeType: String
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
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, snapshotId = snapshotId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetInstanceEbsBlockDevice]
  }
}

