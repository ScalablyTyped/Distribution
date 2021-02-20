package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`direct-tcpip`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectTcpipChannelInfo extends ChannelOpenInfo {
  
  var data: TcpipChannelData = js.native
  
  var packetSize: Double = js.native
  
  var sender: Double = js.native
  
  var `type`: `direct-tcpip` = js.native
  
  var window: Double = js.native
}
object DirectTcpipChannelInfo {
  
  @scala.inline
  def apply(data: TcpipChannelData, packetSize: Double, sender: Double, `type`: `direct-tcpip`, window: Double): DirectTcpipChannelInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], packetSize = packetSize.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectTcpipChannelInfo]
  }
  
  @scala.inline
  implicit class DirectTcpipChannelInfoMutableBuilder[Self <: DirectTcpipChannelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: TcpipChannelData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketSize(value: Double): Self = StObject.set(x, "packetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSender(value: Double): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `direct-tcpip`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
  }
}
