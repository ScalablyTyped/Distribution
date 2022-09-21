package typings.secureWeightedSample

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object integerMod {
  
  /**
    * Exact sampling using integer weights. The sum of weights must be less than `Number.MAX_SAFE_INTEGER`.
    * The RNG is sampled until a suitable candidate is found. The expected number of samples is 2. If the
    * sum of weights is a power of 2, only a single sample is needed. It then does a linear pass over the
    * weights until the random number is less than the cumulative weights. Hence `O(n)`.
    *
    * @returns The index from the weights array, which can be used to index another data array or used directly.
    *
    * @example
    * // or exact sampling using integers
    * import sampleInteger = require('secure-weighted-sample/integer')
    * console.log(sampleInteger([8, 40, 16, 4, 6]))
    */
  inline def apply(integerWeights: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].apply(integerWeights.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("secure-weighted-sample/integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
