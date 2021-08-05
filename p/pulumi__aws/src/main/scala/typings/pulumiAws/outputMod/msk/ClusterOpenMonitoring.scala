package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoring extends StObject {
  
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: ClusterOpenMonitoringPrometheus
}
object ClusterOpenMonitoring {
  
  inline def apply(prometheus: ClusterOpenMonitoringPrometheus): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
  
  extension [Self <: ClusterOpenMonitoring](x: Self) {
    
    inline def setPrometheus(value: ClusterOpenMonitoringPrometheus): Self = StObject.set(x, "prometheus", value.asInstanceOf[js.Any])
  }
}
