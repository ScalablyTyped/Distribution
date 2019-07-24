package typings
package reactDashTransitionDashGroupLib.switchTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait modes extends js.Object

@JSImport("react-transition-group/SwitchTransition", "modes")
@js.native
object modes extends js.Object {
  @js.native
  sealed trait in
    extends reactDashTransitionDashGroupLib.switchTransitionMod.modes
  
  @js.native
  sealed trait out
    extends reactDashTransitionDashGroupLib.switchTransitionMod.modes
  
  /* "in-out" */ val in: in with java.lang.String = js.native
  /* "out-in" */ val out: out with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[reactDashTransitionDashGroupLib.switchTransitionMod.modes with java.lang.String] = js.native
}

