package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
  /* 128 */ @js.native
  object CustomExecutable extends TopLevel[CustomExecutable with Double]
  
  /* 64 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  /* 4 */ @js.native
  object Encrypted extends TopLevel[Encrypted with Double]
  
  /* 32 */ @js.native
  object Executable extends TopLevel[Executable with Double]
  
  /* 16 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  /* 256 */ @js.native
  object InstallScript extends TopLevel[InstallScript with Double]
  
  /* 8 */ @js.native
  object ReadOnly extends TopLevel[ReadOnly with Double]
  
  /* 512 */ @js.native
  object Symlink extends TopLevel[Symlink with Double]
  
  /* 1 */ @js.native
  object UserConfig extends TopLevel[UserConfig with Double]
  
  /* 2 */ @js.native
  object VersionedUserConfig extends TopLevel[VersionedUserConfig with Double]
  
}

