package typings.protonsRuntime

import typings.protonsRuntime.mod.Reader
import typings.protonsRuntime.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcCodecMod {
  
  @JSImport("protons-runtime/dist/src/codec", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CODEC_TYPES extends StObject
  @JSImport("protons-runtime/dist/src/codec", "CODEC_TYPES")
  @js.native
  object CODEC_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CODEC_TYPES & Double] = js.native
    
    @js.native
    sealed trait BIT32
      extends StObject
         with CODEC_TYPES
    /* 5 */ val BIT32: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.BIT32 & Double = js.native
    
    @js.native
    sealed trait BIT64
      extends StObject
         with CODEC_TYPES
    /* 1 */ val BIT64: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.BIT64 & Double = js.native
    
    @js.native
    sealed trait END_GROUP
      extends StObject
         with CODEC_TYPES
    /* 4 */ val END_GROUP: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.END_GROUP & Double = js.native
    
    @js.native
    sealed trait LENGTH_DELIMITED
      extends StObject
         with CODEC_TYPES
    /* 2 */ val LENGTH_DELIMITED: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.LENGTH_DELIMITED & Double = js.native
    
    @js.native
    sealed trait START_GROUP
      extends StObject
         with CODEC_TYPES
    /* 3 */ val START_GROUP: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.START_GROUP & Double = js.native
    
    @js.native
    sealed trait VARINT
      extends StObject
         with CODEC_TYPES
    /* 0 */ val VARINT: typings.protonsRuntime.distSrcCodecMod.CODEC_TYPES.VARINT & Double = js.native
  }
  
  inline def createCodec[T](name: String, `type`: CODEC_TYPES, encode: EncodeFunction[T], decode: DecodeFunction[T]): Codec[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("createCodec")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], encode.asInstanceOf[js.Any], decode.asInstanceOf[js.Any])).asInstanceOf[Codec[T]]
  
  trait Codec[T] extends StObject {
    
    def decode(reader: Reader): T
    def decode(reader: Reader, length: Double): T
    @JSName("decode")
    var decode_Original: DecodeFunction[T]
    
    def encode(value: T, writer: Writer): Unit
    def encode(value: T, writer: Writer, opts: EncodeOptions): Unit
    @JSName("encode")
    var encode_Original: EncodeFunction[T]
    
    var name: String
    
    var `type`: CODEC_TYPES
  }
  object Codec {
    
    inline def apply[T](
      decode: (/* reader */ Reader, /* length */ js.UndefOr[Double]) => T,
      encode: (T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions]) => Unit,
      name: String,
      `type`: CODEC_TYPES
    ): Codec[T] = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction2(decode), encode = js.Any.fromFunction3(encode), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codec[T]]
    }
    
    extension [Self <: Codec[?], T](x: Self & Codec[T]) {
      
      inline def setDecode(value: (/* reader */ Reader, /* length */ js.UndefOr[Double]) => T): Self = StObject.set(x, "decode", js.Any.fromFunction2(value))
      
      inline def setEncode(value: (T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions]) => Unit): Self = StObject.set(x, "encode", js.Any.fromFunction3(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: CODEC_TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type DecodeFunction[T] = js.Function2[/* reader */ Reader, /* length */ js.UndefOr[Double], T]
  
  type EncodeFunction[T] = js.Function3[/* value */ T, /* writer */ Writer, /* opts */ js.UndefOr[EncodeOptions], Unit]
  
  trait EncodeOptions extends StObject {
    
    var lengthDelimited: js.UndefOr[Boolean] = js.undefined
  }
  object EncodeOptions {
    
    inline def apply(): EncodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodeOptions]
    }
    
    extension [Self <: EncodeOptions](x: Self) {
      
      inline def setLengthDelimited(value: Boolean): Self = StObject.set(x, "lengthDelimited", value.asInstanceOf[js.Any])
      
      inline def setLengthDelimitedUndefined: Self = StObject.set(x, "lengthDelimited", js.undefined)
    }
  }
}
