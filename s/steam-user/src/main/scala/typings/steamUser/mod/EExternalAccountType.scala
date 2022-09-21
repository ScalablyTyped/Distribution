package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EExternalAccountType extends StObject
@JSImport("steam-user", "EExternalAccountType")
@js.native
object EExternalAccountType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EExternalAccountType & Double] = js.native
  
  @js.native
  sealed trait k_EExternalFacebookAccount
    extends StObject
       with EExternalAccountType
  /* 3 */ val k_EExternalFacebookAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalFacebookAccount & Double = js.native
  
  @js.native
  sealed trait k_EExternalFacebookPage
    extends StObject
       with EExternalAccountType
  /* 7 */ val k_EExternalFacebookPage: typings.steamUser.mod.EExternalAccountType.k_EExternalFacebookPage & Double = js.native
  
  @js.native
  sealed trait k_EExternalGoogleAccount
    extends StObject
       with EExternalAccountType
  /* 2 */ val k_EExternalGoogleAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalGoogleAccount & Double = js.native
  
  @js.native
  sealed trait k_EExternalNone
    extends StObject
       with EExternalAccountType
  /* 0 */ val k_EExternalNone: typings.steamUser.mod.EExternalAccountType.k_EExternalNone & Double = js.native
  
  @js.native
  sealed trait k_EExternalSteamAccount
    extends StObject
       with EExternalAccountType
  /* 1 */ val k_EExternalSteamAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalSteamAccount & Double = js.native
  
  @js.native
  sealed trait k_EExternalTwitchAccount
    extends StObject
       with EExternalAccountType
  /* 5 */ val k_EExternalTwitchAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalTwitchAccount & Double = js.native
  
  @js.native
  sealed trait k_EExternalTwitterAccount
    extends StObject
       with EExternalAccountType
  /* 4 */ val k_EExternalTwitterAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalTwitterAccount & Double = js.native
  
  @js.native
  sealed trait k_EExternalYouTubeChannelAccount
    extends StObject
       with EExternalAccountType
  /* 6 */ val k_EExternalYouTubeChannelAccount: typings.steamUser.mod.EExternalAccountType.k_EExternalYouTubeChannelAccount & Double = js.native
}
