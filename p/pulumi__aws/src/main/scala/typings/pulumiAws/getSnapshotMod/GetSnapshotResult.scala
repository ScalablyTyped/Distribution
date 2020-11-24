package typings.pulumiAws.getSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSnapshotResult extends js.Object {
  
  /**
    * Amazon Resource Name (ARN) of the EBS Snapshot.
    */
  val arn: String = js.native
  
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: String = js.native
  
  /**
    * A description for the snapshot
    */
  val description: String = js.native
  
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: Boolean = js.native
  
  val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String = js.native
  
  val mostRecent: js.UndefOr[Boolean] = js.native
  
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: String = js.native
  
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: String = js.native
  
  val owners: js.UndefOr[js.Array[String]] = js.native
  
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The snapshot ID (e.g. snap-59fcb34e).
    */
  val snapshotId: String = js.native
  
  val snapshotIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The snapshot state.
    */
  val state: String = js.native
  
  /**
    * A map of tags for the resource.
    */
  val tags: StringDictionary[String] = js.native
  
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: String = js.native
  
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: Double = js.native
}
object GetSnapshotResult {
  
  @scala.inline
  def apply(
    arn: String,
    dataEncryptionKeyId: String,
    description: String,
    encrypted: Boolean,
    id: String,
    kmsKeyId: String,
    ownerAlias: String,
    ownerId: String,
    snapshotId: String,
    state: String,
    tags: StringDictionary[String],
    volumeId: String,
    volumeSize: Double
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], dataEncryptionKeyId = dataEncryptionKeyId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], ownerAlias = ownerAlias.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
  
  @scala.inline
  implicit class GetSnapshotResultOps[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
    
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
    def setDataEncryptionKeyId(value: String): Self = this.set("dataEncryptionKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAlias(value: String): Self = this.set("ownerAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerId(value: String): Self = this.set("ownerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSize(value: Double): Self = this.set("volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: GetSnapshotFilter*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[GetSnapshotFilter]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    
    @scala.inline
    def setMostRecent(value: Boolean): Self = this.set("mostRecent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMostRecent: Self = this.set("mostRecent", js.undefined)
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setRestorableByUserIdsVarargs(value: String*): Self = this.set("restorableByUserIds", js.Array(value :_*))
    
    @scala.inline
    def setRestorableByUserIds(value: js.Array[String]): Self = this.set("restorableByUserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestorableByUserIds: Self = this.set("restorableByUserIds", js.undefined)
    
    @scala.inline
    def setSnapshotIdsVarargs(value: String*): Self = this.set("snapshotIds", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotIds(value: js.Array[String]): Self = this.set("snapshotIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotIds: Self = this.set("snapshotIds", js.undefined)
  }
}
