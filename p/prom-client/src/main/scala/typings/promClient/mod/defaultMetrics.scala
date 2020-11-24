package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait defaultMetrics extends js.Object {
  
  /**
  	 * All available default metrics
  	 */
  var metricsList: js.Array[String] = js.native
}
object defaultMetrics {
  
  @scala.inline
  def apply(metricsList: js.Array[String]): defaultMetrics = {
    val __obj = js.Dynamic.literal(metricsList = metricsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultMetrics]
  }
  
  @scala.inline
  implicit class defaultMetricsOps[Self <: defaultMetrics] (val x: Self) extends AnyVal {
    
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
    def setMetricsListVarargs(value: String*): Self = this.set("metricsList", js.Array(value :_*))
    
    @scala.inline
    def setMetricsList(value: js.Array[String]): Self = this.set("metricsList", value.asInstanceOf[js.Any])
  }
}
