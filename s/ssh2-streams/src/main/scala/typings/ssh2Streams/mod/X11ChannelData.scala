package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X11ChannelData extends js.Object {
  
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
  implicit class X11ChannelDataOps[Self <: X11ChannelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSrcIP(value: String): Self = this.set("srcIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPort(value: Double): Self = this.set("srcPort", value.asInstanceOf[js.Any])
  }
}
