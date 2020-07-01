package typings.socketclusterClient.authMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGAuthEngine extends js.Object {
  def loadToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
  def removeToken(name: String): js.Promise[AuthToken | SignedAuthToken | Null] = js.native
  def saveToken(name: String, token: AuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
  def saveToken(name: String, token: AuthToken, options: StringDictionary[js.Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
  def saveToken(name: String, token: SignedAuthToken): js.Promise[AuthToken | SignedAuthToken] = js.native
  def saveToken(name: String, token: SignedAuthToken, options: StringDictionary[js.Any]): js.Promise[AuthToken | SignedAuthToken] = js.native
}

