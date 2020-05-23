package typings.pubnub.anon

import typings.pubnub.mod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataEvent extends js.Object {
  var data: MessageAction
  var event: String
}

object DataEvent {
  @scala.inline
  def apply(data: MessageAction, event: String): DataEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEvent]
  }
}

