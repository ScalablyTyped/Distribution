package typings.restify.restifyMod

import typings.restify.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAuthorization extends js.Object {
  var basic: js.UndefOr[Anon_Password] = js.undefined
  var credentials: String
  var scheme: String
}

object RequestAuthorization {
  @scala.inline
  def apply(credentials: String, scheme: String, basic: Anon_Password = null): RequestAuthorization = {
    val __obj = js.Dynamic.literal(credentials = credentials, scheme = scheme)
    if (basic != null) __obj.updateDynamic("basic")(basic)
    __obj.asInstanceOf[RequestAuthorization]
  }
}

