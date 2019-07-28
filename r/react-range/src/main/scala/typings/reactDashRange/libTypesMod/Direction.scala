package typings.reactDashRange.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSImport("react-range/lib/types", "Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait Down extends Direction
  
  @js.native
  sealed trait Left extends Direction
  
  @js.native
  sealed trait Right extends Direction
  
  @js.native
  sealed trait Up extends Direction
  
  /* "to bottom" */ val Down: typings.reactDashRange.libTypesMod.Direction.Down with String = js.native
  /* "to left" */ val Left: typings.reactDashRange.libTypesMod.Direction.Left with String = js.native
  /* "to right" */ val Right: typings.reactDashRange.libTypesMod.Direction.Right with String = js.native
  /* "to top" */ val Up: typings.reactDashRange.libTypesMod.Direction.Up with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Direction with String] = js.native
}

