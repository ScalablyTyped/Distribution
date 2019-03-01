package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvChannelRequest extends ChannelRequest {
  var key: java.lang.String
  var recipient: scala.Double
  var request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.env
  var `val`: java.lang.String
  var wantReply: scala.Boolean
}

object EnvChannelRequest {
  @scala.inline
  def apply(
    key: java.lang.String,
    recipient: scala.Double,
    request: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.env,
    `val`: java.lang.String,
    wantReply: scala.Boolean
  ): EnvChannelRequest = {
    val __obj = js.Dynamic.literal(`val` = `val`)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("recipient")(recipient)
    __obj.updateDynamic("request")(request)
    __obj.updateDynamic("wantReply")(wantReply)
    __obj.asInstanceOf[EnvChannelRequest]
  }
}

