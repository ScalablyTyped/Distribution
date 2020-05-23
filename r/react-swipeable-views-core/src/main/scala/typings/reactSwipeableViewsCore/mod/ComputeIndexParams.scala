package typings.reactSwipeableViewsCore.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeIndexParams extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var pageX: Double
  var resistance: js.UndefOr[Boolean] = js.undefined
  var startIndex: Double
  var startX: Double
  var viewLength: Double
}

object ComputeIndexParams {
  @scala.inline
  def apply(
    pageX: Double,
    startIndex: Double,
    startX: Double,
    viewLength: Double,
    children: ReactNode = null,
    resistance: js.UndefOr[Boolean] = js.undefined
  ): ComputeIndexParams = {
    val __obj = js.Dynamic.literal(pageX = pageX.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], viewLength = viewLength.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeIndexParams]
  }
}

