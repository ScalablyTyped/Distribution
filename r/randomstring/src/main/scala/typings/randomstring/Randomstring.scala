package typings.randomstring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Randomstring {
  
  trait GenerateOptions extends StObject {
    
    var capitalization: js.UndefOr[String] = js.undefined
    
    var charset: js.UndefOr[String] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var readable: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setCapitalization(value: String): Self = StObject.set(x, "capitalization", value.asInstanceOf[js.Any])
      
      inline def setCapitalizationUndefined: Self = StObject.set(x, "capitalization", js.undefined)
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setReadable(value: Boolean): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setReadableUndefined: Self = StObject.set(x, "readable", js.undefined)
    }
  }
}
