package typings.pvtsutils

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvtsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pvtsutils", "BufferSourceConverter")
  @js.native
  open class BufferSourceConverter () extends StObject
  object BufferSourceConverter {
    
    @JSImport("pvtsutils", "BufferSourceConverter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Concatenates buffers
      * @param buffers List of buffers
      * @returns Concatenated buffer
      */
    /* static member */
    inline def concat(buffers: BufferSource*): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.typedarray.ArrayBuffer]
    /**
      * Concatenates buffers
      * @param buffers List of buffers
      * @returns Concatenated buffer
      */
    /* static member */
    inline def concat(buffers: js.Array[BufferSource]): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    /**
      * Concatenates buffers and converts it into specified ArrayBufferView
      * @param buffers List of buffers
      * @param type ArrayBufferView constructor
      * @returns Concatenated buffer of specified type
      */
    /* static member */
    inline def concat[T /* <: js.typedarray.ArrayBufferView */](buffers: js.Array[BufferSource], `type`: ArrayBufferViewConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(buffers.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
    
    /**
      * Checks if incoming data is ArrayBuffer
      * @param data Data to be checked
      * @returns Returns `true` if incoming data is ArrayBuffer, otherwise `false`
      */
    /* static member */
    inline def isArrayBuffer(data: Any): /* is std.ArrayBuffer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBuffer */ Boolean]
    
    /**
      * Checks if incoming data is ArraybufferView
      * @param data Data to be checked
      * @returns Returns `true` if incoming data is ArraybufferView, otherwise `false`
      */
    /* static member */
    inline def isArrayBufferView(data: Any): /* is std.ArrayBufferView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBufferView */ Boolean]
    
    /**
      * Checks if incoming data is BufferSource
      * @param data Data to be checked
      * @returns Returns `true` if incoming data is BufferSource, otherwise `false`
      */
    /* static member */
    inline def isBufferSource(data: Any): /* is pvtsutils.pvtsutils.BufferSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferSource")(data.asInstanceOf[js.Any]).asInstanceOf[/* is pvtsutils.pvtsutils.BufferSource */ Boolean]
    
    /**
      * Checks if buffers are equal
      * @param a Buffer source
      * @param b Buffer source
      * @returns Returns `true` if buffers are equal, otherwise `false`
      */
    /* static member */
    inline def isEqual(a: BufferSource, b: BufferSource): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Converts incoming buffer source into ArrayBuffer
      * @param data Buffer source
      * @returns ArrayBuffer representation of data
      */
    /* static member */
    inline def toArrayBuffer(data: BufferSource): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Converts incoming buffer source into Uint8Array
      * @param data Buffer source
      * @returns Uint8Array representation of data
      */
    /* static member */
    inline def toUint8Array(data: BufferSource): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    /**
      * Converts BufferSource to ArrayBufferView specified view
      * @param data Buffer source
      * @param type Type of ArrayBufferView
      * @returns Specified ArrayBufferView
      */
    /* static member */
    inline def toView[T /* <: js.typedarray.ArrayBufferView */](data: BufferSource, `type`: ArrayBufferViewConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("toView")(data.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
  }
  
  @JSImport("pvtsutils", "Convert")
  @js.native
  open class Convert () extends StObject
  object Convert {
    
    @JSImport("pvtsutils", "Convert")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    @JSImport("pvtsutils", "Convert.DEFAULT_UTF8_ENCODING")
    @js.native
    def DEFAULT_UTF8_ENCODING: TextEncoding = js.native
    inline def DEFAULT_UTF8_ENCODING_=(x: TextEncoding): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_UTF8_ENCODING")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def FromBase64(base64: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /* static member */
    inline def FromBase64Url(base64url: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /* static member */
    inline def FromBinary(text: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} formatted
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    /* static member */
    inline def FromHex(hexString: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /* static member */
    inline def FromString(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def FromString(str: String, enc: BufferEncoding): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /**
      * Converts UTF-8 string to UTF-16 encoded buffer
      * @param text UTF-8 string
      * @param littleEndian Indicates whether the char code is stored in little- or big-endian format
      * @returns UTF-16 encoded buffer
      */
    /* static member */
    inline def FromUtf16String(text: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf16String")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def FromUtf16String(text: String, littleEndian: Boolean): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf16String")(text.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /* static member */
    inline def FromUtf8String(text: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
    inline def FromUtf8String(text: String, encoding: TextEncoding): js.typedarray.ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBuffer]
    
    /* static member */
    inline def ToBase64(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def ToBase64Url(data: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def ToBinary(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    /* static member */
    inline def ToHex(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ToString(buffer: BufferSource, enc: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Converts UTF-16 encoded buffer to UTF-8 string
      * @param buffer UTF-16 encoded buffer
      * @param littleEndian Indicates whether the char code is stored in little- or big-endian format
      * @returns UTF-8 string
      */
    /* static member */
    inline def ToUtf16String(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf16String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ToUtf16String(buffer: BufferSource, littleEndian: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf16String")(buffer.asInstanceOf[js.Any], littleEndian.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /* static member */
    inline def ToUtf8String(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ToUtf8String(buffer: BufferSource, encoding: TextEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    /* static member */
    inline def formatString(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /* static member */
    inline def isBase64(data: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    /* static member */
    inline def isBase64Url(data: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    /* static member */
    inline def isHex(data: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
  
  inline def assign(target: Any, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def combine(buf: js.typedarray.ArrayBuffer*): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(buf.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ArrayBufferLike]
  
  inline def isEqual(bytes1: js.typedarray.ArrayBuffer, bytes2: js.typedarray.ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait ArrayBufferViewConstructor[T /* <: js.typedarray.ArrayBufferView */]
    extends StObject
       with Instantiable1[
          (/* array */ ArrayBufferLike) | (/* array */ ArrayLike[Double]) | (/* length */ Double), 
          T
        ]
       with Instantiable2[/* buffer */ ArrayBufferLike, /* byteOffset */ Double, T]
       with Instantiable3[
          /* buffer */ ArrayBufferLike, 
          (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
          /* length */ Double, 
          T
        ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pvtsutils.pvtsutilsStrings.utf8
    - typings.pvtsutils.pvtsutilsStrings.binary
    - typings.pvtsutils.pvtsutilsStrings.base64
    - typings.pvtsutils.pvtsutilsStrings.base64url
    - typings.pvtsutils.pvtsutilsStrings.hex
    - java.lang.String
  */
  type BufferEncoding = _BufferEncoding | String
  
  type BufferSource = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  /* Rewritten from type alias, can be one of: 
    - typings.pvtsutils.pvtsutilsStrings.ascii
    - typings.pvtsutils.pvtsutilsStrings.utf8
    - typings.pvtsutils.pvtsutilsStrings.utf16
    - typings.pvtsutils.pvtsutilsStrings.utf16be
    - typings.pvtsutils.pvtsutilsStrings.utf16le
    - typings.pvtsutils.pvtsutilsStrings.usc2
  */
  trait TextEncoding extends StObject
  object TextEncoding {
    
    inline def ascii: typings.pvtsutils.pvtsutilsStrings.ascii = "ascii".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.ascii]
    
    inline def usc2: typings.pvtsutils.pvtsutilsStrings.usc2 = "usc2".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.usc2]
    
    inline def utf16: typings.pvtsutils.pvtsutilsStrings.utf16 = "utf16".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16]
    
    inline def utf16be: typings.pvtsutils.pvtsutilsStrings.utf16be = "utf16be".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16be]
    
    inline def utf16le: typings.pvtsutils.pvtsutilsStrings.utf16le = "utf16le".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf16le]
    
    inline def utf8: typings.pvtsutils.pvtsutilsStrings.utf8 = "utf8".asInstanceOf[typings.pvtsutils.pvtsutilsStrings.utf8]
  }
  
  trait _BufferEncoding extends StObject
}
