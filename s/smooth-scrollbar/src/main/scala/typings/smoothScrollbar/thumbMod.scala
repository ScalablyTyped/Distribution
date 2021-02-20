package typings.smoothScrollbar

import typings.smoothScrollbar.directionMod.TrackDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thumbMod {
  
  @JSImport("smooth-scrollbar/track/thumb", "ScrollbarThumb")
  @js.native
  class ScrollbarThumb protected ()
    extends typings.smoothScrollbar.trackMod.ScrollbarThumb {
    def this(_direction: TrackDirection) = this()
    def this(_direction: TrackDirection, _minSize: Double) = this()
    
    var _direction: js.Any = js.native
    
    var _getStyle: js.Any = js.native
    
    var _minSize: js.Any = js.native
  }
}
