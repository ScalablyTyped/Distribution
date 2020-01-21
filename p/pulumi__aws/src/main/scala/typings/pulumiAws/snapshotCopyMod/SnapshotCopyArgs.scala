package typings.pulumiAws.snapshotCopyMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotCopyArgs extends js.Object {
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the snapshot is encrypted.
    */
  val encrypted: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN for the KMS encryption key.
    * * `sourceSnapshotId` The ARN for the snapshot to be copied.
    * * `sourceRegion` The region of the source snapshot.
    */
  val kmsKeyId: js.UndefOr[Input[String]] = js.native
  val sourceRegion: Input[String] = js.native
  val sourceSnapshotId: Input[String] = js.native
  /**
    * A mapping of tags for the snapshot.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object SnapshotCopyArgs {
  @scala.inline
  def apply(
    sourceRegion: Input[String],
    sourceSnapshotId: Input[String],
    description: Input[String] = null,
    encrypted: Input[Boolean] = null,
    kmsKeyId: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): SnapshotCopyArgs = {
    val __obj = js.Dynamic.literal(sourceRegion = sourceRegion.asInstanceOf[js.Any], sourceSnapshotId = sourceSnapshotId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCopyArgs]
  }
}

