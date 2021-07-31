package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chiSquaredGoodnessOfFitMod {
  
  @JSImport("simple-statistics/src/chi_squared_goodness_of_fit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(data: js.Array[Double], distributionType: js.Function, significance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(data.asInstanceOf[js.Any], distributionType.asInstanceOf[js.Any], significance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
