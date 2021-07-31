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
  
  @scala.inline
  def apply[T /* <: String */](help: String, name: String): SummaryConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryConfiguration[T]]
  }
  
  @scala.inline
  implicit class SummaryConfigurationMutableBuilder[Self <: SummaryConfiguration[?], T /* <: String */] (val x: Self & SummaryConfiguration[T]) extends AnyVal {
    
    @scala.inline
    def setAgeBuckets(value: Double): Self = StObject.set(x, "ageBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgeBucketsUndefined: Self = StObject.set(x, "ageBuckets", js.undefined)
    
    @scala.inline
    def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorUndefined: Self = StObject.set(x, "aggregator", js.undefined)
    
    @scala.inline
    def setCompressCount(value: Double): Self = StObject.set(x, "compressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressCountUndefined: Self = StObject.set(x, "compressCount", js.undefined)
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNames(value: js.Array[T]): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    @scala.inline
    def setLabelNamesVarargs(value: T*): Self = StObject.set(x, "labelNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentiles(value: js.Array[Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentilesUndefined: Self = StObject.set(x, "percentiles", js.undefined)
    
    @scala.inline
    def setPercentilesVarargs(value: Double*): Self = StObject.set(x, "percentiles", js.Array(value :_*))
    
    @scala.inline
    def setRegisters(value: js.Array[Registry]): Self = StObject.set(x, "registers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistersUndefined: Self = StObject.set(x, "registers", js.undefined)
    
    @scala.inline
    def setRegistersVarargs(value: Registry*): Self = StObject.set(x, "registers", js.Array(value :_*))
  }
}
