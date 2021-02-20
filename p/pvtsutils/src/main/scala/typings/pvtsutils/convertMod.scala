package typings.pvtsutils

import typings.pvtsutils.bufferSourceConverterMod.BufferSource
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertMod {
  
  @JSImport("pvtsutils/build/types/convert", "Convert")
  @js.native
  class Convert () extends StObject
  /* static members */
  object Convert {
    
    @JSImport("pvtsutils/build/types/convert", "Convert.Base64Padding")
    @js.native
    def Base64Padding(base64: String): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.FromBase64")
    @js.native
    def FromBase64(base64: String): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.FromBase64Url")
    @js.native
    def FromBase64Url(base64url: String): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.FromBinary")
    @js.native
    def FromBinary(text: String): ArrayBuffer = js.native
    
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} formatted
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    @JSImport("pvtsutils/build/types/convert", "Convert.FromHex")
    @js.native
    def FromHex(hexString: String): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.FromString")
    @js.native
    def FromString(str: String): ArrayBuffer = js.native
    @JSImport("pvtsutils/build/types/convert", "Convert.FromString")
    @js.native
    def FromString(str: String, enc: BufferEncoding): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.FromUtf8String")
    @js.native
    def FromUtf8String(text: String): ArrayBuffer = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.ToBase64")
    @js.native
    def ToBase64(buffer: BufferSource): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.ToBase64Url")
    @js.native
    def ToBase64Url(data: BufferSource): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.ToBinary")
    @js.native
    def ToBinary(buffer: BufferSource): String = js.native
    
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    @JSImport("pvtsutils/build/types/convert", "Convert.ToHex")
    @js.native
    def ToHex(buffer: BufferSource): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource): String = js.native
    @JSImport("pvtsutils/build/types/convert", "Convert.ToString")
    @js.native
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.ToUtf8String")
    @js.native
    def ToUtf8String(buffer: BufferSource): String = js.native
    
    /**
      * Removes odd chars from string data
      * @param data String data
      */
    @JSImport("pvtsutils/build/types/convert", "Convert.formatString")
    @js.native
    def formatString(data: String): String = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.isBase64")
    @js.native
    def isBase64(data: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.isBase64Url")
    @js.native
    def isBase64Url(data: js.Any): /* is string */ Boolean = js.native
    
    @JSImport("pvtsutils/build/types/convert", "Convert.isHex")
    @js.native
    def isHex(data: js.Any): /* is string */ Boolean = js.native
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
