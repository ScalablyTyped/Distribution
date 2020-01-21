package typings.simpleOauth2.mod

import typings.simpleOauth2.AnonAuthorizationMethod
import typings.simpleOauth2.AnonAuthorizeHost
import typings.simpleOauth2.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleOptions[ClientIdName /* <: String */] extends js.Object {
  var auth: AnonAuthorizeHost
  var client: AnonId[ClientIdName]
  /**
    * Used to set global options to the internal http library (wreck).
    * All options except baseUrl are allowed
    * Defaults to header.Accept = "application/json"
    */
  var http: js.UndefOr[js.Object] = js.undefined
  var options: js.UndefOr[AnonAuthorizationMethod] = js.undefined
}

object ModuleOptions {
  @scala.inline
  def apply[ClientIdName /* <: String */](
    auth: AnonAuthorizeHost,
    client: AnonId[ClientIdName],
    http: js.Object = null,
    options: AnonAuthorizationMethod = null
  ): ModuleOptions[ClientIdName] = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleOptions[ClientIdName]]
  }
}

