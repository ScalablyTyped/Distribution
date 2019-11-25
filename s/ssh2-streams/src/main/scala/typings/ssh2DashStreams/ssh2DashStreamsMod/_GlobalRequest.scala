package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GlobalRequest extends js.Object

object _GlobalRequest {
  @scala.inline
  def TcpipForwardGlobalRequest(bindAddr: String, bindPort: Double): _GlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GlobalRequest]
  }
  @scala.inline
  def openssh_StreamLocalForwardGlobalRequest(socketPath: String): _GlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_GlobalRequest]
  }
}

