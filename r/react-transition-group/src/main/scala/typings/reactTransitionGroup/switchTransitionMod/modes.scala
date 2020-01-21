package typings.reactTransitionGroup.switchTransitionMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[modes with String] = js.native
  /* "in-out" */ @js.native
  object in extends TopLevel[in with String]
  
  /* "out-in" */ @js.native
  object out extends TopLevel[out with String]
  
}

