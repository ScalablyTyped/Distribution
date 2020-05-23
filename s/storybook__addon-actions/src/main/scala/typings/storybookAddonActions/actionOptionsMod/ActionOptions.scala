package typings.storybookAddonActions.actionOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionOptions extends js.Object {
  var allowFunction: js.UndefOr[Boolean] = js.undefined
  var clearOnStoryChange: js.UndefOr[Boolean] = js.undefined
  var depth: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
}

object ActionOptions {
  @scala.inline
  def apply(
    allowFunction: js.UndefOr[Boolean] = js.undefined,
    clearOnStoryChange: js.UndefOr[Boolean] = js.undefined,
    depth: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined
  ): ActionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFunction)) __obj.updateDynamic("allowFunction")(allowFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearOnStoryChange)) __obj.updateDynamic("clearOnStoryChange")(clearOnStoryChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionOptions]
  }
}

