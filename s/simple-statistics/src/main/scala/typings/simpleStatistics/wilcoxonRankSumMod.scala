package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wilcoxonRankSumMod {
  
  @JSImport("simple-statistics/src/wilcoxon_rank_sum.", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any])).asInstanceOf[Double]
}
