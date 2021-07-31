package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binomialDistributionMod {
  
  @JSImport("simple-statistics/src/binomial_distribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(trials: Double, probability: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(trials.asInstanceOf[js.Any], probability.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
