package typings.rangeInclusive

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
    * Generate a closed range of numbers `[a, b]` with step size `d`.
    *
    * @example
    * import rangeInclusive = require('range-inclusive')
    *
    * rangeInclusive(10) // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    * rangeInclusive(3, 9, 3) // [3, 6, 9]
    * rangeInclusive(7, 5, -1) // [7, 6, 5]
    */
  inline def apply(stop: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].apply(stop.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  @JSImport("range-inclusive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
