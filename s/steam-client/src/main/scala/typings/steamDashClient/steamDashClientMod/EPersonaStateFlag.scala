package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaStateFlag extends js.Object

@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends js.Object {
  @js.native
  sealed trait ClientTypeMobile extends EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeTenfoot extends EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeVR extends EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeWeb extends EPersonaStateFlag
  
   // removed "no longer has any effect"
  @js.native
  sealed trait Golden extends EPersonaStateFlag
  
  @js.native
  sealed trait HasRichPresence extends EPersonaStateFlag
  
  @js.native
  sealed trait InJoinableGame extends EPersonaStateFlag
  
  @js.native
  sealed trait LaunchTypeGamepad extends EPersonaStateFlag
  
   // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait OnlineUsingBigPicture extends EPersonaStateFlag
  
   // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait OnlineUsingMobile extends EPersonaStateFlag
  
   // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait OnlineUsingVR extends EPersonaStateFlag
  
   // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait OnlineUsingWeb extends EPersonaStateFlag
  
  /* 512 */ val ClientTypeMobile: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.ClientTypeMobile with Double = js.native
  /* 1024 */ val ClientTypeTenfoot: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.ClientTypeTenfoot with Double = js.native
  /* 2048 */ val ClientTypeVR: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.ClientTypeVR with Double = js.native
  /* 256 */ val ClientTypeWeb: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.ClientTypeWeb with Double = js.native
  /* 4 */ val Golden: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.Golden with Double = js.native
  /* 1 */ val HasRichPresence: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.HasRichPresence with Double = js.native
  /* 2 */ val InJoinableGame: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.InJoinableGame with Double = js.native
  /* 4096 */ val LaunchTypeGamepad: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.LaunchTypeGamepad with Double = js.native
  /* 1024 */ val OnlineUsingBigPicture: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.OnlineUsingBigPicture with Double = js.native
  /* 512 */ val OnlineUsingMobile: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.OnlineUsingMobile with Double = js.native
  /* 2048 */ val OnlineUsingVR: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.OnlineUsingVR with Double = js.native
  /* 256 */ val OnlineUsingWeb: typings.steamDashClient.steamDashClientMod.EPersonaStateFlag.OnlineUsingWeb with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag with Double] = js.native
}

