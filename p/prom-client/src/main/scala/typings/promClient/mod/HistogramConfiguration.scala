package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramConfiguration[T /* <: String */] extends StObject {
  
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var help: String
  
  var labelNames: js.UndefOr[js.Array[T]] = js.undefined
  
  var name: String
  
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}
object HistogramConfiguration {
  
  @scala.inline
  def apply[T /* <: String */](help: String, name: String): HistogramConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistogramConfiguration[T]]
  }
  
  @scala.inline
  implicit class HistogramConfigurationMutableBuilder[Self <: HistogramConfiguration[?], T /* <: String */] (val x: Self & HistogramConfiguration[T]) extends AnyVal {
    
    @scala.inline
    def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregatorUndefined: Self = StObject.set(x, "aggregator", js.undefined)
    
    @scala.inline
    def setBuckets(value: js.Array[Double]): Self = StObject.set(x, "buckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketsUndefined: Self = StObject.set(x, "buckets", js.undefined)
    
    @scala.inline
    def setBucketsVarargs(value: Double*): Self = StObject.set(x, "buckets", js.Array(value :_*))
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNames(value: js.Array[T]): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    @scala.inline
    def setLabelNamesVarargs(value: T*): Self = StObject.set(x, "labelNames", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisters(value: js.Array[Registry]): Self = StObject.set(x, "registers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistersUndefined: Self = StObject.set(x, "registers", js.undefined)
    
    @scala.inline
    def setRegistersVarargs(value: Registry*): Self = StObject.set(x, "registers", js.Array(value :_*))
  }
}
