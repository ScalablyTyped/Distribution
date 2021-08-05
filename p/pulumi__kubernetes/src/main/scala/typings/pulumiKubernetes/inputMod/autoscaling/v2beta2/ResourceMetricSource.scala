package typings.pulumiKubernetes.inputMod.autoscaling.v2beta2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceMetricSource indicates how to scale on a resource metric known to Kubernetes, as specified in requests and limits, describing each pod in the current scale target (e.g. CPU or memory).  The values will be averaged together before being compared to the target.  Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.  Only one "target" type should be set.
  */
trait ResourceMetricSource extends StObject {
  
  /**
    * name is the name of the resource in question.
    */
  var name: Input[String]
  
  /**
    * target specifies the target value for the given metric
    */
  var target: Input[MetricTarget]
}
object ResourceMetricSource {
  
  inline def apply(name: Input[String], target: Input[MetricTarget]): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
  
  extension [Self <: ResourceMetricSource](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Input[MetricTarget]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
