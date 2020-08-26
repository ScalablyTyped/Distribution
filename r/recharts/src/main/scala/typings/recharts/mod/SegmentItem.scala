package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentItem extends js.Object {
  var x: Double | String = js.native
  var y: Double | String = js.native
}

object SegmentItem {
  @scala.inline
  def apply(x: Double | String, y: Double | String): SegmentItem = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentItem]
  }
  @scala.inline
  implicit class SegmentItemOps[Self <: SegmentItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setX(value: Double | String): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double | String): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

