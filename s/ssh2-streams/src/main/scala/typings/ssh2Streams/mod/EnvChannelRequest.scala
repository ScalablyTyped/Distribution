package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.env
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvChannelRequest extends ChannelRequest {
  var key: String
  var recipient: Double
  var request: env
  var `val`: String
  var wantReply: Boolean
}

object EnvChannelRequest {
  @scala.inline
  def apply(key: String, recipient: Double, request: env, `val`: String, wantReply: Boolean): EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvChannelRequest]
  }
}

