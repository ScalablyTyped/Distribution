package typings.reactAdal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "adalGetToken")
@js.native
object adalGetToken extends js.Object {
  def apply(authContext: AuthenticationContext, resourceUrl: String): js.Promise[String | Null] = js.native
}

