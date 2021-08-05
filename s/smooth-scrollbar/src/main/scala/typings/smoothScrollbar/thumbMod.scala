package typings.smoothScrollbar

import typings.smoothScrollbar.directionMod.TrackDirection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbMod {
  
  @JSImport("smooth-scrollbar/track/thumb", "ScrollbarThumb")
  @js.native
  class ScrollbarThumb protected ()
    extends StObject
       with typings.smoothScrollbar.trackMod.ScrollbarThumb {
    def this(_direction: TrackDirection) = this()
    def this(_direction: TrackDirection, _minSize: Double) = this()
    
    /* private */ var _direction: js.Any = js.native
    
    /* private */ var _getStyle: js.Any = js.native
    
    /* private */ var _minSize: js.Any = js.native
    
    /* CompleteClass */
    override def attachTo(track: HTMLElement): Unit = js.native
    
    /* CompleteClass */
    var displaySize: Double = js.native
    
    /* CompleteClass */
    override val element: HTMLElement = js.native
    
    /* CompleteClass */
    var offset: Double = js.native
    
    /* CompleteClass */
    var realSize: Double = js.native
    
    /* CompleteClass */
    override def update(scrollOffset: Double, containerSize: Double, pageSize: Double): Unit = js.native
  }
}
