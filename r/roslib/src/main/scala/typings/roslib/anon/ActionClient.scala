package typings.roslib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionClient extends js.Object {
  var actionClient: typings.roslib.mod.ActionClient
  var goalMessage: js.Any
}

object ActionClient {
  @scala.inline
  def apply(actionClient: typings.roslib.mod.ActionClient, goalMessage: js.Any): ActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionClient]
  }
}

