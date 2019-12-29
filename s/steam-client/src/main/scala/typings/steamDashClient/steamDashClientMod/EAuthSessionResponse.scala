package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAuthSessionResponse extends js.Object

@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends js.Object {
  @js.native
  sealed trait AuthTicketCanceled extends EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalid extends EAuthSessionResponse
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed extends EAuthSessionResponse
  
  @js.native
  sealed trait LoggedInElseWhere extends EAuthSessionResponse
  
  @js.native
  sealed trait NoLicenseOrExpired extends EAuthSessionResponse
  
  @js.native
  sealed trait OK extends EAuthSessionResponse
  
  @js.native
  sealed trait PublisherIssuedBan extends EAuthSessionResponse
  
  @js.native
  sealed trait UserNotConnectedToSteam extends EAuthSessionResponse
  
  @js.native
  sealed trait VACBanned extends EAuthSessionResponse
  
  @js.native
  sealed trait VACCheckTimedOut extends EAuthSessionResponse
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse with Double] = js.native
  /* 6 */ @js.native
  object AuthTicketCanceled extends TopLevel[AuthTicketCanceled with Double]
  
  /* 8 */ @js.native
  object AuthTicketInvalid extends TopLevel[AuthTicketInvalid with Double]
  
  /* 7 */ @js.native
  object AuthTicketInvalidAlreadyUsed extends TopLevel[AuthTicketInvalidAlreadyUsed with Double]
  
  /* 4 */ @js.native
  object LoggedInElseWhere extends TopLevel[LoggedInElseWhere with Double]
  
  /* 2 */ @js.native
  object NoLicenseOrExpired extends TopLevel[NoLicenseOrExpired with Double]
  
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  /* 9 */ @js.native
  object PublisherIssuedBan extends TopLevel[PublisherIssuedBan with Double]
  
  /* 1 */ @js.native
  object UserNotConnectedToSteam extends TopLevel[UserNotConnectedToSteam with Double]
  
  /* 3 */ @js.native
  object VACBanned extends TopLevel[VACBanned with Double]
  
  /* 5 */ @js.native
  object VACCheckTimedOut extends TopLevel[VACCheckTimedOut with Double]
  
}

