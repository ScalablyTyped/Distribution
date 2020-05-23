package typings.pubnub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionTimetoken extends js.Object {
  var actionTimetoken: String | Double
  var uuid: String
}

object ActionTimetoken {
  @scala.inline
  def apply(actionTimetoken: String | Double, uuid: String): ActionTimetoken = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionTimetoken]
  }
}

