package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listenerPolicyMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/listenerPolicy", "ListenerPolicy")
  @js.native
  class ListenerPolicy protected () extends CustomResource {
    /**
      * Create a ListenerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancing.ListenerPolicy has been deprecated in favor of aws.elb.ListenerPolicy */
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
    
    @JSImport("@pulumi/aws/elasticloadbalancing/listenerPolicy", "ListenerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: ListenerPolicyState): ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ListenerPolicy]
    inline def get(name: String, id: Input[ID], state: ListenerPolicyState, opts: CustomResourceOptions): ListenerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerPolicy]
    
    /**
      * Returns true if the given object is an instance of ListenerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancing/listenerPolicy.ListenerPolicy */ Boolean]
  }
  
  trait ListenerPolicyArgs extends StObject {
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Input[String]
    
    /**
      * The load balancer listener port to apply the policy to.
      */
    val loadBalancerPort: Input[Double]
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ListenerPolicyArgs {
    
    inline def apply(loadBalancerName: Input[String], loadBalancerPort: Input[Double]): ListenerPolicyArgs = {
      val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any], loadBalancerPort = loadBalancerPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerPolicyArgs]
    }
    
    extension [Self <: ListenerPolicyArgs](x: Self) {
      
      inline def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerPort(value: Input[Double]): Self = StObject.set(x, "loadBalancerPort", value.asInstanceOf[js.Any])
      
      inline def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      inline def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      inline def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
  
  trait ListenerPolicyState extends StObject {
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The load balancer listener port to apply the policy to.
      */
    val loadBalancerPort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ListenerPolicyState {
    
    inline def apply(): ListenerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerPolicyState]
    }
    
    extension [Self <: ListenerPolicyState](x: Self) {
      
      inline def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
      
      inline def setLoadBalancerPort(value: Input[Double]): Self = StObject.set(x, "loadBalancerPort", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerPortUndefined: Self = StObject.set(x, "loadBalancerPort", js.undefined)
      
      inline def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      inline def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      inline def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
}
