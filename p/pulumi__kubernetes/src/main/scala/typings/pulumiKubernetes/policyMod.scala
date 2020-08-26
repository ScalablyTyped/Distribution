package typings.pulumiKubernetes

import typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetListArgs
import typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudgetArgs
import typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyListArgs
import typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicyArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
      extends typings.pulumiKubernetes.policyV1beta1Mod.PodDisruptionBudget {
      /**
        * Create a PodDisruptionBudget resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class PodDisruptionBudgetList protected ()
      extends typings.pulumiKubernetes.policyV1beta1Mod.PodDisruptionBudgetList {
      /**
        * Create a PodDisruptionBudgetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class PodSecurityPolicy protected ()
      extends typings.pulumiKubernetes.policyV1beta1Mod.PodSecurityPolicy {
      /**
        * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
    }
    
    @js.native
    class PodSecurityPolicyList protected ()
      extends typings.pulumiKubernetes.policyV1beta1Mod.PodSecurityPolicyList {
      /**
        * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyListArgs) = this()
      def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    
    /* static members */
    @js.native
    object PodDisruptionBudget extends js.Object {
      /**
        * Get an existing PodDisruptionBudget resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = js.native
      /**
        * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodDisruptionBudgetList extends js.Object {
      /**
        * Get an existing PodDisruptionBudgetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = js.native
      /**
        * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicy extends js.Object {
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = js.native
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = js.native
    }
    
    /* static members */
    @js.native
    object PodSecurityPolicyList extends js.Object {
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = js.native
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = js.native
    }
    
  }
  
}

