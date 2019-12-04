package typings.rmcDashTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: js.Array[Double]
  var overflow: Anon_AdjustX
  var points: js.Array[String]
  var targetOffset: js.Array[Double]
}

object Anon_Offset {
  @scala.inline
  def apply(
    offset: js.Array[Double],
    overflow: Anon_AdjustX,
    points: js.Array[String],
    targetOffset: js.Array[Double]
  ): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], targetOffset = targetOffset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

