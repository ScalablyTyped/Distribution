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
  
  @scala.inline
  def apply(): Handler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerMutableBuilder[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExec(value: Input[ExecAction]): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setHttpGet(value: Input[HTTPGetAction]): Self = StObject.set(x, "httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGetUndefined: Self = StObject.set(x, "httpGet", js.undefined)
    
    @scala.inline
    def setTcpSocket(value: Input[TCPSocketAction]): Self = StObject.set(x, "tcpSocket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocketUndefined: Self = StObject.set(x, "tcpSocket", js.undefined)
  }
}
