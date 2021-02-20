package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`auth-agent@opensshDotcom`
import typings.ssh2Streams.ssh2StreamsStrings.`direct-streamlocal@opensshDotcom`
import typings.ssh2Streams.ssh2StreamsStrings.`direct-tcpip`
import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-streamlocal@opensshDotcom`
import typings.ssh2Streams.ssh2StreamsStrings.`forwarded-tcpip`
import typings.ssh2Streams.ssh2StreamsStrings.session
import typings.ssh2Streams.ssh2StreamsStrings.x11
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ssh2Streams.mod.X11ChannelInfo
  - typings.ssh2Streams.mod.ForwardedTcpipChannelInfo
  - typings.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo
  - typings.ssh2Streams.mod.opensshAuthAgentChannelInfo
  - typings.ssh2Streams.mod.DirectTcpipChannelInfo
  - typings.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo
  - typings.ssh2Streams.mod.SessionChannelInfo
*/
trait ChannelOpenInfo extends StObject
object ChannelOpenInfo {
  
  @scala.inline
  def DirectTcpipChannelInfo(data: TcpipChannelData, packetSize: Double, sender: Double, `type`: `direct-tcpip`, window: Double): typings.ssh2Streams.mod.DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.DirectTcpipChannelInfo]
  }
  
  @scala.inline
  def ForwardedTcpipChannelInfo(
    data: TcpipChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-tcpip`,
    window: Double
  ): typings.ssh2Streams.mod.ForwardedTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.ForwardedTcpipChannelInfo]
  }
  
  @scala.inline
  def SessionChannelInfo(packetSize: Double, sender: Double, `type`: session, window: Double): typings.ssh2Streams.mod.SessionChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.SessionChannelInfo]
  }
  
  @scala.inline
  def X11ChannelInfo(data: X11ChannelData, packetSize: Double, sender: Double, `type`: x11, window: Double): typings.ssh2Streams.mod.X11ChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.X11ChannelInfo]
  }
  
  @scala.inline
  def opensshAuthAgentChannelInfo(packetSize: Double, sender: Double, `type`: `auth-agent@opensshDotcom`, window: Double): typings.ssh2Streams.mod.opensshAuthAgentChannelInfo = {
    val __obj = js.Dynamic.literal(packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.opensshAuthAgentChannelInfo]
  }
  
  @scala.inline
  def opensshDirectStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `direct-streamlocal@opensshDotcom`,
    window: Double
  ): typings.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.opensshDirectStreamLocalChannelInfo]
  }
  
  @scala.inline
  def opensshForwardedStreamLocalChannelInfo(
    data: SocketChannelData,
    packetSize: Double,
    sender: Double,
    `type`: `forwarded-streamlocal@opensshDotcom`,
    window: Double
  ): typings.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.ssh2Streams.mod.opensshForwardedStreamLocalChannelInfo]
  }
}
