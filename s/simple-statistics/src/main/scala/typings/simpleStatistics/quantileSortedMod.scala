package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantileSortedMod {
  
  @JSImport("simple-statistics/src/quantile_sorted", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
}
