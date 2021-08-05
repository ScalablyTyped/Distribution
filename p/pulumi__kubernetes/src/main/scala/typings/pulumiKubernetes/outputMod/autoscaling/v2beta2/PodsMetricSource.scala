package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
  */
trait PodsMetricSource extends StObject {
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTarget
}
object PodsMetricSource {
  
  inline def apply(metric: MetricIdentifier, target: MetricTarget): PodsMetricSource = {
    val __obj = js.Dynamic.literal(metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[PodsMetricSource]
  }
  
  extension [Self <: PodsMetricSource](x: Self) {
    
    inline def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: MetricTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
