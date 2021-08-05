package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SummaryConfiguration[T /* <: String */] extends StObject {
  
  var ageBuckets: js.UndefOr[Double] = js.undefined
  
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  
  var compressCount: js.UndefOr[Double] = js.undefined
  
  var help: String
  
  var labelNames: js.UndefOr[js.Array[T]] = js.undefined
  
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
  
  var name: String
  
  var percentiles: js.UndefOr[js.Array[Double]] = js.undefined
  
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}
object SummaryConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): SummaryConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration[T]]
  }
  
  extension [Self <: SummaryConfiguration[?], T /* <: String */](x: Self & SummaryConfiguration[T]) {
    
    inline def setAgeBuckets(value: Double): Self = StObject.set(x, "ageBuckets", value.asInstanceOf[js.Any])
    
    inline def setAgeBucketsUndefined: Self = StObject.set(x, "ageBuckets", js.undefined)
    
    inline def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    inline def setAggregatorUndefined: Self = StObject.set(x, "aggregator", js.undefined)
    
    inline def setCompressCount(value: Double): Self = StObject.set(x, "compressCount", value.asInstanceOf[js.Any])
    
    inline def setCompressCountUndefined: Self = StObject.set(x, "compressCount", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setLabelNames(value: js.Array[T]): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    inline def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    inline def setLabelNamesVarargs(value: T*): Self = StObject.set(x, "labelNames", js.Array(value :_*))
    
    inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPercentiles(value: js.Array[Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    inline def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    inline def setPercentilesVarargs(value: Double*): Self = StObject.set(x, "percentiles", js.Array(value :_*))
    
    inline def setRegisters(value: js.Array[Registry]): Self = StObject.set(x, "registers", value.asInstanceOf[js.Any])
    
    inline def setRegistersUndefined: Self = StObject.set(x, "registers", js.undefined)
    
    inline def setRegistersVarargs(value: Registry*): Self = StObject.set(x, "registers", js.Array(value :_*))
  }
}
