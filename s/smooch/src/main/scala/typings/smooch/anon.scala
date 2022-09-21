package typings.smooch

import typings.smooch.smoochStrings.sdkGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined smooch.ConversationData & {  avatarUrl :string,   name :string} */
  trait ConversationDataavatarUrl extends StObject {
    
    var avatarUrl: String
    
    var conversation: Conversation
    
    var name: String
  }
  object ConversationDataavatarUrl {
    
    inline def apply(avatarUrl: String, conversation: Conversation, name: String): ConversationDataavatarUrl = {
      val __obj = js.Dynamic.literal(avatarUrl = avatarUrl.asInstanceOf[js.Any], conversation = conversation.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConversationDataavatarUrl]
    }
    
    extension [Self <: ConversationDataavatarUrl](x: Self) {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setConversation(value: Conversation): Self = StObject.set(x, "conversation", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<smooch.Conversation> */
  trait PartialConversation extends StObject {
    
    var businessLastRead: js.UndefOr[Double] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var iconUrl: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var lastUpdatedAt: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[js.Array[Message]] = js.undefined
    
    var metadata: js.UndefOr[Metadata] = js.undefined
    
    var participants: js.UndefOr[js.Array[ConversationParticipant]] = js.undefined
    
    var `type`: js.UndefOr[sdkGroup | String] = js.undefined
  }
  object PartialConversation {
    
    inline def apply(): PartialConversation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConversation]
    }
    
    extension [Self <: PartialConversation](x: Self) {
      
      inline def setBusinessLastRead(value: Double): Self = StObject.set(x, "businessLastRead", value.asInstanceOf[js.Any])
      
      inline def setBusinessLastReadUndefined: Self = StObject.set(x, "businessLastRead", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
      
      inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setParticipants(value: js.Array[ConversationParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
      
      inline def setParticipantsVarargs(value: ConversationParticipant*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setType(value: sdkGroup | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooch.smooch.Nullable<smooch.Conversation>> */
  trait PartialNullableConversati extends StObject {
    
    var businessLastRead: js.UndefOr[Double | Null] = js.undefined
    
    var description: js.UndefOr[String | Null] = js.undefined
    
    var displayName: js.UndefOr[String | Null] = js.undefined
    
    var iconUrl: js.UndefOr[String | Null] = js.undefined
    
    var id: js.UndefOr[String | Null] = js.undefined
    
    var lastUpdatedAt: js.UndefOr[Double | Null] = js.undefined
    
    var messages: js.UndefOr[js.Array[Message] | Null] = js.undefined
    
    var metadata: js.UndefOr[Metadata | Null] = js.undefined
    
    var participants: js.UndefOr[js.Array[ConversationParticipant] | Null] = js.undefined
    
    var `type`: js.UndefOr[sdkGroup | String | Null] = js.undefined
  }
  object PartialNullableConversati {
    
    inline def apply(): PartialNullableConversati = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialNullableConversati]
    }
    
    extension [Self <: PartialNullableConversati](x: Self) {
      
      inline def setBusinessLastRead(value: Double): Self = StObject.set(x, "businessLastRead", value.asInstanceOf[js.Any])
      
      inline def setBusinessLastReadNull: Self = StObject.set(x, "businessLastRead", null)
      
      inline def setBusinessLastReadUndefined: Self = StObject.set(x, "businessLastRead", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionNull: Self = StObject.set(x, "description", null)
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlNull: Self = StObject.set(x, "iconUrl", null)
      
      inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdNull: Self = StObject.set(x, "id", null)
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLastUpdatedAt(value: Double): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
      
      inline def setLastUpdatedAtNull: Self = StObject.set(x, "lastUpdatedAt", null)
      
      inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
      
      inline def setMessages(value: js.Array[Message]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesNull: Self = StObject.set(x, "messages", null)
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setParticipants(value: js.Array[ConversationParticipant]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
      
      inline def setParticipantsNull: Self = StObject.set(x, "participants", null)
      
      inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
      
      inline def setParticipantsVarargs(value: ConversationParticipant*): Self = StObject.set(x, "participants", js.Array(value*))
      
      inline def setType(value: sdkGroup | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<smooch.User> */
  trait PartialUser extends StObject {
    
    var avatarUrl: js.UndefOr[String] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var externalId: js.UndefOr[String] = js.undefined
    
    var givenName: js.UndefOr[String] = js.undefined
    
    var hasPaymendInfo: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var metadata: js.UndefOr[Metadata] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var signedUpAt: js.UndefOr[String] = js.undefined
    
    var surname: js.UndefOr[String] = js.undefined
  }
  object PartialUser {
    
    inline def apply(): PartialUser = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialUser]
    }
    
    extension [Self <: PartialUser](x: Self) {
      
      inline def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
      
      inline def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
      
      inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
      
      inline def setGivenName(value: String): Self = StObject.set(x, "givenName", value.asInstanceOf[js.Any])
      
      inline def setGivenNameUndefined: Self = StObject.set(x, "givenName", js.undefined)
      
      inline def setHasPaymendInfo(value: Boolean): Self = StObject.set(x, "hasPaymendInfo", value.asInstanceOf[js.Any])
      
      inline def setHasPaymendInfoUndefined: Self = StObject.set(x, "hasPaymendInfo", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setSignedUpAt(value: String): Self = StObject.set(x, "signedUpAt", value.asInstanceOf[js.Any])
      
      inline def setSignedUpAtUndefined: Self = StObject.set(x, "signedUpAt", js.undefined)
      
      inline def setSurname(value: String): Self = StObject.set(x, "surname", value.asInstanceOf[js.Any])
      
      inline def setSurnameUndefined: Self = StObject.set(x, "surname", js.undefined)
    }
  }
}
