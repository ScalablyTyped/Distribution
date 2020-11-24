package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAuthSessionResponse extends js.Object
@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse with Double] = js.native
  
  @js.native
  sealed trait AuthTicketCanceled extends EAuthSessionResponse
  /* 6 */ @js.native
  object AuthTicketCanceled extends TopLevel[AuthTicketCanceled with Double]
  
  @js.native
  sealed trait AuthTicketInvalid extends EAuthSessionResponse
  /* 8 */ @js.native
  object AuthTicketInvalid extends TopLevel[AuthTicketInvalid with Double]
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed extends EAuthSessionResponse
  /* 7 */ @js.native
  object AuthTicketInvalidAlreadyUsed extends TopLevel[AuthTicketInvalidAlreadyUsed with Double]
  
  @js.native
  sealed trait LoggedInElseWhere extends EAuthSessionResponse
  /* 4 */ @js.native
  object LoggedInElseWhere extends TopLevel[LoggedInElseWhere with Double]
  
  @js.native
  sealed trait NoLicenseOrExpired extends EAuthSessionResponse
  /* 2 */ @js.native
  object NoLicenseOrExpired extends TopLevel[NoLicenseOrExpired with Double]
  
  @js.native
  sealed trait OK extends EAuthSessionResponse
  /* 0 */ @js.native
  object OK extends TopLevel[OK with Double]
  
  @js.native
  sealed trait PublisherIssuedBan extends EAuthSessionResponse
  /* 9 */ @js.native
  object PublisherIssuedBan extends TopLevel[PublisherIssuedBan with Double]
  
  @js.native
  sealed trait UserNotConnectedToSteam extends EAuthSessionResponse
  /* 1 */ @js.native
  object UserNotConnectedToSteam extends TopLevel[UserNotConnectedToSteam with Double]
  
  @js.native
  sealed trait VACBanned extends EAuthSessionResponse
  /* 3 */ @js.native
  object VACBanned extends TopLevel[VACBanned with Double]
  
  @js.native
  sealed trait VACCheckTimedOut extends EAuthSessionResponse
  /* 5 */ @js.native
  object VACCheckTimedOut extends TopLevel[VACCheckTimedOut with Double]
}
