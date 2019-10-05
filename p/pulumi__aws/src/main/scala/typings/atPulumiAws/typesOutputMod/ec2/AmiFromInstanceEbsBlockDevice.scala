package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmiFromInstanceEbsBlockDevice extends js.Object {
  var deleteOnTermination: Boolean
  var deviceName: String
  var encrypted: Boolean
  var iops: Double
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object AmiFromInstanceEbsBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Boolean,
    deviceName: String,
    encrypted: Boolean,
    iops: Double,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): AmiFromInstanceEbsBlockDevice = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, deviceName = deviceName, encrypted = encrypted, iops = iops, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[AmiFromInstanceEbsBlockDevice]
  }
}

