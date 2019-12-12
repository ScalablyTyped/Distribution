package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EChatInfoType.InfoUpdate
import typings.steamDashClient.steamDashClientMod.EChatInfoType.MemberLimitChange
import typings.steamDashClient.steamDashClientMod.EChatInfoType.StateChange
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EChatInfoType with Double] = js.native
  /* 2 */ @js.native
  object InfoUpdate extends TopLevel[InfoUpdate with Double]
  
  /* 3 */ @js.native
  object MemberLimitChange extends TopLevel[MemberLimitChange with Double]
  
  /* 1 */ @js.native
  object StateChange extends TopLevel[StateChange with Double]
  
}

