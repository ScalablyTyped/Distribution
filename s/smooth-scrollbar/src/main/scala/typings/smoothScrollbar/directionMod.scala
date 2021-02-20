package typings.smoothScrollbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directionMod {
  
  @js.native
  sealed trait TrackDirection extends StObject
  @JSImport("smooth-scrollbar/track/direction", "TrackDirection")
  @js.native
  object TrackDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection with String] = js.native
    
    @js.native
    sealed trait X extends TrackDirection
    /* "x" */ val X: typings.smoothScrollbar.directionMod.TrackDirection.X with String = js.native
    
    @js.native
    sealed trait Y extends TrackDirection
    /* "y" */ val Y: typings.smoothScrollbar.directionMod.TrackDirection.Y with String = js.native
  }
}
