package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Away extends EPersonaState
  
  @js.native
  sealed trait Busy extends EPersonaState
  
  @js.native
  sealed trait LookingToPlay extends EPersonaState
  
  @js.native
  sealed trait LookingToTrade extends EPersonaState
  
  @js.native
  sealed trait Max extends EPersonaState
  
  @js.native
  sealed trait Offline extends EPersonaState
  
  @js.native
  sealed trait Online extends EPersonaState
  
  @js.native
  sealed trait Snooze extends EPersonaState
  
  /* 3 */ val Away: typings.steamDashClient.steamDashClientMod.EPersonaState.Away with Double = js.native
  /* 2 */ val Busy: typings.steamDashClient.steamDashClientMod.EPersonaState.Busy with Double = js.native
  /* 6 */ val LookingToPlay: typings.steamDashClient.steamDashClientMod.EPersonaState.LookingToPlay with Double = js.native
  /* 5 */ val LookingToTrade: typings.steamDashClient.steamDashClientMod.EPersonaState.LookingToTrade with Double = js.native
  /* 7 */ val Max: typings.steamDashClient.steamDashClientMod.EPersonaState.Max with Double = js.native
  /* 0 */ val Offline: typings.steamDashClient.steamDashClientMod.EPersonaState.Offline with Double = js.native
  /* 1 */ val Online: typings.steamDashClient.steamDashClientMod.EPersonaState.Online with Double = js.native
  /* 4 */ val Snooze: typings.steamDashClient.steamDashClientMod.EPersonaState.Snooze with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaState with Double] = js.native
}

