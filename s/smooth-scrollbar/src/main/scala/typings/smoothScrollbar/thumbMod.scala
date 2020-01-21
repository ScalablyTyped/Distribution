package typings.smoothScrollbar

import typings.smoothScrollbar.directionMod.TrackDirection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/thumb", JSImport.Namespace)
@js.native
object thumbMod extends js.Object {
  @js.native
  class ScrollbarThumb protected ()
    extends typings.smoothScrollbar.trackMod.ScrollbarThumb {
    def this(_direction: TrackDirection) = this()
    def this(_direction: TrackDirection, _minSize: Double) = this()
    var _direction: js.Any = js.native
    var _getStyle: js.Any = js.native
    var _minSize: js.Any = js.native
    /* CompleteClass */
    override var displaySize: Double = js.native
    /* CompleteClass */
    override val element: HTMLElement = js.native
    /* CompleteClass */
    override var offset: Double = js.native
    /* CompleteClass */
    override var realSize: Double = js.native
    /* CompleteClass */
    override def attachTo(track: HTMLElement): Unit = js.native
    /* CompleteClass */
    override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
  
}

