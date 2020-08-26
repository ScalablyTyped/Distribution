package typings.reactMdUtils.movementTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait JumpMovementKey extends MovementKey

@JSImport("@react-md/utils/types/wia-aria/movement/types", "JumpMovementKey")
@js.native
object JumpMovementKey extends js.Object {
  @js.native
  sealed trait AltEnd extends JumpMovementKey
  
  @js.native
  sealed trait AltHome extends JumpMovementKey
  
  @js.native
  sealed trait ControlEnd extends JumpMovementKey
  
  @js.native
  sealed trait ControlHome extends JumpMovementKey
  
  @js.native
  sealed trait ControlShiftEnd extends JumpMovementKey
  
  @js.native
  sealed trait ControlShiftHome extends JumpMovementKey
  
  @js.native
  sealed trait End extends JumpMovementKey
  
  @js.native
  sealed trait Home extends JumpMovementKey
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[JumpMovementKey with String] = js.native
  /* "Alt+End" */ @js.native
  object AltEnd extends TopLevel[AltEnd with String]
  
  /* "Alt+Home" */ @js.native
  object AltHome extends TopLevel[AltHome with String]
  
  /* "Control+End" */ @js.native
  object ControlEnd extends TopLevel[ControlEnd with String]
  
  /* "Control+Home" */ @js.native
  object ControlHome extends TopLevel[ControlHome with String]
  
  /* "Control+Shift+End" */ @js.native
  object ControlShiftEnd extends TopLevel[ControlShiftEnd with String]
  
  /* "Control+Shift+Home" */ @js.native
  object ControlShiftHome extends TopLevel[ControlShiftHome with String]
  
  /* "End" */ @js.native
  object End extends TopLevel[End with String]
  
  /* "Home" */ @js.native
  object Home extends TopLevel[Home with String]
  
}

