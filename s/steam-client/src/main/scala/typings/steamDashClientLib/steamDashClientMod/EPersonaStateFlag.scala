package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPersonaStateFlag extends js.Object

@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends js.Object {
  @js.native
  sealed trait ClientTypeMobile
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeTenfoot
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeVR
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait ClientTypeWeb
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
   // removed "no longer has any effect"
  @js.native
  sealed trait Golden
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait HasRichPresence
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait InJoinableGame
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
   // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait OnlineUsingBigPicture
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
   // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait OnlineUsingMobile
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
   // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait OnlineUsingVR
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
   // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait OnlineUsingWeb
    extends steamDashClientLib.steamDashClientMod.EPersonaStateFlag
  
  /* 512 */ val ClientTypeMobile: ClientTypeMobile with scala.Double = js.native
  /* 1024 */ val ClientTypeTenfoot: ClientTypeTenfoot with scala.Double = js.native
  /* 2048 */ val ClientTypeVR: ClientTypeVR with scala.Double = js.native
  /* 256 */ val ClientTypeWeb: ClientTypeWeb with scala.Double = js.native
  /* 4 */ val Golden: Golden with scala.Double = js.native
  /* 1 */ val HasRichPresence: HasRichPresence with scala.Double = js.native
  /* 2 */ val InJoinableGame: InJoinableGame with scala.Double = js.native
  /* 4096 */ val LaunchTypeGamepad: LaunchTypeGamepad with scala.Double = js.native
  /* 1024 */ val OnlineUsingBigPicture: OnlineUsingBigPicture with scala.Double = js.native
  /* 512 */ val OnlineUsingMobile: OnlineUsingMobile with scala.Double = js.native
  /* 2048 */ val OnlineUsingVR: OnlineUsingVR with scala.Double = js.native
  /* 256 */ val OnlineUsingWeb: OnlineUsingWeb with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EPersonaStateFlag with scala.Double] = js.native
}

