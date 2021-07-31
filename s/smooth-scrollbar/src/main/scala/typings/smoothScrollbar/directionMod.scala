package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionMod {
  
  @js.native
  sealed trait TrackDirection extends StObject
  @JSImport("smooth-scrollbar/track/direction", "TrackDirection")
  @js.native
  object TrackDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection & String] = js.native
    
    @js.native
    sealed trait X
      extends StObject
         with TrackDirection
    /* "x" */ val X: typings.smoothScrollbar.directionMod.TrackDirection.X & String = js.native
    
    @js.native
    sealed trait Y
      extends StObject
         with TrackDirection
    /* "y" */ val Y: typings.smoothScrollbar.directionMod.TrackDirection.Y & String = js.native
  }
}
