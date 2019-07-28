package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EChatInfoType extends js.Object

@JSImport("steam-client", "EChatInfoType")
@js.native
object EChatInfoType extends js.Object {
  @js.native
  sealed trait InfoUpdate extends EChatInfoType
  
  @js.native
  sealed trait MemberLimitChange extends EChatInfoType
  
  @js.native
  sealed trait StateChange extends EChatInfoType
  
  /* 2 */ val InfoUpdate: typings.steamDashClient.steamDashClientMod.EChatInfoType.InfoUpdate with Double = js.native
  /* 3 */ val MemberLimitChange: typings.steamDashClient.steamDashClientMod.EChatInfoType.MemberLimitChange with Double = js.native
  /* 1 */ val StateChange: typings.steamDashClient.steamDashClientMod.EChatInfoType.StateChange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatInfoType with Double] = js.native
}

