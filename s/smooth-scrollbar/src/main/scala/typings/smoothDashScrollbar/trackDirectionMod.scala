package typings.smoothDashScrollbar

import typings.smoothDashScrollbar.trackDirectionMod.TrackDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/track/direction", JSImport.Namespace)
@js.native
object trackDirectionMod extends js.Object {
  @js.native
  sealed trait TrackDirection extends js.Object
  
  @js.native
  object TrackDirection extends js.Object {
    @js.native
    sealed trait X extends TrackDirection
    
    @js.native
    sealed trait Y extends TrackDirection
    
    /* "x" */ val X: typings.smoothDashScrollbar.trackDirectionMod.TrackDirection.X with String = js.native
    /* "y" */ val Y: typings.smoothDashScrollbar.trackDirectionMod.TrackDirection.Y with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection with String] = js.native
  }
  
}

