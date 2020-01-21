package typings.stompit.getAddressInfoMod

import typings.stompit.connectMod.ConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var connectArgs: ConnectOptions
  var host: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var pseudoUri: String
  var transport: String
  var transportPath: String
}

object AddressInfo {
  @scala.inline
  def apply(
    connectArgs: ConnectOptions,
    pseudoUri: String,
    transport: String,
    transportPath: String,
    host: String = null,
    path: String = null,
    port: Int | Double = null
  ): AddressInfo = {
    val __obj = js.Dynamic.literal(connectArgs = connectArgs.asInstanceOf[js.Any], pseudoUri = pseudoUri.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any], transportPath = transportPath.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInfo]
  }
}

