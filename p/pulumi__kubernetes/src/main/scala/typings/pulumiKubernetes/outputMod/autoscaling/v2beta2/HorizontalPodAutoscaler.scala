package typings.pulumiKubernetes.outputMod.autoscaling.v2beta2

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HorizontalPodAutoscaler is the configuration for a horizontal pod autoscaler, which automatically manages the replica count of any resource implementing the scale subresource based on the metrics specified.
  */
trait HorizontalPodAutoscaler extends StObject {
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: autoscalingSlashv2beta2
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler
  
  /**
    * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta
  
  /**
    * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
    */
  var spec: HorizontalPodAutoscalerSpec
  
  /**
    * status is the current information about the autoscaler.
    */
  var status: HorizontalPodAutoscalerStatus
}
object HorizontalPodAutoscaler {
  
  @scala.inline
  def apply(metadata: ObjectMeta, spec: HorizontalPodAutoscalerSpec, status: HorizontalPodAutoscalerStatus): HorizontalPodAutoscaler = {
    val __obj = js.Dynamic.literal(apiVersion = "autoscaling/v2beta2", kind = "HorizontalPodAutoscaler", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HorizontalPodAutoscaler]
  }
  
  @scala.inline
  implicit class HorizontalPodAutoscalerMutableBuilder[Self <: HorizontalPodAutoscaler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: autoscalingSlashv2beta2): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpec(value: HorizontalPodAutoscalerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: HorizontalPodAutoscalerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
