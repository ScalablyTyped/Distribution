package typings.smoothDashScrollbar

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection with String] = js.native
    /* "x" */ @js.native
    object X extends TopLevel[X with String]
    
    /* "y" */ @js.native
    object Y extends TopLevel[Y with String]
    
  }
  
}

