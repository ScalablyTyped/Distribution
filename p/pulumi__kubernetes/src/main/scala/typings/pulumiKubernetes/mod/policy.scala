package typings.pulumiKubernetes.mod

import typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetListArgs
import typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudgetArgs
import typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyListArgs
import typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicyArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policy {
  
  object v1beta1 {
    
    @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodDisruptionBudget")
    @js.native
    class PodDisruptionBudget protected ()
      extends typings.pulumiKubernetes.policyMod.v1beta1.PodDisruptionBudget {
      /**
        * Create a PodDisruptionBudget resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodDisruptionBudget {
      
      @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodDisruptionBudget")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodDisruptionBudget resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podDisruptionBudgetMod.PodDisruptionBudget]
      
      /**
        * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodDisruptionBudgetList")
    @js.native
    class PodDisruptionBudgetList protected ()
      extends typings.pulumiKubernetes.policyMod.v1beta1.PodDisruptionBudgetList {
      /**
        * Create a PodDisruptionBudgetList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodDisruptionBudgetListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodDisruptionBudgetList {
      
      @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodDisruptionBudgetList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodDisruptionBudgetList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.podDisruptionBudgetListMod.PodDisruptionBudgetList]
      
      /**
        * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudgetList.PodDisruptionBudgetList */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodSecurityPolicy")
    @js.native
    class PodSecurityPolicy protected ()
      extends typings.pulumiKubernetes.policyMod.v1beta1.PodSecurityPolicy {
      /**
        * Create a PodSecurityPolicy resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodSecurityPolicy {
      
      @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodSecurityPolicy")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodSecurityPolicy resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1PodSecurityPolicyMod.PodSecurityPolicy]
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicy.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicy.PodSecurityPolicy */ Boolean]
    }
    
    @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodSecurityPolicyList")
    @js.native
    class PodSecurityPolicyList protected ()
      extends typings.pulumiKubernetes.policyMod.v1beta1.PodSecurityPolicyList {
      /**
        * Create a PodSecurityPolicyList resource with the given unique name, arguments, and options.
        *
        * @param name The _unique_ name of the resource.
        * @param args The arguments to use to populate this resource's properties.
        * @param opts A bag of options that control this resource's behavior.
        */
      def this(name: String) = this()
      def this(name: String, args: PodSecurityPolicyListArgs) = this()
      def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
      def this(name: String, args: PodSecurityPolicyListArgs, opts: CustomResourceOptions) = this()
    }
    /* static members */
    object PodSecurityPolicyList {
      
      @JSImport("@pulumi/kubernetes", "policy.v1beta1.PodSecurityPolicyList")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Get an existing PodSecurityPolicyList resource's state with the given name, ID, and optional extra
        * properties used to qualify the lookup.
        *
        * @param name The _unique_ name of the resulting resource.
        * @param id The _unique_ provider ID of the resource to lookup.
        * @param opts Optional settings to control the behavior of the CustomResource.
        */
      @scala.inline
      def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      @scala.inline
      def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiKubernetes.v1beta1PodSecurityPolicyListMod.PodSecurityPolicyList]
      
      /**
        * Returns true if the given object is an instance of PodSecurityPolicyList.  This is designed to work even
        * when multiple copies of the Pulumi SDK have been loaded into the same process.
        */
      @scala.inline
      def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podSecurityPolicyList.PodSecurityPolicyList */ Boolean]
    }
  }
}
