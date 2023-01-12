package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPSctpDescription extends StObject {
  
  var maxMessageSize: js.UndefOr[Double] = js.undefined
  
  var port: Double
  
  var protocol: String
}
object SDPSctpDescription {
  
  inline def apply(port: Double, protocol: String): SDPSctpDescription = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPSctpDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SDPSctpDescription] (val x: Self) extends AnyVal {
    
    inline def setMaxMessageSize(value: Double): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
