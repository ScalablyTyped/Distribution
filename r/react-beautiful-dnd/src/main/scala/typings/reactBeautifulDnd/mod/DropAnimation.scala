package typings.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropAnimation extends js.Object {
  var curve: String
  var duration: Double
  var moveTo: Position
  var opacity: js.UndefOr[Double] = js.undefined
  var scale: js.UndefOr[Double] = js.undefined
}

object DropAnimation {
  @scala.inline
  def apply(
    curve: String,
    duration: Double,
    moveTo: Position,
    opacity: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], moveTo = moveTo.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
}

