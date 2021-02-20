package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ObjectMetricSource indicates how to scale on a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
  */
@js.native
trait ObjectMetricSource extends StObject {
  
  var describedObject: CrossVersionObjectReference = js.native
  
  /**
    * metric identifies the target metric by name and selector
    */
  var metric: MetricIdentifier = js.native
  
  /**
    * target specifies the target value for the given metric
    */
  var target: MetricTarget = js.native
}
object ObjectMetricSource {
  
  @scala.inline
  def apply(describedObject: CrossVersionObjectReference, metric: MetricIdentifier, target: MetricTarget): ObjectMetricSource = {
    val __obj = js.Dynamic.literal(describedObject = describedObject.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMetricSource]
  }
  
  @scala.inline
  implicit class ObjectMetricSourceMutableBuilder[Self <: ObjectMetricSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescribedObject(value: CrossVersionObjectReference): Self = StObject.set(x, "describedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetric(value: MetricIdentifier): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: MetricTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
