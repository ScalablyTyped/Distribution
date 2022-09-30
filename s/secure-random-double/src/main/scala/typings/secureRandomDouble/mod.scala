package typings.secureRandomDouble

import typings.secureRandomDouble.secureRandomDoubleDoubles.`10000000000000000000000000000000000000000000000000000`
import typings.secureRandomDouble.secureRandomDoubleDoubles.`2220446049250313080847263336181640625`
import typings.secureRandomDouble.secureRandomDoubleDoubles.`4503599627370496`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate doubles (`number`) in the range `[0, 1)`, with all points being equidistant and unbiased.
    *
    * @example
    * import double = require('secure-random-double')
    *
    * const n = double()
    */
  inline def apply(): Double = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Double]
  
  @JSImport("secure-random-double", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** The basis representation of `1`. */
  @JSImport("secure-random-double", "BASE")
  @js.native
  val BASE: `10000000000000000000000000000000000000000000000000000` = js.native
  
  /** Distance between consecutive points. */
  @JSImport("secure-random-double", "DISTANCE")
  @js.native
  val DISTANCE: `2220446049250313080847263336181640625` = js.native
  
  /** Number of representable points. */
  @JSImport("secure-random-double", "POINTS")
  @js.native
  val POINTS: `4503599627370496` = js.native
}
