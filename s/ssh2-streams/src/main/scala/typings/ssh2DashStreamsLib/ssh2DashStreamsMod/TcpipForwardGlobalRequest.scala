package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpipForwardGlobalRequest extends _GlobalRequest {
  /**
    * The IP address to start/stop binding to.
    */
  var bindAddr: java.lang.String
  /**
    * The port to start/stop binding to.
    */
  var bindPort: scala.Double
}

object TcpipForwardGlobalRequest {
  @scala.inline
  def apply(bindAddr: java.lang.String, bindPort: scala.Double): TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr, bindPort = bindPort)
  
    __obj.asInstanceOf[TcpipForwardGlobalRequest]
  }
}

