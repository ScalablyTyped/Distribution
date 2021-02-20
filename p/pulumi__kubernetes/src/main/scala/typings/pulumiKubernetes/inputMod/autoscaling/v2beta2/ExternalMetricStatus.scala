package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricStatus indicates the current value of a global metric not associated with any Kubernetes object.
  */
@js.native
trait ExternalMetricStatus extends StObject {
  
  /**
    * current contains the current value for the given metric
    */
  var current: Input[MetricValueStatus] = js.native
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: Input[MetricIdentifier] = js.native
}
object ExternalMetricStatus {
  
  @scala.inline
  def apply(current: Input[MetricValueStatus], metric: Input[MetricIdentifier]): ExternalMetricStatus = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricStatus]
  }
  
  @scala.inline
  implicit class ExternalMetricStatusMutableBuilder[Self <: ExternalMetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Input[MetricValueStatus]): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: Input[MetricIdentifier]): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
