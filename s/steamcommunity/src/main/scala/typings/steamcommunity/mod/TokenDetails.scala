package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenDetails extends StObject {
  
  /** Your account's logon name. */
  var accountName: Any
  
  /** Your account's SteamID, as a SteamID object. */
  var steamID: SteamID
  
  /** Your logon token. */
  var webLogonToken: Any
}
object TokenDetails {
  
  inline def apply(accountName: Any, steamID: SteamID, webLogonToken: Any): TokenDetails = {
    val __obj = js.Dynamic.literal(accountName = accountName.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], webLogonToken = webLogonToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenDetails]
  }
  
  extension [Self <: TokenDetails](x: Self) {
    
    inline def setAccountName(value: Any): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: SteamID): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setWebLogonToken(value: Any): Self = StObject.set(x, "webLogonToken", value.asInstanceOf[js.Any])
  }
}
