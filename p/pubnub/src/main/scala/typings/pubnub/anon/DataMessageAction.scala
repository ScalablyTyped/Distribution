package typings.pubnub.anon

import typings.pubnub.mod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataMessageAction extends js.Object {
  var data: MessageAction
}

object DataMessageAction {
  @scala.inline
  def apply(data: MessageAction): DataMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataMessageAction]
  }
}

