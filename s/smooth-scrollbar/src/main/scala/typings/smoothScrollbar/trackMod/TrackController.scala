package typings.smoothScrollbar.trackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackController extends js.Object {
  val xAxis: ScrollbarTrack
  val yAxis: ScrollbarTrack
  def autoHideOnIdle(): Unit
  def update(): Unit
}

object TrackController {
  @scala.inline
  def apply(autoHideOnIdle: () => Unit, update: () => Unit, xAxis: ScrollbarTrack, yAxis: ScrollbarTrack): TrackController = {
    val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackController]
  }
}

