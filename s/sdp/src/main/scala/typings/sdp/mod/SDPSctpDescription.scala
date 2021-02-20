package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SDPSctpDescription extends StObject {
  
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
  implicit class SDPSctpDescriptionMutableBuilder[Self <: SDPSctpDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
