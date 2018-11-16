package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "policy")
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
    @js.native
    class Eviction protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a policy.v1beta1.Eviction resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a policy.v1beta1.Eviction resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.Eviction) = this()
      /**
                  * Create a policy.v1beta1.Eviction resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.Eviction, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * DeleteOptions may be provided
                   */
      val deleteOptions: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.DeleteOptions] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * ObjectMeta describes the pod that is being evicted.
                   */
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.Eviction = js.native
    }
    
    /**
             * PodDisruptionBudget is an object to define the max disruption that can be caused to a
             * collection of pods
             */
    @js.native
    class PodDisruptionBudget protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget) = this()
      /**
                  * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
                   * Specification of the desired behavior of the PodDisruptionBudget.
                   */
      val spec: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
      /**
                   * Most recently observed status of the PodDisruptionBudget.
                   */
      val status: atPulumiPulumiLib.pulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
    }
    
    /**
             * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
             */
    @js.native
    class PodDisruptionBudgetList protected ()
      extends atPulumiPulumiLib.pulumiMod.CustomResource {
      /**
                  * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String) = this()
      /**
                  * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList) = this()
      /**
                  * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
                  *
                  * @param name The _unique_ name of the resource.
                  * @param args The arguments to use to populate this resource's properties.
                  * @param opts A bag of options that control this resource's behavior.
                  */
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
                   * APIVersion defines the versioned schema of this representation of an object. Servers should
                   * convert recognized schemas to the latest internal value, and may reject unrecognized
                   * values. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
                   */
      val apiVersion: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val items: atPulumiPulumiLib.pulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
          ] = js.native
      /**
                   * Kind is a string value representing the REST resource this object represents. Servers may
                   * infer this from the endpoint the client submits requests to. Cannot be updated. In
                   * CamelCase. More info:
                   * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
                   */
      val kind: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
      val metadata: atPulumiPulumiLib.pulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
    }
    
    /**
             * Eviction evicts a pod from its node subject to certain policies and safety constraints. This
             * is a subresource of Pod.  A request to cause such an eviction is created by POSTing to
             * .../pods/<pod name>/evictions.
             */
    @js.native
    object Eviction extends js.Object {
      /**
                   * Get the state of an existing `Eviction` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.Eviction = js.native
    }
    
    /**
             * PodDisruptionBudget is an object to define the max disruption that can be caused to a
             * collection of pods
             */
    @js.native
    object PodDisruptionBudget extends js.Object {
      /**
                   * Get the state of an existing `PodDisruptionBudget` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
    }
    
    /**
             * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
             */
    @js.native
    object PodDisruptionBudgetList extends js.Object {
      /**
                   * Get the state of an existing `PodDisruptionBudgetList` resource, as identified by `id`.
                   * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
                   * Kubernetes convention) the ID becomes default/<name>.
                   *
                   * Pulumi will keep track of this resource using `name` as the Pulumi ID.
                   *
                   * @param name _Unique_ name used to register this resource with Pulumi.
                   * @param id An ID for the Kubernetes resource to retrive. Takes the form
                   *  <namespace>/<name> or <name>.
                   */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
    }
    
  }
  
}

