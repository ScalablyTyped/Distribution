package typings.randomstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Randomstring {
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomstring.randomstringStrings.lowercase
    - typings.randomstring.randomstringStrings.uppercase
  */
  trait Capitalization extends StObject
  object Capitalization {
    
    inline def lowercase: typings.randomstring.randomstringStrings.lowercase = "lowercase".asInstanceOf[typings.randomstring.randomstringStrings.lowercase]
    
    inline def uppercase: typings.randomstring.randomstringStrings.uppercase = "uppercase".asInstanceOf[typings.randomstring.randomstringStrings.uppercase]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.randomstring.randomstringStrings.alphanumeric
    - typings.randomstring.randomstringStrings.alphabetic
    - typings.randomstring.randomstringStrings.numeric
    - typings.randomstring.randomstringStrings.hex
    - typings.randomstring.randomstringStrings.binary
    - typings.randomstring.randomstringStrings.octal
    - java.lang.String
  */
  type Charset = _Charset | String
  
  trait GenerateOptions extends StObject {
    
    var capitalization: js.UndefOr[Capitalization] = js.undefined
    
    var charset: js.UndefOr[Charset] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
      inline def setCapitalization(value: Capitalization): Self = StObject.set(x, "capitalization", value.asInstanceOf[js.Any])
      
      inline def setCapitalizationUndefined: Self = StObject.set(x, "capitalization", js.undefined)
      
      inline def setCharset(value: Charset): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    }
  }
  
  trait _Charset extends StObject
}
