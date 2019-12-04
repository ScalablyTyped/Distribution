package typings.sipDotJs.libApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api", "RegistererState")
@js.native
object RegistererState extends js.Object {
  /* "Initial" */ val Initial: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Initial with String = js.native
  /* "Registered" */ val Registered: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Registered with String = js.native
  /* "Terminated" */ val Terminated: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Terminated with String = js.native
  /* "Unregistered" */ val Unregistered: typings.sipDotJs.libApiRegistererDashStateMod.RegistererState.Unregistered with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.sipDotJs.libApiRegistererDashStateMod.RegistererState with String] = js.native
}

