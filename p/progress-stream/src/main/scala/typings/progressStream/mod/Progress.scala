package typings.progressStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Progress extends js.Object {
  var delta: Double = js.native
  var eta: Double = js.native
  var length: Double = js.native
  var percentage: Double = js.native
  var remaining: Double = js.native
  var runtime: Double = js.native
  var speed: Double = js.native
  var transferred: Double = js.native
}

object Progress {
  @scala.inline
  def apply(
    delta: Double,
    eta: Double,
    length: Double,
    percentage: Double,
    remaining: Double,
    runtime: Double,
    speed: Double,
    transferred: Double
  ): Progress = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], eta = eta.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], percentage = percentage.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], transferred = transferred.asInstanceOf[js.Any])
    __obj.asInstanceOf[Progress]
  }
  @scala.inline
  implicit class ProgressOps[Self <: Progress] (val x: Self) extends AnyVal {
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
    def setDelta(value: Double): Self = this.set("delta", value.asInstanceOf[js.Any])
    @scala.inline
    def setEta(value: Double): Self = this.set("eta", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuntime(value: Double): Self = this.set("runtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransferred(value: Double): Self = this.set("transferred", value.asInstanceOf[js.Any])
  }
  
}

