package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends js.Object
@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag with Double] = js.native
  
  @js.native
  sealed trait ClientTypeMobile extends EPersonaStateFlag
  /* 512 */ @js.native
  object ClientTypeMobile extends TopLevel[ClientTypeMobile with Double]
  
  @js.native
  sealed trait ClientTypeTenfoot extends EPersonaStateFlag
  /* 1024 */ @js.native
  object ClientTypeTenfoot extends TopLevel[ClientTypeTenfoot with Double]
  
  @js.native
  sealed trait ClientTypeVR extends EPersonaStateFlag
  /* 2048 */ @js.native
  object ClientTypeVR extends TopLevel[ClientTypeVR with Double]
  
  @js.native
  sealed trait ClientTypeWeb extends EPersonaStateFlag
  /* 256 */ @js.native
  object ClientTypeWeb extends TopLevel[ClientTypeWeb with Double]
  
   // removed "no longer has any effect"
  @js.native
  sealed trait Golden extends EPersonaStateFlag
  /* 4 */ @js.native
  object Golden extends TopLevel[Golden with Double]
  
  @js.native
  sealed trait HasRichPresence extends EPersonaStateFlag
  /* 1 */ @js.native
  object HasRichPresence extends TopLevel[HasRichPresence with Double]
  
  @js.native
  sealed trait InJoinableGame extends EPersonaStateFlag
  /* 2 */ @js.native
  object InJoinableGame extends TopLevel[InJoinableGame with Double]
  
  @js.native
  sealed trait LaunchTypeGamepad extends EPersonaStateFlag
  /* 4096 */ @js.native
  object LaunchTypeGamepad extends TopLevel[LaunchTypeGamepad with Double]
  
   // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait OnlineUsingBigPicture extends EPersonaStateFlag
  /* 1024 */ @js.native
  object OnlineUsingBigPicture extends TopLevel[OnlineUsingBigPicture with Double]
  
   // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait OnlineUsingMobile extends EPersonaStateFlag
  /* 512 */ @js.native
  object OnlineUsingMobile extends TopLevel[OnlineUsingMobile with Double]
  
   // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait OnlineUsingVR extends EPersonaStateFlag
  /* 2048 */ @js.native
  object OnlineUsingVR extends TopLevel[OnlineUsingVR with Double]
  
   // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait OnlineUsingWeb extends EPersonaStateFlag
  /* 256 */ @js.native
  object OnlineUsingWeb extends TopLevel[OnlineUsingWeb with Double]
}
