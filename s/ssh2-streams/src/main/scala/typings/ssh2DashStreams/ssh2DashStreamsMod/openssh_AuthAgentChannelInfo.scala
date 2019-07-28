package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`auth-agent@opensshDOTcom`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelInfo extends ChannelOpenInfo {
  var packetSize: Double
  var sender: Double
  var `type`: `auth-agent@opensshDOTcom`
  var window: Double
}

object openssh_AuthAgentChannelInfo {
  @scala.inline
  def apply(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDOTcom`, window: Double): openssh_AuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize, sender = sender, window = window)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[openssh_AuthAgentChannelInfo]
  }
}

