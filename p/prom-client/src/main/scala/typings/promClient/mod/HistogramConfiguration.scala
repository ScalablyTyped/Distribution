package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramConfiguration[T /* <: String */]
  extends StObject
     with MetricConfiguration[T] {
  
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  
  @JSName("collect")
  var collect_HistogramConfiguration: js.UndefOr[CollectFunction[Histogram[T]]] = js.undefined
}
object HistogramConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): HistogramConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfiguration[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramConfiguration[?], T /* <: String */] (val x: Self & HistogramConfiguration[T]) extends AnyVal {
    
    inline def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    inline def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    inline def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value*))
    
    inline def setCollect(value: CollectFunction[Histogram[T]]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
  }
}
