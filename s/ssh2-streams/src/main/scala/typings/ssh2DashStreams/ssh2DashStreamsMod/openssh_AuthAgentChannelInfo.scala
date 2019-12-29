package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`auth-agent@opensshDotcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelInfo extends ChannelOpenInfo {
  var packetSize: Double
  var sender: Double
  var `type`: `auth-agent@opensshDotcom`
  var window: Double
}

object openssh_AuthAgentChannelInfo {
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDotcom`, window: Double): openssh_AuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[openssh_AuthAgentChannelInfo]
  }
}

