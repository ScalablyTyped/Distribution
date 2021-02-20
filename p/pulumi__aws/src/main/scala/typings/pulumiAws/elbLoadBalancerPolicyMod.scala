package typings.pulumiAws

import typings.pulumiAws.outputMod.elb.LoadBalancerPolicyPolicyAttribute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbLoadBalancerPolicyMod {
  
  @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy")
  @js.native
  class LoadBalancerPolicy protected () extends CustomResource {
    /**
      * Create a LoadBalancerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LoadBalancerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The load balancer on which the policy is defined.
      */
    val loadBalancerName: Output_[String] = js.native
    
    /**
      * Policy attribute to apply to the policy.
      */
    val policyAttributes: Output_[js.UndefOr[js.Array[LoadBalancerPolicyPolicyAttribute]]] = js.native
    
    /**
      * The name of the load balancer policy.
      */
    val policyName: Output_[String] = js.native
    
    /**
      * The policy type.
      */
    val policyTypeName: Output_[String] = js.native
  }
  /* static members */
  object LoadBalancerPolicy {
    
    /**
      * Get an existing LoadBalancerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState): LoadBalancerPolicy = js.native
    @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerPolicyState, opts: CustomResourceOptions): LoadBalancerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb/loadBalancerPolicy", "LoadBalancerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerPolicy.LoadBalancerPolicy */ Boolean = js.native
  }
  
  @js.native
  trait LoadBalancerPolicyArgs extends StObject {
    
    /**
      * The load balancer on which the policy is defined.
      */
    val loadBalancerName: Input[String] = js.native
    
    /**
      * Policy attribute to apply to the policy.
      */
    val policyAttributes: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]]
        ]
      ] = js.native
    
    /**
      * The name of the load balancer policy.
      */
    val policyName: Input[String] = js.native
    
    /**
      * The policy type.
      */
    val policyTypeName: Input[String] = js.native
  }
  object LoadBalancerPolicyArgs {
    
    @scala.inline
    def apply(loadBalancerName: Input[String], policyName: Input[String], policyTypeName: Input[String]): LoadBalancerPolicyArgs = {
      val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], policyName = policyName.asInstanceOf[js.Any], policyTypeName = policyTypeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerPolicyArgs]
    }
    
    @scala.inline
    implicit class LoadBalancerPolicyArgsMutableBuilder[Self <: LoadBalancerPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyAttributes(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]]
            ]
      ): Self = StObject.set(x, "policyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyAttributesUndefined: Self = StObject.set(x, "policyAttributes", js.undefined)
      
      @scala.inline
      def setPolicyAttributesVarargs(value: Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]*): Self = StObject.set(x, "policyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setPolicyName(value: Input[String]): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypeName(value: Input[String]): Self = StObject.set(x, "policyTypeName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LoadBalancerPolicyState extends StObject {
    
    /**
      * The load balancer on which the policy is defined.
      */
    val loadBalancerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Policy attribute to apply to the policy.
      */
    val policyAttributes: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]]
        ]
      ] = js.native
    
    /**
      * The name of the load balancer policy.
      */
    val policyName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The policy type.
      */
    val policyTypeName: js.UndefOr[Input[String]] = js.native
  }
  object LoadBalancerPolicyState {
    
    @scala.inline
    def apply(): LoadBalancerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerPolicyState]
    }
    
    @scala.inline
    implicit class LoadBalancerPolicyStateMutableBuilder[Self <: LoadBalancerPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
      
      @scala.inline
      def setPolicyAttributes(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]]
            ]
      ): Self = StObject.set(x, "policyAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyAttributesUndefined: Self = StObject.set(x, "policyAttributes", js.undefined)
      
      @scala.inline
      def setPolicyAttributesVarargs(value: Input[typings.pulumiAws.inputMod.elb.LoadBalancerPolicyPolicyAttribute]*): Self = StObject.set(x, "policyAttributes", js.Array(value :_*))
      
      @scala.inline
      def setPolicyName(value: Input[String]): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
      
      @scala.inline
      def setPolicyTypeName(value: Input[String]): Self = StObject.set(x, "policyTypeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyTypeNameUndefined: Self = StObject.set(x, "policyTypeName", js.undefined)
    }
  }
}
