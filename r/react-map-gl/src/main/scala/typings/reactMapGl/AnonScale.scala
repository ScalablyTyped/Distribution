package typings.reactMapGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScale extends js.Object {
  var scale: Double
  var startPos: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object AnonScale {
  @scala.inline
  def apply(scale: Double, startPos: js.Tuple2[Double, Double] = null): AnonScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    if (startPos != null) __obj.updateDynamic("startPos")(startPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScale]
  }
}

