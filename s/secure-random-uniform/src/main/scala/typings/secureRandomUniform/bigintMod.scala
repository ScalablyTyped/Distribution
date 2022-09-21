package typings.secureRandomUniform

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bigintMod {
  
  /**
    * Generate secure, random, uniform integers, compensating for modulo bias.
    *
    * @returns A number from the uniform distribution `[0, limit)` (limit exclusive).
    *
    * @example
    * import secureRandom = require('secure-random-uniform/bigint')
    *
    * // Numbers from [0, 2^64)
    * secureRandom(2n ** 64n)
    *
    * // Numbers from [0, googol)
    * secureRandom(10n ** 100n)
    */
  inline def apply(limit: js.BigInt): js.BigInt = ^.asInstanceOf[js.Dynamic].apply(limit.asInstanceOf[js.Any]).asInstanceOf[js.BigInt]
  
  @JSImport("secure-random-uniform/bigint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
