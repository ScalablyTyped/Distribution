package typings.pulumiKubernetes.inputMod

import typings.pulumiKubernetes.inputMod.core.v1.EnvFromSource
import typings.pulumiKubernetes.inputMod.core.v1.EnvVar
import typings.pulumiKubernetes.inputMod.core.v1.Volume
import typings.pulumiKubernetes.inputMod.core.v1.VolumeMount
import typings.pulumiKubernetes.inputMod.meta.v1.LabelSelector
import typings.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.settingsDotk8sDotioSlashv1alpha1
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object settings {
  
  object v1alpha1 {
    
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    trait PodPreset extends StObject {
      
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[Input[settingsDotk8sDotioSlashv1alpha1]] = js.undefined
      
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPreset]] = js.undefined
      
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      
      var spec: js.UndefOr[Input[PodPresetSpec]] = js.undefined
    }
    object PodPreset {
      
      inline def apply(): PodPreset = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PodPreset]
      }
      
      extension [Self <: PodPreset](x: Self) {
        
        inline def setApiVersion(value: Input[settingsDotk8sDotioSlashv1alpha1]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
        
        inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
        
        inline def setKind(value: Input[typings.pulumiKubernetes.pulumiKubernetesStrings.PodPreset]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setMetadata(value: Input[ObjectMeta]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
        
        inline def setSpec(value: Input[PodPresetSpec]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
        
        inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
      }
    }
    
    /**
      * PodPresetSpec is a description of a pod preset.
      */
    trait PodPresetSpec extends StObject {
      
      /**
        * Env defines the collection of EnvVar to inject into containers.
        */
      var env: js.UndefOr[Input[js.Array[Input[EnvVar]]]] = js.undefined
      
      /**
        * EnvFrom defines the collection of EnvFromSource to inject into containers.
        */
      var envFrom: js.UndefOr[Input[js.Array[Input[EnvFromSource]]]] = js.undefined
      
      /**
        * Selector is a label query over a set of resources, in this case pods. Required.
        */
      var selector: js.UndefOr[Input[LabelSelector]] = js.undefined
      
      /**
        * VolumeMounts defines the collection of VolumeMount to inject into containers.
        */
      var volumeMounts: js.UndefOr[Input[js.Array[Input[VolumeMount]]]] = js.undefined
      
      /**
        * Volumes defines the collection of Volume to inject into the pod.
        */
      var volumes: js.UndefOr[Input[js.Array[Input[Volume]]]] = js.undefined
    }
    object PodPresetSpec {
      
      inline def apply(): PodPresetSpec = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PodPresetSpec]
      }
      
      extension [Self <: PodPresetSpec](x: Self) {
        
        inline def setEnv(value: Input[js.Array[Input[EnvVar]]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        inline def setEnvFrom(value: Input[js.Array[Input[EnvFromSource]]]): Self = StObject.set(x, "envFrom", value.asInstanceOf[js.Any])
        
        inline def setEnvFromUndefined: Self = StObject.set(x, "envFrom", js.undefined)
        
        inline def setEnvFromVarargs(value: Input[EnvFromSource]*): Self = StObject.set(x, "envFrom", js.Array(value :_*))
        
        inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
        
        inline def setEnvVarargs(value: Input[EnvVar]*): Self = StObject.set(x, "env", js.Array(value :_*))
        
        inline def setSelector(value: Input[LabelSelector]): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
        
        inline def setVolumeMounts(value: Input[js.Array[Input[VolumeMount]]]): Self = StObject.set(x, "volumeMounts", value.asInstanceOf[js.Any])
        
        inline def setVolumeMountsUndefined: Self = StObject.set(x, "volumeMounts", js.undefined)
        
        inline def setVolumeMountsVarargs(value: Input[VolumeMount]*): Self = StObject.set(x, "volumeMounts", js.Array(value :_*))
        
        inline def setVolumes(value: Input[js.Array[Input[Volume]]]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
        
        inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
        
        inline def setVolumesVarargs(value: Input[Volume]*): Self = StObject.set(x, "volumes", js.Array(value :_*))
      }
    }
  }
}
