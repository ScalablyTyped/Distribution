package typings.atStorybookAddonDashActions.atStorybookAddonDashActionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clearOnStoryChange: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    clearOnStoryChange: js.UndefOr[Boolean] = js.undefined,
    depth: Int | Double = null,
    limit: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearOnStoryChange)) __obj.updateDynamic("clearOnStoryChange")(clearOnStoryChange)
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

