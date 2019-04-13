package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERemoteStoragePlatform extends js.Object

@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends js.Object {
  @js.native
  sealed trait All
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait Linux
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait None
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait OSX
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait PS3
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
   // removed
  @js.native
  sealed trait Reserved1
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait Reserved2
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  @js.native
  sealed trait Windows
    extends steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform
  
  /* -1 */ val All: All with scala.Double = js.native
  /* 8 */ val Linux: Linux with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val OSX: OSX with scala.Double = js.native
  /* 4 */ val PS3: PS3 with scala.Double = js.native
  /* 8 */ val Reserved1: Reserved1 with scala.Double = js.native
  /* 16 */ val Reserved2: Reserved2 with scala.Double = js.native
  /* 1 */ val Windows: Windows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.ERemoteStoragePlatform with scala.Double] = js.native
}

