package typings.reactNativeVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnSeekData extends js.Object {
  var currentTime: Double = js.native
  var seekTime: Double = js.native
  var target: js.UndefOr[Double] = js.native
}

object OnSeekData {
  @scala.inline
  def apply(currentTime: Double, seekTime: Double): OnSeekData = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], seekTime = seekTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnSeekData]
  }
  @scala.inline
  implicit class OnSeekDataOps[Self <: OnSeekData] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeekTime(value: Double): Self = this.set("seekTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

