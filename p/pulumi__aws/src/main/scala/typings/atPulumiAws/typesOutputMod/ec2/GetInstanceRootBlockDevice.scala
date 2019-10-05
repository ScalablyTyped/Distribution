package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceRootBlockDevice extends js.Object {
  /**
    * If the root block device will be deleted on termination.
    */
  var deleteOnTermination: Boolean
  /**
    * If the EBS volume is encrypted.
    */
  var encrypted: Boolean
  /**
    * `0` If the volume is not a provisioned IOPS image, otherwise the supported IOPS count.
    */
  var iops: Double
  var kmsKeyId: String
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

object GetInstanceRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    encrypted: Boolean,
    iops: Double,
    kmsKeyId: String,
    volumeId: String,
    volumeSize: Double,
    volumeType: String
  ): GetInstanceRootBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, volumeId = volumeId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetInstanceRootBlockDevice]
  }
}

