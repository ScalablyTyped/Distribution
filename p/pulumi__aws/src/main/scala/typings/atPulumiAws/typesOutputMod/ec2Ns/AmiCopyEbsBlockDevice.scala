package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiCopyEbsBlockDevice extends js.Object {
  var deleteOnTermination: Boolean
  var deviceName: String
  /**
    * Specifies whether the destination snapshots of the copied image should be encrypted. Defaults to `false`
    */
  var encrypted: Boolean
  var iops: Double
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object AmiCopyEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): AmiCopyEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[AmiCopyEbsBlockDevice]
  }
}

