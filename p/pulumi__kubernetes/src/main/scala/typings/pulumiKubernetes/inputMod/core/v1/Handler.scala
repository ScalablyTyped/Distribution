package typings.pulumiKubernetes.inputMod.core.v1

import typings.pulumiPulumi.outputMod.Input
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
  var exec: js.UndefOr[Input[ExecAction]] = js.undefined
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: js.UndefOr[Input[HTTPGetAction]] = js.undefined
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: js.UndefOr[Input[TCPSocketAction]] = js.undefined
}
object Handler {
  
  inline def apply(): Handler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler]
  }
  
  extension [Self <: Handler](x: Self) {
    
    inline def setExec(value: Input[ExecAction]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    inline def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    inline def setHttpGet(value: Input[HTTPGetAction]): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    inline def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    inline def setTcpSocket(value: Input[TCPSocketAction]): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    inline def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
  }
}
