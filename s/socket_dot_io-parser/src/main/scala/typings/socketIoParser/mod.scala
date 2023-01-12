package typings.socketIoParser

import typings.socketIoComponentEmitter.mod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("socket.io-parser", "Decoder")
  @js.native
  /**
    * Decoder constructor
    *
    * @param {function} reviver - custom reviver to pass down to JSON.stringify
    */
  open class Decoder ()
    extends Emitter[js.Object, js.Object, DecoderReservedEvents] {
    def this(reviver: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) = this()
    
    /**
      * Decodes an encoded packet string into packet JSON.
      *
      * @param {String} obj - encoded packet
      */
    def add(obj: Any): Unit = js.native
    
    /**
      * Decode a packet String (JSON data)
      *
      * @param {String} str
      * @return {Object} packet
      */
    /* private */ var decodeString: Any = js.native
    
    /**
      * Deallocates a parser's resources
      */
    def destroy(): Unit = js.native
    
    /* private */ var reconstructor: Any = js.native
    
    /* private */ var reviver: Any = js.native
    
    /* private */ var tryParse: Any = js.native
  }
  /* static members */
  object Decoder {
    
    @JSImport("socket.io-parser", "Decoder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("socket.io-parser", "Decoder.isPayloadValid")
    @js.native
    def isPayloadValid: Any = js.native
    inline def isPayloadValid_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isPayloadValid")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("socket.io-parser", "Encoder")
  @js.native
  /**
    * Encoder constructor
    *
    * @param {function} replacer - custom replacer to pass down to JSON.parse
    */
  open class Encoder () extends StObject {
    def this(replacer: js.ThisFunction2[/* this */ Any, /* key */ String, /* value */ Any, Any]) = this()
    
    /**
      * Encode a packet as a single string if non-binary, or as a
      * buffer sequence, depending on packet type.
      *
      * @param {Object} obj - packet object
      */
    def encode(obj: Packet): js.Array[Any] = js.native
    
    /**
      * Encode packet as 'buffer sequence' by removing blobs, and
      * deconstructing packet into object with placeholders and
      * a list of buffers.
      */
    /* private */ var encodeAsBinary: Any = js.native
    
    /**
      * Encode packet as string.
      */
    /* private */ var encodeAsString: Any = js.native
    
    /* private */ var replacer: Any = js.native
  }
  
  @js.native
  sealed trait PacketType extends StObject
  @JSImport("socket.io-parser", "PacketType")
  @js.native
  object PacketType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PacketType & Double] = js.native
    
    @js.native
    sealed trait ACK
      extends StObject
         with PacketType
    /* 3 */ val ACK: typings.socketIoParser.mod.PacketType.ACK & Double = js.native
    
    @js.native
    sealed trait BINARY_ACK
      extends StObject
         with PacketType
    /* 6 */ val BINARY_ACK: typings.socketIoParser.mod.PacketType.BINARY_ACK & Double = js.native
    
    @js.native
    sealed trait BINARY_EVENT
      extends StObject
         with PacketType
    /* 5 */ val BINARY_EVENT: typings.socketIoParser.mod.PacketType.BINARY_EVENT & Double = js.native
    
    @js.native
    sealed trait CONNECT
      extends StObject
         with PacketType
    /* 0 */ val CONNECT: typings.socketIoParser.mod.PacketType.CONNECT & Double = js.native
    
    @js.native
    sealed trait CONNECT_ERROR
      extends StObject
         with PacketType
    /* 4 */ val CONNECT_ERROR: typings.socketIoParser.mod.PacketType.CONNECT_ERROR & Double = js.native
    
    @js.native
    sealed trait DISCONNECT
      extends StObject
         with PacketType
    /* 1 */ val DISCONNECT: typings.socketIoParser.mod.PacketType.DISCONNECT & Double = js.native
    
    @js.native
    sealed trait EVENT
      extends StObject
         with PacketType
    /* 2 */ val EVENT: typings.socketIoParser.mod.PacketType.EVENT & Double = js.native
  }
  
  @JSImport("socket.io-parser", "protocol")
  @js.native
  val protocol: Double = js.native
  
  trait DecoderReservedEvents extends StObject {
    
    def decoded(packet: Packet): Unit
  }
  object DecoderReservedEvents {
    
    inline def apply(decoded: Packet => Unit): DecoderReservedEvents = {
      val __obj = js.Dynamic.literal(decoded = js.Any.fromFunction1(decoded))
      __obj.asInstanceOf[DecoderReservedEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecoderReservedEvents] (val x: Self) extends AnyVal {
      
      inline def setDecoded(value: Packet => Unit): Self = StObject.set(x, "decoded", js.Any.fromFunction1(value))
    }
  }
  
  trait Packet extends StObject {
    
    var attachments: js.UndefOr[Double] = js.undefined
    
    var data: js.UndefOr[Any] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    var nsp: String
    
    var `type`: PacketType
  }
  object Packet {
    
    inline def apply(nsp: String, `type`: PacketType): Packet = {
      val __obj = js.Dynamic.literal(nsp = nsp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Packet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      inline def setAttachments(value: Double): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
      
      inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setNsp(value: String): Self = StObject.set(x, "nsp", value.asInstanceOf[js.Any])
      
      inline def setType(value: PacketType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
