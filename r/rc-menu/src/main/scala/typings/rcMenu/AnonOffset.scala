package typings.rcMenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends js.Object {
  var offset: js.Array[Double]
  var overflow: AnonAdjustX
  var points: js.Array[String]
}

object AnonOffset {
  @scala.inline
  def apply(offset: js.Array[Double], overflow: AnonAdjustX, points: js.Array[String]): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}

