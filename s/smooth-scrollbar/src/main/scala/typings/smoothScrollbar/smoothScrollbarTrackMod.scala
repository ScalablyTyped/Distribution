package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import typings.smoothScrollbar.trackMod.ScrollbarTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object smoothScrollbarTrackMod {
  
  @JSImport("smooth-scrollbar/track", "TrackController")
  @js.native
  open class TrackController protected ()
    extends StObject
       with typings.smoothScrollbar.trackMod.TrackController {
    def this(_scrollbar: Scrollbar) = this()
    
    /* private */ var _scrollbar: Any = js.native
    
    /* CompleteClass */
    override def autoHideOnIdle(): Unit = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
    
    /* CompleteClass */
    override val xAxis: ScrollbarTrack = js.native
    
    /* CompleteClass */
    override val yAxis: ScrollbarTrack = js.native
  }
}
