package typings.sigstore

import typings.sigstore.distIdentityProviderMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIdentityCiMod {
  
  @JSImport("sigstore/dist/identity/ci", "CIContextProvider")
  @js.native
  open class CIContextProvider protected ()
    extends StObject
       with Provider {
    def this(audience: String) = this()
    
    /* private */ var audience: Any = js.native
    
    /* CompleteClass */
    override def getToken(): js.Promise[String] = js.native
  }
}
