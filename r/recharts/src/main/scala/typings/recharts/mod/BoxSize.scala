package typings.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxSize extends js.Object {
  var boxHeight: Double = js.native
  var boxWidth: Double = js.native
}

object BoxSize {
  @scala.inline
  def apply(boxHeight: Double, boxWidth: Double): BoxSize = {
    val __obj = js.Dynamic.literal(boxHeight = boxHeight.asInstanceOf[js.Any], boxWidth = boxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxSize]
  }
  @scala.inline
  implicit class BoxSizeOps[Self <: BoxSize] (val x: Self) extends AnyVal {
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
    def setBoxHeight(value: Double): Self = this.set("boxHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoxWidth(value: Double): Self = this.set("boxWidth", value.asInstanceOf[js.Any])
  }
  
}

