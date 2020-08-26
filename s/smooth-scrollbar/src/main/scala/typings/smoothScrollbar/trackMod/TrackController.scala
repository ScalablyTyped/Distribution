package typings.smoothScrollbar.trackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackController extends js.Object {
  val xAxis: ScrollbarTrack = js.native
  val yAxis: ScrollbarTrack = js.native
  def autoHideOnIdle(): Unit = js.native
  def update(): Unit = js.native
}

object TrackController {
  @scala.inline
  def apply(autoHideOnIdle: () => Unit, update: () => Unit, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
    val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackController]
  }
  @scala.inline
  implicit class TrackControllerOps[Self <: TrackController] (val x: Self) extends AnyVal {
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
    def setAutoHideOnIdle(value: () => Unit): Self = this.set("autoHideOnIdle", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    @scala.inline
    def setXAxis(value: ScrollbarTrack): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setYAxis(value: ScrollbarTrack): Self = this.set("yAxis", value.asInstanceOf[js.Any])
  }
  
}

