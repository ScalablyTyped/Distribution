package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends StObject
@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
  
  @js.native
  sealed trait CustomExecutable extends EDepotFileFlag
  /* 128 */ val CustomExecutable: typings.steamClient.mod.EDepotFileFlag.CustomExecutable with Double = js.native
  
  @js.native
  sealed trait Directory extends EDepotFileFlag
  /* 64 */ val Directory: typings.steamClient.mod.EDepotFileFlag.Directory with Double = js.native
  
  @js.native
  sealed trait Encrypted extends EDepotFileFlag
  /* 4 */ val Encrypted: typings.steamClient.mod.EDepotFileFlag.Encrypted with Double = js.native
  
  @js.native
  sealed trait Executable extends EDepotFileFlag
  /* 32 */ val Executable: typings.steamClient.mod.EDepotFileFlag.Executable with Double = js.native
  
  @js.native
  sealed trait Hidden extends EDepotFileFlag
  /* 16 */ val Hidden: typings.steamClient.mod.EDepotFileFlag.Hidden with Double = js.native
  
  @js.native
  sealed trait InstallScript extends EDepotFileFlag
  /* 256 */ val InstallScript: typings.steamClient.mod.EDepotFileFlag.InstallScript with Double = js.native
  
  @js.native
  sealed trait ReadOnly extends EDepotFileFlag
  /* 8 */ val ReadOnly: typings.steamClient.mod.EDepotFileFlag.ReadOnly with Double = js.native
  
  @js.native
  sealed trait Symlink extends EDepotFileFlag
  /* 512 */ val Symlink: typings.steamClient.mod.EDepotFileFlag.Symlink with Double = js.native
  
  @js.native
  sealed trait UserConfig extends EDepotFileFlag
  /* 1 */ val UserConfig: typings.steamClient.mod.EDepotFileFlag.UserConfig with Double = js.native
  
  @js.native
  sealed trait VersionedUserConfig extends EDepotFileFlag
  /* 2 */ val VersionedUserConfig: typings.steamClient.mod.EDepotFileFlag.VersionedUserConfig with Double = js.native
}
