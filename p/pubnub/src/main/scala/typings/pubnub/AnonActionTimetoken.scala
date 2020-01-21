package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActionTimetoken extends js.Object {
  var actionTimetoken: String | Double
  var uuid: String
}

object AnonActionTimetoken {
  @scala.inline
  def apply(actionTimetoken: String | Double, uuid: String): AnonActionTimetoken = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActionTimetoken]
  }
}

