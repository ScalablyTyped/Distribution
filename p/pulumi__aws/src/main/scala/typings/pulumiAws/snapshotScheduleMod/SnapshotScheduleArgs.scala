package typings.pulumiAws.snapshotScheduleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapshotScheduleArgs extends js.Object {
  /**
    * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example `cron(30 12 *)` or `rate(12 hours)`.
    */
  val definitions: Input[js.Array[Input[String]]] = js.native
  /**
    * The description of the snapshot schedule.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Whether to destroy all associated clusters with this snapshot schedule on deletion. Must be enabled and applied before attempting deletion.
    */
  val forceDestroy: js.UndefOr[Input[Boolean]] = js.native
  val identifier: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique
    * identifier beginning with the specified prefix. Conflicts with `identifier`.
    */
  val identifierPrefix: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object SnapshotScheduleArgs {
  @scala.inline
  def apply(
    definitions: Input[js.Array[Input[String]]],
    description: Input[String] = null,
    forceDestroy: Input[Boolean] = null,
    identifier: Input[String] = null,
    identifierPrefix: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): SnapshotScheduleArgs = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (forceDestroy != null) __obj.updateDynamic("forceDestroy")(forceDestroy.asInstanceOf[js.Any])
    if (identifier != null) __obj.updateDynamic("identifier")(identifier.asInstanceOf[js.Any])
    if (identifierPrefix != null) __obj.updateDynamic("identifierPrefix")(identifierPrefix.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotScheduleArgs]
  }
}

