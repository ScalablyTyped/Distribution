package typings
package atPulumiAwsLib.ebsGetSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSnapshotResult extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    */
  val dataEncryptionKeyId: java.lang.String
  /**
    * A description for the snapshot
    */
  val description: java.lang.String
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: scala.Boolean
  val filters: js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]] = js.undefined
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyId: java.lang.String
  val mostRecent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: java.lang.String
  /**
    * The AWS account ID of the EBS snapshot owner.
    */
  val ownerId: java.lang.String
  val owners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  val restorableByUserIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The snapshot ID (e.g. snap-59fcb34e).
    */
  val snapshotId: java.lang.String
  val snapshotIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The snapshot state.
    */
  val state: java.lang.String
  /**
    * A mapping of tags for the resource.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The volume ID (e.g. vol-59fcb34e).
    */
  val volumeId: java.lang.String
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: scala.Double
}

object GetSnapshotResult {
  @scala.inline
  def apply(
    dataEncryptionKeyId: java.lang.String,
    description: java.lang.String,
    encrypted: scala.Boolean,
    id: java.lang.String,
    kmsKeyId: java.lang.String,
    ownerAlias: java.lang.String,
    ownerId: java.lang.String,
    snapshotId: java.lang.String,
    state: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    volumeId: java.lang.String,
    volumeSize: scala.Double,
    filters: js.Array[atPulumiAwsLib.Anon_NameValues] = null,
    mostRecent: js.UndefOr[scala.Boolean] = js.undefined,
    owners: js.Array[java.lang.String] = null,
    restorableByUserIds: js.Array[java.lang.String] = null,
    snapshotIds: js.Array[java.lang.String] = null
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

