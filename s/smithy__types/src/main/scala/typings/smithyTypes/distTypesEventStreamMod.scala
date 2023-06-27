package typings.smithyTypes

import typings.smithyTypes.distTypesHttpMod.HttpRequest
import typings.smithyTypes.distTypesMiddlewareMod.FinalizeHandler
import typings.smithyTypes.distTypesMiddlewareMod.FinalizeHandlerArguments
import typings.smithyTypes.distTypesMiddlewareMod.FinalizeHandlerOutput
import typings.smithyTypes.distTypesMiddlewareMod.HandlerExecutionContext
import typings.smithyTypes.distTypesResponseMod.MetadataBearer
import typings.smithyTypes.smithyTypesStrings.binary
import typings.smithyTypes.smithyTypesStrings.boolean_
import typings.smithyTypes.smithyTypesStrings.byte
import typings.smithyTypes.smithyTypesStrings.integer
import typings.smithyTypes.smithyTypesStrings.long
import typings.smithyTypes.smithyTypesStrings.short
import typings.smithyTypes.smithyTypesStrings.string_
import typings.smithyTypes.smithyTypesStrings.timestamp
import typings.smithyTypes.smithyTypesStrings.uuid
import typings.std.AsyncIterable
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventStreamMod {
  
  type BinaryHeaderValue = HeaderValue[binary, js.typedarray.Uint8Array]
  
  type BooleanHeaderValue = HeaderValue[boolean_, Boolean]
  
  type ByteHeaderValue = HeaderValue[byte, Double]
  
  trait EventStreamMarshaller[StreamType] extends StObject {
    
    def deserialize[T](body: StreamType, deserializer: js.Function1[/* input */ Record[String, Message], js.Promise[T]]): AsyncIterable[T]
    @JSName("deserialize")
    var deserialize_Original: EventStreamMarshallerDeserFn[StreamType]
    
    def serialize[T](input: AsyncIterable[T], serializer: js.Function1[/* event */ T, Message]): StreamType
    @JSName("serialize")
    var serialize_Original: EventStreamMarshallerSerFn[StreamType]
  }
  object EventStreamMarshaller {
    
    inline def apply[StreamType](
      deserialize: (StreamType, /* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]]) => AsyncIterable[Any],
      serialize: (/* input */ AsyncIterable[Any], /* serializer */ js.Function1[/* event */ Any, Message]) => StreamType
    ): EventStreamMarshaller[StreamType] = {
      val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction2(deserialize), serialize = js.Any.fromFunction2(serialize))
      __obj.asInstanceOf[EventStreamMarshaller[StreamType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventStreamMarshaller[?], StreamType] (val x: Self & EventStreamMarshaller[StreamType]) extends AnyVal {
      
      inline def setDeserialize(
        value: (StreamType, /* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]]) => AsyncIterable[Any]
      ): Self = StObject.set(x, "deserialize", js.Any.fromFunction2(value))
      
      inline def setSerialize(
        value: (/* input */ AsyncIterable[Any], /* serializer */ js.Function1[/* event */ Any, Message]) => StreamType
      ): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    }
  }
  
  type EventStreamMarshallerDeserFn[StreamType] = js.Function2[
    /* body */ StreamType, 
    /* deserializer */ js.Function1[/* input */ Record[String, Message], js.Promise[Any]], 
    AsyncIterable[Any]
  ]
  
  type EventStreamMarshallerSerFn[StreamType] = js.Function2[
    /* input */ AsyncIterable[Any], 
    /* serializer */ js.Function1[/* event */ Any, Message], 
    StreamType
  ]
  
  @js.native
  trait EventStreamPayloadHandler extends StObject {
    
    def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](next: FinalizeHandler[Input, Output], args: FinalizeHandlerArguments[Input]): js.Promise[FinalizeHandlerOutput[Output]] = js.native
    def handle[Input /* <: js.Object */, Output /* <: MetadataBearer */](
      next: FinalizeHandler[Input, Output],
      args: FinalizeHandlerArguments[Input],
      context: HandlerExecutionContext
    ): js.Promise[FinalizeHandlerOutput[Output]] = js.native
  }
  
  type EventStreamPayloadHandlerProvider = js.Function1[/* options */ Any, EventStreamPayloadHandler]
  
  trait EventStreamRequestSigner extends StObject {
    
    def sign(request: HttpRequest): js.Promise[HttpRequest]
  }
  object EventStreamRequestSigner {
    
    inline def apply(sign: HttpRequest => js.Promise[HttpRequest]): EventStreamRequestSigner = {
      val __obj = js.Dynamic.literal(sign = js.Any.fromFunction1(sign))
      __obj.asInstanceOf[EventStreamRequestSigner]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventStreamRequestSigner] (val x: Self) extends AnyVal {
      
      inline def setSign(value: HttpRequest => js.Promise[HttpRequest]): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    }
  }
  
  trait EventStreamSerdeContext extends StObject {
    
    var eventStreamMarshaller: EventStreamMarshaller[Any]
  }
  object EventStreamSerdeContext {
    
    inline def apply(eventStreamMarshaller: EventStreamMarshaller[Any]): EventStreamSerdeContext = {
      val __obj = js.Dynamic.literal(eventStreamMarshaller = eventStreamMarshaller.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventStreamSerdeContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventStreamSerdeContext] (val x: Self) extends AnyVal {
      
      inline def setEventStreamMarshaller(value: EventStreamMarshaller[Any]): Self = StObject.set(x, "eventStreamMarshaller", value.asInstanceOf[js.Any])
    }
  }
  
  type EventStreamSerdeProvider = js.Function1[/* options */ Any, EventStreamMarshaller[Any]]
  
  type EventStreamSignerProvider = js.Function1[/* options */ Any, EventStreamRequestSigner]
  
  trait HeaderValue[K /* <: String */, V] extends StObject {
    
    var `type`: K
    
    var value: V
  }
  object HeaderValue {
    
    inline def apply[K /* <: String */, V](`type`: K, value: V): HeaderValue[K, V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderValue[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderValue[?, ?], K /* <: String */, V] (val x: Self & (HeaderValue[K, V])) extends AnyVal {
      
      inline def setType(value: K): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Int64 extends StObject {
    
    val bytes: js.typedarray.Uint8Array
  }
  object Int64 {
    
    inline def apply(bytes: js.typedarray.Uint8Array): Int64 = {
      val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Int64]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Int64] (val x: Self) extends AnyVal {
      
      inline def setBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    }
  }
  
  type IntegerHeaderValue = HeaderValue[integer, Double]
  
  type LongHeaderValue = HeaderValue[long, Int64]
  
  trait Message extends StObject {
    
    var body: js.typedarray.Uint8Array
    
    var headers: MessageHeaders
  }
  object Message {
    
    inline def apply(body: js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHeaderValue = BooleanHeaderValue | ByteHeaderValue | ShortHeaderValue | IntegerHeaderValue | LongHeaderValue | BinaryHeaderValue | StringHeaderValue | TimestampHeaderValue | UuidHeaderValue
  
  type MessageHeaders = Record[String, MessageHeaderValue]
  
  type ShortHeaderValue = HeaderValue[short, Double]
  
  type StringHeaderValue = HeaderValue[string_, String]
  
  type TimestampHeaderValue = HeaderValue[timestamp, js.Date]
  
  type UuidHeaderValue = HeaderValue[uuid, String]
}
