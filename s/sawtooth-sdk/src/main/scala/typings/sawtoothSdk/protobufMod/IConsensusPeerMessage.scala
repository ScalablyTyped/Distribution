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
    content: js.UndefOr[Null | Uint8Array] = js.undefined,
    messageType: js.UndefOr[Null | String] = js.undefined,
    name: js.UndefOr[Null | String] = js.undefined,
    version: js.UndefOr[Null | String] = js.undefined
  ): IConsensusPeerMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(messageType)) __obj.updateDynamic("messageType")(messageType.asInstanceOf[js.Any])
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConsensusPeerMessage]
  }
}

