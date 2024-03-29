package typings.secureWeightedSample

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Approximate sampling using decimal percentage weights. Imprecision occurs if the passed weights
    * are not exactly representable in the double floating point interval `[0, 1)`. Only performs a
    * single sample from the RNG and does a linear pass over the weights until the random number is
    * less than the cumulative weights. Hence `O(n)`.
    *
    * @returns The index from the weights array, which can be used to index another data array or used directly.
    *
    * @example
    * // Either approx sampling with percentage weights (imprecision stems from the passed weights)
    * import sample = require('secure-weighted-sample')
    * console.log(sample([0.1, 0.5, 0.2, 0.05, 0.15]))
    */
  inline def apply(weights: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].apply(weights.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("secure-weighted-sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
