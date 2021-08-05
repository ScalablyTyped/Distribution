package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zScoreMod {
  
  @JSImport("simple-statistics/src/z_score", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: Double, mean: Double, standardDeviation: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], mean.asInstanceOf[js.Any], standardDeviation.asInstanceOf[js.Any])).asInstanceOf[Double]
}
