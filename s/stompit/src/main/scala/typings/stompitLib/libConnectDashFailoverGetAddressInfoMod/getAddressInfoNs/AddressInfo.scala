package typings
package stompitLib.libConnectDashFailoverGetAddressInfoMod.getAddressInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressInfo extends js.Object {
  var connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions
  var host: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var pseudoUri: java.lang.String
  var transport: java.lang.String
  var transportPath: java.lang.String
}

object AddressInfo {
  @scala.inline
  def apply(
    connectArgs: stompitLib.libConnectMod.connectNs.ConnectOptions,
    pseudoUri: java.lang.String,
    transport: java.lang.String,
    transportPath: java.lang.String,
    host: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null
  ): AddressInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connectArgs")(connectArgs)
    __obj.updateDynamic("pseudoUri")(pseudoUri)
    __obj.updateDynamic("transport")(transport)
    __obj.updateDynamic("transportPath")(transportPath)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressInfo]
  }
}

