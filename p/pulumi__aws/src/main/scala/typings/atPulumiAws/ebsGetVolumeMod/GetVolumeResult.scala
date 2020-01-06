package typings.atPulumiAws.ebsGetVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ebs.GetVolumeFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVolumeResult extends js.Object {
  /**
    * The volume ARN (e.g. arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
    */
  val arn: String = js.native
  /**
    * The AZ where the EBS volume exists.
    */
  val availabilityZone: String = js.native
  /**
    * Whether the disk is encrypted.
    */
  val encrypted: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetVolumeFilter]] = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The amount of IOPS for the disk.
    */
  val iops: Double = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  val mostRecent: js.UndefOr[Boolean] = js.native
  /**
    * The size of the drive in GiBs.
    */
  val size: Double = js.native
  /**
    * The snapshotId the EBS volume is based off.
    */
  val snapshotId: String = js.native
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: String = js.native
  /**
    * The type of EBS volume.
    */
  val volumeType: String = js.native
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
    filters: js.Array[GetVolumeFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined
  ): GetVolumeResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVolumeResult]
  }
}

