package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestAuthorization extends js.Object {
  var basic: js.UndefOr[restifyLib.Anon_Password] = js.undefined
  var credentials: java.lang.String
  var scheme: java.lang.String
}

object RequestAuthorization {
  @scala.inline
  def apply(credentials: java.lang.String, scheme: java.lang.String, basic: restifyLib.Anon_Password = null): RequestAuthorization = {
    val __obj = js.Dynamic.literal(credentials = credentials, scheme = scheme)
    if (basic != null) __obj.updateDynamic("basic")(basic)
    __obj.asInstanceOf[RequestAuthorization]
  }
}

