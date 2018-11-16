package typings
package smoothDashScrollbarLib.trackThumbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/thumb", "ScrollbarThumb")
@js.native
class ScrollbarThumb protected ()
  extends smoothDashScrollbarLib.interfacesTrackMod.ScrollbarThumb {
  def this(_direction: smoothDashScrollbarLib.trackDirectionMod.TrackDirection) = this()
  def this(_direction: smoothDashScrollbarLib.trackDirectionMod.TrackDirection, _minSize: scala.Double) = this()
  var _direction: js.Any = js.native
  var _minSize: js.Any = js.native
  /* CompleteClass */
  override var displaySize: scala.Double = js.native
  /* CompleteClass */
  override val element: stdLib.HTMLElement = js.native
  /**
       * Thumb element
       */
  @JSName("element")
  val element_ScrollbarThumb: stdLib.HTMLDivElement = js.native
  /* CompleteClass */
  override var offset: scala.Double = js.native
  /* CompleteClass */
  override var realSize: scala.Double = js.native
  /* private */ def _getStyle(): js.Any = js.native
  /* CompleteClass */
  override def attachTo(track: stdLib.HTMLElement): scala.Unit = js.native
  /* CompleteClass */
  override def update(scrollOffset: scala.Double, containerSize: scala.Double, pageSize: scala.Double): scala.Unit = js.native
}

