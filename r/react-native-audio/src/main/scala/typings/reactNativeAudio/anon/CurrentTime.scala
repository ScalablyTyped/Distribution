package typings.reactNativeAudio.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentTime extends js.Object {
  var currentTime: Double = js.native
}

object CurrentTime {
  @scala.inline
  def apply(currentTime: Double): CurrentTime = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTime]
  }
  @scala.inline
  implicit class CurrentTimeOps[Self <: CurrentTime] (val x: Self) extends AnyVal {
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
  }
  
}

