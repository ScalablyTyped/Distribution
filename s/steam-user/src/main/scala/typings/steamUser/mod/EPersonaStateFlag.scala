package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPersonaStateFlag extends StObject
@JSImport("steam-user", "EPersonaStateFlag")
@js.native
object EPersonaStateFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPersonaStateFlag & Double] = js.native
  
  @js.native
  sealed trait ClientTypeMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val ClientTypeMobile: typings.steamUser.mod.EPersonaStateFlag.ClientTypeMobile & Double = js.native
  
  @js.native
  sealed trait ClientTypeTenfoot
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val ClientTypeTenfoot: typings.steamUser.mod.EPersonaStateFlag.ClientTypeTenfoot & Double = js.native
  
  @js.native
  sealed trait ClientTypeVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val ClientTypeVR: typings.steamUser.mod.EPersonaStateFlag.ClientTypeVR & Double = js.native
  
  @js.native
  sealed trait ClientTypeWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val ClientTypeWeb: typings.steamUser.mod.EPersonaStateFlag.ClientTypeWeb & Double = js.native
  
  @js.native
  sealed trait Golden
    extends StObject
       with EPersonaStateFlag
  /* 4 */ val Golden: typings.steamUser.mod.EPersonaStateFlag.Golden & Double = js.native
  
  @js.native
  sealed trait HasRichPresence
    extends StObject
       with EPersonaStateFlag
  /* 1 */ val HasRichPresence: typings.steamUser.mod.EPersonaStateFlag.HasRichPresence & Double = js.native
  
  @js.native
  sealed trait InJoinableGame
    extends StObject
       with EPersonaStateFlag
  /* 2 */ val InJoinableGame: typings.steamUser.mod.EPersonaStateFlag.InJoinableGame & Double = js.native
  
  @js.native
  sealed trait LaunchTypeCompatTool
    extends StObject
       with EPersonaStateFlag
  /* 8192 */ val LaunchTypeCompatTool: typings.steamUser.mod.EPersonaStateFlag.LaunchTypeCompatTool & Double = js.native
  
  @js.native
  sealed trait LaunchTypeGamepad
    extends StObject
       with EPersonaStateFlag
  /* 4096 */ val LaunchTypeGamepad: typings.steamUser.mod.EPersonaStateFlag.LaunchTypeGamepad & Double = js.native
  
  @js.native
  sealed trait OnlineUsingBigPicture
    extends StObject
       with EPersonaStateFlag
  /* 1024 */ val OnlineUsingBigPicture: typings.steamUser.mod.EPersonaStateFlag.OnlineUsingBigPicture & Double = js.native
  
  @js.native
  sealed trait OnlineUsingMobile
    extends StObject
       with EPersonaStateFlag
  /* 512 */ val OnlineUsingMobile: typings.steamUser.mod.EPersonaStateFlag.OnlineUsingMobile & Double = js.native
  
  @js.native
  sealed trait OnlineUsingVR
    extends StObject
       with EPersonaStateFlag
  /* 2048 */ val OnlineUsingVR: typings.steamUser.mod.EPersonaStateFlag.OnlineUsingVR & Double = js.native
  
  @js.native
  sealed trait OnlineUsingWeb
    extends StObject
       with EPersonaStateFlag
  /* 256 */ val OnlineUsingWeb: typings.steamUser.mod.EPersonaStateFlag.OnlineUsingWeb & Double = js.native
  
  @js.native
  sealed trait RemotePlayTogether
    extends StObject
       with EPersonaStateFlag
  /* 8 */ val RemotePlayTogether: typings.steamUser.mod.EPersonaStateFlag.RemotePlayTogether & Double = js.native
}
