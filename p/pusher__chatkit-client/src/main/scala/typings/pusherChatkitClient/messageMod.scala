package typings.pusherChatkitClient

import typings.pusherChatkitClient.pusherChatkitClientStrings.`inline`
import typings.pusherChatkitClient.pusherChatkitClientStrings.attachment
import typings.pusherChatkitClient.pusherChatkitClientStrings.url
import typings.pusherChatkitClient.roomMod.PusherRoom
import typings.pusherChatkitClient.userMod.PusherUser
import typings.std.Blob
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageMod {
  
  // This is what a file looks like after it's returned by Chatkit
  trait AttachmentPayload
    extends StObject
       with MessagePayload {
    
    var customData: js.UndefOr[js.Any] = js.undefined
    
    var name: String
    
    var size: Double
    
    var `type`: String
    
    def url(): js.Promise[String]
    
    def urlExpiry(): js.Promise[Date]
  }
  object AttachmentPayload {
    
    @scala.inline
    def apply(
      name: String,
      size: Double,
      `type`: String,
      url: () => js.Promise[String],
      urlExpiry: () => js.Promise[Date]
    ): AttachmentPayload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = js.Any.fromFunction0(url), urlExpiry = js.Any.fromFunction0(urlExpiry))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttachmentPayload]
    }
    
    @scala.inline
    implicit class AttachmentPayloadMutableBuilder[Self <: AttachmentPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: () => js.Promise[String]): Self = StObject.set(x, "url", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUrlExpiry(value: () => js.Promise[Date]): Self = StObject.set(x, "urlExpiry", js.Any.fromFunction0(value))
    }
  }
  
  // This is used when uploading a file.
  trait FilePayload
    extends StObject
       with SendMessagePayload {
    
    var customData: js.UndefOr[js.Any] = js.undefined
    
    // Optional if it can be inferred from the file
    var file: Blob
    
    // Optional if it can be inferred from the file
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FilePayload {
    
    @scala.inline
    def apply(file: Blob): FilePayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePayload]
    }
    
    @scala.inline
    implicit class FilePayloadMutableBuilder[Self <: FilePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomData(value: js.Any): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDataUndefined: Self = StObject.set(x, "customData", js.undefined)
      
      @scala.inline
      def setFile(value: Blob): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait InlinePayload
    extends StObject
       with MessagePayload
       with SendMessagePayload {
    
    var content: String
    
    var `type`: String
  }
  object InlinePayload {
    
    @scala.inline
    def apply(content: String, `type`: String): InlinePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlinePayload]
    }
    
    @scala.inline
    implicit class InlinePayloadMutableBuilder[Self <: InlinePayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageFromPusher extends StObject {
    
    var createdAt: Date
    
    var id: String
    
    var parts: js.Array[MessagePart]
    
    var sender: PusherUser
  }
  object MessageFromPusher {
    
    @scala.inline
    def apply(createdAt: Date, id: String, parts: js.Array[MessagePart], sender: PusherUser): MessageFromPusher = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageFromPusher]
    }
    
    @scala.inline
    implicit class MessageFromPusherMutableBuilder[Self <: MessageFromPusher] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParts(value: js.Array[MessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: MessagePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setSender(value: PusherUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessagePart extends StObject {
    
    var partType: `inline` | url | attachment
    
    var payload: MessagePayload
  }
  object MessagePart {
    
    @scala.inline
    def apply(partType: `inline` | url | attachment, payload: MessagePayload): MessagePart = {
      val __obj = js.Dynamic.literal(partType = partType.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessagePart]
    }
    
    @scala.inline
    implicit class MessagePartMutableBuilder[Self <: MessagePart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPartType(value: `inline` | url | attachment): Self = StObject.set(x, "partType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: MessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pusherChatkitClient.messageMod.InlinePayload
    - typings.pusherChatkitClient.messageMod.UrlPayload
    - typings.pusherChatkitClient.messageMod.AttachmentPayload
  */
  trait MessagePayload extends StObject
  object MessagePayload {
    
    @scala.inline
    def AttachmentPayload(
      name: String,
      size: Double,
      `type`: String,
      url: () => js.Promise[String],
      urlExpiry: () => js.Promise[Date]
    ): typings.pusherChatkitClient.messageMod.AttachmentPayload = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = js.Any.fromFunction0(url), urlExpiry = js.Any.fromFunction0(urlExpiry))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.AttachmentPayload]
    }
    
    @scala.inline
    def InlinePayload(content: String, `type`: String): typings.pusherChatkitClient.messageMod.InlinePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.InlinePayload]
    }
    
    @scala.inline
    def UrlPayload(`type`: String, url: String): typings.pusherChatkitClient.messageMod.UrlPayload = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.UrlPayload]
    }
  }
  
  trait PusherMessage extends StObject {
    
    var createdAt: Date
    
    var id: Double
    
    var parts: js.Array[MessagePart]
    
    var room: PusherRoom
    
    var sender: PusherUser
    
    var updatedAt: Date
  }
  object PusherMessage {
    
    @scala.inline
    def apply(
      createdAt: Date,
      id: Double,
      parts: js.Array[MessagePart],
      room: PusherRoom,
      sender: PusherUser,
      updatedAt: Date
    ): PusherMessage = {
      val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[PusherMessage]
    }
    
    @scala.inline
    implicit class PusherMessageMutableBuilder[Self <: PusherMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParts(value: js.Array[MessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartsVarargs(value: MessagePart*): Self = StObject.set(x, "parts", js.Array(value :_*))
      
      @scala.inline
      def setRoom(value: PusherRoom): Self = StObject.set(x, "room", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSender(value: PusherUser): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdatedAt(value: Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pusherChatkitClient.messageMod.InlinePayload
    - typings.pusherChatkitClient.messageMod.UrlPayload
    - typings.pusherChatkitClient.messageMod.FilePayload
  */
  trait SendMessagePayload extends StObject
  object SendMessagePayload {
    
    @scala.inline
    def FilePayload(file: Blob): typings.pusherChatkitClient.messageMod.FilePayload = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.FilePayload]
    }
    
    @scala.inline
    def InlinePayload(content: String, `type`: String): typings.pusherChatkitClient.messageMod.InlinePayload = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.InlinePayload]
    }
    
    @scala.inline
    def UrlPayload(`type`: String, url: String): typings.pusherChatkitClient.messageMod.UrlPayload = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pusherChatkitClient.messageMod.UrlPayload]
    }
  }
  
  trait UrlPayload
    extends StObject
       with MessagePayload
       with SendMessagePayload {
    
    var `type`: String
    
    var url: String
  }
  object UrlPayload {
    
    @scala.inline
    def apply(`type`: String, url: String): UrlPayload = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlPayload]
    }
    
    @scala.inline
    implicit class UrlPayloadMutableBuilder[Self <: UrlPayload] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
