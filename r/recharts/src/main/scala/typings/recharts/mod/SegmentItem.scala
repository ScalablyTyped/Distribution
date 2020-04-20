package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentItem extends js.Object {
  var x: Double | String
  var y: Double | String
}

object SegmentItem {
  @scala.inline
  def apply(x: Double | String, y: Double | String): SegmentItem = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentItem]
  }
}

