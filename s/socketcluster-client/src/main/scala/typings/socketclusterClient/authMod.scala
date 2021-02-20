package typings.socketclusterClient

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object authMod {
  
  @JSImport("socketcluster-client/lib/auth", JSImport.Namespace)
  @js.native
  class ^ () extends AuthEngine
  
  @js.native
  trait AGAuthEngine extends StObject {
    
    def loadToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
    
    def removeToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
    
    def saveToken(name: String, token: AuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: AuthToken, options: StringDictionary[js.Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: SignedAuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
    def saveToken(name: String, token: SignedAuthToken, options: StringDictionary[js.Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
  }
  
  @js.native
  trait AuthEngine extends AGAuthEngine
  
  type AuthToken = StringDictionary[js.Any]
  
  type SignedAuthToken = String
}
