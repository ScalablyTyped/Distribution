package typings.reactDashSortableDashPane.libPaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsPaneResizable extends js.Object {
  var x: js.UndefOr[Boolean] = js.undefined
  var xy: js.UndefOr[Boolean] = js.undefined
  var y: js.UndefOr[Boolean] = js.undefined
}

object IsPaneResizable {
  @scala.inline
  def apply(
    x: js.UndefOr[Boolean] = js.undefined,
    xy: js.UndefOr[Boolean] = js.undefined,
    y: js.UndefOr[Boolean] = js.undefined
  ): IsPaneResizable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x)
    if (!js.isUndefined(xy)) __obj.updateDynamic("xy")(xy)
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[IsPaneResizable]
  }
}

