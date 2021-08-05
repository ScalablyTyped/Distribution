package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler defines a specific action that should be taken
  */
trait Handler extends StObject {
  
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: ExecAction
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetAction
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: TCPSocketAction
}
object Handler {
  
  inline def apply(exec: ExecAction, httpGet: HTTPGetAction, tcpSocket: TCPSocketAction): Handler = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setExec(value: ExecAction): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setHttpGet(value: HTTPGetAction): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setTcpSocket(value: TCPSocketAction): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
  }
}
