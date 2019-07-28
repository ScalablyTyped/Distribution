package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.env
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
    val __obj = js.Dynamic.literal(key = key, recipient = recipient, request = request, wantReply = wantReply)
    __obj.updateDynamic("val")(`val`)
    __obj.asInstanceOf[EnvChannelRequest]
  }
}

