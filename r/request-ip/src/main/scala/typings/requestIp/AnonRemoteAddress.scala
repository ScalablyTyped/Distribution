package typings.requestIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoteAddress extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
}

object AnonRemoteAddress {
  @scala.inline
  def apply(remoteAddress: String = null): AnonRemoteAddress = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRemoteAddress]
  }
}

