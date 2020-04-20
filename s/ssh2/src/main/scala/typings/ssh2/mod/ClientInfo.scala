package typings.ssh2.mod

import typings.ssh2Streams.mod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientInfo extends js.Object {
  /** Information about the client. */
  var header: Header
  /** The remote address of the connection. */
  var ip: String
}

object ClientInfo {
  @scala.inline
  def apply(header: Header, ip: String): ClientInfo = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientInfo]
  }
}

