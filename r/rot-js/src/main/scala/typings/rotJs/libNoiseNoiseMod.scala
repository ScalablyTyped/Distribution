package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNoiseNoiseMod {
  
  /* note: abstract class */ @JSImport("rot-js/lib/noise/noise", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Noise {
    
    /* CompleteClass */
    override def get(x: Double, y: Double): Double = js.native
  }
  
  trait Noise extends StObject {
    
    def get(x: Double, y: Double): Double
  }
  object Noise {
    
    inline def apply(get: (Double, Double) => Double): Noise = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Noise]
    }
    
    extension [Self <: Noise](x: Self) {
      
      inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
}
