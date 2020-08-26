package typings.reactCustomScrollbars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait positionValues extends js.Object {
  var clientHeight: Double = js.native
  var clientWidth: Double = js.native
  var left: Double = js.native
  var scrollHeight: Double = js.native
  var scrollLeft: Double = js.native
  var scrollTop: Double = js.native
  var scrollWidth: Double = js.native
  var top: Double = js.native
}

object positionValues {
  @scala.inline
  def apply(
    clientHeight: Double,
    clientWidth: Double,
    left: Double,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double,
    top: Double
  ): positionValues = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[positionValues]
  }
  @scala.inline
  implicit class positionValuesOps[Self <: positionValues] (val x: Self) extends AnyVal {
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
    def setClientHeight(value: Double): Self = this.set("clientHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientWidth(value: Double): Self = this.set("clientWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollHeight(value: Double): Self = this.set("scrollHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollLeft(value: Double): Self = this.set("scrollLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollTop(value: Double): Self = this.set("scrollTop", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrollWidth(value: Double): Self = this.set("scrollWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

