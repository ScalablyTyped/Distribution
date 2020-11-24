package typings.signalr.SignalR.Hub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientHubInvocation extends js.Object {
  
  var Args: String = js.native
  
  var Hub: String = js.native
  
  var Method: String = js.native
  
  var State: String = js.native
}
object ClientHubInvocation {
  
  @scala.inline
  def apply(Args: String, Hub: String, Method: String, State: String): ClientHubInvocation = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Hub = Hub.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientHubInvocation]
  }
  
  @scala.inline
  implicit class ClientHubInvocationOps[Self <: ClientHubInvocation] (val x: Self) extends AnyVal {
    
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
    def setArgs(value: String): Self = this.set("Args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHub(value: String): Self = this.set("Hub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("Method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("State", value.asInstanceOf[js.Any])
  }
}
