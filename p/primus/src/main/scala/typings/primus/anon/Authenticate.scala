package typings.primus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authenticate extends js.Object {
  var authenticate: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object Authenticate {
  @scala.inline
  def apply(authenticate: String = null, message: String = null, statusCode: js.UndefOr[Double] = js.undefined): Authenticate = {
    val __obj = js.Dynamic.literal()
    if (authenticate != null) __obj.updateDynamic("authenticate")(authenticate.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authenticate]
  }
}

