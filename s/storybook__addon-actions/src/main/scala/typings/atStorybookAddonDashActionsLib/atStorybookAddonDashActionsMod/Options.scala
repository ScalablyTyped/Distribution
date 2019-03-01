package typings
package atStorybookAddonDashActionsLib.atStorybookAddonDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clearOnStoryChange: js.UndefOr[scala.Boolean] = js.undefined
  var depth: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clearOnStoryChange: js.UndefOr[scala.Boolean] = js.undefined,
    depth: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearOnStoryChange)) __obj.updateDynamic("clearOnStoryChange")(clearOnStoryChange)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

