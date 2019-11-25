package typings.roslib

import typings.roslib.roslibMod.ActionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionClient extends js.Object {
  var actionClient: ActionClient
  var goalMessage: js.Any
}

object Anon_ActionClient {
  @scala.inline
  def apply(actionClient: ActionClient, goalMessage: js.Any): Anon_ActionClient = {
    val __obj = js.Dynamic.literal(actionClient = actionClient.asInstanceOf[js.Any], goalMessage = goalMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionClient]
  }
}

