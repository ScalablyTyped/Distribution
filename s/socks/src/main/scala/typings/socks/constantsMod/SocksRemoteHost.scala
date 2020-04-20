package typings.socks.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a remote host
  */
trait SocksRemoteHost extends js.Object {
  var host: String
  var port: Double
}

object SocksRemoteHost {
  @scala.inline
  def apply(host: String, port: Double): SocksRemoteHost = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksRemoteHost]
  }
}

