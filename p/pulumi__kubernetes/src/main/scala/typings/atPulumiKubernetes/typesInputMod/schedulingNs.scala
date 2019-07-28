package typings.atPulumiKubernetes.typesInputMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`schedulingDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`schedulingDOTk8sDOTio/v1alpha1`
import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`schedulingDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiKubernetes.typesInputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesInputMod.schedulingNs.v1Ns.PriorityClass
import typings.atPulumiPulumi.outputMod.Input
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1`]] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClass]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: Input[Double]
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1`]] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: Input[js.Array[Input[PriorityClass]]]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList]] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClass */ Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1.PriorityClassList */ Boolean = js.native
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClass]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: Input[Double]
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1alpha1`]] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.schedulingNs.v1alpha1Ns.PriorityClass]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList]] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClass */ Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1alpha1.PriorityClassList */ Boolean = js.native
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * description is an arbitrary string that usually provides guidelines on when this priority
        * class should be used.
        */
      var description: js.UndefOr[Input[String]] = js.undefined
      /**
        * globalDefault specifies whether this PriorityClass should be considered as the default
        * priority for pods that do not have any priority class. Only one PriorityClass can be marked
        * as `globalDefault`. However, if more than one PriorityClasses exists with their
        * `globalDefault` field set to true, the smallest value of such global default
        * PriorityClasses will be used as the default priority.
        */
      var globalDefault: js.UndefOr[Input[Boolean]] = js.undefined
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClass]] = js.undefined
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ObjectMeta]] = js.undefined
      /**
        * PreemptionPolicy is the Policy for preempting pods with lower priority. One of Never,
        * PreemptLowerPriority. Defaults to PreemptLowerPriority if unset. This field is alpha-level
        * and is only honored by servers that enable the NonPreemptingPriority feature.
        */
      var preemptionPolicy: js.UndefOr[Input[String]] = js.undefined
      /**
        * The value of this priority class. This is the actual priority that pods receive when they
        * have the name of this class in their pod spec.
        */
      var value: Input[Double]
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
      var apiVersion: js.UndefOr[Input[`schedulingDOTk8sDOTio/v1beta1`]] = js.undefined
      /**
        * items is the list of PriorityClasses
        */
      var items: Input[
            js.Array[
              Input[typings.atPulumiKubernetes.typesInputMod.schedulingNs.v1beta1Ns.PriorityClass]
            ]
          ]
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      var kind: js.UndefOr[Input[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PriorityClassList]] = js.undefined
      /**
        * Standard list metadata More info:
        * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
        */
      var metadata: js.UndefOr[Input[ListMeta]] = js.undefined
    }
    
    def isPriorityClass(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClass */ Boolean = js.native
    def isPriorityClassList(o: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/types/input.scheduling.v1beta1.PriorityClassList */ Boolean = js.native
  }
  
}

