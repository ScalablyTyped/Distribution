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
  def apply(messages: js.UndefOr[Null | js.Array[IMessage]] = js.undefined): IMessageList = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(messages)) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessageList]
  }
}

