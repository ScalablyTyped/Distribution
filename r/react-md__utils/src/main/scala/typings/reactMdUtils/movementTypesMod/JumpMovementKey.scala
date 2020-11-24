package typings.reactMdUtils.movementTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait JumpMovementKey extends MovementKey
@JSImport("@react-md/utils/types/wia-aria/movement/types", "JumpMovementKey")
@js.native
object JumpMovementKey extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JumpMovementKey with String] = js.native
  
  @js.native
  sealed trait AltEnd extends JumpMovementKey
  /* "Alt+End" */ @js.native
  object AltEnd extends TopLevel[AltEnd with String]
  
  @js.native
  sealed trait AltHome extends JumpMovementKey
  /* "Alt+Home" */ @js.native
  object AltHome extends TopLevel[AltHome with String]
  
  @js.native
  sealed trait ControlEnd extends JumpMovementKey
  /* "Control+End" */ @js.native
  object ControlEnd extends TopLevel[ControlEnd with String]
  
  @js.native
  sealed trait ControlHome extends JumpMovementKey
  /* "Control+Home" */ @js.native
  object ControlHome extends TopLevel[ControlHome with String]
  
  @js.native
  sealed trait ControlShiftEnd extends JumpMovementKey
  /* "Control+Shift+End" */ @js.native
  object ControlShiftEnd extends TopLevel[ControlShiftEnd with String]
  
  @js.native
  sealed trait ControlShiftHome extends JumpMovementKey
  /* "Control+Shift+Home" */ @js.native
  object ControlShiftHome extends TopLevel[ControlShiftHome with String]
  
  @js.native
  sealed trait End extends JumpMovementKey
  /* "End" */ @js.native
  object End extends TopLevel[End with String]
  
  @js.native
  sealed trait Home extends JumpMovementKey
  /* "Home" */ @js.native
  object Home extends TopLevel[Home with String]
}
