package typings.randomNormal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Return a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution)
    * random number. By default this, starts with a mean of 0 and a standard
    * deviation of 1 which is the standard normal distribution.
    * @param options Controls the shape of the normal distribution
    */
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  inline def apply(options: Options): Double = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("random-normal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /** The standard deviation of the normal distribution. Defaults to 1 */
    var dev: js.UndefOr[Double] = js.undefined
    
    /** The mean of the normal distribution. Defaults to 0 */
    var mean: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setDevUndefined: Self = StObject.set(x, "dev", js.undefined)
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
    }
  }
}
