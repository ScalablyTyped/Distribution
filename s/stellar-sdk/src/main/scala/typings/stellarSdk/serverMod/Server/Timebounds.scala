package typings.stellarSdk.serverMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timebounds extends js.Object {
  var maxTime: Double = js.native
  var minTime: Double = js.native
}

object Timebounds {
  @scala.inline
  def apply(maxTime: Double, minTime: Double): Timebounds = {
    val __obj = js.Dynamic.literal(maxTime = maxTime.asInstanceOf[js.Any], minTime = minTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timebounds]
  }
  @scala.inline
  implicit class TimeboundsOps[Self <: Timebounds] (val x: Self) extends AnyVal {
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
    def setMaxTime(value: Double): Self = this.set("maxTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinTime(value: Double): Self = this.set("minTime", value.asInstanceOf[js.Any])
  }
  
}

