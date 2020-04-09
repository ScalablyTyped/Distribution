package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageList extends js.Object {
  /** MessageList messages */
  var messages: js.UndefOr[js.Array[IMessage] | Null] = js.undefined
}

object IMessageList {
  @scala.inline
  def apply(messages: js.Array[IMessage] = null): IMessageList = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageList]
  }
}

