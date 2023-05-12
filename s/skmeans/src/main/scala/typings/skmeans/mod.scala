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
  inline def apply[TPoint /* <: Double | js.Array[Double] */](data: js.Array[TPoint], k: Double): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](data: js.Array[TPoint], k: Double, centroids: Null, iterations: Double): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Null,
    iterations: Double,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Null,
    iterations: Null,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Null,
    iterations: Unit,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](data: js.Array[TPoint], k: Double, centroids: Unit, iterations: Double): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Unit,
    iterations: Double,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Unit,
    iterations: Null,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: Unit,
    iterations: Unit,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](data: js.Array[TPoint], k: Double, centroids: CentroidValues[TPoint]): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](data: js.Array[TPoint], k: Double, centroids: CentroidValues[TPoint], iterations: Double): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: CentroidValues[TPoint],
    iterations: Double,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: CentroidValues[TPoint],
    iterations: Null,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  inline def apply[TPoint /* <: Double | js.Array[Double] */](
    data: js.Array[TPoint],
    k: Double,
    centroids: CentroidValues[TPoint],
    iterations: Unit,
    distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double | Null]
  ): DataResult[TPoint] = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], k.asInstanceOf[js.Any], centroids.asInstanceOf[js.Any], iterations.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[DataResult[TPoint]]
  
  @JSImport("skmeans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - js.Array[TPoint]
    - typings.skmeans.skmeansStrings.kmrand
    - typings.skmeans.skmeansStrings.kmpp
  */
  type CentroidValues[TPoint /* <: Double | js.Array[Double] */] = _CentroidValues[TPoint] | js.Array[TPoint]
  
  @js.native
  trait DataResult[TPoint /* <: Double | js.Array[Double] */] extends StObject {
    
    var centroids: js.Array[TPoint] = js.native
    
    var idxs: js.Array[Double] = js.native
    
    var it: Double = js.native
    
    var k: Double = js.native
    
    def test(x: TPoint): Unit = js.native
    def test(x: TPoint, distance: js.Function2[/* x */ TPoint, /* y */ TPoint, Double]): Unit = js.native
  }
  
  trait _CentroidValues[TPoint /* <: Double | js.Array[Double] */] extends StObject
}
