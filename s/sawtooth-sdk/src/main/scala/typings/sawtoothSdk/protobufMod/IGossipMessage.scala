package typings.sawtoothSdk.protobufMod

import typings.sawtoothSdk.protobufMod.GossipMessage.ContentType
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipMessage extends js.Object {
  /** GossipMessage content */
  var content: js.UndefOr[Uint8Array | Null] = js.undefined
  /** GossipMessage contentType */
  var contentType: js.UndefOr[ContentType | Null] = js.undefined
  /** GossipMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipMessage {
  @scala.inline
  def apply(content: Uint8Array = null, contentType: ContentType = null, timeToLive: Int | Double = null): IGossipMessage = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipMessage]
  }
}

