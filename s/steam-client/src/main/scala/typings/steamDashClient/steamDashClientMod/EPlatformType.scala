package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPlatformType extends js.Object

@JSImport("steam-client", "EPlatformType")
@js.native
object EPlatformType extends js.Object {
   // removed "split to Linux64 and Linux32"
  @js.native
  sealed trait Linux extends EPlatformType
  
  @js.native
  sealed trait Linux32 extends EPlatformType
  
  @js.native
  sealed trait Linux64 extends EPlatformType
  
  @js.native
  sealed trait Max extends EPlatformType
  
  @js.native
  sealed trait OSX extends EPlatformType
  
  @js.native
  sealed trait PS3 extends EPlatformType
  
  @js.native
  sealed trait Unknown extends EPlatformType
  
  @js.native
  sealed trait Win32 extends EPlatformType
  
  @js.native
  sealed trait Win64 extends EPlatformType
  
  /* 3 */ val Linux: typings.steamDashClient.steamDashClientMod.EPlatformType.Linux with Double = js.native
  /* 6 */ val Linux32: typings.steamDashClient.steamDashClientMod.EPlatformType.Linux32 with Double = js.native
  /* 3 */ val Linux64: typings.steamDashClient.steamDashClientMod.EPlatformType.Linux64 with Double = js.native
  /* 6 */ val Max: typings.steamDashClient.steamDashClientMod.EPlatformType.Max with Double = js.native
  /* 4 */ val OSX: typings.steamDashClient.steamDashClientMod.EPlatformType.OSX with Double = js.native
  /* 5 */ val PS3: typings.steamDashClient.steamDashClientMod.EPlatformType.PS3 with Double = js.native
  /* 0 */ val Unknown: typings.steamDashClient.steamDashClientMod.EPlatformType.Unknown with Double = js.native
  /* 1 */ val Win32: typings.steamDashClient.steamDashClientMod.EPlatformType.Win32 with Double = js.native
  /* 2 */ val Win64: typings.steamDashClient.steamDashClientMod.EPlatformType.Win64 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPlatformType with Double] = js.native
}

