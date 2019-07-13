package typings
package reactDashRangeLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("react-range/lib/types", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Down
    extends reactDashRangeLib.libTypesMod.Direction
  
  @js.native
  sealed trait Left
    extends reactDashRangeLib.libTypesMod.Direction
  
  @js.native
  sealed trait Right
    extends reactDashRangeLib.libTypesMod.Direction
  
  @js.native
  sealed trait Up
    extends reactDashRangeLib.libTypesMod.Direction
  
  /* "to bottom" */ val Down: Down with java.lang.String = js.native
  /* "to left" */ val Left: Left with java.lang.String = js.native
  /* "to right" */ val Right: Right with java.lang.String = js.native
  /* "to top" */ val Up: Up with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[reactDashRangeLib.libTypesMod.Direction with java.lang.String] = js.native
}

