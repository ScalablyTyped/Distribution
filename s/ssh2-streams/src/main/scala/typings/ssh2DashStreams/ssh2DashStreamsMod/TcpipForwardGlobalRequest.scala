package typings.ssh2DashStreams.ssh2DashStreamsMod

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
    val __obj = js.Dynamic.literal(bindAddr = bindAddr, bindPort = bindPort)
  
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
}

