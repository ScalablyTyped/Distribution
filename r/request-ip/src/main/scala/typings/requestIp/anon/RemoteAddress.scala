package typings.requestIp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteAddress extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
}

object RemoteAddress {
  @scala.inline
  def apply(remoteAddress: String = null): RemoteAddress = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteAddress]
  }
}

