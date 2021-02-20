package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
@js.native
trait PodsMetricSource extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier = js.native
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTarget = js.native
}
object PodsMetricSource {
  
  @scala.inline
  def apply(metric: MetricIdentifier, target: MetricTarget): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  
  @scala.inline
  implicit class PodsMetricSourceMutableBuilder[Self <: PodsMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: MetricTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
