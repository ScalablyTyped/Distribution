package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Start extends js.Object {
  var start: Double = js.native
  var stop: Double = js.native
}

object Start {
  @scala.inline
  def apply(start: Double, stop: Double): Start = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    __obj.asInstanceOf[Start]
  }
  @scala.inline
  implicit class StartOps[Self <: Start] (val x: Self) extends AnyVal {
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
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: Double): Self = this.set("stop", value.asInstanceOf[js.Any])
  }
  
}

