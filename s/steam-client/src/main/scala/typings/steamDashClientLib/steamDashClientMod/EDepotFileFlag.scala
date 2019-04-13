package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepotFileFlag extends js.Object

@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends js.Object {
  @js.native
  sealed trait CustomExecutable
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait Directory
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait Encrypted
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait Executable
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait Hidden
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait InstallScript
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait ReadOnly
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait Symlink
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait UserConfig
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  @js.native
  sealed trait VersionedUserConfig
    extends steamDashClientLib.steamDashClientMod.EDepotFileFlag
  
  /* 128 */ val CustomExecutable: CustomExecutable with scala.Double = js.native
  /* 64 */ val Directory: Directory with scala.Double = js.native
  /* 4 */ val Encrypted: Encrypted with scala.Double = js.native
  /* 32 */ val Executable: Executable with scala.Double = js.native
  /* 16 */ val Hidden: Hidden with scala.Double = js.native
  /* 256 */ val InstallScript: InstallScript with scala.Double = js.native
  /* 8 */ val ReadOnly: ReadOnly with scala.Double = js.native
  /* 512 */ val Symlink: Symlink with scala.Double = js.native
  /* 1 */ val UserConfig: UserConfig with scala.Double = js.native
  /* 2 */ val VersionedUserConfig: VersionedUserConfig with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EDepotFileFlag with scala.Double] = js.native
}

