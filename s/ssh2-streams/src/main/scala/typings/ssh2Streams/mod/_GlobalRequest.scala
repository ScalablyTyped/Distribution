package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GlobalRequest extends js.Object
object _GlobalRequest {
  
  @scala.inline
  def TcpipForwardGlobalRequest(bindAddr: String, bindPort: Double): _GlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GlobalRequest]
  }
  
  @scala.inline
  def opensshStreamLocalForwardGlobalRequest(socketPath: String): _GlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GlobalRequest]
  }
}
