package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDepotFileFlag extends js.Object
@JSImport("steam-client", "EDepotFileFlag")
@js.native
object EDepotFileFlag extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDepotFileFlag with Double] = js.native
  
  @js.native
  sealed trait CustomExecutable extends EDepotFileFlag
  /* 128 */ @js.native
  object CustomExecutable extends TopLevel[CustomExecutable with Double]
  
  @js.native
  sealed trait Directory extends EDepotFileFlag
  /* 64 */ @js.native
  object Directory extends TopLevel[Directory with Double]
  
  @js.native
  sealed trait Encrypted extends EDepotFileFlag
  /* 4 */ @js.native
  object Encrypted extends TopLevel[Encrypted with Double]
  
  @js.native
  sealed trait Executable extends EDepotFileFlag
  /* 32 */ @js.native
  object Executable extends TopLevel[Executable with Double]
  
  @js.native
  sealed trait Hidden extends EDepotFileFlag
  /* 16 */ @js.native
  object Hidden extends TopLevel[Hidden with Double]
  
  @js.native
  sealed trait InstallScript extends EDepotFileFlag
  /* 256 */ @js.native
  object InstallScript extends TopLevel[InstallScript with Double]
  
  @js.native
  sealed trait ReadOnly extends EDepotFileFlag
  /* 8 */ @js.native
  object ReadOnly extends TopLevel[ReadOnly with Double]
  
  @js.native
  sealed trait Symlink extends EDepotFileFlag
  /* 512 */ @js.native
  object Symlink extends TopLevel[Symlink with Double]
  
  @js.native
  sealed trait UserConfig extends EDepotFileFlag
  /* 1 */ @js.native
  object UserConfig extends TopLevel[UserConfig with Double]
  
  @js.native
  sealed trait VersionedUserConfig extends EDepotFileFlag
  /* 2 */ @js.native
  object VersionedUserConfig extends TopLevel[VersionedUserConfig with Double]
}
