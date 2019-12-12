package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.All
import typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.FriendsOnly
import typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Invalid
import typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Private
import typings.steamDashClient.steamDashClientMod.EUCMFilePrivacyState.Public
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EUCMFilePrivacyState with Double] = js.native
  /* 8 | 4 | 2 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 4 */ @js.native
  object FriendsOnly extends TopLevel[FriendsOnly with Double]
  
  /* -1 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 2 */ @js.native
  object Private extends TopLevel[Private with Double]
  
  /* 8 */ @js.native
  object Public extends TopLevel[Public with Double]
  
}

