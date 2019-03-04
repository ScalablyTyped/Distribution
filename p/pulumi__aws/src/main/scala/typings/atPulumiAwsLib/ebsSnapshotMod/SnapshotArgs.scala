package typings
package atPulumiAwsLib.ebsSnapshotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotArgs extends js.Object {
  /**
    * A description of what the snapshot is.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the snapshot
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The Volume ID of which to make a snapshot.
    */
  val volumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object SnapshotArgs {
  @scala.inline
  def apply(
    volumeId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): SnapshotArgs = {
    val __obj = js.Dynamic.literal(volumeId = volumeId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotArgs]
  }
}

