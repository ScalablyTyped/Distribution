package typings.smooch

import typings.smooch.smoochStrings.sdkGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conversation extends StObject {
  
  var businessLastRead: Double
  
  var description: String
  
  var displayName: String
  
  var iconUrl: String
  
  var id: String
  
  var lastUpdatedAt: Double
  
  var messages: js.Array[Message]
  
  var metadata: Metadata
  
  var participants: js.Array[ConversationParticipant]
  
  var `type`: sdkGroup | String
}
object Conversation {
  
  inline def apply(
    businessLastRead: Double,
    description: String,
    displayName: String,
    iconUrl: String,
    id: String,
    lastUpdatedAt: Double,
    messages: js.Array[Message],
    metadata: Metadata,
    participants: js.Array[ConversationParticipant],
    `type`: sdkGroup | String
  ): Conversation = {
    val __obj = js.Dynamic.literal(businessLastRead = businessLastRead.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conversation] (val x: Self) extends AnyVal {
    
    inline def setBusinessLastRead(value: Double): Self = StObject.set(x, "businessLastRead", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setParticipants(value: js.Array[ConversationParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsVarargs(value: ConversationParticipant*): Self = StObject.set(x, "participants", js.Array(value*))
    
    inline def setType(value: sdkGroup | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
