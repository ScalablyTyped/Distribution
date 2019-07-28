package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EUCMFilePrivacyState extends js.Object

@JSImport("steam-client", "EUCMFilePrivacyState")
@js.native
object EUCMFilePrivacyState extends js.Object {
   // 14
  @js.native
  sealed trait All extends EUCMFilePrivacyState
  
  @js.native
  sealed trait FriendsOnly extends EUCMFilePrivacyState
  
  @js.native
  sealed trait Invalid extends EUCMFilePrivacyState
  
  @js.native
  sealed trait Private extends EUCMFilePrivacyState
  
  @js.native
  sealed trait Public extends EUCMFilePrivacyState
  
  /* 8 | 4 | 2 */ val All: typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.All with Double = js.native
  /* 4 */ val FriendsOnly: typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.FriendsOnly with Double = js.native
  /* -1 */ val Invalid: typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Invalid with Double = js.native
  /* 2 */ val Private: typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Private with Double = js.native
  /* 8 */ val Public: typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Public with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState with Double] = js.native
}

