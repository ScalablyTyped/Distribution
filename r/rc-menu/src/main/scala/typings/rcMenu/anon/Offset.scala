package typings.rcMenu.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Offset extends js.Object {
  var offset: js.Array[Double]
  var overflow: AdjustX
  var points: js.Array[String]
}

object Offset {
  @scala.inline
  def apply(offset: js.Array[Double], overflow: AdjustX, points: js.Array[String]): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

