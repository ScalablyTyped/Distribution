package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends StObject
@JSImport("steam-user", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with ERemoteStoragePlatform
  /* -1 */ val All: typings.steamUser.mod.ERemoteStoragePlatform.All & Double = js.native
  
  @js.native
  sealed trait Android
    extends StObject
       with ERemoteStoragePlatform
  /* 32 */ val Android: typings.steamUser.mod.ERemoteStoragePlatform.Android & Double = js.native
  
  @js.native
  sealed trait IPhoneOS
    extends StObject
       with ERemoteStoragePlatform
  /* 64 */ val IPhoneOS: typings.steamUser.mod.ERemoteStoragePlatform.IPhoneOS & Double = js.native
  
  @js.native
  sealed trait Linux
    extends StObject
       with ERemoteStoragePlatform
  /* 8 */ val Linux: typings.steamUser.mod.ERemoteStoragePlatform.Linux & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ERemoteStoragePlatform
  /* 0 */ val None: typings.steamUser.mod.ERemoteStoragePlatform.None & Double = js.native
  
  @js.native
  sealed trait OSX
    extends StObject
       with ERemoteStoragePlatform
  /* 2 */ val OSX: typings.steamUser.mod.ERemoteStoragePlatform.OSX & Double = js.native
  
  @js.native
  sealed trait PS3
    extends StObject
       with ERemoteStoragePlatform
  /* 4 */ val PS3: typings.steamUser.mod.ERemoteStoragePlatform.PS3 & Double = js.native
  
  @js.native
  sealed trait Switch
    extends StObject
       with ERemoteStoragePlatform
  /* 16 */ val Switch: typings.steamUser.mod.ERemoteStoragePlatform.Switch & Double = js.native
  
  @js.native
  sealed trait Windows
    extends StObject
       with ERemoteStoragePlatform
  /* 1 */ val Windows: typings.steamUser.mod.ERemoteStoragePlatform.Windows & Double = js.native
}
