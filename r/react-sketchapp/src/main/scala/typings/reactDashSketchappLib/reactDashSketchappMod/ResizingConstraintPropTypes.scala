package typings
package reactDashSketchappLib.reactDashSketchappMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizingConstraintPropTypes extends js.Object {
  var bottom: js.UndefOr[scala.Boolean] = js.undefined
  var fixedHeight: js.UndefOr[scala.Boolean] = js.undefined
  var fixedWidth: js.UndefOr[scala.Boolean] = js.undefined
  var left: js.UndefOr[scala.Boolean] = js.undefined
  var right: js.UndefOr[scala.Boolean] = js.undefined
  var top: js.UndefOr[scala.Boolean] = js.undefined
}

object ResizingConstraintPropTypes {
  @scala.inline
  def apply(
    bottom: js.UndefOr[scala.Boolean] = js.undefined,
    fixedHeight: js.UndefOr[scala.Boolean] = js.undefined,
    fixedWidth: js.UndefOr[scala.Boolean] = js.undefined,
    left: js.UndefOr[scala.Boolean] = js.undefined,
    right: js.UndefOr[scala.Boolean] = js.undefined,
    top: js.UndefOr[scala.Boolean] = js.undefined
  ): ResizingConstraintPropTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom)
    if (!js.isUndefined(fixedHeight)) __obj.updateDynamic("fixedHeight")(fixedHeight)
    if (!js.isUndefined(fixedWidth)) __obj.updateDynamic("fixedWidth")(fixedWidth)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[ResizingConstraintPropTypes]
  }
}

