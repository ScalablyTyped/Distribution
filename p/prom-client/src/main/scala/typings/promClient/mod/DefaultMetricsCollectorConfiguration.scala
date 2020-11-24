package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMetricsCollectorConfiguration extends js.Object {
  
  var eventLoopMonitoringPrecision: js.UndefOr[Double] = js.native
  
  var gcDurationBuckets: js.UndefOr[js.Array[Double]] = js.native
  
  var prefix: js.UndefOr[String] = js.native
  
  var register: js.UndefOr[Registry] = js.native
}
object DefaultMetricsCollectorConfiguration {
  
  @scala.inline
  def apply(): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
  
  @scala.inline
  implicit class DefaultMetricsCollectorConfigurationOps[Self <: DefaultMetricsCollectorConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEventLoopMonitoringPrecision(value: Double): Self = this.set("eventLoopMonitoringPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventLoopMonitoringPrecision: Self = this.set("eventLoopMonitoringPrecision", js.undefined)
    
    @scala.inline
    def setGcDurationBucketsVarargs(value: Double*): Self = this.set("gcDurationBuckets", js.Array(value :_*))
    
    @scala.inline
    def setGcDurationBuckets(value: js.Array[Double]): Self = this.set("gcDurationBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcDurationBuckets: Self = this.set("gcDurationBuckets", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRegister(value: Registry): Self = this.set("register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
  }
}
