package typings
package steamDashClientLib.steamDashClientMod

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
  sealed trait All
    extends steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState
  
  @js.native
  sealed trait FriendsOnly
    extends steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState
  
  @js.native
  sealed trait Private
    extends steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState
  
  @js.native
  sealed trait Public
    extends steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState
  
  /* 8 | 4 | 2 */ val All: All with scala.Double = js.native
  /* 4 */ val FriendsOnly: FriendsOnly with scala.Double = js.native
  /* -1 */ val Invalid: Invalid with scala.Double = js.native
  /* 2 */ val Private: Private with scala.Double = js.native
  /* 8 */ val Public: Public with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EUCMFilePrivacyState with scala.Double] = js.native
}

