package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricConfiguration[T /* <: String */] extends StObject {
  
  var aggregator: js.UndefOr[Aggregator] = js.undefined
  
  var collect: js.UndefOr[CollectFunction[Any]] = js.undefined
  
  var help: String
  
  var labelNames: js.UndefOr[js.Array[T]] = js.undefined
  
  var name: String
  
  var registers: js.UndefOr[js.Array[Registry]] = js.undefined
}
object MetricConfiguration {
  
  inline def apply[T /* <: String */](help: String, name: String): MetricConfiguration[T] = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricConfiguration[T]]
  }
  
  extension [Self <: MetricConfiguration[?], T /* <: String */](x: Self & MetricConfiguration[T]) {
    
    inline def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    inline def setAggregatorUndefined: Self = StObject.set(x, "aggregator", js.undefined)
    
    inline def setCollect(value: CollectFunction[Any]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setCollectUndefined: Self = StObject.set(x, "collect", js.undefined)
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setLabelNames(value: js.Array[T]): Self = StObject.set(x, "labelNames", value.asInstanceOf[js.Any])
    
    inline def setLabelNamesUndefined: Self = StObject.set(x, "labelNames", js.undefined)
    
    inline def setLabelNamesVarargs(value: T*): Self = StObject.set(x, "labelNames", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegisters(value: js.Array[Registry]): Self = StObject.set(x, "registers", value.asInstanceOf[js.Any])
    
    inline def setRegistersUndefined: Self = StObject.set(x, "registers", js.undefined)
    
    inline def setRegistersVarargs(value: Registry*): Self = StObject.set(x, "registers", js.Array(value*))
  }
}
