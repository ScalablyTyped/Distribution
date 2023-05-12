package typings.steamUser.anon

import typings.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcToken extends StObject {
  
  var appID: Double
  
  var gcToken: Double
  
  var steamID: ^
  
  var ticketCrc: Double
  
  var validated: Boolean
}
object GcToken {
  
  inline def apply(appID: Double, gcToken: Double, steamID: ^, ticketCrc: Double, validated: Boolean): GcToken = {
    val __obj = js.Dynamic.literal(appID = appID.asInstanceOf[js.Any], gcToken = gcToken.asInstanceOf[js.Any], steamID = steamID.asInstanceOf[js.Any], ticketCrc = ticketCrc.asInstanceOf[js.Any], validated = validated.asInstanceOf[js.Any])
    __obj.asInstanceOf[GcToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GcToken] (val x: Self) extends AnyVal {
    
    inline def setAppID(value: Double): Self = StObject.set(x, "appID", value.asInstanceOf[js.Any])
    
    inline def setGcToken(value: Double): Self = StObject.set(x, "gcToken", value.asInstanceOf[js.Any])
    
    inline def setSteamID(value: ^): Self = StObject.set(x, "steamID", value.asInstanceOf[js.Any])
    
    inline def setTicketCrc(value: Double): Self = StObject.set(x, "ticketCrc", value.asInstanceOf[js.Any])
    
    inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
  }
}
