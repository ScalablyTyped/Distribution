package typings.reactNativeCalendarPicker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwipeConfig extends js.Object {
  var directionalOffsetThreshold: js.UndefOr[Double] = js.native
  var velocityThreshold: js.UndefOr[Double] = js.native
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
    def setDirectionalOffsetThreshold(value: Double): Self = this.set("directionalOffsetThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectionalOffsetThreshold: Self = this.set("directionalOffsetThreshold", js.undefined)
    @scala.inline
    def setVelocityThreshold(value: Double): Self = this.set("velocityThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVelocityThreshold: Self = this.set("velocityThreshold", js.undefined)
  }
  
}

