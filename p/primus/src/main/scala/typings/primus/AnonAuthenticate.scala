package typings.primus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthenticate extends js.Object {
  var authenticate: js.UndefOr[String] = js.undefined
  var message: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
}

object AnonAuthenticate {
  @scala.inline
  def apply(authenticate: String = null, message: String = null, statusCode: Int | Double = null): AnonAuthenticate = {
    val __obj = js.Dynamic.literal()
    if (authenticate != null) __obj.updateDynamic("authenticate")(authenticate.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthenticate]
  }
}

