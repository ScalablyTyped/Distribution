package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait defaultMetrics extends StObject {
  
  /**
  	 * All available default metrics
  	 */
  var metricsList: js.Array[String]
}
object defaultMetrics {
  
  inline def apply(metricsList: js.Array[String]): defaultMetrics = {
    val __obj = js.Dynamic.literal(metricsList = metricsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultMetrics]
  }
  
  extension [Self <: defaultMetrics](x: Self) {
    
    inline def setMetricsList(value: js.Array[String]): Self = StObject.set(x, "metricsList", value.asInstanceOf[js.Any])
    
    inline def setMetricsListVarargs(value: String*): Self = StObject.set(x, "metricsList", js.Array(value*))
  }
}
