package typings
package ssh2Lib.ssh2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  /** Information about the client. */
  var header: ssh2DashStreamsLib.ssh2DashStreamsMod.Header
  /** The remote address of the connection. */
  var ip: java.lang.String
}

object ClientInfo {
  @scala.inline
  def apply(header: ssh2DashStreamsLib.ssh2DashStreamsMod.Header, ip: java.lang.String): ClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("ip")(ip)
    __obj.asInstanceOf[ClientInfo]
  }
}

