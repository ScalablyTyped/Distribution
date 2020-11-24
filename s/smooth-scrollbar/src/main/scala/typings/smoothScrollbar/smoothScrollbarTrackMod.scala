package typings.smoothScrollbar

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/track", JSImport.Namespace)
@js.native
object smoothScrollbarTrackMod extends js.Object {
  
  @js.native
  class TrackController protected ()
    extends typings.smoothScrollbar.trackMod.TrackController {
    def this(_scrollbar: Scrollbar) = this()
    
    var _scrollbar: js.Any = js.native
  }
}
