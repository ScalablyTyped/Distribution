package typings
package atPulumiKubernetesLib.typesInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/types/input", "policy")
@js.native
object policyNs extends js.Object {
  @JSName("v1beta1")
  @js.native
  object v1beta1Ns extends js.Object {
    /**
             * Eviction evicts a pod from its node subject to certain policies and safety constraints. This
             * is a subresource of Pod.  A request to cause such an eviction is created by POSTing to
             * .../pods/<pod name>/evictions.
             */
    
    trait Eviction extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * DeleteOptions may be provided
                   */
      var deleteOptions: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.DeleteOptions]
          ] = js.undefined
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      /**
                   * ObjectMeta describes the pod that is being evicted.
                   */
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ObjectMeta]
          ] = js.undefined
    }
    
    /**
             * PodDisruptionBudget is an object to define the max disruption that can be caused to a
             * collection of pods
             */
    
    trait PodDisruptionBudget extends js.Object {
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
      /**
                   * Specification of the desired behavior of the PodDisruptionBudget.
                   */
      var spec: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodDisruptionBudgetSpec]] = js.undefined
      /**
                   * Most recently observed status of the PodDisruptionBudget.
                   */
      var status: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[PodDisruptionBudgetStatus]] = js.undefined
    }
    
    /**
             * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
             */
    
    trait PodDisruptionBudgetList extends js.Object {
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      var apiVersion: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var items: atPulumiPulumiLib.resourceMod.Input[js.Array[PodDisruptionBudget]]
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      var kind: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[java.lang.String]] = js.undefined
      var metadata: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.ListMeta]
          ] = js.undefined
    }
    
    /**
             * PodDisruptionBudgetSpec is a description of a PodDisruptionBudget.
             */
    
    trait PodDisruptionBudgetSpec extends js.Object {
      /**
                   * An eviction is allowed if at most "maxUnavailable" pods selected by "selector" are
                   * unavailable after the eviction, i.e. even in absence of the evicted pod. For example, one
                   * can prevent all voluntary evictions by specifying 0. This is a mutually exclusive setting
                   * with "minAvailable".
                   */
      var maxUnavailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * An eviction is allowed if at least "minAvailable" pods selected by "selector" will still be
                   * available after the eviction, i.e. even in the absence of the evicted pod.  So for example
                   * you can prevent all voluntary evictions by specifying "100%".
                   */
      var minAvailable: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double | java.lang.String]] = js.undefined
      /**
                   * Label query over pods whose evictions are managed by the disruption budget.
                   */
      var selector: js.UndefOr[
            atPulumiPulumiLib.resourceMod.Input[atPulumiKubernetesLib.typesInputMod.metaNs.v1Ns.LabelSelector]
          ] = js.undefined
    }
    
    /**
             * PodDisruptionBudgetStatus represents information about the status of a PodDisruptionBudget.
             * Status may trail the actual state of a system.
             */
    
    trait PodDisruptionBudgetStatus extends js.Object {
      /**
                   * current number of healthy pods
                   */
      var currentHealthy: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * minimum desired number of healthy pods
                   */
      var desiredHealthy: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * DisruptedPods contains information about pods whose eviction was processed by the API
                   * server eviction subresource handler but has not yet been observed by the
                   * PodDisruptionBudget controller. A pod will be in this map from the time when the API server
                   * processed the eviction request to the time when the pod is seen by PDB controller as having
                   * been marked for deletion (or after a timeout). The key in the map is the name of the pod
                   * and the value is the time when the API server processed the eviction request. If the
                   * deletion didn't occur and a pod is still there it will be removed from the list
                   * automatically by PodDisruptionBudget controller after some time. If everything goes smooth
                   * this map should be empty for the most of the time. Large number of entries in the map may
                   * indicate problems with pod deletions.
                   */
      var disruptedPods: atPulumiPulumiLib.resourceMod.Input[js.Object]
      /**
                   * Number of pod disruptions that are currently allowed.
                   */
      var disruptionsAllowed: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * total number of pods counted by this disruption budget
                   */
      var expectedPods: atPulumiPulumiLib.resourceMod.Input[scala.Double]
      /**
                   * Most recent generation observed when updating this PDB status. PodDisruptionsAllowed and
                   * other status informatio is valid only if observedGeneration equals to PDB's object
                   * generation.
                   */
      var observedGeneration: js.UndefOr[atPulumiPulumiLib.resourceMod.Input[scala.Double]] = js.undefined
    }
    
    def isEviction(o: js.Any): /* is Eviction */scala.Boolean = js.native
    def isPodDisruptionBudget(o: js.Any): /* is PodDisruptionBudget */scala.Boolean = js.native
    def isPodDisruptionBudgetList(o: js.Any): /* is PodDisruptionBudgetList */scala.Boolean = js.native
  }
  
}

