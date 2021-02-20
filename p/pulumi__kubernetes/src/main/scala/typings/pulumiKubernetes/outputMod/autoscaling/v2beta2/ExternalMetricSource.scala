package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ExternalMetricSource indicates how to scale on a metric not associated with any Kubernetes object (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
  */
@js.native
trait ExternalMetricSource extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier = js.native
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTarget = js.native
}
object ExternalMetricSource {
  
  @scala.inline
  def apply(metric: MetricIdentifier, target: MetricTarget): ExternalMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalMetricSource]
  }
  
  @scala.inline
  implicit class ExternalMetricSourceMutableBuilder[Self <: ExternalMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: MetricTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
