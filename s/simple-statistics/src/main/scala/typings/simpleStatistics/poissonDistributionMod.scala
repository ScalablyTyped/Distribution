package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object poissonDistributionMod {
  
  @JSImport("simple-statistics/src/poisson_distribution", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(lambda: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(lambda.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
