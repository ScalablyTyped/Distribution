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
  
  var modes: Any
  
  var recipient: Double
  
  var request: `pty-req`
  
  var rows: Double
  
  var term: String
  
  var wantReply: Boolean
  
  var width: Double
}
object PseudoTtyChannelRequest {
  
  inline def apply(
    cols: Double,
    height: Double,
    modes: Any,
    recipient: Double,
    rows: Double,
    term: String,
    wantReply: Boolean,
    width: Double
  ): PseudoTtyChannelRequest = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "pty-req", rows = rows.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any], wantReply = wantReply.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoTtyChannelRequest]
  }
  
  extension [Self <: PseudoTtyChannelRequest](x: Self) {
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setModes(value: Any): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `pty-req`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
