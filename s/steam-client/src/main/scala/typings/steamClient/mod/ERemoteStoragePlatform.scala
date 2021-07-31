package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends StObject
@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ERemoteStoragePlatform
  /* -1 */ val All: typings.steamClient.mod.ERemoteStoragePlatform.All & Double = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with ERemoteStoragePlatform
  /* 8 */ val Linux: typings.steamClient.mod.ERemoteStoragePlatform.Linux & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ERemoteStoragePlatform
  /* 0 */ val None: typings.steamClient.mod.ERemoteStoragePlatform.None & Double = js.native
  
  @js.native
  sealed trait OSX
    extends StObject
       with ERemoteStoragePlatform
  /* 2 */ val OSX: typings.steamClient.mod.ERemoteStoragePlatform.OSX & Double = js.native
  
  @js.native
  sealed trait PS3
    extends StObject
       with ERemoteStoragePlatform
  /* 4 */ val PS3: typings.steamClient.mod.ERemoteStoragePlatform.PS3 & Double = js.native
  
  @js.native
  sealed trait Reserved1
    extends StObject
       with ERemoteStoragePlatform
  /* 8 */ val Reserved1: typings.steamClient.mod.ERemoteStoragePlatform.Reserved1 & Double = js.native
  
  // removed
  @js.native
  sealed trait Reserved2
    extends StObject
       with ERemoteStoragePlatform
  /* 16 */ val Reserved2: typings.steamClient.mod.ERemoteStoragePlatform.Reserved2 & Double = js.native
  
  @js.native
  sealed trait Windows
    extends StObject
       with ERemoteStoragePlatform
  /* 1 */ val Windows: typings.steamClient.mod.ERemoteStoragePlatform.Windows & Double = js.native
}
