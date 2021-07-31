package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noiseNoiseMod {
  
  @JSImport("rot-js/lib/noise/noise", JSImport.Default)
  @js.native
  abstract class default ()
    extends StObject
       with Noise {
    
    /* CompleteClass */
    override def get(x: Double, y: Double): Double = js.native
  }
  
  trait Noise extends StObject {
    
    def get(x: Double, y: Double): Double
  }
  object Noise {
    
    @scala.inline
    def apply(get: (Double, Double) => Double): Noise = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
      __obj.asInstanceOf[Noise]
    }
    
    @scala.inline
    implicit class NoiseMutableBuilder[Self <: Noise] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    }
  }
}
