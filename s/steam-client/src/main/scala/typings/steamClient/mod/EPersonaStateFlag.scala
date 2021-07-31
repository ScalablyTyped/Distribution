package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends StObject
@JSImport("steam-client", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag & Double] = js.native
  
  // removed "renamed to ClientTypeMobile"
  @js.native
  sealed trait ClientTypeMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val ClientTypeMobile: typings.steamClient.mod.EPersonaStateFlag.ClientTypeMobile & Double = js.native
  
  // removed "renamed to ClientTypeTenfoot"
  @js.native
  sealed trait ClientTypeTenfoot
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typings.steamClient.mod.EPersonaStateFlag.ClientTypeTenfoot & Double = js.native
  
  // removed "renamed to ClientTypeVR"
  @js.native
  sealed trait ClientTypeVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val ClientTypeVR: typings.steamClient.mod.EPersonaStateFlag.ClientTypeVR & Double = js.native
  
  // removed "renamed to ClientTypeWeb"
  @js.native
  sealed trait ClientTypeWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val ClientTypeWeb: typings.steamClient.mod.EPersonaStateFlag.ClientTypeWeb & Double = js.native
  
  @js.native
  sealed trait Golden
    extends StObject
       with EPersonaStateFlag
  /* 4 */ val Golden: typings.steamClient.mod.EPersonaStateFlag.Golden & Double = js.native
  
  @js.native
  sealed trait HasRichPresence
    extends StObject
       with EPersonaStateFlag
  /* 1 */ val HasRichPresence: typings.steamClient.mod.EPersonaStateFlag.HasRichPresence & Double = js.native
  
  @js.native
  sealed trait InJoinableGame
    extends StObject
       with EPersonaStateFlag
  /* 2 */ val InJoinableGame: typings.steamClient.mod.EPersonaStateFlag.InJoinableGame & Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends StObject
       with EPersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typings.steamClient.mod.EPersonaStateFlag.LaunchTypeGamepad & Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typings.steamClient.mod.EPersonaStateFlag.OnlineUsingBigPicture & Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typings.steamClient.mod.EPersonaStateFlag.OnlineUsingMobile & Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typings.steamClient.mod.EPersonaStateFlag.OnlineUsingVR & Double = js.native
  
  // removed "no longer has any effect"
  @js.native
  sealed trait OnlineUsingWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typings.steamClient.mod.EPersonaStateFlag.OnlineUsingWeb & Double = js.native
}
