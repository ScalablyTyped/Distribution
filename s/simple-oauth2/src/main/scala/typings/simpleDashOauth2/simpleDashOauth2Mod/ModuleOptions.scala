package typings.simpleDashOauth2.simpleDashOauth2Mod

import typings.simpleDashOauth2.Anon_AuthorizationMethod
import typings.simpleDashOauth2.Anon_AuthorizeHost
import typings.simpleDashOauth2.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ClientIdName /* <: String */] extends js.Object {
  var auth: Anon_AuthorizeHost
  var client: Anon_Id[ClientIdName]
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[Anon_AuthorizationMethod] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[ClientIdName /* <: String */](
    auth: Anon_AuthorizeHost,
    client: Anon_Id[ClientIdName],
    http: js.Object = null,
    options: Anon_AuthorizationMethod = null
  ): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth, client = client)
    if (http != null) __obj.updateDynamic("http")(http)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
}

