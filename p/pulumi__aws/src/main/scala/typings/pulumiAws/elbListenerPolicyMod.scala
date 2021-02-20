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

object elbListenerPolicyMod {
  
  @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy")
  @js.native
  class ListenerPolicy protected () extends CustomResource {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerPolicyArgs) = this()
    def this(name: String, args: ListenerPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Output_[String] = js.native
    
    /**
      * The load balancer listener port to apply the policy to.
      */
    val loadBalancerPort: Output_[Double] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: Output_[js.UndefOr[js.Array[String]]] = js.native
  }
  /* static members */
  object ListenerPolicy {
    
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState): ListenerPolicy = js.native
    @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): ListenerPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb/listenerPolicy", "ListenerPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/listenerPolicy.ListenerPolicy */ Boolean = js.native
  }
  
  @js.native
  trait ListenerPolicyArgs extends StObject {
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Input[String] = js.native
    
    /**
      * The load balancer listener port to apply the policy to.
      */
    val loadBalancerPort: Input[Double] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ListenerPolicyArgs {
    
    @scala.inline
    def apply(loadBalancerName: Input[String], loadBalancerPort: Input[Double]): ListenerPolicyArgs = {
      val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], loadBalancerPort = loadBalancerPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerPolicyArgs]
    }
    
    @scala.inline
    implicit class ListenerPolicyArgsMutableBuilder[Self <: ListenerPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerPort(value: Input[Double]): Self = StObject.set(x, "loadBalancerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      @scala.inline
      def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ListenerPolicyState extends StObject {
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The load balancer listener port to apply the policy to.
      */
    val loadBalancerPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object ListenerPolicyState {
    
    @scala.inline
    def apply(): ListenerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerPolicyState]
    }
    
    @scala.inline
    implicit class ListenerPolicyStateMutableBuilder[Self <: ListenerPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
      
      @scala.inline
      def setLoadBalancerPort(value: Input[Double]): Self = StObject.set(x, "loadBalancerPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerPortUndefined: Self = StObject.set(x, "loadBalancerPort", js.undefined)
      
      @scala.inline
      def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      @scala.inline
      def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
}
