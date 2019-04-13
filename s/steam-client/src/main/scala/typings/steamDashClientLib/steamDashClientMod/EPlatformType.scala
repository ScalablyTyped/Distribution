package typings
package steamDashClientLib.steamDashClientMod

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
  sealed trait Linux
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Linux32
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Linux64
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait OSX
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait PS3
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Unknown
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Win32
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  @js.native
  sealed trait Win64
    extends steamDashClientLib.steamDashClientMod.EPlatformType
  
  /* 3 */ val Linux: Linux with scala.Double = js.native
  /* 6 */ val Linux32: Linux32 with scala.Double = js.native
  /* 3 */ val Linux64: Linux64 with scala.Double = js.native
  /* 6 */ val Max: Max with scala.Double = js.native
  /* 4 */ val OSX: OSX with scala.Double = js.native
  /* 5 */ val PS3: PS3 with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 1 */ val Win32: Win32 with scala.Double = js.native
  /* 2 */ val Win64: Win64 with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EPlatformType with scala.Double] = js.native
}

