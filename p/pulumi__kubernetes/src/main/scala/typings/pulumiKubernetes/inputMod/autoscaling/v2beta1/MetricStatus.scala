package typings.pulumiKubernetes.inputMod.autoscaling.v2beta1

import typings.pulumiPulumi.outputMod.Input
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
  var external: js.UndefOr[Input[ExternalMetricStatus]] = js.undefined
  
  /**
    * object refers to a metric describing a single kubernetes object (for example, hits-per-second on an Ingress object).
    */
  var `object`: js.UndefOr[Input[ObjectMetricStatus]] = js.undefined
  
  /**
    * pods refers to a metric describing each pod in the current scale target (for example, transactions-processed-per-second).  The values will be averaged together before being compared to the target value.
    */
  var pods: js.UndefOr[Input[PodsMetricStatus]] = js.undefined
  
  /**
    * resource refers to a resource metric (such as those specified in requests and limits) known to Kubernetes describing each pod in the current scale target (e.g. CPU or memory). Such metrics are built in to Kubernetes, and have special scaling options on top of those available to normal per-pod metrics using the "pods" source.
    */
  var resource: js.UndefOr[Input[ResourceMetricStatus]] = js.undefined
  
  /**
    * type is the type of metric source.  It will be one of "Object", "Pods" or "Resource", each corresponds to a matching field in the object.
    */
  var `type`: Input[String]
}
object MetricStatus {
  
  @scala.inline
  def apply(`type`: Input[String]): MetricStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricStatus]
  }
  
  @scala.inline
  implicit class MetricStatusMutableBuilder[Self <: MetricStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal(value: Input[ExternalMetricStatus]): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
    
    @scala.inline
    def setObject(value: Input[ObjectMetricStatus]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectUndefined: Self = StObject.set(x, "object", js.undefined)
    
    @scala.inline
    def setPods(value: Input[PodsMetricStatus]): Self = StObject.set(x, "pods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPodsUndefined: Self = StObject.set(x, "pods", js.undefined)
    
    @scala.inline
    def setResource(value: Input[ResourceMetricStatus]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
