package typings.pulsarClient

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
