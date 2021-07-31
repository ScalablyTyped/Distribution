package typings.skmeans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calculates unidimiensional and multidimensional k-means clustering on data.
    *
    * @param data Unidimiensional or multidimensional array of values to be clustered.
    * @param k Number of clusters.
    * @param centroids Initial centroid values.
    * @param iterations Maximum number of iterations. If not provided, it will be set to 10000.
    * @param distance Custom distance function. Takes two points as arguments and returns a scalar number.
    */
  @scala.inline
  def apply(data: js.Array[js.Array[Double] | Double], k: Double): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(data: js.Array[js.Array[Double] | Double], k: Double, centroids: Unit, iterations: Double): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: Unit,
    iterations: Double,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: Unit,
    iterations: Null,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: Unit,
    iterations: Unit,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(data: js.Array[js.Array[Double] | Double], k: Double, centroids: CentroidValues): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Double
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Double,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Null,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  @scala.inline
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: CentroidValues,
    iterations: Unit,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[Data]
  
  @JSImport("skmeans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.skmeans.skmeansStrings.kmrand
    - typings.skmeans.skmeansStrings.kmpp
    - scala.Null
  */
  type CentroidValues = _CentroidValues | Null
  
  @js.native
  trait Data extends StObject {
    
    var centroids: Double = js.native
    
    var idxs: js.Array[Double] = js.native
    
    var it: Double = js.native
    
    var k: Double = js.native
    
    def test(x: Double): Unit = js.native
    def test(x: Double, point: js.Function2[/* x1 */ Double, /* x2 */ Double, Double]): Unit = js.native
  }
  
  trait _CentroidValues extends StObject
}
