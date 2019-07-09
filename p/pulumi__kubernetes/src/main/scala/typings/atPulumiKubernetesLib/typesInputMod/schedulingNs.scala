package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "scheduling")
@js.native
object schedulingNs extends js.Object {
  @JSName("v1")
  @js.native
  object v1Ns extends js.Object {
    /**
      * PriorityClass defines mapping from a priority class name to the priority integer value. The
      * value can be any valid integer.
      */
    trait PriorityClass extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: atPulumiPulumiLib.outputMod.Input[scala.Double]
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    trait PriorityClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1`]
          ] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[PriorityClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClass */ scala.Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClassList */ scala.Boolean = js.native
  }
  
  @JSName("v1alpha1")
  @js.native
  object v1alpha1Ns extends js.Object {
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by
      * scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name
      * to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
            ]
          ] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: atPulumiPulumiLib.outputMod.Input[scala.Double]
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    trait PriorityClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1alpha1`
            ]
          ] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[PriorityClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClass */ scala.Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClassList */ scala.Boolean = js.native
  }
  
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
      * DEPRECATED - This group version of PriorityClass is deprecated by
      * scheduling.k8s.io/v1/PriorityClass. PriorityClass defines mapping from a priority class name
      * to the priority integer value. The value can be any valid integer.
      */
    trait PriorityClass extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClass]
          ] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: atPulumiPulumiLib.outputMod.Input[scala.Double]
    }
    
    /**
      * PriorityClassList is a collection of priority classes.
      */
    trait PriorityClassList extends js.Object {
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      var apiVersion: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[
              atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`schedulingDOTk8sDOTio/v1beta1`
            ]
          ] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[PriorityClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PriorityClassList]
          ] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.outputMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClass */ scala.Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClassList */ scala.Boolean = js.native
  }
  
}

