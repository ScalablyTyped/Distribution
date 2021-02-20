package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadBalancerBackendServerPolicyMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
  @js.native
  class LoadBalancerBackendServerPolicy protected () extends CustomResource {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.LoadBalancerBackendServerPolicy has been deprecated in favor of aws.elb.LoadBalancerBackendServerPolicy */
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs) = this()
    def this(name: String, args: LoadBalancerBackendServerPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The instance port to apply the policy to.
      */
    val instancePort: Output_[Double] = js.native
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Output_[String] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object LoadBalancerBackendServerPolicy {
    
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): LoadBalancerBackendServerPolicy = js.native
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): LoadBalancerBackendServerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = js.native
  }
  
  @js.native
  trait LoadBalancerBackendServerPolicyArgs extends StObject {
    
    /**
      * The instance port to apply the policy to.
      */
    val instancePort: Input[Double] = js.native
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Input[String] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object LoadBalancerBackendServerPolicyArgs {
    
    @scala.inline
    def apply(instancePort: Input[Double], loadBalancerName: Input[String]): LoadBalancerBackendServerPolicyArgs = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerBackendServerPolicyArgs]
    }
    
    @scala.inline
    implicit class LoadBalancerBackendServerPolicyArgsMutableBuilder[Self <: LoadBalancerBackendServerPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      @scala.inline
      def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait LoadBalancerBackendServerPolicyState extends StObject {
    
    /**
      * The instance port to apply the policy to.
      */
    val instancePort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object LoadBalancerBackendServerPolicyState {
    
    @scala.inline
    def apply(): LoadBalancerBackendServerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
    }
    
    @scala.inline
    implicit class LoadBalancerBackendServerPolicyStateMutableBuilder[Self <: LoadBalancerBackendServerPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
      
      @scala.inline
      def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      @scala.inline
      def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
}
