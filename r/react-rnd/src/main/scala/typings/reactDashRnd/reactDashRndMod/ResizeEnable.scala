package typings.reactDashRnd.reactDashRndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEnable extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var bottomLeft: js.UndefOr[Boolean] = js.undefined
  var bottomRight: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var topLeft: js.UndefOr[Boolean] = js.undefined
  var topRight: js.UndefOr[Boolean] = js.undefined
}

object ResizeEnable {
  @scala.inline
  def apply(
    bottom: js.UndefOr[Boolean] = js.undefined,
    bottomLeft: js.UndefOr[Boolean] = js.undefined,
    bottomRight: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    right: js.UndefOr[Boolean] = js.undefined,
    top: js.UndefOr[Boolean] = js.undefined,
    topLeft: js.UndefOr[Boolean] = js.undefined,
    topRight: js.UndefOr[Boolean] = js.undefined
  ): ResizeEnable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (!js.isUndefined(bottomLeft)) __obj.updateDynamic("bottomLeft")(bottomLeft)
    if (!js.isUndefined(bottomRight)) __obj.updateDynamic("bottomRight")(bottomRight)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft)
    if (!js.isUndefined(topRight)) __obj.updateDynamic("topRight")(topRight)
    __obj.asInstanceOf[ResizeEnable]
  }
}

