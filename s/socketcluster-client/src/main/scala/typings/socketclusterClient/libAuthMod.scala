package typings.socketclusterClient

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAuthMod {
  
  @JSImport("socketcluster-client/lib/auth", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with AuthEngine
  
  @js.native
  trait AGAuthEngine extends StObject {
    
    def loadToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
    
    def removeToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
    
    def saveToken(name: String, token: AuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: AuthToken, options: StringDictionary[Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: SignedAuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: SignedAuthToken, options: StringDictionary[Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
  }
  
  @js.native
  trait AuthEngine
    extends StObject
       with AGAuthEngine
  
  type AuthToken = StringDictionary[Any]
  
  type SignedAuthToken = String
}
