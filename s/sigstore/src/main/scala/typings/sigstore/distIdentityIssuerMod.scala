package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIdentityIssuerMod {
  
  @JSImport("sigstore/dist/identity/issuer", "Issuer")
  @js.native
  open class Issuer protected () extends StObject {
    def this(baseURL: String) = this()
    
    def authEndpoint(): js.Promise[String] = js.native
    
    /* private */ var baseURL: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /* private */ var fetch: Any = js.native
    
    /* private */ var loadOpenIDConfig: Any = js.native
    
    def tokenEndpoint(): js.Promise[String] = js.native
  }
}
