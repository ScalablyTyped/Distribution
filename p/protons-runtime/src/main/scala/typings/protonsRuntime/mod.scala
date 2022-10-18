package typings.protonsRuntime

import typings.protonsRuntime.distSrcCodecMod.Codec
import typings.protonsRuntime.distSrcCodecMod.EncodeOptions
import typings.protonsRuntime.protonsRuntimeBooleans.`true`
import typings.uint8arraylist.mod.Uint8ArrayList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protons-runtime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeMessage[T](buf: js.typedarray.Uint8Array, codec: Codec[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMessage")(buf.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def decodeMessage[T](buf: Uint8ArrayList, codec: Codec[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("decodeMessage")(buf.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def encodeMessage[T](message: T, codec: Codec[T]): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeMessage")(message.asInstanceOf[js.Any], codec.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def enumeration[T](v: Any): Codec[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumeration")(v.asInstanceOf[js.Any]).asInstanceOf[Codec[T]]
  
  inline def message[T](
    encode: js.Function3[/* obj */ T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions], Unit],
    decode: js.Function2[/* reader */ Reader, /* length */ js.UndefOr[Double], T]
  ): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("message")(encode.asInstanceOf[js.Any], decode.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  trait FieldDef extends StObject {
    
    var codec: Codec[Any]
    
    var name: String
    
    var optional: js.UndefOr[`true`] = js.undefined
    
    var packed: js.UndefOr[`true`] = js.undefined
    
    var repeats: js.UndefOr[`true`] = js.undefined
  }
  object FieldDef {
    
    inline def apply(codec: Codec[Any], name: String): FieldDef = {
      val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldDef]
    }
    
    extension [Self <: FieldDef](x: Self) {
      
      inline def setCodec(value: Codec[Any]): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      inline def setPacked(value: `true`): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setPackedUndefined: Self = StObject.set(x, "packed", js.undefined)
      
      inline def setRepeats(value: `true`): Self = StObject.set(x, "repeats", value.asInstanceOf[js.Any])
      
      inline def setRepeatsUndefined: Self = StObject.set(x, "repeats", js.undefined)
    }
  }
  
  @js.native
  trait Reader extends StObject {
    
    /**
      * Reads a varint as a boolean
      */
    def bool(): Boolean = js.native
    
    /**
      * Read buffer
      */
    var buf: js.typedarray.Uint8Array = js.native
    
    /**
      * Reads a sequence of bytes preceded by its length as a varint
      */
    def bytes(): js.typedarray.Uint8Array = js.native
    
    /**
      * Reads a double (64 bit float) as a number
      */
    def double(): Double = js.native
    
    /**
      * Reads fixed 32 bits as an unsigned 32 bit integer
      */
    def fixed32(): Double = js.native
    
    /**
      * Reads fixed 64 bits
      */
    def fixed64(): js.BigInt = js.native
    
    /**
      * Reads a float (32 bit) as a number
      */
    def float(): Double = js.native
    
    /**
      * Reads a varint as a signed 32 bit value
      */
    def int32(): Double = js.native
    
    /**
      * Reads a varint as a signed 64 bit value
      */
    def int64(): js.BigInt = js.native
    
    /**
      * Read buffer length
      */
    var len: Double = js.native
    
    /**
      * Read buffer position
      */
    var pos: Double = js.native
    
    /**
      * Reads fixed 32 bits as a signed 32 bit integer
      */
    def sfixed32(): Double = js.native
    
    /**
      * Reads zig-zag encoded fixed 64 bits
      */
    def sfixed64(): js.BigInt = js.native
    
    /**
      * Reads a zig-zag encoded varint as a signed 32 bit value
      */
    def sint32(): Double = js.native
    
    /**
      * Reads a zig-zag encoded varint as a signed 64 bit value
      */
    def sint64(): js.BigInt = js.native
    
    /**
      * Skips the specified number of bytes if specified, otherwise skips a varints`
      */
    def skip(): Unit = js.native
    def skip(length: Double): Unit = js.native
    
    /**
      * Skips the next element of the specified wire type
      */
    def skipType(wireType: Double): Unit = js.native
    
    /**
      * Reads a string preceded by its byte length as a varint
      */
    def string(): String = js.native
    
    /**
      * Reads a varint as an unsigned 32 bit value
      */
    def uint32(): Double = js.native
    
    /**
      * Reads a varint as an unsigned 64 bit value
      */
    def uint64(): js.BigInt = js.native
  }
  
  trait Writer extends StObject {
    
    /**
      * Writes a boolish value as a varint
      */
    def bool(value: Boolean): Writer
    
    /**
      * Writes a sequence of bytes
      */
    def bytes(value: js.typedarray.Uint8Array): Writer
    
    /**
      * Writes a double (64 bit float)
      */
    def double(value: Double): Writer
    
    /**
      * Finishes the write operation
      */
    def finish(): js.typedarray.Uint8Array
    
    /**
      * Writes an unsigned 32 bit value as fixed 32 bits
      */
    def fixed32(value: Double): Writer
    
    /**
      * Writes an unsigned 64 bit value as fixed 64 bits
      */
    def fixed64(value: js.BigInt): Writer
    
    /**
      * Writes a float (32 bit)
      */
    def float(value: Double): Writer
    
    /**
      * Forks this writer's state by pushing it to a stack.
      * Calling {@link Writer#reset|reset} or {@link Writer#ldelim|ldelim} resets the writer to the previous state.
      */
    def fork(): Writer
    
    /**
      * Writes a signed 32 bit value as a varint`
      */
    def int32(value: Double): Writer
    
    /**
      * Writes a signed 64 bit value as a varint
      */
    def int64(value: js.BigInt): Writer
    
    /**
      * Resets to the last state and appends the fork state's current write length as a varint followed by its operations.
      */
    def ldelim(): Writer
    
    /**
      * Current length
      */
    var len: Double
    
    /**
      * Resets this instance to the last state.
      */
    def reset(): Writer
    
    /**
      * Writes a signed 32 bit value as fixed 32 bits
      */
    def sfixed32(value: Double): Writer
    
    /**
      * Writes a signed 64 bit value as fixed 64 bits
      */
    def sfixed64(value: js.BigInt): Writer
    
    /**
      * Writes a 32 bit value as a varint, zig-zag encoded
      */
    def sint32(value: Double): Writer
    
    /**
      * Writes a signed 64 bit value as a varint, zig-zag encoded
      */
    def sint64(value: js.BigInt): Writer
    
    /**
      * Writes a string
      */
    def string(value: String): Writer
    
    /**
      * Writes an unsigned 32 bit value as a varint
      */
    def uint32(value: Double): Writer
    
    /**
      * Writes an unsigned 64 bit value as a varint
      */
    def uint64(value: js.BigInt): Writer
  }
  object Writer {
    
    inline def apply(
      bool: Boolean => Writer,
      bytes: js.typedarray.Uint8Array => Writer,
      double: Double => Writer,
      finish: () => js.typedarray.Uint8Array,
      fixed32: Double => Writer,
      fixed64: js.BigInt => Writer,
      float: Double => Writer,
      fork: () => Writer,
      int32: Double => Writer,
      int64: js.BigInt => Writer,
      ldelim: () => Writer,
      len: Double,
      reset: () => Writer,
      sfixed32: Double => Writer,
      sfixed64: js.BigInt => Writer,
      sint32: Double => Writer,
      sint64: js.BigInt => Writer,
      string: String => Writer,
      uint32: Double => Writer,
      uint64: js.BigInt => Writer
    ): Writer = {
      val __obj = js.Dynamic.literal(bool = js.Any.fromFunction1(bool), bytes = js.Any.fromFunction1(bytes), double = js.Any.fromFunction1(double), finish = js.Any.fromFunction0(finish), fixed32 = js.Any.fromFunction1(fixed32), fixed64 = js.Any.fromFunction1(fixed64), float = js.Any.fromFunction1(float), fork = js.Any.fromFunction0(fork), int32 = js.Any.fromFunction1(int32), int64 = js.Any.fromFunction1(int64), ldelim = js.Any.fromFunction0(ldelim), len = len.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), sfixed32 = js.Any.fromFunction1(sfixed32), sfixed64 = js.Any.fromFunction1(sfixed64), sint32 = js.Any.fromFunction1(sint32), sint64 = js.Any.fromFunction1(sint64), string = js.Any.fromFunction1(string), uint32 = js.Any.fromFunction1(uint32), uint64 = js.Any.fromFunction1(uint64))
      __obj.asInstanceOf[Writer]
    }
    
    extension [Self <: Writer](x: Self) {
      
      inline def setBool(value: Boolean => Writer): Self = StObject.set(x, "bool", js.Any.fromFunction1(value))
      
      inline def setBytes(value: js.typedarray.Uint8Array => Writer): Self = StObject.set(x, "bytes", js.Any.fromFunction1(value))
      
      inline def setDouble(value: Double => Writer): Self = StObject.set(x, "double", js.Any.fromFunction1(value))
      
      inline def setFinish(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setFixed32(value: Double => Writer): Self = StObject.set(x, "fixed32", js.Any.fromFunction1(value))
      
      inline def setFixed64(value: js.BigInt => Writer): Self = StObject.set(x, "fixed64", js.Any.fromFunction1(value))
      
      inline def setFloat(value: Double => Writer): Self = StObject.set(x, "float", js.Any.fromFunction1(value))
      
      inline def setFork(value: () => Writer): Self = StObject.set(x, "fork", js.Any.fromFunction0(value))
      
      inline def setInt32(value: Double => Writer): Self = StObject.set(x, "int32", js.Any.fromFunction1(value))
      
      inline def setInt64(value: js.BigInt => Writer): Self = StObject.set(x, "int64", js.Any.fromFunction1(value))
      
      inline def setLdelim(value: () => Writer): Self = StObject.set(x, "ldelim", js.Any.fromFunction0(value))
      
      inline def setLen(value: Double): Self = StObject.set(x, "len", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Writer): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSfixed32(value: Double => Writer): Self = StObject.set(x, "sfixed32", js.Any.fromFunction1(value))
      
      inline def setSfixed64(value: js.BigInt => Writer): Self = StObject.set(x, "sfixed64", js.Any.fromFunction1(value))
      
      inline def setSint32(value: Double => Writer): Self = StObject.set(x, "sint32", js.Any.fromFunction1(value))
      
      inline def setSint64(value: js.BigInt => Writer): Self = StObject.set(x, "sint64", js.Any.fromFunction1(value))
      
      inline def setString(value: String => Writer): Self = StObject.set(x, "string", js.Any.fromFunction1(value))
      
      inline def setUint32(value: Double => Writer): Self = StObject.set(x, "uint32", js.Any.fromFunction1(value))
      
      inline def setUint64(value: js.BigInt => Writer): Self = StObject.set(x, "uint64", js.Any.fromFunction1(value))
    }
  }
}
