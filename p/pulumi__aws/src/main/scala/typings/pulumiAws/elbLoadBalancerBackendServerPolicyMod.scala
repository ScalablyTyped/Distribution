package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbLoadBalancerBackendServerPolicyMod {
  
  @JSImport("@pulumi/aws/elb/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
  @js.native
  class LoadBalancerBackendServerPolicy protected () extends CustomResource {
    /**
      * Create a LoadBalancerBackendServerPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    
    @JSImport("@pulumi/aws/elb/loadBalancerBackendServerPolicy", "LoadBalancerBackendServerPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing LoadBalancerBackendServerPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[LoadBalancerBackendServerPolicy]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoadBalancerBackendServerPolicy]
    inline def get(name: String, id: Input[ID], state: LoadBalancerBackendServerPolicyState): LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[LoadBalancerBackendServerPolicy]
    inline def get(
      name: String,
      id: Input[ID],
      state: LoadBalancerBackendServerPolicyState,
      opts: CustomResourceOptions
    ): LoadBalancerBackendServerPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[LoadBalancerBackendServerPolicy]
    
    /**
      * Returns true if the given object is an instance of LoadBalancerBackendServerPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elb/loadBalancerBackendServerPolicy.LoadBalancerBackendServerPolicy */ Boolean]
  }
  
  trait LoadBalancerBackendServerPolicyArgs extends StObject {
    
    /**
      * The instance port to apply the policy to.
      */
    val instancePort: Input[Double]
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: Input[String]
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LoadBalancerBackendServerPolicyArgs {
    
    inline def apply(instancePort: Input[Double], loadBalancerName: Input[String]): LoadBalancerBackendServerPolicyArgs = {
      val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadBalancerBackendServerPolicyArgs]
    }
    
    extension [Self <: LoadBalancerBackendServerPolicyArgs](x: Self) {
      
      inline def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      inline def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      inline def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      inline def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
  
  trait LoadBalancerBackendServerPolicyState extends StObject {
    
    /**
      * The instance port to apply the policy to.
      */
    val instancePort: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The load balancer to attach the policy to.
      */
    val loadBalancerName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * List of Policy Names to apply to the backend server.
      */
    val policyNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object LoadBalancerBackendServerPolicyState {
    
    inline def apply(): LoadBalancerBackendServerPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadBalancerBackendServerPolicyState]
    }
    
    extension [Self <: LoadBalancerBackendServerPolicyState](x: Self) {
      
      inline def setInstancePort(value: Input[Double]): Self = StObject.set(x, "instancePort", value.asInstanceOf[js.Any])
      
      inline def setInstancePortUndefined: Self = StObject.set(x, "instancePort", js.undefined)
      
      inline def setLoadBalancerName(value: Input[String]): Self = StObject.set(x, "loadBalancerName", value.asInstanceOf[js.Any])
      
      inline def setLoadBalancerNameUndefined: Self = StObject.set(x, "loadBalancerName", js.undefined)
      
      inline def setPolicyNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "policyNames", value.asInstanceOf[js.Any])
      
      inline def setPolicyNamesUndefined: Self = StObject.set(x, "policyNames", js.undefined)
      
      inline def setPolicyNamesVarargs(value: Input[String]*): Self = StObject.set(x, "policyNames", js.Array(value :_*))
    }
  }
}
