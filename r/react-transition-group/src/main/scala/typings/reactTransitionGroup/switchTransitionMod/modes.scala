package typings.reactTransitionGroup.switchTransitionMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait modes extends js.Object
@JSImport("react-transition-group/SwitchTransition", "modes")
@js.native
object modes extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[modes with String] = js.native
  
  @js.native
  sealed trait in extends modes
  /* "in-out" */ @js.native
  object in extends TopLevel[in with String]
  
  @js.native
  sealed trait out extends modes
  /* "out-in" */ @js.native
  object out extends TopLevel[out with String]
}
