package typings.sdp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPSctpDescription extends js.Object {
  
  var maxMessageSize: js.UndefOr[Double] = js.native
  
  var port: Double = js.native
  
  var protocol: String = js.native
}
object SDPSctpDescription {
  
  @scala.inline
  def apply(port: Double, protocol: String): SDPSctpDescription = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPSctpDescription]
  }
  
  @scala.inline
  implicit class SDPSctpDescriptionOps[Self <: SDPSctpDescription] (val x: Self) extends AnyVal {
    
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSize(value: Double): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessageSize: Self = this.set("maxMessageSize", js.undefined)
  }
}
