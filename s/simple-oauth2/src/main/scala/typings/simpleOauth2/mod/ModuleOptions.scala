package typings.simpleOauth2.mod

import typings.simpleOauth2.anon.AuthorizationMethod
import typings.simpleOauth2.anon.AuthorizeHost
import typings.simpleOauth2.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ClientIdName /* <: String */] extends js.Object {
  var auth: AuthorizeHost
  var client: Id[ClientIdName]
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[AuthorizationMethod] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[/* <: java.lang.String */ ClientIdName](
    auth: AuthorizeHost,
    client: Id[ClientIdName],
    http: js.Object = null,
    options: AuthorizationMethod = null
  ): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
}

