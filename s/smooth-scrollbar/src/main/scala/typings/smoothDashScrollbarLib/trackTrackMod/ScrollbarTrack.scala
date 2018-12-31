package typings
package smoothDashScrollbarLib.trackTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/track", "ScrollbarTrack")
@js.native
class ScrollbarTrack protected ()
  extends smoothDashScrollbarLib.interfacesTrackMod.ScrollbarTrack {
  def this(direction: smoothDashScrollbarLib.trackDirectionMod.TrackDirection) = this()
  def this(direction: smoothDashScrollbarLib.trackDirectionMod.TrackDirection, thumbMinSize: scala.Double) = this()
  var _isShown: js.Any = js.native
  /* CompleteClass */
  override val element: stdLib.HTMLElement = js.native
  /**
    * Track element
    */
  @JSName("element")
  val element_ScrollbarTrack: stdLib.HTMLDivElement = js.native
  /* CompleteClass */
  override val thumb: smoothDashScrollbarLib.interfacesTrackMod.ScrollbarThumb = js.native
  @JSName("thumb")
  val thumb_ScrollbarTrack: smoothDashScrollbarLib.trackThumbMod.ScrollbarThumb = js.native
  /* CompleteClass */
  override def attachTo(container: stdLib.HTMLElement): scala.Unit = js.native
  /* CompleteClass */
  override def hide(): scala.Unit = js.native
  /* CompleteClass */
  override def show(): scala.Unit = js.native
  /* CompleteClass */
  override def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit = js.native
}

