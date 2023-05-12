package typings.sigstore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OidcIdentityToken extends StObject {
  
  var oidcIdentityToken: String
}
object OidcIdentityToken {
  
  inline def apply(oidcIdentityToken: String): OidcIdentityToken = {
    val __obj = js.Dynamic.literal(oidcIdentityToken = oidcIdentityToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidcIdentityToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OidcIdentityToken] (val x: Self) extends AnyVal {
    
    inline def setOidcIdentityToken(value: String): Self = StObject.set(x, "oidcIdentityToken", value.asInstanceOf[js.Any])
  }
}
