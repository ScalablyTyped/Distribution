package typings.smooch

import typings.smooch.smoochStrings.business
import typings.smooch.smoochStrings.user
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  var displayName: String
  
  var id: String
  
  var received: Double
  
  var role: user | business
  
  var source: MessageSource
  
  var text: String
  
  var `type`: ContentType
  
  var userId: String
}
object Message {
  
  inline def apply(
    displayName: String,
    id: String,
    received: Double,
    role: user | business,
    source: MessageSource,
    text: String,
    `type`: ContentType,
    userId: String
  ): Message = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  extension [Self <: Message](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    
    inline def setRole(value: user | business): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setSource(value: MessageSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: ContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
