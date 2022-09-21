package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ESteamNetworkingSocketsCipher extends StObject
@JSImport("steam-user", "ESteamNetworkingSocketsCipher")
@js.native
object ESteamNetworkingSocketsCipher extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ESteamNetworkingSocketsCipher & Double] = js.native
  
  @js.native
  sealed trait AES_256_GCM
    extends StObject
       with ESteamNetworkingSocketsCipher
  /* 2 */ val AES_256_GCM: typings.steamUser.mod.ESteamNetworkingSocketsCipher.AES_256_GCM & Double = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with ESteamNetworkingSocketsCipher
  /* 0 */ val INVALID: typings.steamUser.mod.ESteamNetworkingSocketsCipher.INVALID & Double = js.native
  
  @js.native
  sealed trait NULL
    extends StObject
       with ESteamNetworkingSocketsCipher
  /* 1 */ val NULL: typings.steamUser.mod.ESteamNetworkingSocketsCipher.NULL & Double = js.native
}
