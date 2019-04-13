package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAuthSessionResponse extends js.Object

@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends js.Object {
  @js.native
  sealed trait AuthTicketCanceled
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalid
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait LoggedInElseWhere
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait NoLicenseOrExpired
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait OK
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait PublisherIssuedBan
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait UserNotConnectedToSteam
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait VACBanned
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  @js.native
  sealed trait VACCheckTimedOut
    extends steamDashClientLib.steamDashClientMod.EAuthSessionResponse
  
  /* 6 */ val AuthTicketCanceled: AuthTicketCanceled with scala.Double = js.native
  /* 8 */ val AuthTicketInvalid: AuthTicketInvalid with scala.Double = js.native
  /* 7 */ val AuthTicketInvalidAlreadyUsed: AuthTicketInvalidAlreadyUsed with scala.Double = js.native
  /* 4 */ val LoggedInElseWhere: LoggedInElseWhere with scala.Double = js.native
  /* 2 */ val NoLicenseOrExpired: NoLicenseOrExpired with scala.Double = js.native
  /* 0 */ val OK: OK with scala.Double = js.native
  /* 9 */ val PublisherIssuedBan: PublisherIssuedBan with scala.Double = js.native
  /* 1 */ val UserNotConnectedToSteam: UserNotConnectedToSteam with scala.Double = js.native
  /* 3 */ val VACBanned: VACBanned with scala.Double = js.native
  /* 5 */ val VACCheckTimedOut: VACCheckTimedOut with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EAuthSessionResponse with scala.Double] = js.native
}

