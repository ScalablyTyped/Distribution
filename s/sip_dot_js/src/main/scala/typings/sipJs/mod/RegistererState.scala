package typings.sipJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "RegistererState")
@js.native
object RegistererState extends js.Object {
  /* "Initial" */ val Initial: typings.sipJs.registererStateMod.RegistererState.Initial with String = js.native
  /* "Registered" */ val Registered: typings.sipJs.registererStateMod.RegistererState.Registered with String = js.native
  /* "Terminated" */ val Terminated: typings.sipJs.registererStateMod.RegistererState.Terminated with String = js.native
  /* "Unregistered" */ val Unregistered: typings.sipJs.registererStateMod.RegistererState.Unregistered with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipJs.registererStateMod.RegistererState with String] = js.native
}

