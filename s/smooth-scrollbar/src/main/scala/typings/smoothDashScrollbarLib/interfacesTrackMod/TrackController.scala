package typings
package smoothDashScrollbarLib.interfacesTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackController extends js.Object {
  val xAxis: ScrollbarTrack
  val yAxis: ScrollbarTrack
  def autoHideOnIdle(): scala.Unit
  def update(): scala.Unit
}

object TrackController {
  @scala.inline
  def apply(
    autoHideOnIdle: () => scala.Unit,
    update: () => scala.Unit,
    xAxis: ScrollbarTrack,
    yAxis: ScrollbarTrack
  ): TrackController = {
    val __obj = js.Dynamic.literal(autoHideOnIdle = js.Any.fromFunction0(autoHideOnIdle), update = js.Any.fromFunction0(update), xAxis = xAxis, yAxis = yAxis)
  
    __obj.asInstanceOf[TrackController]
  }
}

