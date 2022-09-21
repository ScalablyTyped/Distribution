package typings.secureRandomUniform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate secure, random, uniform integers, compensating for modulo bias.
    *
    * @returns A number from the uniform distribution `[0, limit)` (limit exclusive). Note that limit
    * must not be larger than `2^53 - 1` (`Number.MAX_SAFE_INTEGER`).
    *
    * @example
    * import secureRandom = require('secure-random-uniform')
    *
    * // Numbers from [0, 2000)
    * secureRandom(2000)
    *
    * // Numbers from [100, 110)
    * secureRandom(10) + 100
    *
    * // Numbers from [-10, 10]
    * secureRandom(21) - 10
    */
  inline def apply(limit: Double): Double = ^.asInstanceOf[js.Dynamic].apply(limit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("secure-random-uniform", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
