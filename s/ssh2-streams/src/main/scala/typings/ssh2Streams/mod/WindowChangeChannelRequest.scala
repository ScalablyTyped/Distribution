package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`window-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowChangeChannelRequest
  extends StObject
     with ChannelRequest {
  
  var cols: Double
  
  var height: Double
  
  var recipient: Double
  
  var request: `window-change`
  
  var rows: Double
  
  var width: Double
}
object WindowChangeChannelRequest {
  
  inline def apply(cols: Double, height: Double, recipient: Double, rows: Double, width: Double): WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "window-change", rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowChangeChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowChangeChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `window-change`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
