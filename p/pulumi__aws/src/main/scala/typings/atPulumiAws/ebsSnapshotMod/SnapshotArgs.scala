package typings.atPulumiAws.ebsSnapshotMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotArgs extends js.Object {
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the snapshot
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: Input[String] = js.native
}

object SnapshotArgs {
  @scala.inline
  def apply(
    volumeId: Input[String],
    description: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): SnapshotArgs = {
    val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
}

