package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends StObject
@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform with Double] = js.native
  
  @js.native
  sealed trait All extends ERemoteStoragePlatform
  /* -1 */ val All: typings.steamClient.mod.ERemoteStoragePlatform.All with Double = js.native
  
  @js.native
  sealed trait Linux extends ERemoteStoragePlatform
  /* 8 */ val Linux: typings.steamClient.mod.ERemoteStoragePlatform.Linux with Double = js.native
  
  @js.native
  sealed trait None extends ERemoteStoragePlatform
  /* 0 */ val None: typings.steamClient.mod.ERemoteStoragePlatform.None with Double = js.native
  
  @js.native
  sealed trait OSX extends ERemoteStoragePlatform
  /* 2 */ val OSX: typings.steamClient.mod.ERemoteStoragePlatform.OSX with Double = js.native
  
  @js.native
  sealed trait PS3 extends ERemoteStoragePlatform
  /* 4 */ val PS3: typings.steamClient.mod.ERemoteStoragePlatform.PS3 with Double = js.native
  
  @js.native
  sealed trait Reserved1 extends ERemoteStoragePlatform
  /* 8 */ val Reserved1: typings.steamClient.mod.ERemoteStoragePlatform.Reserved1 with Double = js.native
  
  // removed
  @js.native
  sealed trait Reserved2 extends ERemoteStoragePlatform
  /* 16 */ val Reserved2: typings.steamClient.mod.ERemoteStoragePlatform.Reserved2 with Double = js.native
  
  @js.native
  sealed trait Windows extends ERemoteStoragePlatform
  /* 1 */ val Windows: typings.steamClient.mod.ERemoteStoragePlatform.Windows with Double = js.native
}
