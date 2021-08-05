package typings.ssh2Streams.mod

import typings.ssh2Streams.ssh2StreamsStrings.env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvChannelRequest
  extends StObject
     with ChannelRequest {
  
  var key: String
  
  var recipient: Double
  
  var request: env
  
  var `val`: String
  
  var wantReply: Boolean
}
object EnvChannelRequest {
  
  inline def apply(key: String, recipient: Double, `val`: String, wantReply: Boolean): EnvChannelRequest = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "env", wantReply = wantReply.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvChannelRequest]
  }
  
  extension [Self <: EnvChannelRequest](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: env): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    
    inline def setWantReply(value: Boolean): Self = StObject.set(x, "wantReply", value.asInstanceOf[js.Any])
  }
}
