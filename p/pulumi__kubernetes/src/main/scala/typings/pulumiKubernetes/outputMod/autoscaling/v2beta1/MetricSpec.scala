package typings.pulumiKubernetes.outputMod.autoscaling.v2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * MetricSpec specifies how to scale based on a single metric (only `type` and one other matching field should be set at once).
  */
trait MetricSpec extends StObject {
  
  /**
    * external refers to a global metric that is not associated with any Kubernetes object. It allows autoscaling based on information coming from components running outside of cluster (for example length of queue in cloud messaging service, or QPS from loadbalancer running outside of cluster).
    */
  var external: ExternalMetricSource
  
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: ObjectMetricSource
  
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: PodsMetricSource
  
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: ResourceMetricSource
  
  /**
    * type is the type of metric source.  It should be one of "Object", "Pods" or "Resource", each mapping to a matching field in the object.
    */
  var `type`: String
}
object MetricSpec {
  
  @scala.inline
  def apply(
    external: ExternalMetricSource,
    `object`: ObjectMetricSource,
    pods: PodsMetricSource,
    resource: ResourceMetricSource,
    `type`: String
  ): MetricSpec = {
    val __obj = js.Dynamic.literal(external = external.asInstanceOf[js.Any], pods = pods.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricSpec]
  }
  
  @scala.inline
  implicit class MetricSpecMutableBuilder[Self <: MetricSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal(value: ExternalMetricSource): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ObjectMetricSource): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPods(value: PodsMetricSource): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: ResourceMetricSource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
