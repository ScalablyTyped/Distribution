package typings.stablelibRandom

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSourceMod {
  
  trait RandomSource extends StObject {
    
    /**
      * Returns the availability of random source.
      * A source can only be used if isAvailable returns true.
      */
    var isAvailable: Boolean
    
    /**
      * Returns a byte array of the given length filled with random bytes.
      */
    def randomBytes(length: Double): js.typedarray.Uint8Array
  }
  object RandomSource {
    
    inline def apply(isAvailable: Boolean, randomBytes: Double => js.typedarray.Uint8Array): RandomSource = {
      val __obj = js.Dynamic.literal(isAvailable = isAvailable.asInstanceOf[js.Any], randomBytes = js.Any.fromFunction1(randomBytes))
      __obj.asInstanceOf[RandomSource]
    }
    
    extension [Self <: RandomSource](x: Self) {
      
      inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
      
      inline def setRandomBytes(value: Double => js.typedarray.Uint8Array): Self = StObject.set(x, "randomBytes", js.Any.fromFunction1(value))
    }
  }
}
