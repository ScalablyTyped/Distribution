package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricObject extends StObject {
  
  var aggregator: Aggregator
  
  def collect(): Unit | js.Promise[Unit]
  @JSName("collect")
  var collect_Original: CollectFunction[Any]
  
  var help: String
  
  var name: String
  
  var `type`: MetricType
}
object MetricObject {
  
  inline def apply(
    aggregator: Aggregator,
    collect: CollectFunction[Any],
    help: String,
    name: String,
    `type`: MetricType
  ): MetricObject = {
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], collect = collect.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricObject] (val x: Self) extends AnyVal {
    
    inline def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    inline def setCollect(value: CollectFunction[Any]): Self = StObject.set(x, "collect", value.asInstanceOf[js.Any])
    
    inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: MetricType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
