package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _GlobalRequest extends StObject
object _GlobalRequest {
  
  inline def TcpipForwardGlobalRequest(bindAddr: String, bindPort: Double): typings.ssh2Streams.mod.TcpipForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(bindAddr = bindAddr.asInstanceOf[js.Any], bindPort = bindPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.TcpipForwardGlobalRequest]
  }
  
  inline def opensshStreamLocalForwardGlobalRequest(socketPath: String): typings.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest = {
    val __obj = js.Dynamic.literal(socketPath = socketPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.opensshStreamLocalForwardGlobalRequest]
  }
}
