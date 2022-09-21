package typings.rangeExclusive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(/** @default 1 */
  start: Double, stop: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def apply(
    /** @default 1 */
  start: Double,
    stop: Double,
    /** @default 1 */
  // tslint:disable-next-line unified-signatures
  stepSize: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(start.asInstanceOf[js.Any], stop.asInstanceOf[js.Any], stepSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  /**
    * Generate a closed range of numbers `[a, b)` with step size `d`
    *
    * @example
    * import rangeExclusive = require('range-exclusive')
    *
    * rangeExclusive(10) // [1, 2, 3, 4, 5, 6, 7, 8, 9]
    * rangeExclusive(3, 9, 3) // [3, 6]
    * rangeExclusive(7, 5, -1) // [7, 6]
    */
  inline def apply(stop: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(stop.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @JSImport("range-exclusive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
