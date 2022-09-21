package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EInternalAccountType extends StObject
@JSImport("steam-user", "EInternalAccountType")
@js.native
object EInternalAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EInternalAccountType & Double] = js.native
  
  @js.native
  sealed trait k_EInternalAppType
    extends StObject
       with EInternalAccountType
  /* 3 */ val k_EInternalAppType: typings.steamUser.mod.EInternalAccountType.k_EInternalAppType & Double = js.native
  
  @js.native
  sealed trait k_EInternalBroadcastChannelType
    extends StObject
       with EInternalAccountType
  /* 4 */ val k_EInternalBroadcastChannelType: typings.steamUser.mod.EInternalAccountType.k_EInternalBroadcastChannelType & Double = js.native
  
  @js.native
  sealed trait k_EInternalClanType
    extends StObject
       with EInternalAccountType
  /* 2 */ val k_EInternalClanType: typings.steamUser.mod.EInternalAccountType.k_EInternalClanType & Double = js.native
  
  @js.native
  sealed trait k_EInternalSteamAccountType
    extends StObject
       with EInternalAccountType
  /* 1 */ val k_EInternalSteamAccountType: typings.steamUser.mod.EInternalAccountType.k_EInternalSteamAccountType & Double = js.native
}
