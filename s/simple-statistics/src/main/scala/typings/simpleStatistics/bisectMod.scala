package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bisectMod {
  
  @JSImport("simple-statistics/src/bisect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    func: js.Function1[/* x */ Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], maxIterations.asInstanceOf[js.Any], errorTolerance.asInstanceOf[js.Any])).asInstanceOf[Double]
}
