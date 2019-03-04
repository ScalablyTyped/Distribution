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
    autoHideOnIdle: js.Function0[scala.Unit],
    update: js.Function0[scala.Unit],
    xAxis: ScrollbarTrack,
    yAxis: ScrollbarTrack
  ): TrackController = {
    val __obj = js.Dynamic.literal(autoHideOnIdle = autoHideOnIdle, update = update, xAxis = xAxis, yAxis = yAxis)
  
    __obj.asInstanceOf[TrackController]
  }
}

