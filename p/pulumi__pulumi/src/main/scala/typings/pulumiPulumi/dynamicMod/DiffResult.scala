package typings.pulumiPulumi.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffResult extends js.Object {
  /**
    * If true, this diff detected changes and suggests an update.
    */
  val changes: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
    * void potential side-by-side issues with the default create before delete behavior.
    */
  val deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined
  /**
    * If this update requires a replacement, the set of properties triggering it.
    */
  val replaces: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * An optional list of properties that will not ever change.
    */
  val stables: js.UndefOr[js.Array[String]] = js.undefined
}

object DiffResult {
  @scala.inline
  def apply(
    changes: js.UndefOr[Boolean] = js.undefined,
    deleteBeforeReplace: js.UndefOr[Boolean] = js.undefined,
    replaces: js.Array[String] = null,
    stables: js.Array[String] = null
  ): DiffResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changes)) __obj.updateDynamic("changes")(changes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace.get.asInstanceOf[js.Any])
    if (replaces != null) __obj.updateDynamic("replaces")(replaces.asInstanceOf[js.Any])
    if (stables != null) __obj.updateDynamic("stables")(stables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiffResult]
  }
}

