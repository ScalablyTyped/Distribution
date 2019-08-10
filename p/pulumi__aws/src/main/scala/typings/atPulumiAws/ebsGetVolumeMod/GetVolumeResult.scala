package typings.atPulumiAws.ebsGetVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_NameValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetVolumeResult extends js.Object {
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: String
  /**
    * The AZ where the EBS volume exists.
    */
  val availabilityZone: String
  /**
    * Whether the disk is encrypted.
    */
  val encrypted: Boolean
  val filters: js.UndefOr[js.Array[Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The amount of IOPS for the disk.
    */
  val iops: Double
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * The size of the drive in GiBs.
    */
  val size: Double
  /**
    * The snapshotId the EBS volume is based off.
    */
  val snapshotId: String
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: String
  /**
    * The type of EBS volume.
    */
  val volumeType: String
}

object GetVolumeResult {
  @scala.inline
  def apply(
    arn: String,
    availabilityZone: String,
    encrypted: Boolean,
    id: String,
    iops: Double,
    kmsKeyId: String,
    size: Double,
    snapshotId: String,
    tags: StringDictionary[js.Any],
    volumeId: String,
    volumeType: String,
    filters: js.Array[Anon_NameValues] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined
  ): GetVolumeResult = {
    val __obj = js.Dynamic.literal(arn = arn, availabilityZone = availabilityZone, encrypted = encrypted, id = id, iops = iops, kmsKeyId = kmsKeyId, size = size, snapshotId = snapshotId, tags = tags, volumeId = volumeId, volumeType = volumeType)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    __obj.asInstanceOf[GetVolumeResult]
  }
}

