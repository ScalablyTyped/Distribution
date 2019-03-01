package typings
package atPulumiPulumiLib.dynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffResult extends js.Object {
  /**
    * If true, this diff detected changes and suggests an update.
    */
  val changes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, and a replacement occurs, the resource will first be deleted before being recreated.  This is to
    * void potential side-by-side issues with the default create before delete behavior.
    */
  val deleteBeforeReplace: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If this update requires a replacement, the set of properties triggering it.
    */
  val replaces: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * An optional list of properties that will not ever change.
    */
  val stables: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object DiffResult {
  @scala.inline
  def apply(
    changes: js.UndefOr[scala.Boolean] = js.undefined,
    deleteBeforeReplace: js.UndefOr[scala.Boolean] = js.undefined,
    replaces: js.Array[java.lang.String] = null,
    stables: js.Array[java.lang.String] = null
  ): DiffResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(changes)) __obj.updateDynamic("changes")(changes)
    if (!js.isUndefined(deleteBeforeReplace)) __obj.updateDynamic("deleteBeforeReplace")(deleteBeforeReplace)
    if (replaces != null) __obj.updateDynamic("replaces")(replaces)
    if (stables != null) __obj.updateDynamic("stables")(stables)
    __obj.asInstanceOf[DiffResult]
  }
}

