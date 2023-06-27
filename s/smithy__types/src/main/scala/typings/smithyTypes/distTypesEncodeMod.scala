package typings.smithyTypes

import typings.smithyTypes.distTypesEventStreamMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEncodeMod {
  
  trait AvailableMessage extends StObject {
    
    def getMessage(): js.UndefOr[Message]
    
    def isEndOfStream(): Boolean
  }
  object AvailableMessage {
    
    inline def apply(getMessage: () => js.UndefOr[Message], isEndOfStream: () => Boolean): AvailableMessage = {
      val __obj = js.Dynamic.literal(getMessage = js.Any.fromFunction0(getMessage), isEndOfStream = js.Any.fromFunction0(isEndOfStream))
      __obj.asInstanceOf[AvailableMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableMessage] (val x: Self) extends AnyVal {
      
      inline def setGetMessage(value: () => js.UndefOr[Message]): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
      
      inline def setIsEndOfStream(value: () => Boolean): Self = StObject.set(x, "isEndOfStream", js.Any.fromFunction0(value))
    }
  }
  
  trait AvailableMessages extends StObject {
    
    def getMessages(): js.Array[Message]
    
    def isEndOfStream(): Boolean
  }
  object AvailableMessages {
    
    inline def apply(getMessages: () => js.Array[Message], isEndOfStream: () => Boolean): AvailableMessages = {
      val __obj = js.Dynamic.literal(getMessages = js.Any.fromFunction0(getMessages), isEndOfStream = js.Any.fromFunction0(isEndOfStream))
      __obj.asInstanceOf[AvailableMessages]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableMessages] (val x: Self) extends AnyVal {
      
      inline def setGetMessages(value: () => js.Array[Message]): Self = StObject.set(x, "getMessages", js.Any.fromFunction0(value))
      
      inline def setIsEndOfStream(value: () => Boolean): Self = StObject.set(x, "isEndOfStream", js.Any.fromFunction0(value))
    }
  }
  
  trait MessageDecoder extends StObject {
    
    def decode(message: js.typedarray.ArrayBufferView): Message
    
    def endOfStream(): Unit
    
    def feed(message: js.typedarray.ArrayBufferView): Unit
    
    def getAvailableMessages(): AvailableMessages
    
    def getMessage(): AvailableMessage
  }
  object MessageDecoder {
    
    inline def apply(
      decode: js.typedarray.ArrayBufferView => Message,
      endOfStream: () => Unit,
      feed: js.typedarray.ArrayBufferView => Unit,
      getAvailableMessages: () => AvailableMessages,
      getMessage: () => AvailableMessage
    ): MessageDecoder = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), endOfStream = js.Any.fromFunction0(endOfStream), feed = js.Any.fromFunction1(feed), getAvailableMessages = js.Any.fromFunction0(getAvailableMessages), getMessage = js.Any.fromFunction0(getMessage))
      __obj.asInstanceOf[MessageDecoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageDecoder] (val x: Self) extends AnyVal {
      
      inline def setDecode(value: js.typedarray.ArrayBufferView => Message): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEndOfStream(value: () => Unit): Self = StObject.set(x, "endOfStream", js.Any.fromFunction0(value))
      
      inline def setFeed(value: js.typedarray.ArrayBufferView => Unit): Self = StObject.set(x, "feed", js.Any.fromFunction1(value))
      
      inline def setGetAvailableMessages(value: () => AvailableMessages): Self = StObject.set(x, "getAvailableMessages", js.Any.fromFunction0(value))
      
      inline def setGetMessage(value: () => AvailableMessage): Self = StObject.set(x, "getMessage", js.Any.fromFunction0(value))
    }
  }
  
  trait MessageEncoder extends StObject {
    
    def encode(message: Message): js.typedarray.Uint8Array
  }
  object MessageEncoder {
    
    inline def apply(encode: Message => js.typedarray.Uint8Array): MessageEncoder = {
      val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[MessageEncoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageEncoder] (val x: Self) extends AnyVal {
      
      inline def setEncode(value: Message => js.typedarray.Uint8Array): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
}
