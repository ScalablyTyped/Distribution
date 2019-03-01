package typings
package socketclusterDashClientLib.libScclientsocketMod.SCClientSocketNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newState")(newState)
    __obj.updateDynamic("oldState")(oldState)
    __obj.asInstanceOf[AuthStateChangeData]
  }
}

