package typings.rnFetchBlob

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
  }
  object Count {
    
    inline def apply(): Count = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    }
  }
  
  trait Decode extends StObject {
    
    def decode(input: String): String
    
    def encode(input: String): String
  }
  object Decode {
    
    inline def apply(decode: String => String, encode: String => String): Decode = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[Decode]
    }
    
    extension [Self <: Decode](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
}
