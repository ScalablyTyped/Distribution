package typings
package atPulumiKubernetesLib.atPulumiKubernetesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "policy")
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
      extends atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget {
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
    }
    
    /**
      * PodDisruptionBudgetList is a collection of PodDisruptionBudgets.
      */
    @js.native
    class PodDisruptionBudgetList protected ()
      extends atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList {
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
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container.
      */
    @js.native
    class PodSecurityPolicy protected ()
      extends atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy {
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
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
      */
    @js.native
    class PodSecurityPolicyList protected ()
      extends atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList {
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
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudget = js.native
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
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodDisruptionBudgetList = js.native
    }
    
    /**
      * PodSecurityPolicy governs the ability to make requests that affect the Security Context that
      * will be applied to a pod and container.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicy = js.native
    }
    
    /**
      * PodSecurityPolicyList is a list of PodSecurityPolicy objects.
      */
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
        * @param id An ID for the Kubernetes resource to retrive. Takes the form
        *  <namespace>/<name> or <name>.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList = js.native
      def get(
        name: java.lang.String,
        id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
        opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
      ): atPulumiKubernetesLib.providerMod.policyNs.v1beta1Ns.PodSecurityPolicyList = js.native
    }
    
  }
  
}

