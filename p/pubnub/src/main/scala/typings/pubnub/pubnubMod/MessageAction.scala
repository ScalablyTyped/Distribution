package typings.pubnub.pubnubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAction extends js.Object {
  var actionTimetoken: String
  var messageTimetoken: String
  var `type`: String
  var uuid: String
  var value: String
}

object MessageAction {
  @scala.inline
  def apply(actionTimetoken: String, messageTimetoken: String, `type`: String, uuid: String, value: String): MessageAction = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken, messageTimetoken = messageTimetoken, uuid = uuid, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessageAction]
  }
}

