package typings.pulumiAws.getSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSnapshotResult extends js.Object {
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
    * id is the provider-assigned unique ID for this managed resource.
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
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    dataEncryptionKeyId: String,
    description: String,
    encrypted: Boolean,
    id: String,
    kmsKeyId: String,
    ownerAlias: String,
    ownerId: String,
    snapshotId: String,
    state: String,
    tags: StringDictionary[js.Any],
    volumeId: String,
    volumeSize: Double,
    filters: js.Array[GetSnapshotFilter] = null,
    mostRecent: js.UndefOr[Boolean] = js.undefined,
    owners: js.Array[String] = null,
    restorableByUserIds: js.Array[String] = null,
    snapshotIds: js.Array[String] = null
  ): GetSnapshotResult = {
    val __obj = js.Dynamic.literal(dataEncryptionKeyId = dataEncryptionKeyId.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], ownerAlias = ownerAlias.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], snapshotId = snapshotId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any], volumeSize = volumeSize.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent.asInstanceOf[js.Any])
    if (owners != null) __obj.updateDynamic("owners")(owners.asInstanceOf[js.Any])
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds.asInstanceOf[js.Any])
    if (snapshotIds != null) __obj.updateDynamic("snapshotIds")(snapshotIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

