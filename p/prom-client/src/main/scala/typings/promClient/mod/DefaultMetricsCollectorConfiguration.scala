package typings.promClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultMetricsCollectorConfiguration extends StObject {
  
  var eventLoopMonitoringPrecision: js.UndefOr[Double] = js.undefined
  
  var gcDurationBuckets: js.UndefOr[js.Array[Double]] = js.undefined
  
  var labels: js.UndefOr[js.Object] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var register: js.UndefOr[Registry] = js.undefined
}
object DefaultMetricsCollectorConfiguration {
  
  inline def apply(): DefaultMetricsCollectorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultMetricsCollectorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultMetricsCollectorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEventLoopMonitoringPrecision(value: Double): Self = StObject.set(x, "eventLoopMonitoringPrecision", value.asInstanceOf[js.Any])
    
    inline def setEventLoopMonitoringPrecisionUndefined: Self = StObject.set(x, "eventLoopMonitoringPrecision", js.undefined)
    
    inline def setGcDurationBuckets(value: js.Array[Double]): Self = StObject.set(x, "gcDurationBuckets", value.asInstanceOf[js.Any])
    
    inline def setGcDurationBucketsUndefined: Self = StObject.set(x, "gcDurationBuckets", js.undefined)
    
    inline def setGcDurationBucketsVarargs(value: Double*): Self = StObject.set(x, "gcDurationBuckets", js.Array(value*))
    
    inline def setLabels(value: js.Object): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRegister(value: Registry): Self = StObject.set(x, "register", value.asInstanceOf[js.Any])
    
    inline def setRegisterUndefined: Self = StObject.set(x, "register", js.undefined)
  }
}
