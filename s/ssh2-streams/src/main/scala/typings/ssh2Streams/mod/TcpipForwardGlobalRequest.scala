package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipForwardGlobalRequest extends _GlobalRequest {
  /**
    * The IP address to start/stop binding to.
    */
  var bindAddr: String
  /**
    * The port to start/stop binding to.
    */
  var bindPort: Double
}

object TcpipForwardGlobalRequest {
  @scala.inline
  def apply(bindAddr: String, bindPort: Double): TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
}

