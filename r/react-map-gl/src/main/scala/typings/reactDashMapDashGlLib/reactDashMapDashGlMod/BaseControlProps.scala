package typings
package reactDashMapDashGlLib.reactDashMapDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseControlProps extends js.Object {
  var captureClick: js.UndefOr[scala.Boolean] = js.undefined
  var captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined
  var captureDrag: js.UndefOr[scala.Boolean] = js.undefined
  var captureScroll: js.UndefOr[scala.Boolean] = js.undefined
}

object BaseControlProps {
  @scala.inline
  def apply(
    captureClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDoubleClick: js.UndefOr[scala.Boolean] = js.undefined,
    captureDrag: js.UndefOr[scala.Boolean] = js.undefined,
    captureScroll: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseControlProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(captureClick)) __obj.updateDynamic("captureClick")(captureClick)
    if (!js.isUndefined(captureDoubleClick)) __obj.updateDynamic("captureDoubleClick")(captureDoubleClick)
    if (!js.isUndefined(captureDrag)) __obj.updateDynamic("captureDrag")(captureDrag)
    if (!js.isUndefined(captureScroll)) __obj.updateDynamic("captureScroll")(captureScroll)
    __obj.asInstanceOf[BaseControlProps]
  }
}

