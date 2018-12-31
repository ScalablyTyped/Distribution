package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "settings")
@js.native
object settingsNs extends js.Object {
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * PodPreset is a policy resource that defines additional runtime requirements for a Pod.
      */
    trait PodPreset extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodPresetSpec]] = js.undefined
    }
    
    /**
      * PodPresetList is a list of PodPreset objects.
      */
    trait PodPresetList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Items is a list of schema objects.
        */
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PodPreset]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
      * PodPresetSpec is a description of a pod preset.
      */
    trait PodPresetSpec extends js.Object {
      /**
        * Env defines the collection of EnvVar to inject into containers.
        */
      var env: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EnvVar]]
          ] = js.undefined
      /**
        * EnvFrom defines the collection of EnvFromSource to inject into containers.
        */
      var envFrom: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.EnvFromSource]]
          ] = js.undefined
      /**
        * Selector is a label query over a set of resources, in this case pods. Required.
        */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
      /**
        * VolumeMounts defines the collection of VolumeMount to inject into containers.
        */
      var volumeMounts: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.VolumeMount]]
          ] = js.undefined
      /**
        * Volumes defines the collection of Volume to inject into the pod.
        */
      var volumes: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[js.Array[atPulumiKubernetesLib.typesInputMod.coreNs.v1Ns.Volume]]
          ] = js.undefined
    }
    
    def isPodPreset(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.settings.v1alpha1.PodPreset */ scala.Boolean = js.native
    def isPodPresetList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.settings.v1alpha1.PodPresetList */ scala.Boolean = js.native
  }
  
}

