package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object combineMeansMod {
  
  @JSImport("simple-statistics/src/combine_means", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(mean1: Double, n1: Double, mean2: Double, n2: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(mean1.asInstanceOf[js.Any], n1.asInstanceOf[js.Any], mean2.asInstanceOf[js.Any], n2.asInstanceOf[js.Any])).asInstanceOf[Double]
}
