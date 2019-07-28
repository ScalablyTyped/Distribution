package typings.smoothDashScrollbar.trackTrackMod

import typings.smoothDashScrollbar.interfacesTrackMod.ScrollbarThumb
import typings.smoothDashScrollbar.trackDirectionMod.TrackDirection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/track", "ScrollbarTrack")
@js.native
class ScrollbarTrack protected ()
  extends typings.smoothDashScrollbar.interfacesTrackMod.ScrollbarTrack {
  def this(direction: TrackDirection) = this()
  def this(direction: TrackDirection, thumbMinSize: Double) = this()
  var _isShown: js.Any = js.native
  /* CompleteClass */
  override val element: HTMLElement = js.native
  /**
    * Track element
    */
  @JSName("element")
  val element_ScrollbarTrack: HTMLDivElement = js.native
  /* CompleteClass */
  override val thumb: ScrollbarThumb = js.native
  @JSName("thumb")
  val thumb_ScrollbarTrack: typings.smoothDashScrollbar.trackThumbMod.ScrollbarThumb = js.native
  /* CompleteClass */
  override def attachTo(container: HTMLElement): Unit = js.native
  /* CompleteClass */
  override def hide(): Unit = js.native
  /* CompleteClass */
  override def show(): Unit = js.native
  /* CompleteClass */
  override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

