package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAuthSessionResponse extends StObject
@JSImport("steam-client", "EAuthSessionResponse")
@js.native
object EAuthSessionResponse extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAuthSessionResponse & Double] = js.native
  
  @js.native
  sealed trait AuthTicketCanceled
    extends StObject
       with EAuthSessionResponse
  /* 6 */ val AuthTicketCanceled: typings.steamClient.mod.EAuthSessionResponse.AuthTicketCanceled & Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalid
    extends StObject
       with EAuthSessionResponse
  /* 8 */ val AuthTicketInvalid: typings.steamClient.mod.EAuthSessionResponse.AuthTicketInvalid & Double = js.native
  
  @js.native
  sealed trait AuthTicketInvalidAlreadyUsed
    extends StObject
       with EAuthSessionResponse
  /* 7 */ val AuthTicketInvalidAlreadyUsed: typings.steamClient.mod.EAuthSessionResponse.AuthTicketInvalidAlreadyUsed & Double = js.native
  
  @js.native
  sealed trait LoggedInElseWhere
    extends StObject
       with EAuthSessionResponse
  /* 4 */ val LoggedInElseWhere: typings.steamClient.mod.EAuthSessionResponse.LoggedInElseWhere & Double = js.native
  
  @js.native
  sealed trait NoLicenseOrExpired
    extends StObject
       with EAuthSessionResponse
  /* 2 */ val NoLicenseOrExpired: typings.steamClient.mod.EAuthSessionResponse.NoLicenseOrExpired & Double = js.native
  
  @js.native
  sealed trait OK
    extends StObject
       with EAuthSessionResponse
  /* 0 */ val OK: typings.steamClient.mod.EAuthSessionResponse.OK & Double = js.native
  
  @js.native
  sealed trait PublisherIssuedBan
    extends StObject
       with EAuthSessionResponse
  /* 9 */ val PublisherIssuedBan: typings.steamClient.mod.EAuthSessionResponse.PublisherIssuedBan & Double = js.native
  
  @js.native
  sealed trait UserNotConnectedToSteam
    extends StObject
       with EAuthSessionResponse
  /* 1 */ val UserNotConnectedToSteam: typings.steamClient.mod.EAuthSessionResponse.UserNotConnectedToSteam & Double = js.native
  
  @js.native
  sealed trait VACBanned
    extends StObject
       with EAuthSessionResponse
  /* 3 */ val VACBanned: typings.steamClient.mod.EAuthSessionResponse.VACBanned & Double = js.native
  
  @js.native
  sealed trait VACCheckTimedOut
    extends StObject
       with EAuthSessionResponse
  /* 5 */ val VACCheckTimedOut: typings.steamClient.mod.EAuthSessionResponse.VACCheckTimedOut & Double = js.native
}
