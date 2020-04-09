package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.Message.MessageType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessage extends js.Object {
  /** Message content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
  /** Message correlationId */
  var correlationId: js.UndefOr[String | Null] = js.undefined
  /** Message messageType */
  var messageType: js.UndefOr[MessageType | Null] = js.undefined
}

object IMessage {
  @scala.inline
  def apply(content: Uint8Array = null, correlationId: String = null, messageType: MessageType = null): IMessage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (correlationId != null) __obj.updateDynamic("correlationId")(correlationId.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
}

