package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends StObject
@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag & Double] = js.native
  
  @js.native
  sealed trait CustomExecutable
    extends StObject
       with EDepotFileFlag
  /* 128 */ val CustomExecutable: typings.steamClient.mod.EDepotFileFlag.CustomExecutable & Double = js.native
  
  @js.native
  sealed trait Directory
    extends StObject
       with EDepotFileFlag
  /* 64 */ val Directory: typings.steamClient.mod.EDepotFileFlag.Directory & Double = js.native
  
  @js.native
  sealed trait Encrypted
    extends StObject
       with EDepotFileFlag
  /* 4 */ val Encrypted: typings.steamClient.mod.EDepotFileFlag.Encrypted & Double = js.native
  
  @js.native
  sealed trait Executable
    extends StObject
       with EDepotFileFlag
  /* 32 */ val Executable: typings.steamClient.mod.EDepotFileFlag.Executable & Double = js.native
  
  @js.native
  sealed trait Hidden
    extends StObject
       with EDepotFileFlag
  /* 16 */ val Hidden: typings.steamClient.mod.EDepotFileFlag.Hidden & Double = js.native
  
  @js.native
  sealed trait InstallScript
    extends StObject
       with EDepotFileFlag
  /* 256 */ val InstallScript: typings.steamClient.mod.EDepotFileFlag.InstallScript & Double = js.native
  
  @js.native
  sealed trait ReadOnly
    extends StObject
       with EDepotFileFlag
  /* 8 */ val ReadOnly: typings.steamClient.mod.EDepotFileFlag.ReadOnly & Double = js.native
  
  @js.native
  sealed trait Symlink
    extends StObject
       with EDepotFileFlag
  /* 512 */ val Symlink: typings.steamClient.mod.EDepotFileFlag.Symlink & Double = js.native
  
  @js.native
  sealed trait UserConfig
    extends StObject
       with EDepotFileFlag
  /* 1 */ val UserConfig: typings.steamClient.mod.EDepotFileFlag.UserConfig & Double = js.native
  
  @js.native
  sealed trait VersionedUserConfig
    extends StObject
       with EDepotFileFlag
  /* 2 */ val VersionedUserConfig: typings.steamClient.mod.EDepotFileFlag.VersionedUserConfig & Double = js.native
}
