package typings
package signalrLib.SignalRNs.HubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientHubInvocation extends js.Object {
  var Args: java.lang.String
  var Hub: java.lang.String
  var Method: java.lang.String
  var State: java.lang.String
}

object ClientHubInvocation {
  @scala.inline
  def apply(Args: java.lang.String, Hub: java.lang.String, Method: java.lang.String, State: java.lang.String): ClientHubInvocation = {
    val __obj = js.Dynamic.literal(Args = Args, Hub = Hub, Method = Method, State = State)
  
    __obj.asInstanceOf[ClientHubInvocation]
  }
}

