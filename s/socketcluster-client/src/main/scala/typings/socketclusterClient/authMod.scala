package typings.socketclusterClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socketcluster-client/lib/auth", JSImport.Namespace)
@js.native
object authMod extends js.Object {
  @js.native
  trait AGAuthEngine extends js.Object {
    def loadToken(name: String): js.Promise[js.Object] = js.native
    def removeToken(name: String): js.Promise[js.Object] = js.native
    def saveToken(name: String, token: js.Object): js.Promise[js.Object] = js.native
    def saveToken(name: String, token: js.Object, options: js.Object): js.Promise[js.Object] = js.native
  }
  
  @js.native
  class AuthEngine () extends AGAuthEngine
  
}

