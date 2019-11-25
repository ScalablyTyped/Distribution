package typings.pubnub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionTimetoken extends js.Object {
  var actionTimetoken: String | Double
  var uuid: String
}

object Anon_ActionTimetoken {
  @scala.inline
  def apply(actionTimetoken: String | Double, uuid: String): Anon_ActionTimetoken = {
    val __obj = js.Dynamic.literal(actionTimetoken = actionTimetoken.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionTimetoken]
  }
}

