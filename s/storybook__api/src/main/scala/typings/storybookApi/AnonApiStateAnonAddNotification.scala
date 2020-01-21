package typings.storybookApi

import typings.storybookApi.notificationsMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApiStateAnonAddNotification extends js.Object {
  var api: AnonAddNotification
  var state: SubState
}

object AnonApiStateAnonAddNotification {
  @scala.inline
  def apply(api: AnonAddNotification, state: SubState): AnonApiStateAnonAddNotification = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonApiStateAnonAddNotification]
  }
}

