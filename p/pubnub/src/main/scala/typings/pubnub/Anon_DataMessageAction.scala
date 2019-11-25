package typings.pubnub

import typings.pubnub.pubnubMod.MessageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataMessageAction extends js.Object {
  var data: MessageAction
}

object Anon_DataMessageAction {
  @scala.inline
  def apply(data: MessageAction): Anon_DataMessageAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataMessageAction]
  }
}

