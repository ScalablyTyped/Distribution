package typings.pvtsutils

import typings.pvtsutils.bufferSourceConverterMod.BufferSource
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @JSImport("pvtsutils/build/types/convert", "Convert")
  @js.native
  class Convert () extends StObject
  /* static members */
  object Convert {
    
    @JSImport("pvtsutils/build/types/convert", "Convert")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Base64Padding(base64: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Base64Padding")(base64.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def FromBase64(base64: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    inline def FromBase64Url(base64url: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBase64Url")(base64url.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    inline def FromBinary(text: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromBinary")(text.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} formatted
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    inline def FromHex(hexString: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromHex")(hexString.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    inline def FromString(str: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    inline def FromString(str: String, enc: BufferEncoding): ArrayBuffer = (^.asInstanceOf[js.Dynamic].applyDynamic("FromString")(str.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[ArrayBuffer]
    
    inline def FromUtf8String(text: String): ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("FromUtf8String")(text.asInstanceOf[js.Any]).asInstanceOf[ArrayBuffer]
    
    inline def ToBase64(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToBase64Url(data: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToBinary(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToBinary")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    inline def ToHex(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToHex")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def ToString(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def ToString(buffer: BufferSource, enc: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ToString")(buffer.asInstanceOf[js.Any], enc.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def ToUtf8String(buffer: BufferSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ToUtf8String")(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    inline def formatString(data: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatString")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isBase64(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def isBase64Url(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBase64Url")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
    
    inline def isHex(data: js.Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHex")(data.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pvtsutils.pvtsutilsStrings.utf8
    - typings.pvtsutils.pvtsutilsStrings.binary
    - typings.pvtsutils.pvtsutilsStrings.base64
    - typings.pvtsutils.pvtsutilsStrings.base64url
    - typings.pvtsutils.pvtsutilsStrings.hex
    - java.lang.String
  */
  type BufferEncoding = _BufferEncoding | String
  
  trait _BufferEncoding extends StObject
}
