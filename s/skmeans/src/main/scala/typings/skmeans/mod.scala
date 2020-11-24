package typings.skmeans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("skmeans", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * Calculates unidimiensional and multidimensional k-means clustering on data.
    *
    * @param data Unidimiensional or multidimensional array of values to be clustered.
    * @param k Number of clusters.
    * @param centroids Initial centroid values.
    * @param iterations Maximum number of iterations. If not provided, it will be set to 10000.
    * @param distance Custom distance function. Takes two points as arguments and returns a scalar number.
    */
  def apply(data: js.Array[js.Array[Double] | Double], k: Double): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: js.UndefOr[CentroidValues],
    iterations: js.UndefOr[scala.Nothing],
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: js.UndefOr[CentroidValues],
    iterations: Double
  ): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: js.UndefOr[CentroidValues],
    iterations: Double,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = js.native
  def apply(
    data: js.Array[js.Array[Double] | Double],
    k: Double,
    centroids: js.UndefOr[CentroidValues],
    iterations: Null,
    distance: js.Function2[/* x */ Double, /* y */ Double, Double]
  ): Data = js.native
  def apply(data: js.Array[js.Array[Double] | Double], k: Double, centroids: CentroidValues): Data = js.native
  
  @js.native
  trait Data extends js.Object {
    
    var centroids: Double = js.native
    
    var idxs: js.Array[Double] = js.native
    
    var it: Double = js.native
    
    var k: Double = js.native
    
    def test(x: Double): Unit = js.native
    def test(x: Double, point: js.Function2[/* x1 */ Double, /* x2 */ Double, Double]): Unit = js.native
  }
  
  trait _CentroidValues extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.skmeans.skmeansStrings.kmrand
    - typings.skmeans.skmeansStrings.kmpp
    - scala.Null
  */
  type CentroidValues = _CentroidValues | Null
}
