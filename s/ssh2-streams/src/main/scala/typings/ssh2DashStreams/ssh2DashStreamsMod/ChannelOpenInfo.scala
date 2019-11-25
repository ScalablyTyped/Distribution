package typings.ssh2DashStreams.ssh2DashStreamsMod

import typings.ssh2DashStreams.ssh2DashStreamsStrings.`auth-agent@opensshDOTcom`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`direct-streamlocal@opensshDOTcom`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`direct-tcpip`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`forwarded-streamlocal@opensshDOTcom`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.`forwarded-tcpip`
import typings.ssh2DashStreams.ssh2DashStreamsStrings.session
import typings.ssh2DashStreams.ssh2DashStreamsStrings.x11
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.ssh2DashStreams.ssh2DashStreamsMod.X11ChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.ForwardedTcpipChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.openssh_ForwardedStreamLocalChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.openssh_AuthAgentChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.DirectTcpipChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.openssh_DirectStreamLocalChannelInfo
  - typings.ssh2DashStreams.ssh2DashStreamsMod.SessionChannelInfo
*/
trait ChannelOpenInfo extends js.Object

object ChannelOpenInfo {
  @scala.inline
  def openssh_ForwardedStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDOTcom`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def openssh_AuthAgentChannelInfo(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDOTcom`, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def X11ChannelInfo(data: X11ChannelData, packetSize: Double, sender: Double, `type`: x11, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def ForwardedTcpipChannelInfo(
    data: TcpipChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-tcpip`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def SessionChannelInfo(packetSize: Double, sender: Double, `type`: session, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def openssh_DirectStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDOTcom`,
    window: Double
  ): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
  @scala.inline
  def DirectTcpipChannelInfo(data: TcpipChannelData, packetSize: Double, sender: Double, `type`: `direct-tcpip`, window: Double): ChannelOpenInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOpenInfo]
  }
}

