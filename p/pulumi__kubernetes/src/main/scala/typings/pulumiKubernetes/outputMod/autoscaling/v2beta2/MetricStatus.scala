package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricStatus describes the last-read state of a single metric.
  */
trait MetricStatus extends StObject {
  
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
    */
  var external: ExternalMetricStatus
  
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: ObjectMetricStatus
  
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: PodsMetricStatus
  
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: ResourceMetricStatus
  
  /**
    * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each corresponds to a matching field in the object.
    */
  var `type`: String
}
object MetricStatus {
  
  inline def apply(
    external: ExternalMetricStatus,
    `object`: ObjectMetricStatus,
    pods: PodsMetricStatus,
    resource: ResourceMetricStatus,
    `type`: String
  ): MetricStatus = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStatus]
  }
  
  extension [Self <: MetricStatus](x: Self) {
    
    inline def setExternal(value: ExternalMetricStatus): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    inline def setObject(value: ObjectMetricStatus): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setPods(value: PodsMetricStatus): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    inline def setResource(value: ResourceMetricStatus): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
