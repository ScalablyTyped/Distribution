package typings.requestDashIp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RemoteAddress extends js.Object {
  var remoteAddress: js.UndefOr[String] = js.undefined
}

object Anon_RemoteAddress {
  @scala.inline
  def apply(remoteAddress: String = null): Anon_RemoteAddress = {
    val __obj = js.Dynamic.literal()
    if (remoteAddress != null) __obj.updateDynamic("remoteAddress")(remoteAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_RemoteAddress]
  }
}

