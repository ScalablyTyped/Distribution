package typings.restDashIo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rest-io/lib/src/authentication", JSImport.Namespace)
@js.native
object libSrcAuthenticationMod extends js.Object {
  def createAuthToken(userId: String): js.Any = js.native
  def decryptAuthToken(authToken: String): Anon_CreatedAt = js.native
  def encryptPassword(password: String): js.Any = js.native
}

