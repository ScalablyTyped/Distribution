package typings.rmcTooltip.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.Array[Double]
  var overflow: AdjustX
  var points: js.Array[String]
  var targetOffset: js.Array[Double]
}

object Offset {
  @scala.inline
  def apply(
    offset: js.Array[Double],
    overflow: AdjustX,
    points: js.Array[String],
    targetOffset: js.Array[Double]
  ): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

