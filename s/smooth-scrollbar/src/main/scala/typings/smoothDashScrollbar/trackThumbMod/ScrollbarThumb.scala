package typings.smoothDashScrollbar.trackThumbMod

import typings.smoothDashScrollbar.trackDirectionMod.TrackDirection
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/thumb", "ScrollbarThumb")
@js.native
class ScrollbarThumb protected ()
  extends typings.smoothDashScrollbar.interfacesTrackMod.ScrollbarThumb {
  def this(_direction: TrackDirection) = this()
  def this(_direction: TrackDirection, _minSize: Double) = this()
  var _direction: js.Any = js.native
  var _getStyle: js.Any = js.native
  var _minSize: js.Any = js.native
  /* CompleteClass */
  override var displaySize: Double = js.native
  /* CompleteClass */
  override val element: HTMLElement = js.native
  /**
    * Thumb element
    */
  @JSName("element")
  val element_ScrollbarThumb: HTMLDivElement = js.native
  /* CompleteClass */
  override var offset: Double = js.native
  /* CompleteClass */
  override var realSize: Double = js.native
  /* CompleteClass */
  override def attachTo(track: HTMLElement): Unit = js.native
  /* CompleteClass */
  override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
}

