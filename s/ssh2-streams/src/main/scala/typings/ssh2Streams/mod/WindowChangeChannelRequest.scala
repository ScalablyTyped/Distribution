package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`window-change`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowChangeChannelRequest extends ChannelRequest {
  
  var cols: Double = js.native
  
  var height: Double = js.native
  
  var recipient: Double = js.native
  
  var request: `window-change` = js.native
  
  var rows: Double = js.native
  
  var width: Double = js.native
}
object WindowChangeChannelRequest {
  
  @scala.inline
  def apply(
    cols: Double,
    height: Double,
    recipient: Double,
    request: `window-change`,
    rows: Double,
    width: Double
  ): WindowChangeChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowChangeChannelRequest]
  }
  
  @scala.inline
  implicit class WindowChangeChannelRequestMutableBuilder[Self <: WindowChangeChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `window-change`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
