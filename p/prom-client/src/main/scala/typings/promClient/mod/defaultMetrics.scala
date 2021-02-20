package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait defaultMetrics extends StObject {
  
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
  implicit class defaultMetricsMutableBuilder[Self <: defaultMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetricsList(value: js.Array[String]): Self = StObject.set(x, "metricsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsListVarargs(value: String*): Self = StObject.set(x, "metricsList", js.Array(value :_*))
  }
}
