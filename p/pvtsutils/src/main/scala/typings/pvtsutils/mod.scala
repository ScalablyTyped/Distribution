package typings.pvtsutils

import typings.pvtsutils.bufferSourceConverterMod.BufferSource
import typings.pvtsutils.convertMod.BufferEncoding
import typings.std.ArrayBuffer
import typings.std.ArrayBufferLike
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pvtsutils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pvtsutils", "BufferSourceConverter")
  @js.native
  class BufferSourceConverter ()
    extends typings.pvtsutils.bufferSourceConverterMod.BufferSourceConverter
  /* static members */
  object BufferSourceConverter {
    
    @JSImport("pvtsutils", "BufferSourceConverter")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isArrayBufferView(data: js.Any): /* is std.ArrayBufferView */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArrayBufferView")(data.asInstanceOf[js.Any]).asInstanceOf[/* is std.ArrayBufferView */ Boolean]
    
    @scala.inline
    def isBufferSource(data: js.Any): /* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBufferSource")(data.asInstanceOf[js.Any]).asInstanceOf[/* is pvtsutils.pvtsutils/build/types/buffer_source_converter.BufferSource */ Boolean]
    
    @scala.inline
    def toArrayBuffer(data: BufferSource): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def toUint8Array(data: BufferSource): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(data.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  }
  
  @JSImport("pvtsutils", "Convert")
  @js.native
  class Convert ()
    extends typings.pvtsutils.convertMod.Convert
  /* static members */
  object Convert {
    
    @JSImport("pvtsutils", "Convert")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def FromBase64(base64: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def FromBase64Url(base64url: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def FromBinary(text: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} formatted
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    @scala.inline
    def FromHex(hexString: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def FromString(str: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    @scala.inline
    def FromString(str: String, enc: BufferEncoding): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def FromUtf8String(text: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    @scala.inline
    def ToBase64(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToBase64Url(data: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToBinary(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    @scala.inline
    def ToHex(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    @scala.inline
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @scala.inline
    def ToUtf8String(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    @scala.inline
    def formatString(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def isBase64(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def isBase64Url(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    @scala.inline
    def isHex(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
  
  @scala.inline
  def assign(target: js.Any, sources: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def combine(buf: ArrayBuffer*): ArrayBufferLike = ^.asInstanceOf[js.Dynamic].applyDynamic("combine")(buf.asInstanceOf[js.Any]).asInstanceOf[ArrayBufferLike]
  
  @scala.inline
  def isEqual(bytes1: ArrayBuffer, bytes2: ArrayBuffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(bytes1.asInstanceOf[js.Any], bytes2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
