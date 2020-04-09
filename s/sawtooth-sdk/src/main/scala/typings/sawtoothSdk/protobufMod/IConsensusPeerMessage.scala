package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConsensusPeerMessage extends js.Object {
  /** ConsensusPeerMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
  /** ConsensusPeerMessage messageType */
  var messageType: js.UndefOr[String | Null] = js.undefined
  /** ConsensusPeerMessage name */
  var name: js.UndefOr[String | Null] = js.undefined
  /** ConsensusPeerMessage version */
  var version: js.UndefOr[String | Null] = js.undefined
}

object IConsensusPeerMessage {
  @scala.inline
  def apply(
    content: Uint8Array = null,
    messageType: String = null,
    name: String = null,
    version: String = null
  ): IConsensusPeerMessage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (messageType != null) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusPeerMessage]
  }
}

