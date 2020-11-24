package typings.pulumiKubernetes.outputMod.core.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handler defines a specific action that should be taken
  */
@js.native
trait Handler extends js.Object {
  
  /**
    * One and only one of the following should be specified. Exec specifies the action to take.
    */
  var exec: ExecAction = js.native
  
  /**
    * HTTPGet specifies the http request to perform.
    */
  var httpGet: HTTPGetAction = js.native
  
  /**
    * TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported
    */
  var tcpSocket: TCPSocketAction = js.native
}
object Handler {
  
  @scala.inline
  def apply(exec: ExecAction, httpGet: HTTPGetAction, tcpSocket: TCPSocketAction): Handler = {
    val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], httpGet = httpGet.asInstanceOf[js.Any], tcpSocket = tcpSocket.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handler]
  }
  
  @scala.inline
  implicit class HandlerOps[Self <: Handler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExec(value: ExecAction): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpGet(value: HTTPGetAction): Self = this.set("httpGet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpSocket(value: TCPSocketAction): Self = this.set("tcpSocket", value.asInstanceOf[js.Any])
  }
}
