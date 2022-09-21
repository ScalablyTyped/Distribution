package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends StObject
@JSImport("steam-user", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag & Double] = js.native
  
  @js.native
  sealed trait CustomExecutable
    extends StObject
       with EDepotFileFlag
  /* 128 */ val CustomExecutable: typings.steamUser.mod.EDepotFileFlag.CustomExecutable & Double = js.native
  
  @js.native
  sealed trait Directory
    extends StObject
       with EDepotFileFlag
  /* 64 */ val Directory: typings.steamUser.mod.EDepotFileFlag.Directory & Double = js.native
  
  @js.native
  sealed trait Encrypted
    extends StObject
       with EDepotFileFlag
  /* 4 */ val Encrypted: typings.steamUser.mod.EDepotFileFlag.Encrypted & Double = js.native
  
  @js.native
  sealed trait Executable
    extends StObject
       with EDepotFileFlag
  /* 32 */ val Executable: typings.steamUser.mod.EDepotFileFlag.Executable & Double = js.native
  
  @js.native
  sealed trait Hidden
    extends StObject
       with EDepotFileFlag
  /* 16 */ val Hidden: typings.steamUser.mod.EDepotFileFlag.Hidden & Double = js.native
  
  @js.native
  sealed trait InstallScript
    extends StObject
       with EDepotFileFlag
  /* 256 */ val InstallScript: typings.steamUser.mod.EDepotFileFlag.InstallScript & Double = js.native
  
  @js.native
  sealed trait ReadOnly
    extends StObject
       with EDepotFileFlag
  /* 8 */ val ReadOnly: typings.steamUser.mod.EDepotFileFlag.ReadOnly & Double = js.native
  
  @js.native
  sealed trait Symlink
    extends StObject
       with EDepotFileFlag
  /* 512 */ val Symlink: typings.steamUser.mod.EDepotFileFlag.Symlink & Double = js.native
  
  @js.native
  sealed trait UserConfig
    extends StObject
       with EDepotFileFlag
  /* 1 */ val UserConfig: typings.steamUser.mod.EDepotFileFlag.UserConfig & Double = js.native
  
  @js.native
  sealed trait VersionedUserConfig
    extends StObject
       with EDepotFileFlag
  /* 2 */ val VersionedUserConfig: typings.steamUser.mod.EDepotFileFlag.VersionedUserConfig & Double = js.native
}
