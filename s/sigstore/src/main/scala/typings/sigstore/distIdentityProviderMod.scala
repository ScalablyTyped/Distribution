package typings.sigstore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIdentityProviderMod {
  
  trait Provider extends StObject {
    
    def getToken(): js.Promise[String]
  }
  object Provider {
    
    inline def apply(getToken: () => js.Promise[String]): Provider = {
      val __obj = js.Dynamic.literal(getToken = js.Any.fromFunction0(getToken))
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      inline def setGetToken(value: () => js.Promise[String]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
    }
  }
}
