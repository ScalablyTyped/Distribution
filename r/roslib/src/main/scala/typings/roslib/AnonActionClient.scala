package typings.roslib

import typings.roslib.mod.ActionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionClient extends js.Object {
  var actionClient: ActionClient
  var goalMessage: js.Any
}

object AnonActionClient {
  @scala.inline
  def apply(actionClient: ActionClient, goalMessage: js.Any): AnonActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActionClient]
  }
}

