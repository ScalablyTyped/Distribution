package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait openssh_AuthAgentChannelInfo extends ChannelOpenInfo {
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`auth-agent@opensshDOTcom`
  var window: scala.Double
}

object openssh_AuthAgentChannelInfo {
  @scala.inline
  def apply(
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.`auth-agent@opensshDOTcom`,
    window: scala.Double
  ): openssh_AuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("packetSize")(packetSize)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[openssh_AuthAgentChannelInfo]
  }
}

