package typings
package smoothDashScrollbarLib.trackDirectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TrackDirection extends js.Object

@JSImport("smooth-scrollbar/track/direction", "TrackDirection")
@js.native
object TrackDirection extends js.Object {
  @js.native
  sealed trait X
    extends smoothDashScrollbarLib.trackDirectionMod.TrackDirection
  
  @js.native
  sealed trait Y
    extends smoothDashScrollbarLib.trackDirectionMod.TrackDirection
  
  /* "x" */ val X: X with java.lang.String = js.native
  /* "y" */ val Y: Y with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[smoothDashScrollbarLib.trackDirectionMod.TrackDirection with java.lang.String] = js.native
}

