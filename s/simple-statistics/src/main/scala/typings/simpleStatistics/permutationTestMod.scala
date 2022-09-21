package typings.simpleStatistics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object permutationTestMod {
  
  @JSImport("simple-statistics/src/permutation_test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(sampleX: js.Array[Double], sampleY: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(sampleX: js.Array[Double], sampleY: js.Array[Double], string: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(sampleX: js.Array[Double], sampleY: js.Array[Double], string: String, k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    sampleX: js.Array[Double],
    sampleY: js.Array[Double],
    string: String,
    k: Double,
    randomSource: js.Function0[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    sampleX: js.Array[Double],
    sampleY: js.Array[Double],
    string: String,
    k: Unit,
    randomSource: js.Function0[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(sampleX: js.Array[Double], sampleY: js.Array[Double], string: Unit, k: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    sampleX: js.Array[Double],
    sampleY: js.Array[Double],
    string: Unit,
    k: Double,
    randomSource: js.Function0[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def default(
    sampleX: js.Array[Double],
    sampleY: js.Array[Double],
    string: Unit,
    k: Unit,
    randomSource: js.Function0[Double]
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sampleX.asInstanceOf[js.Any], sampleY.asInstanceOf[js.Any], string.asInstanceOf[js.Any], k.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Double]
}
