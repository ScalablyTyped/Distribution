package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait metric extends StObject {
  
  var aggregator: Aggregator = js.native
  
  var help: String = js.native
  
  var name: String = js.native
  
  var `type`: MetricType = js.native
}
object metric {
  
  @scala.inline
  def apply(aggregator: Aggregator, help: String, name: String, `type`: MetricType): metric = {
    val __obj = js.Dynamic.literal(aggregator = aggregator.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[metric]
  }
  
  @scala.inline
  implicit class metricMutableBuilder[Self <: metric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregator(value: Aggregator): Self = StObject.set(x, "aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetricType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
