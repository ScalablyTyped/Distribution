package typings.atPulumiKubernetes

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/policy", JSImport.Namespace)
@js.native
object policyMod extends js.Object {
  @js.native
  object v1beta1 extends js.Object {
    @js.native
    class PodDisruptionBudget protected ()
      extends typings.atPulumiKubernetes.policyV1beta1Mod.PodDisruptionBudget {
      /**
        * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudget) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudget,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class PodDisruptionBudgetList protected ()
      extends typings.atPulumiKubernetes.policyV1beta1Mod.PodDisruptionBudgetList {
      /**
        * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetList
      ) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class PodSecurityPolicy protected ()
      extends typings.atPulumiKubernetes.policyV1beta1Mod.PodSecurityPolicy {
      /**
        * Create a policy.v1beta1.PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodSecurityPolicy) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodSecurityPolicy,
        opts: CustomResourceOptions
      ) = this()
    }
    
    @js.native
    class PodSecurityPolicyList protected ()
      extends typings.atPulumiKubernetes.policyV1beta1Mod.PodSecurityPolicyList {
      /**
        * Create a policy.v1beta1.PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodSecurityPolicyList) = this()
      def this(
        name: String,
        args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodSecurityPolicyList,
        opts: CustomResourceOptions
      ) = this()
    }
    
    /* static members */
    @js.native
    object PodDisruptionBudget extends js.Object {
      /**
        * Get the state of an existing `PodDisruptionBudget` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.policyV1beta1PodDisruptionBudgetMod.PodDisruptionBudget = js.native
      /**
        * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodDisruptionBudgetList extends js.Object {
      /**
        * Get the state of an existing `PodDisruptionBudgetList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.policyV1beta1PodDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      /**
        * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicy extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicy` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.policyV1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodSecurityPolicy.PodSecurityPolicy */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicyList extends js.Object {
      /**
        * Get the state of an existing `PodSecurityPolicyList` resource, as identified by `id`.
        * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
        * Kubernetes convention) the ID becomes `default/<name>`.
        *
        * Pulumi will keep track of this resource using `name` as the Pulumi ID.
        *
        * @param name _Unique_ name used to register this resource with Pulumi.
        * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
        * @param opts Uniquely specifies a CustomResource to select.
        */
      def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.policyV1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodSecurityPolicyList.PodSecurityPolicyList */ Boolean = js.native
    }
    
  }
  
}

