package typings.reactDashAdal.reactDashAdalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-adal", "adalFetch")
@js.native
object adalFetch extends js.Object {
  def apply(
    authContext: AuthenticationContext,
    resource: String,
    fetch: js.Function2[/* input */ String, /* init */ js.Any, js.Promise[_]],
    url: String,
    options: js.Any
  ): js.Promise[_] = js.native
}

