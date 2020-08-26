package typings.recharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetRadius extends js.Object {
  var offsetRadius: Double = js.native
}

object OffsetRadius {
  @scala.inline
  def apply(offsetRadius: Double): OffsetRadius = {
    val __obj = js.Dynamic.literal(offsetRadius = offsetRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetRadius]
  }
  @scala.inline
  implicit class OffsetRadiusOps[Self <: OffsetRadius] (val x: Self) extends AnyVal {
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
    def setOffsetRadius(value: Double): Self = this.set("offsetRadius", value.asInstanceOf[js.Any])
  }
  
}

