package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryConfiguration[T /* <: String */]
  extends StObject
     with MetricConfiguration[T] {
  
  var ageBuckets: js.UndefOr[Double] = js.undefined
  
  @JSName("collect")
  var collect_SummaryConfiguration: js.UndefOr[CollectFunction[Summary[T]]] = js.undefined
  
  var compressCount: js.UndefOr[Double] = js.undefined
  
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  
  var percentiles: js.UndefOr[js.Array[Double]] = js.undefined
}
object SummaryConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): SummaryConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration[T]]
  }
  
  extension [Self <: SummaryConfiguration[?], T /* <: String */](x: Self & SummaryConfiguration[T]) {
    
    inline def setAgeBuckets(value: Double): Self = StObject.set(x, "ageBuckets", value.asInstanceOf[js.Any])
    
    inline def setAgeBucketsUndefined: Self = StObject.set(x, "ageBuckets", js.undefined)
    
    inline def setCollect(value: CollectFunction[Summary[T]]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
    
    inline def setCompressCount(value: Double): Self = StObject.set(x, "compressCount", value.asInstanceOf[js.Any])
    
    inline def setCompressCountUndefined: Self = StObject.set(x, "compressCount", js.undefined)
    
    inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    inline def setPercentiles(value: js.Array[Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    inline def setPercentilesVarargs(value: Double*): Self = StObject.set(x, "percentiles", js.Array(value*))
  }
}
