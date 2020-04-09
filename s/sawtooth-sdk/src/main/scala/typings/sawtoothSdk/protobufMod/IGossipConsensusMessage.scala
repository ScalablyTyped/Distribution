package typings.sawtoothSdk.protobufMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGossipConsensusMessage extends js.Object {
  /** GossipConsensusMessage message */
  var message: js.UndefOr[Uint8Array | Null] = js.undefined
  /** GossipConsensusMessage senderId */
  var senderId: js.UndefOr[Uint8Array | Null] = js.undefined
  /** GossipConsensusMessage timeToLive */
  var timeToLive: js.UndefOr[Double | Null] = js.undefined
}

object IGossipConsensusMessage {
  @scala.inline
  def apply(message: Uint8Array = null, senderId: Uint8Array = null, timeToLive: Int | Double = null): IGossipConsensusMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (senderId != null) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    if (timeToLive != null) __obj.updateDynamic("timeToLive")(timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGossipConsensusMessage]
  }
}

