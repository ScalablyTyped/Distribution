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
  }
  object Base64 {
    
    @scala.inline
    def apply(decode: String => String, encode: String => String): Base64 = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Base64]
    }
    
    @scala.inline
    implicit class Base64MutableBuilder[Self <: Base64] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Base64
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Base64 = ^
}
