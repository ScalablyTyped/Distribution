package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientID extends StObject {
  
  var clientID: String
  
  var clientSecret: js.UndefOr[String] = js.undefined
  
  var issuer: String
  
  var redirectURL: js.UndefOr[String] = js.undefined
}
object ClientID {
  
  inline def apply(clientID: String, issuer: String): ClientID = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientID] (val x: Self) extends AnyVal {
    
    inline def setClientID(value: String): Self = StObject.set(x, "clientID", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setRedirectURL(value: String): Self = StObject.set(x, "redirectURL", value.asInstanceOf[js.Any])
    
    inline def setRedirectURLUndefined: Self = StObject.set(x, "redirectURL", js.undefined)
  }
}
