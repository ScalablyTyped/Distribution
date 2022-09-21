package typings.reactNativeBase64

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-base64", JSImport.Namespace)
  @js.native
  val ^ : Base64 = js.native
  
  trait Base64 extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
    
    def encodeFromByteArray(byteArray: js.typedarray.Uint8Array): String
  }
  object Base64 {
    
    inline def apply(
      decode: String => String,
      encode: String => String,
      encodeFromByteArray: js.typedarray.Uint8Array => String
    ): Base64 = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), encodeFromByteArray = js.Any.fromFunction1(encodeFromByteArray))
      __obj.asInstanceOf[Base64]
    }
    
    extension [Self <: Base64](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeFromByteArray(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encodeFromByteArray", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Base64
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Base64 = ^
}
