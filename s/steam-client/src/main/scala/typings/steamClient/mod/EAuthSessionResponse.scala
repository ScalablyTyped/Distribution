package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAuthSessionResponse extends StObject
@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse with Double] = js.native
  
  @js.native
  sealed trait AuthTicketCanceled extends EAuthSessionResponse
  /* 6 */ val AuthTicketCanceled: typings.steamClient.mod.EAuthSessionResponse.AuthTicketCanceled with Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalid extends EAuthSessionResponse
  /* 8 */ val AuthTicketInvalid: typings.steamClient.mod.EAuthSessionResponse.AuthTicketInvalid with Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed extends EAuthSessionResponse
  /* 7 */ val AuthTicketInvalidAlreadyUsed: typings.steamClient.mod.EAuthSessionResponse.AuthTicketInvalidAlreadyUsed with Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere extends EAuthSessionResponse
  /* 4 */ val LoggedInElseWhere: typings.steamClient.mod.EAuthSessionResponse.LoggedInElseWhere with Double = js.native
  
  @js.native
  sealed trait NoLicenseOrExpired extends EAuthSessionResponse
  /* 2 */ val NoLicenseOrExpired: typings.steamClient.mod.EAuthSessionResponse.NoLicenseOrExpired with Double = js.native
  
  @js.native
  sealed trait OK extends EAuthSessionResponse
  /* 0 */ val OK: typings.steamClient.mod.EAuthSessionResponse.OK with Double = js.native
  
  @js.native
  sealed trait PublisherIssuedBan extends EAuthSessionResponse
  /* 9 */ val PublisherIssuedBan: typings.steamClient.mod.EAuthSessionResponse.PublisherIssuedBan with Double = js.native
  
  @js.native
  sealed trait UserNotConnectedToSteam extends EAuthSessionResponse
  /* 1 */ val UserNotConnectedToSteam: typings.steamClient.mod.EAuthSessionResponse.UserNotConnectedToSteam with Double = js.native
  
  @js.native
  sealed trait VACBanned extends EAuthSessionResponse
  /* 3 */ val VACBanned: typings.steamClient.mod.EAuthSessionResponse.VACBanned with Double = js.native
  
  @js.native
  sealed trait VACCheckTimedOut extends EAuthSessionResponse
  /* 5 */ val VACCheckTimedOut: typings.steamClient.mod.EAuthSessionResponse.VACCheckTimedOut with Double = js.native
}
