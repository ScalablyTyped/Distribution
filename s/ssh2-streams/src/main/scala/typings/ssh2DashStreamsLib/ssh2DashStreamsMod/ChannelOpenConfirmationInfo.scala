package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOpenConfirmationInfo extends js.Object {
  var packetSize: scala.Double
  var recipient: scala.Double
  var sender: scala.Double
  var window: scala.Double
}

object ChannelOpenConfirmationInfo {
  @scala.inline
  def apply(packetSize: scala.Double, recipient: scala.Double, sender: scala.Double, window: scala.Double): ChannelOpenConfirmationInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize, recipient = recipient, sender = sender, window = window)
  
    __obj.asInstanceOf[ChannelOpenConfirmationInfo]
  }
}

