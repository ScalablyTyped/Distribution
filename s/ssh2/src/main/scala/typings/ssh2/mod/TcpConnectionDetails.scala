package typings.ssh2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpConnectionDetails extends js.Object {
  
  /** The remote IP the connection was received on (given in earlier call to `forwardIn()`). */
  var destIP: String = js.native
  
  /** The remote port the connection was received on (given in earlier call to `forwardIn()`). */
  var destPort: Double = js.native
  
  /** The originating IP of the connection. */
  var srcIP: String = js.native
  
  /** The originating port of the connection. */
  var srcPort: Double = js.native
}
object TcpConnectionDetails {
  
  @scala.inline
  def apply(destIP: String, destPort: Double, srcIP: String, srcPort: Double): TcpConnectionDetails = {
    val __obj = js.Dynamic.literal(destIP = destIP.asInstanceOf[js.Any], destPort = destPort.asInstanceOf[js.Any], srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpConnectionDetails]
  }
  
  @scala.inline
  implicit class TcpConnectionDetailsOps[Self <: TcpConnectionDetails] (val x: Self) extends AnyVal {
    
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
    def setDestIP(value: String): Self = this.set("destIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestPort(value: Double): Self = this.set("destPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcIP(value: String): Self = this.set("srcIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPort(value: Double): Self = this.set("srcPort", value.asInstanceOf[js.Any])
  }
}
