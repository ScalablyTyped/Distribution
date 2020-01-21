package typings.socketclusterClient.scclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStateChangeData extends js.Object {
  var newState: AuthStates
  var oldState: AuthStates
}

object AuthStateChangeData {
  @scala.inline
  def apply(newState: AuthStates, oldState: AuthStates): AuthStateChangeData = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthStateChangeData]
  }
}

