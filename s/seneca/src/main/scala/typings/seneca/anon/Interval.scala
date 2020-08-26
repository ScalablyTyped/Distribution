package typings.seneca.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interval extends js.Object {
  var interval: js.UndefOr[Double] = js.native
  var running: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
}

object Interval {
  @scala.inline
  def apply(): Interval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interval]
  }
  @scala.inline
  implicit class IntervalOps[Self <: Interval] (val x: Self) extends AnyVal {
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setRunning(value: Boolean): Self = this.set("running", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunning: Self = this.set("running", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

