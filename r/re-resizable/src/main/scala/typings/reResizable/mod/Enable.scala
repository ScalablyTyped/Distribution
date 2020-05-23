package typings.reResizable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enable extends js.Object {
  var bottom: js.UndefOr[Boolean] = js.undefined
  var bottomLeft: js.UndefOr[Boolean] = js.undefined
  var bottomRight: js.UndefOr[Boolean] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var topLeft: js.UndefOr[Boolean] = js.undefined
  var topRight: js.UndefOr[Boolean] = js.undefined
}

object Enable {
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
  ): Enable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomLeft)) __obj.updateDynamic("bottomLeft")(bottomLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomRight)) __obj.updateDynamic("bottomRight")(bottomRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.get.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topLeft)) __obj.updateDynamic("topLeft")(topLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topRight)) __obj.updateDynamic("topRight")(topRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enable]
  }
}

