package typings.simpleStatistics

import typings.simpleStatistics.anon.Centroids
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kMeansClusterMod {
  
  @JSImport("simple-statistics/src/k_means_cluster", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(points: js.Array[js.Array[Double]], numCluster: Double): Centroids = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], numCluster.asInstanceOf[js.Any])).asInstanceOf[Centroids]
  inline def default(points: js.Array[js.Array[Double]], numCluster: Double, randomSource: js.Function0[Double]): Centroids = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(points.asInstanceOf[js.Any], numCluster.asInstanceOf[js.Any], randomSource.asInstanceOf[js.Any])).asInstanceOf[Centroids]
}
