package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bisectMod {
  
  @JSImport("simple-statistics/src/bisect", JSImport.Default)
  @js.native
  def default(
    func: js.Function1[/* x */ js.Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = js.native
}
