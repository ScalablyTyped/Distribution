package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingSpeed extends js.Object {
  var scrollingSpeed: Double = js.native
}

object ScrollingSpeed {
  @scala.inline
  def apply(scrollingSpeed: Double): ScrollingSpeed = {
    val __obj = js.Dynamic.literal(scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingSpeed]
  }
  @scala.inline
  implicit class ScrollingSpeedOps[Self <: ScrollingSpeed] (val x: Self) extends AnyVal {
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
    def setScrollingSpeed(value: Double): Self = this.set("scrollingSpeed", value.asInstanceOf[js.Any])
  }
  
}

