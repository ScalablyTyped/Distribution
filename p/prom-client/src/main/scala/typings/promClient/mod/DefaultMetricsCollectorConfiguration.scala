package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultMetricsCollectorConfiguration extends StObject {
  
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
  implicit class DefaultMetricsCollectorConfigurationMutableBuilder[Self <: DefaultMetricsCollectorConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventLoopMonitoringPrecision(value: Double): Self = StObject.set(x, "eventLoopMonitoringPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventLoopMonitoringPrecisionUndefined: Self = StObject.set(x, "eventLoopMonitoringPrecision", js.undefined)
    
    @scala.inline
    def setGcDurationBuckets(value: js.Array[Double]): Self = StObject.set(x, "gcDurationBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcDurationBucketsUndefined: Self = StObject.set(x, "gcDurationBuckets", js.undefined)
    
    @scala.inline
    def setGcDurationBucketsVarargs(value: Double*): Self = StObject.set(x, "gcDurationBuckets", js.Array(value :_*))
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRegister(value: Registry): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
