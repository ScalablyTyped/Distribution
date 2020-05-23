package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipBlockResponse extends js.Object {
  /** GossipBlockResponse content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IGossipBlockResponse {
  @scala.inline
  def apply(content: js.UndefOr[Null | Uint8Array] = js.undefined): IGossipBlockResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(content)) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipBlockResponse]
  }
}

