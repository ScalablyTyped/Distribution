package typings.atPulumiAws.ebsGetSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.ebs.GetSnapshotFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: String
  /**
    * A description for the snapshot
    */
  val description: String
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: Boolean
  val filters: js.UndefOr[js.Array[GetSnapshotFilter]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: String
  val mostRecent: js.UndefOr[Boolean] = js.undefined
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: String
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: String
  val owners: js.UndefOr[js.Array[String]] = js.undefined
  val restorableByUserIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The snapshot ID (e.g. snap-59fcb34e).
    */
  val snapshotId: String
  val snapshotIds: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The snapshot state.
    */
  val state: String
  /**
    * A mapping of tags for the resource.
    */
  val tags: StringDictionary[js.Any]
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: String
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: Double
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
    val __obj = js.Dynamic.literal(dataEncryptionKeyId = dataEncryptionKeyId, description = description, encrypted = encrypted, id = id, kmsKeyId = kmsKeyId, ownerAlias = ownerAlias, ownerId = ownerId, snapshotId = snapshotId, state = state, tags = tags, volumeId = volumeId, volumeSize = volumeSize)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(mostRecent)) __obj.updateDynamic("mostRecent")(mostRecent)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (restorableByUserIds != null) __obj.updateDynamic("restorableByUserIds")(restorableByUserIds)
    if (snapshotIds != null) __obj.updateDynamic("snapshotIds")(snapshotIds)
    __obj.asInstanceOf[GetSnapshotResult]
  }
}

