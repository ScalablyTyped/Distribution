package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOpenFailureInfo extends js.Object {
  var description: String
  var reason: String
  var reasonCode: Double
  var recipient: Double
}

object ChannelOpenFailureInfo {
  @scala.inline
  def apply(description: String, reason: String, reasonCode: Double, recipient: Double): ChannelOpenFailureInfo = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], reasonCode = reasonCode.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenFailureInfo]
  }
}

