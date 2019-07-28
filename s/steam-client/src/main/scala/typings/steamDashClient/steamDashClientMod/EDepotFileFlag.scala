package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EDepotFileFlag extends js.Object

@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends js.Object {
  @js.native
  sealed trait CustomExecutable extends EDepotFileFlag
  
  @js.native
  sealed trait Directory extends EDepotFileFlag
  
  @js.native
  sealed trait Encrypted extends EDepotFileFlag
  
  @js.native
  sealed trait Executable extends EDepotFileFlag
  
  @js.native
  sealed trait Hidden extends EDepotFileFlag
  
  @js.native
  sealed trait InstallScript extends EDepotFileFlag
  
  @js.native
  sealed trait ReadOnly extends EDepotFileFlag
  
  @js.native
  sealed trait Symlink extends EDepotFileFlag
  
  @js.native
  sealed trait UserConfig extends EDepotFileFlag
  
  @js.native
  sealed trait VersionedUserConfig extends EDepotFileFlag
  
  /* 128 */ val CustomExecutable: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.CustomExecutable with Double = js.native
  /* 64 */ val Directory: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.Directory with Double = js.native
  /* 4 */ val Encrypted: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.Encrypted with Double = js.native
  /* 32 */ val Executable: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.Executable with Double = js.native
  /* 16 */ val Hidden: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.Hidden with Double = js.native
  /* 256 */ val InstallScript: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.InstallScript with Double = js.native
  /* 8 */ val ReadOnly: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.ReadOnly with Double = js.native
  /* 512 */ val Symlink: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.Symlink with Double = js.native
  /* 1 */ val UserConfig: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.UserConfig with Double = js.native
  /* 2 */ val VersionedUserConfig: typings.steamDashClient.steamDashClientMod.EDepotFileFlag.VersionedUserConfig with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
}

