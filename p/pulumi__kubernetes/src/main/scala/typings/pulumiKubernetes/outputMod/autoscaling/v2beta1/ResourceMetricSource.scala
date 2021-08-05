package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

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
  var name: String
  
  /**
    * targetAverageUtilization is the target value of the average of the resource metric across all relevant pods, represented as a percentage of the requested value of the resource for the pods.
    */
  var targetAverageUtilization: Double
  
  /**
    * targetAverageValue is the target value of the average of the resource metric across all relevant pods, as a raw value (instead of as a percentage of the request), similar to the "pods" metric source type.
    */
  var targetAverageValue: String
}
object ResourceMetricSource {
  
  inline def apply(name: String, targetAverageUtilization: Double, targetAverageValue: String): ResourceMetricSource = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], targetAverageUtilization = targetAverageUtilization.asInstanceOf[js.Any], targetAverageValue = targetAverageValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetricSource]
  }
  
  extension [Self <: ResourceMetricSource](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageUtilization(value: Double): Self = StObject.set(x, "targetAverageUtilization", value.asInstanceOf[js.Any])
    
    inline def setTargetAverageValue(value: String): Self = StObject.set(x, "targetAverageValue", value.asInstanceOf[js.Any])
  }
}
