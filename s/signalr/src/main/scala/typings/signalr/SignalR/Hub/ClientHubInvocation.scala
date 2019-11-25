package typings.signalr.SignalR.Hub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientHubInvocation extends js.Object {
  var Args: String
  var Hub: String
  var Method: String
  var State: String
}

object ClientHubInvocation {
  @scala.inline
  def apply(Args: String, Hub: String, Method: String, State: String): ClientHubInvocation = {
    val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Hub = Hub.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientHubInvocation]
  }
}

