package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait metric extends js.Object {
  
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
  implicit class metricOps[Self <: metric] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAggregator(value: Aggregator): Self = this.set("aggregator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHelp(value: String): Self = this.set("help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetricType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
