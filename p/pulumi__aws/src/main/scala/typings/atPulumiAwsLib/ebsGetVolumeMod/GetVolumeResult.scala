package typings
package atPulumiAwsLib.ebsGetVolumeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVolumeResult extends js.Object {
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: java.lang.String
  /**
    * The AZ where the EBS volume exists.
    */
  val availabilityZone: java.lang.String
  /**
    * Whether the disk is encrypted.
    */
  val encrypted: scala.Boolean
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The amount of IOPS for the disk.
    */
  val iops: scala.Double
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  /**
    * The size of the drive in GiBs.
    */
  val size: scala.Double
  /**
    * The snapshot_id the EBS volume is based off.
    */
  val snapshotId: java.lang.String
  /**
    * A mapping of tags for the resource.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: java.lang.String
  /**
    * The type of EBS volume.
    */
  val volumeType: java.lang.String
}

object GetVolumeResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    availabilityZone: java.lang.String,
    encrypted: scala.Boolean,
    id: java.lang.String,
    iops: scala.Double,
    kmsKeyId: java.lang.String,
    size: scala.Double,
    snapshotId: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    volumeId: java.lang.String,
    volumeType: java.lang.String
  ): GetVolumeResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("availabilityZone")(availabilityZone)
    __obj.updateDynamic("encrypted")(encrypted)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("iops")(iops)
    __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("snapshotId")(snapshotId)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("volumeId")(volumeId)
    __obj.updateDynamic("volumeType")(volumeType)
    __obj.asInstanceOf[GetVolumeResult]
  }
}

