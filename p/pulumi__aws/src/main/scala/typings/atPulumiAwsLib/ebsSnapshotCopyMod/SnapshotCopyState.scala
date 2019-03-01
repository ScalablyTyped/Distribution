package typings
package atPulumiAwsLib.ebsSnapshotCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyState extends js.Object {
  /**
    * The data encryption key identifier for the snapshot.
    * * `source_snapshot_id` The ARN of the copied snapshot.
    * * `source_region` The region of the source snapshot.
    */
  val dataEncryptionKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN for the KMS encryption key.
    * * `source_snapshot_id` The ARN for the snapshot to be copied.
    * * `source_region` The region of the source snapshot.
    */
  val kmsKeyId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Value from an Amazon-maintained list (`amazon`, `aws-marketplace`, `microsoft`) of snapshot owners.
    */
  val ownerAlias: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The AWS account ID of the snapshot owner.
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sourceRegion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val sourceSnapshotId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  val volumeId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The size of the drive in GiBs.
    */
  val volumeSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object SnapshotCopyState {
  @scala.inline
  def apply(
    dataEncryptionKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ownerAlias: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ownerId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    sourceSnapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    volumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    volumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): SnapshotCopyState = {
    val __obj = js.Dynamic.literal()
    if (dataEncryptionKeyId != null) __obj.updateDynamic("dataEncryptionKeyId")(dataEncryptionKeyId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (ownerAlias != null) __obj.updateDynamic("ownerAlias")(ownerAlias.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (sourceRegion != null) __obj.updateDynamic("sourceRegion")(sourceRegion.asInstanceOf[js.Any])
    if (sourceSnapshotId != null) __obj.updateDynamic("sourceSnapshotId")(sourceSnapshotId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyState]
  }
}

