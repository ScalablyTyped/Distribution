package typings.ssh2DashStreams.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOpenConfirmationInfo extends js.Object {
  var packetSize: Double
  var recipient: Double
  var sender: Double
  var window: Double
}

object ChannelOpenConfirmationInfo {
  @scala.inline
  def apply(packetSize: Double, recipient: Double, sender: Double, window: Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
}

