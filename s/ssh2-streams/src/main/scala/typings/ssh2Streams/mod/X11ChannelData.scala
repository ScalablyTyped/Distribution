package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X11ChannelData extends StObject {
  
  var srcIP: String = js.native
  
  var srcPort: Double = js.native
}
object X11ChannelData {
  
  @scala.inline
  def apply(srcIP: String, srcPort: Double): X11ChannelData = {
    val __obj = js.Dynamic.literal(srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11ChannelData]
  }
  
  @scala.inline
  implicit class X11ChannelDataMutableBuilder[Self <: X11ChannelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
