package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
trait ExternalMetricStatus extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: MetricValueStatus
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier
}
object ExternalMetricStatus {
  
  @scala.inline
  def apply(current: MetricValueStatus, metric: MetricIdentifier): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  
  @scala.inline
  implicit class ExternalMetricStatusMutableBuilder[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: MetricValueStatus): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
