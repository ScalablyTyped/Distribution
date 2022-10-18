package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCombineVariancesMod {
  
  @JSImport("simple-statistics/src/combine_variances", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variance1: Double, mean1: Double, n1: Double, variance2: Double, mean2: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(variance1.asInstanceOf[js.Any], mean1.asInstanceOf[js.Any], n1.asInstanceOf[js.Any], variance2.asInstanceOf[js.Any], mean2.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
