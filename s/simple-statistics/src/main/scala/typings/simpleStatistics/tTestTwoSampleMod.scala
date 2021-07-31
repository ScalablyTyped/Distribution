package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tTestTwoSampleMod {
  
  @JSImport("simple-statistics/src/t_test_two_sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
  @scala.inline
  def default(sampleX: js.Array[Double], sampleY: js.Array[Double], difference: Double): Double | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], difference.asInstanceOf[js.Any])).asInstanceOf[Double | Null]
}
