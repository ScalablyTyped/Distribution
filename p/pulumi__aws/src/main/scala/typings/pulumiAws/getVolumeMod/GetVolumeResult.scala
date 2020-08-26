package typings.pulumiAws.getVolumeMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ebs.GetVolumeFilter
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
    * The provider-assigned unique ID for this managed resource.
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
    * (Optional) Specifies whether Amazon EBS Multi-Attach is enabled.
    */
  val multiAttachEnabled: Boolean = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  val outpostArn: String = js.native
  /**
    * The size of the drive in GiBs.
    */
  val size: Double = js.native
  /**
    * The snapshotId the EBS volume is based off.
    */
  val snapshotId: String = js.native
  /**
    * A map of tags for the resource.
    */
  val tags: StringDictionary[String] = js.native
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
    multiAttachEnabled: Boolean,
    outpostArn: String,
    size: Double,
    snapshotId: String,
    tags: StringDictionary[String],
    volumeId: String,
    volumeType: String
  ): GetVolumeResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], iops = iops.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], multiAttachEnabled = multiAttachEnabled.asInstanceOf[js.Any], outpostArn = outpostArn.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeType = volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVolumeResult]
  }
  @scala.inline
  implicit class GetVolumeResultOps[Self <: GetVolumeResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIops(value: Double): Self = this.set("iops", value.asInstanceOf[js.Any])
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiAttachEnabled(value: Boolean): Self = this.set("multiAttachEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("outpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVolumeType(value: String): Self = this.set("volumeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: GetVolumeFilter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[GetVolumeFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
  }
  
}

