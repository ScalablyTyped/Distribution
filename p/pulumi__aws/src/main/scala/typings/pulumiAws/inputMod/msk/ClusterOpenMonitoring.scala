package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOpenMonitoring extends StObject {
  
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: Input[ClusterOpenMonitoringPrometheus]
}
object ClusterOpenMonitoring {
  
  @scala.inline
  def apply(prometheus: Input[ClusterOpenMonitoringPrometheus]): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
  
  @scala.inline
  implicit class ClusterOpenMonitoringMutableBuilder[Self <: ClusterOpenMonitoring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrometheus(value: Input[ClusterOpenMonitoringPrometheus]): Self = StObject.set(x, "prometheus", value.asInstanceOf[js.Any])
  }
}
