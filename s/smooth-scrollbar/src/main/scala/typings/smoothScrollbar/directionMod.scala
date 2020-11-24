package typings.smoothScrollbar

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("smooth-scrollbar/track/direction", JSImport.Namespace)
@js.native
object directionMod extends js.Object {
  
  @js.native
  sealed trait TrackDirection extends js.Object
  @js.native
  object TrackDirection extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TrackDirection with String] = js.native
    
    @js.native
    sealed trait X extends TrackDirection
    /* "x" */ @js.native
    object X extends TopLevel[X with String]
    
    @js.native
    sealed trait Y extends TrackDirection
    /* "y" */ @js.native
    object Y extends TopLevel[Y with String]
  }
}
