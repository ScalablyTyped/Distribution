package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SentMessage extends StObject {
  
  var modified_message: String
  
  var ordinal: Double
  
  var server_timestamp: js.Date
}
object SentMessage {
  
  inline def apply(modified_message: String, ordinal: Double, server_timestamp: js.Date): SentMessage = {
    val __obj = js.Dynamic.literal(modified_message = modified_message.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], server_timestamp = server_timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SentMessage]
  }
  
  extension [Self <: SentMessage](x: Self) {
    
    inline def setModified_message(value: String): Self = StObject.set(x, "modified_message", value.asInstanceOf[js.Any])
    
    inline def setOrdinal(value: Double): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
    
    inline def setServer_timestamp(value: js.Date): Self = StObject.set(x, "server_timestamp", value.asInstanceOf[js.Any])
  }
}
