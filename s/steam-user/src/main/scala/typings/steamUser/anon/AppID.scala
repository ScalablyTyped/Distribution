package typings.steamUser.anon

import typings.steamUser.mod.EAuthSessionResponse
import typings.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppID extends StObject {
  
  var appID: Double
  
  var appOwnerSteamID: ^
  
  var authSessionResponse: EAuthSessionResponse
  
  var state: Double
  
  var steamID: ^
  
  var ticketCrc: typings.bytebuffer.mod.^
  
  var ticketGcToken: Double
}
object AppID {
  
  inline def apply(
    appID: Double,
    appOwnerSteamID: ^,
    authSessionResponse: EAuthSessionResponse,
    state: Double,
    steamID: ^,
    ticketCrc: typings.bytebuffer.mod.^,
    ticketGcToken: Double
  ): AppID = {
    val __obj = js.Dynamic.literal(appID = appID.asInstanceOf[js.Any], appOwnerSteamID = appOwnerSteamID.asInstanceOf[js.Any], authSessionResponse = authSessionResponse.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], ticketCrc = ticketCrc.asInstanceOf[js.Any], ticketGcToken = ticketGcToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppID] (val x: Self) extends AnyVal {
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setAppOwnerSteamID(value: ^): Self = StObject.set(x, "appOwnerSteamID", value.asInstanceOf[js.Any])
    
    inline def setAuthSessionResponse(value: EAuthSessionResponse): Self = StObject.set(x, "authSessionResponse", value.asInstanceOf[js.Any])
    
    inline def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: ^): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setTicketCrc(value: typings.bytebuffer.mod.^): Self = StObject.set(x, "ticketCrc", value.asInstanceOf[js.Any])
    
    inline def setTicketGcToken(value: Double): Self = StObject.set(x, "ticketGcToken", value.asInstanceOf[js.Any])
  }
}
