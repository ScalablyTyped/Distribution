package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatInfoType extends js.Object

@JSImport("steam-client", "EChatInfoType")
@js.native
object EChatInfoType extends js.Object {
  @js.native
  sealed trait InfoUpdate
    extends steamDashClientLib.steamDashClientMod.EChatInfoType
  
  @js.native
  sealed trait MemberLimitChange
    extends steamDashClientLib.steamDashClientMod.EChatInfoType
  
  @js.native
  sealed trait StateChange
    extends steamDashClientLib.steamDashClientMod.EChatInfoType
  
  /* 2 */ val InfoUpdate: InfoUpdate with scala.Double = js.native
  /* 3 */ val MemberLimitChange: MemberLimitChange with scala.Double = js.native
  /* 1 */ val StateChange: StateChange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EChatInfoType with scala.Double] = js.native
}

