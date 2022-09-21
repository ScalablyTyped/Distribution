package typings.pulsarClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Audience extends StObject {
    
    var audience: js.UndefOr[String] = js.undefined
    
    var client_id: js.UndefOr[String] = js.undefined
    
    var client_secret: js.UndefOr[String] = js.undefined
    
    var issuer_url: String
    
    var private_key: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object Audience {
    
    inline def apply(issuer_url: String, `type`: String): Audience = {
      val __obj = js.Dynamic.literal(issuer_url = issuer_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audience]
    }
    
    extension [Self <: Audience](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setClient_idUndefined: Self = StObject.set(x, "client_id", js.undefined)
      
      inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
      
      inline def setClient_secretUndefined: Self = StObject.set(x, "client_secret", js.undefined)
      
      inline def setIssuer_url(value: String): Self = StObject.set(x, "issuer_url", value.asInstanceOf[js.Any])
      
      inline def setPrivate_key(value: String): Self = StObject.set(x, "private_key", value.asInstanceOf[js.Any])
      
      inline def setPrivate_keyUndefined: Self = StObject.set(x, "private_key", js.undefined)
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CertificatePath extends StObject {
    
    var certificatePath: String
    
    var privateKeyPath: String
  }
  object CertificatePath {
    
    inline def apply(certificatePath: String, privateKeyPath: String): CertificatePath = {
      val __obj = js.Dynamic.literal(certificatePath = certificatePath.asInstanceOf[js.Any], privateKeyPath = privateKeyPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[CertificatePath]
    }
    
    extension [Self <: CertificatePath](x: Self) {
      
      inline def setCertificatePath(value: String): Self = StObject.set(x, "certificatePath", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyPath(value: String): Self = StObject.set(x, "privateKeyPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait Token extends StObject {
    
    var token: String
  }
  object Token {
    
    inline def apply(token: String): Token = {
      val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    extension [Self <: Token](x: Self) {
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
