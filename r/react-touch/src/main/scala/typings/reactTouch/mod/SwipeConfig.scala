package typings.reactTouch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeConfig extends js.Object {
  /** @default 100 */
  var swipeDistance: js.UndefOr[Double] = js.native
}

object SwipeConfig {
  @scala.inline
  def apply(): SwipeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeConfig]
  }
  @scala.inline
  implicit class SwipeConfigOps[Self <: SwipeConfig] (val x: Self) extends AnyVal {
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
    def setSwipeDistance(value: Double): Self = this.set("swipeDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeDistance: Self = this.set("swipeDistance", js.undefined)
  }
  
}

