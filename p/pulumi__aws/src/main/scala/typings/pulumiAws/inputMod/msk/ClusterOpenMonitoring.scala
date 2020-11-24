package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterOpenMonitoring extends js.Object {
  
  /**
    * Configuration block for Prometheus settings for open monitoring. See below.
    */
  var prometheus: Input[ClusterOpenMonitoringPrometheus] = js.native
}
object ClusterOpenMonitoring {
  
  @scala.inline
  def apply(prometheus: Input[ClusterOpenMonitoringPrometheus]): ClusterOpenMonitoring = {
    val __obj = js.Dynamic.literal(prometheus = prometheus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterOpenMonitoring]
  }
  
  @scala.inline
  implicit class ClusterOpenMonitoringOps[Self <: ClusterOpenMonitoring] (val x: Self) extends AnyVal {
    
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
    def setPrometheus(value: Input[ClusterOpenMonitoringPrometheus]): Self = this.set("prometheus", value.asInstanceOf[js.Any])
  }
}
