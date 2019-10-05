package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLaunchTemplateBlockDeviceMappingEb extends js.Object {
  var deleteOnTermination: String
  var encrypted: String
  var iops: Double
  var kmsKeyId: String
  var snapshotId: String
  var volumeSize: Double
  var volumeType: String
}

object GetLaunchTemplateBlockDeviceMappingEb {
  @scala.inline
  def apply(
    deleteOnTermination: String,
    encrypted: String,
    iops: Double,
    kmsKeyId: String,
    snapshotId: String,
    volumeSize: Double,
    volumeType: String
  ): GetLaunchTemplateBlockDeviceMappingEb = {
    val __obj = js.Dynamic.literal(deleteOnTermination = deleteOnTermination, encrypted = encrypted, iops = iops, kmsKeyId = kmsKeyId, snapshotId = snapshotId, volumeSize = volumeSize, volumeType = volumeType)
  
    __obj.asInstanceOf[GetLaunchTemplateBlockDeviceMappingEb]
  }
}

