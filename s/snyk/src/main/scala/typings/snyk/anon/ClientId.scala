package typings.snyk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientId extends StObject {
  
  var clientId: String
  
  var clientSecret: String
  
  var isPublic: Boolean
  
  var name: String
  
  var redirectUris: js.Array[String]
  
  var scopes: js.Array[String]
}
object ClientId {
  
  inline def apply(
    clientId: String,
    clientSecret: String,
    isPublic: Boolean,
    name: String,
    redirectUris: js.Array[String],
    scopes: js.Array[String]
  ): ClientId = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], isPublic = isPublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], redirectUris = redirectUris.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientId] (val x: Self) extends AnyVal {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setIsPublic(value: Boolean): Self = StObject.set(x, "isPublic", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRedirectUris(value: js.Array[String]): Self = StObject.set(x, "redirectUris", value.asInstanceOf[js.Any])
    
    inline def setRedirectUrisVarargs(value: String*): Self = StObject.set(x, "redirectUris", js.Array(value*))
    
    inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
  }
}
