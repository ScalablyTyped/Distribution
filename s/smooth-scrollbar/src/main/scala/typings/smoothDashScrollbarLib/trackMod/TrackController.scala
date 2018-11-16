package typings
package smoothDashScrollbarLib.trackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track", "TrackController")
@js.native
class TrackController protected ()
  extends smoothDashScrollbarLib.interfacesTrackMod.TrackController {
  def this(_scrollbar: smoothDashScrollbarLib.interfacesScrollbarMod.Scrollbar) = this()
  var _scrollbar: js.Any = js.native
  /* CompleteClass */
  override val xAxis: smoothDashScrollbarLib.interfacesTrackMod.ScrollbarTrack = js.native
  @JSName("xAxis")
  val xAxis_TrackController: smoothDashScrollbarLib.trackTrackMod.ScrollbarTrack = js.native
  /* CompleteClass */
  override val yAxis: smoothDashScrollbarLib.interfacesTrackMod.ScrollbarTrack = js.native
  @JSName("yAxis")
  val yAxis_TrackController: smoothDashScrollbarLib.trackTrackMod.ScrollbarTrack = js.native
  /* CompleteClass */
  override def autoHideOnIdle(): scala.Unit = js.native
  /* CompleteClass */
  override def update(): scala.Unit = js.native
}

