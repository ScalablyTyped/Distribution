package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag with Double] = js.native
  /* 512 */ @js.native
  object ClientTypeMobile extends TopLevel[ClientTypeMobile with Double]
  
  /* 1024 */ @js.native
  object ClientTypeTenfoot extends TopLevel[ClientTypeTenfoot with Double]
  
  /* 2048 */ @js.native
  object ClientTypeVR extends TopLevel[ClientTypeVR with Double]
  
  /* 256 */ @js.native
  object ClientTypeWeb extends TopLevel[ClientTypeWeb with Double]
  
  /* 4 */ @js.native
  object Golden extends TopLevel[Golden with Double]
  
  /* 1 */ @js.native
  object HasRichPresence extends TopLevel[HasRichPresence with Double]
  
  /* 2 */ @js.native
  object InJoinableGame extends TopLevel[InJoinableGame with Double]
  
  /* 4096 */ @js.native
  object LaunchTypeGamepad extends TopLevel[LaunchTypeGamepad with Double]
  
  /* 1024 */ @js.native
  object OnlineUsingBigPicture extends TopLevel[OnlineUsingBigPicture with Double]
  
  /* 512 */ @js.native
  object OnlineUsingMobile extends TopLevel[OnlineUsingMobile with Double]
  
  /* 2048 */ @js.native
  object OnlineUsingVR extends TopLevel[OnlineUsingVR with Double]
  
  /* 256 */ @js.native
  object OnlineUsingWeb extends TopLevel[OnlineUsingWeb with Double]
  
}

