package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropAnimation extends js.Object {
  var curve: java.lang.String
  var duration: scala.Double
  var moveTo: stdLib.Position
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var scale: js.UndefOr[scala.Double] = js.undefined
}

object DropAnimation {
  @scala.inline
  def apply(
    curve: java.lang.String,
    duration: scala.Double,
    moveTo: stdLib.Position,
    opacity: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null
  ): DropAnimation = {
    val __obj = js.Dynamic.literal(curve = curve, duration = duration, moveTo = moveTo)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropAnimation]
  }
}

