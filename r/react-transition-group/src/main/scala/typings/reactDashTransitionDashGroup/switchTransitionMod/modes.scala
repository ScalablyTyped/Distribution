package typings.reactDashTransitionDashGroup.switchTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait modes extends js.Object

@JSImport("react-transition-group/SwitchTransition", "modes")
@js.native
object modes extends js.Object {
  @js.native
  sealed trait in extends modes
  
  @js.native
  sealed trait out extends modes
  
  /* "in-out" */ val in: typings.reactDashTransitionDashGroup.switchTransitionMod.modes.in with String = js.native
  /* "out-in" */ val out: typings.reactDashTransitionDashGroup.switchTransitionMod.modes.out with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[modes with String] = js.native
}

