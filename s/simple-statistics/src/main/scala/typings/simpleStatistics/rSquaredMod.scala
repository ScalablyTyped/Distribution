package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rSquaredMod {
  
  @JSImport("simple-statistics/src/r_squared", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(x: js.Array[js.Array[Double]], func: js.Function1[/* x */ Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
}
