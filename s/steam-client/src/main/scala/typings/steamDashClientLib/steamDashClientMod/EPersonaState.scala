package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaState extends js.Object

@JSImport("steam-client", "EPersonaState")
@js.native
object EPersonaState extends js.Object {
  @js.native
  sealed trait Away
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait Busy
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait LookingToPlay
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait LookingToTrade
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait Offline
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait Online
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  @js.native
  sealed trait Snooze
    extends steamDashClientLib.steamDashClientMod.EPersonaState
  
  /* 3 */ val Away: Away with scala.Double = js.native
  /* 2 */ val Busy: Busy with scala.Double = js.native
  /* 6 */ val LookingToPlay: LookingToPlay with scala.Double = js.native
  /* 5 */ val LookingToTrade: LookingToTrade with scala.Double = js.native
  /* 7 */ val Max: Max with scala.Double = js.native
  /* 0 */ val Offline: Offline with scala.Double = js.native
  /* 1 */ val Online: Online with scala.Double = js.native
  /* 4 */ val Snooze: Snooze with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EPersonaState with scala.Double] = js.native
}

