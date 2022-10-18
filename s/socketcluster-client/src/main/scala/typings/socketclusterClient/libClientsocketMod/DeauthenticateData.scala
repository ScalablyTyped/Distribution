package typings.socketclusterClient.libClientsocketMod

import typings.socketclusterClient.libAuthMod.AuthToken
import typings.socketclusterClient.libAuthMod.SignedAuthToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeauthenticateData extends StObject {
  
  var oldAuthToken: AuthToken | Null
  
  var oldSignedAuthToken: SignedAuthToken | Null
}
object DeauthenticateData {
  
  inline def apply(): DeauthenticateData = {
    val __obj = js.Dynamic.literal(oldAuthToken = null, oldSignedAuthToken = null)
    __obj.asInstanceOf[DeauthenticateData]
  }
  
  extension [Self <: DeauthenticateData](x: Self) {
    
    inline def setOldAuthToken(value: AuthToken): Self = StObject.set(x, "oldAuthToken", value.asInstanceOf[js.Any])
    
    inline def setOldAuthTokenNull: Self = StObject.set(x, "oldAuthToken", null)
    
    inline def setOldSignedAuthToken(value: SignedAuthToken): Self = StObject.set(x, "oldSignedAuthToken", value.asInstanceOf[js.Any])
    
    inline def setOldSignedAuthTokenNull: Self = StObject.set(x, "oldSignedAuthToken", null)
  }
}
