package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.`pty-req`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PseudoTtyChannelRequest
  extends StObject
     with ChannelRequest {
  
  var cols: Double
  
  var height: Double
  
  var modes: js.Any
  
  var recipient: Double
  
  var request: `pty-req`
  
  var rows: Double
  
  var term: String
  
  var wantReply: Boolean
  
  var width: Double
}
object PseudoTtyChannelRequest {
  
  @scala.inline
  def apply(
    cols: Double,
    height: Double,
    modes: js.Any,
    recipient: Double,
    rows: Double,
    term: String,
    wantReply: Boolean,
    width: Double
  ): PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "pty-req", rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyChannelRequest]
  }
  
  @scala.inline
  implicit class PseudoTtyChannelRequestMutableBuilder[Self <: PseudoTtyChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModes(value: js.Any): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: `pty-req`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
