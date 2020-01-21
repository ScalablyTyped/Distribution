package typings.stompjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHost extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var login: String
  var passcode: String
}

object AnonHost {
  @scala.inline
  def apply(login: String, passcode: String, host: String = null): AnonHost = {
    val __obj = js.Dynamic.literal(login = login.asInstanceOf[js.Any], passcode = passcode.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHost]
  }
}

