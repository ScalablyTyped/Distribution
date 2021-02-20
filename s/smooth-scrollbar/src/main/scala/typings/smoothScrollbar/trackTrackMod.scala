package typings.smoothScrollbar

import typings.smoothScrollbar.directionMod.TrackDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackTrackMod {
  
  @JSImport("smooth-scrollbar/track/track", "ScrollbarTrack")
  @js.native
  class ScrollbarTrack protected ()
    extends typings.smoothScrollbar.trackMod.ScrollbarTrack {
    def this(direction: TrackDirection) = this()
    def this(direction: TrackDirection, thumbMinSize: Double) = this()
    
    var _isShown: js.Any = js.native
  }
}
