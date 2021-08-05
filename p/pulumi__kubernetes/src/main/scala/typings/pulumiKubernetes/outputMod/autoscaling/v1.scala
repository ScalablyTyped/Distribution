package typings.pulumiKubernetes.outputMod.autoscaling

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v1 {
  
  /**
    * CrossVersionObjectReference contains enough information to let you identify the referred resource.
    */
  trait CrossVersionObjectReference extends StObject {
    
    /**
      * API version of the referent
      */
    var apiVersion: String
    
    /**
      * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
      */
    var kind: String
    
    /**
      * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
      */
    var name: String
  }
  object CrossVersionObjectReference {
    
    inline def apply(apiVersion: String, kind: String, name: String): CrossVersionObjectReference = {
      val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrossVersionObjectReference]
    }
    
    extension [Self <: CrossVersionObjectReference](x: Self) {
      
      inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * configuration of a horizontal pod autoscaler.
    */
  trait HorizontalPodAutoscaler extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: autoscalingSlashv1
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: ObjectMeta
    
    /**
      * behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    var spec: HorizontalPodAutoscalerSpec
    
    /**
      * current information about the autoscaler.
      */
    var status: HorizontalPodAutoscalerStatus
  }
  object HorizontalPodAutoscaler {
    
    inline def apply(metadata: ObjectMeta, spec: HorizontalPodAutoscalerSpec, status: HorizontalPodAutoscalerStatus): HorizontalPodAutoscaler = {
      val __obj = js.Dynamic.literal(apiVersion = "autoscaling/v1", kind = "HorizontalPodAutoscaler", metadata = metadata.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscaler]
    }
    
    extension [Self <: HorizontalPodAutoscaler](x: Self) {
      
      inline def setApiVersion(value: autoscalingSlashv1): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setKind(value: typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: ObjectMeta): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setSpec(value: HorizontalPodAutoscalerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: HorizontalPodAutoscalerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specification of a horizontal pod autoscaler.
    */
  trait HorizontalPodAutoscalerSpec extends StObject {
    
    /**
      * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
      */
    var maxReplicas: Double
    
    /**
      * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
      */
    var minReplicas: Double
    
    /**
      * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
      */
    var scaleTargetRef: CrossVersionObjectReference
    
    /**
      * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
      */
    var targetCPUUtilizationPercentage: Double
  }
  object HorizontalPodAutoscalerSpec {
    
    inline def apply(
      maxReplicas: Double,
      minReplicas: Double,
      scaleTargetRef: CrossVersionObjectReference,
      targetCPUUtilizationPercentage: Double
    ): HorizontalPodAutoscalerSpec = {
      val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], minReplicas = minReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any], targetCPUUtilizationPercentage = targetCPUUtilizationPercentage.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
    }
    
    extension [Self <: HorizontalPodAutoscalerSpec](x: Self) {
      
      inline def setMaxReplicas(value: Double): Self = StObject.set(x, "maxReplicas", value.asInstanceOf[js.Any])
      
      inline def setMinReplicas(value: Double): Self = StObject.set(x, "minReplicas", value.asInstanceOf[js.Any])
      
      inline def setScaleTargetRef(value: CrossVersionObjectReference): Self = StObject.set(x, "scaleTargetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetCPUUtilizationPercentage(value: Double): Self = StObject.set(x, "targetCPUUtilizationPercentage", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * current status of a horizontal pod autoscaler
    */
  trait HorizontalPodAutoscalerStatus extends StObject {
    
    /**
      * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
      */
    var currentCPUUtilizationPercentage: Double
    
    /**
      * current number of replicas of pods managed by this autoscaler.
      */
    var currentReplicas: Double
    
    /**
      * desired number of replicas of pods managed by this autoscaler.
      */
    var desiredReplicas: Double
    
    /**
      * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
      */
    var lastScaleTime: String
    
    /**
      * most recent generation observed by this autoscaler.
      */
    var observedGeneration: Double
  }
  object HorizontalPodAutoscalerStatus {
    
    inline def apply(
      currentCPUUtilizationPercentage: Double,
      currentReplicas: Double,
      desiredReplicas: Double,
      lastScaleTime: String,
      observedGeneration: Double
    ): HorizontalPodAutoscalerStatus = {
      val __obj = js.Dynamic.literal(currentCPUUtilizationPercentage = currentCPUUtilizationPercentage.asInstanceOf[js.Any], currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any], lastScaleTime = lastScaleTime.asInstanceOf[js.Any], observedGeneration = observedGeneration.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
    }
    
    extension [Self <: HorizontalPodAutoscalerStatus](x: Self) {
      
      inline def setCurrentCPUUtilizationPercentage(value: Double): Self = StObject.set(x, "currentCPUUtilizationPercentage", value.asInstanceOf[js.Any])
      
      inline def setCurrentReplicas(value: Double): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
      
      inline def setDesiredReplicas(value: Double): Self = StObject.set(x, "desiredReplicas", value.asInstanceOf[js.Any])
      
      inline def setLastScaleTime(value: String): Self = StObject.set(x, "lastScaleTime", value.asInstanceOf[js.Any])
      
      inline def setObservedGeneration(value: Double): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
    }
  }
}
