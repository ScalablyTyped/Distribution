package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcQuantileMod {
  
  @JSImport("simple-statistics/src/quantile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: js.Array[Double], p: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def default(x: js.Array[Double], p: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[Double]
}
