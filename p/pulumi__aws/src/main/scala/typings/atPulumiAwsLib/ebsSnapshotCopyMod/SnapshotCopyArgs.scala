package typings
package atPulumiAwsLib.ebsSnapshotCopyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotCopyArgs extends js.Object {
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
  val sourceRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val sourceSnapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object SnapshotCopyArgs {
  @scala.inline
  def apply(
    sourceRegion: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sourceSnapshotId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encrypted: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    kmsKeyId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): SnapshotCopyArgs = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], sourceSnapshotId = sourceSnapshotId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyArgs]
  }
}

