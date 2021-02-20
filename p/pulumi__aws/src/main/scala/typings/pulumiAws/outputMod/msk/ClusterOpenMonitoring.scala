package typings.pulumiAws.outputMod.msk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOpenMonitoring extends StObject {
  
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: ClusterOpenMonitoringPrometheus = js.native
}
object ClusterOpenMonitoring {
  
  @scala.inline
  def apply(prometheus: ClusterOpenMonitoringPrometheus): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
  
  @scala.inline
  implicit class ClusterOpenMonitoringMutableBuilder[Self <: ClusterOpenMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrometheus(value: ClusterOpenMonitoringPrometheus): Self = StObject.set(x, "prometheus", value.asInstanceOf[js.Any])
  }
}
