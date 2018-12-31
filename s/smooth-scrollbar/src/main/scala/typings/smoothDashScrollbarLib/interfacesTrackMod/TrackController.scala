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

