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
      * PodDisruptionBudget is an object to define the max disruption that can be caused to a
      * collection of pods
      */
    @js.native
    class PodDisruptionBudget protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudget] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * Specification of the desired behavior of the PodDisruptionBudget.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec] = js.native
      /**
        * Most recently observed status of the PodDisruptionBudget.
        */
      val status: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
          ] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
    }
    
    /**
      * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
      */
    @js.native
    class PodDisruptionBudgetList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudget]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodDisruptionBudgetList] = js.native
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container.
      */
    @js.native
    class PodSecurityPolicy protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a policy.v1beta1.PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicy) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicy, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicy] = js.native
      /**
        * Standard object's metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
      /**
        * spec defines the policy enforced.
        */
      val spec: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicySpec] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicy = js.native
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
      */
    @js.native
    class PodSecurityPolicyList protected ()
      extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
      /**
        * Create a policy.v1beta1.PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: java.lang.String) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicyList) = this()
      def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicyList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
      val __inputs: js.Any = js.native
      /**
        * APIVersion defines the versioned schema of this representation of an object. Servers should
        * convert recognized schemas to the latest internal value, and may reject unrecognized
        * values. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
        */
      val apiVersion: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`policy/v1beta1`] = js.native
      /**
        * items is a list of schema objects.
        */
      val items: atPulumiPulumiLib.atPulumiPulumiMod.Output[
            js.Array[atPulumiKubernetesLib.typesOutputMod.policyNs.v1beta1Ns.PodSecurityPolicy]
          ] = js.native
      /**
        * Kind is a string value representing the REST resource this object represents. Servers may
        * infer this from the endpoint the client submits requests to. Cannot be updated. In
        * CamelCase. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
        */
      val kind: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.PodSecurityPolicyList] = js.native
      /**
        * Standard list metadata. More info:
        * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
        */
      val metadata: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
      def getInputs(): atPulumiKubernetesLib.typesInputMod.policyNs.v1beta1Ns.PodSecurityPolicyList = js.native
    }
    
    /* static members */
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
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
    }
    
    /* static members */
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
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicy extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicy` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicyList extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicyList` resource, as identified by `id`.
        * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
        * Kubernetes convention) the ID becomes default/<name>.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList = js.native
    }
    
  }
  
}

