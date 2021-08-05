package typings.pulumiKubernetes.inputMod.autoscaling

import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv1
import typings.pulumiPulumi.outputMod.Input
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
    var apiVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
      */
    var kind: Input[String]
    
    /**
      * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
      */
    var name: Input[String]
  }
  object CrossVersionObjectReference {
    
    inline def apply(kind: Input[String], name: Input[String]): CrossVersionObjectReference = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CrossVersionObjectReference]
    }
    
    extension [Self <: CrossVersionObjectReference](x: Self) {
      
      inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * configuration of a horizontal pod autoscaler.
    */
  trait HorizontalPodAutoscaler extends StObject {
    
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    var apiVersion: js.UndefOr[Input[autoscalingSlashv1]] = js.undefined
    
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler]] = js.undefined
    
    /**
      * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
      */
    var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
    
    /**
      * behaviour of autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
      */
    var spec: js.UndefOr[Input[HorizontalPodAutoscalerSpec]] = js.undefined
    
    /**
      * current information about the autoscaler.
      */
    var status: js.UndefOr[Input[HorizontalPodAutoscalerStatus]] = js.undefined
  }
  object HorizontalPodAutoscaler {
    
    inline def apply(): HorizontalPodAutoscaler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalPodAutoscaler]
    }
    
    extension [Self <: HorizontalPodAutoscaler](x: Self) {
      
      inline def setApiVersion(value: Input[autoscalingSlashv1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
      
      inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
      
      inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setSpec(value: Input[HorizontalPodAutoscalerSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
      
      inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      
      inline def setStatus(value: Input[HorizontalPodAutoscalerStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  /**
    * specification of a horizontal pod autoscaler.
    */
  trait HorizontalPodAutoscalerSpec extends StObject {
    
    /**
      * upper limit for the number of pods that can be set by the autoscaler; cannot be smaller than MinReplicas.
      */
    var maxReplicas: Input[Double]
    
    /**
      * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
      */
    var minReplicas: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * reference to scaled resource; horizontal pod autoscaler will learn the current resource consumption and will set the desired number of pods by using its Scale subresource.
      */
    var scaleTargetRef: Input[CrossVersionObjectReference]
    
    /**
      * target average CPU utilization (represented as a percentage of requested CPU) over all the pods; if not specified the default autoscaling policy will be used.
      */
    var targetCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
  }
  object HorizontalPodAutoscalerSpec {
    
    inline def apply(maxReplicas: Input[Double], scaleTargetRef: Input[CrossVersionObjectReference]): HorizontalPodAutoscalerSpec = {
      val __obj = js.Dynamic.literal(maxReplicas = maxReplicas.asInstanceOf[js.Any], scaleTargetRef = scaleTargetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscalerSpec]
    }
    
    extension [Self <: HorizontalPodAutoscalerSpec](x: Self) {
      
      inline def setMaxReplicas(value: Input[Double]): Self = StObject.set(x, "maxReplicas", value.asInstanceOf[js.Any])
      
      inline def setMinReplicas(value: Input[Double]): Self = StObject.set(x, "minReplicas", value.asInstanceOf[js.Any])
      
      inline def setMinReplicasUndefined: Self = StObject.set(x, "minReplicas", js.undefined)
      
      inline def setScaleTargetRef(value: Input[CrossVersionObjectReference]): Self = StObject.set(x, "scaleTargetRef", value.asInstanceOf[js.Any])
      
      inline def setTargetCPUUtilizationPercentage(value: Input[Double]): Self = StObject.set(x, "targetCPUUtilizationPercentage", value.asInstanceOf[js.Any])
      
      inline def setTargetCPUUtilizationPercentageUndefined: Self = StObject.set(x, "targetCPUUtilizationPercentage", js.undefined)
    }
  }
  
  /**
    * current status of a horizontal pod autoscaler
    */
  trait HorizontalPodAutoscalerStatus extends StObject {
    
    /**
      * current average CPU utilization over all pods, represented as a percentage of requested CPU, e.g. 70 means that an average pod is using now 70% of its requested CPU.
      */
    var currentCPUUtilizationPercentage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * current number of replicas of pods managed by this autoscaler.
      */
    var currentReplicas: Input[Double]
    
    /**
      * desired number of replicas of pods managed by this autoscaler.
      */
    var desiredReplicas: Input[Double]
    
    /**
      * last time the HorizontalPodAutoscaler scaled the number of pods; used by the autoscaler to control how often the number of pods is changed.
      */
    var lastScaleTime: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * most recent generation observed by this autoscaler.
      */
    var observedGeneration: js.UndefOr[Input[Double]] = js.undefined
  }
  object HorizontalPodAutoscalerStatus {
    
    inline def apply(currentReplicas: Input[Double], desiredReplicas: Input[Double]): HorizontalPodAutoscalerStatus = {
      val __obj = js.Dynamic.literal(currentReplicas = currentReplicas.asInstanceOf[js.Any], desiredReplicas = desiredReplicas.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalPodAutoscalerStatus]
    }
    
    extension [Self <: HorizontalPodAutoscalerStatus](x: Self) {
      
      inline def setCurrentCPUUtilizationPercentage(value: Input[Double]): Self = StObject.set(x, "currentCPUUtilizationPercentage", value.asInstanceOf[js.Any])
      
      inline def setCurrentCPUUtilizationPercentageUndefined: Self = StObject.set(x, "currentCPUUtilizationPercentage", js.undefined)
      
      inline def setCurrentReplicas(value: Input[Double]): Self = StObject.set(x, "currentReplicas", value.asInstanceOf[js.Any])
      
      inline def setDesiredReplicas(value: Input[Double]): Self = StObject.set(x, "desiredReplicas", value.asInstanceOf[js.Any])
      
      inline def setLastScaleTime(value: Input[String]): Self = StObject.set(x, "lastScaleTime", value.asInstanceOf[js.Any])
      
      inline def setLastScaleTimeUndefined: Self = StObject.set(x, "lastScaleTime", js.undefined)
      
      inline def setObservedGeneration(value: Input[Double]): Self = StObject.set(x, "observedGeneration", value.asInstanceOf[js.Any])
      
      inline def setObservedGenerationUndefined: Self = StObject.set(x, "observedGeneration", js.undefined)
    }
  }
}
