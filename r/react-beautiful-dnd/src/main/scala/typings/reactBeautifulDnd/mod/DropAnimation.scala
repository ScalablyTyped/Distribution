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
    opacity: Int | Double = null,
    scale: Int | Double = null
  ): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], moveTo = moveTo.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
}

