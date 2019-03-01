package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionChannelInfo extends ChannelOpenInfo {
  var packetSize: scala.Double
  var sender: scala.Double
  var `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.session
  var window: scala.Double
}

object SessionChannelInfo {
  @scala.inline
  def apply(
    packetSize: scala.Double,
    sender: scala.Double,
    `type`: ssh2DashStreamsLib.ssh2DashStreamsLibStrings.session,
    window: scala.Double
  ): SessionChannelInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("packetSize")(packetSize)
    __obj.updateDynamic("sender")(sender)
    __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[SessionChannelInfo]
  }
}

