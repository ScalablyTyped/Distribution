package typings.rcAlign.interfaceMod

import typings.rcAlign.AnonAdjustY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignResult extends js.Object {
  var offset: js.Array[Double]
  var overflow: AnonAdjustY
  var points: js.Array[AlignPoint]
  var targetOffset: js.Array[Double]
}

object AlignResult {
  @scala.inline
  def apply(
    offset: js.Array[Double],
    overflow: AnonAdjustY,
    points: js.Array[AlignPoint],
    targetOffset: js.Array[Double]
  ): AlignResult = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AlignResult]
  }
}

