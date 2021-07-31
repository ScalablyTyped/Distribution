package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxyProtocolPolicyMod {
  
  @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy")
  @js.native
  class ProxyProtocolPolicy protected () extends CustomResource {
    /**
      * Create a ProxyProtocolPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ProxyProtocolPolicyArgs) = this()
    def this(name: String, args: ProxyProtocolPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * List of instance ports to which the policy
      * should be applied. This can be specified if the protocol is SSL or TCP.
      */
    val instancePorts: Output_[js.Array[String]] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Output_[String] = js.native
  }
  /* static members */
  object ProxyProtocolPolicy {
    
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ProxyProtocolPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ProxyProtocolPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ProxyProtocolPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ProxyProtocolPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProxyProtocolPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState): ProxyProtocolPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ProxyProtocolPolicy]
    @scala.inline
    def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState, opts: CustomResourceOptions): ProxyProtocolPolicy = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ProxyProtocolPolicy]
    
    /**
      * Returns true if the given object is an instance of ProxyProtocolPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/proxyProtocolPolicy.ProxyProtocolPolicy */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/proxyProtocolPolicy.ProxyProtocolPolicy */ Boolean]
  }
  
  trait ProxyProtocolPolicyArgs extends StObject {
    
    /**
      * List of instance ports to which the policy
      * should be applied. This can be specified if the protocol is SSL or TCP.
      */
    val instancePorts: Input[js.Array[Input[String]]]
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String]
  }
  object ProxyProtocolPolicyArgs {
    
    @scala.inline
    def apply(instancePorts: Input[js.Array[Input[String]]], loadBalancer: Input[String]): ProxyProtocolPolicyArgs = {
      val __obj = js.Dynamic.literal(instancePorts = instancePorts.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProxyProtocolPolicyArgs]
    }
    
    @scala.inline
    implicit class ProxyProtocolPolicyArgsMutableBuilder[Self <: ProxyProtocolPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancePorts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instancePorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePortsVarargs(value: Input[String]*): Self = StObject.set(x, "instancePorts", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProxyProtocolPolicyState extends StObject {
    
    /**
      * List of instance ports to which the policy
      * should be applied. This can be specified if the protocol is SSL or TCP.
      */
    val instancePorts: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.undefined
  }
  object ProxyProtocolPolicyState {
    
    @scala.inline
    def apply(): ProxyProtocolPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProxyProtocolPolicyState]
    }
    
    @scala.inline
    implicit class ProxyProtocolPolicyStateMutableBuilder[Self <: ProxyProtocolPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstancePorts(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "instancePorts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstancePortsUndefined: Self = StObject.set(x, "instancePorts", js.undefined)
      
      @scala.inline
      def setInstancePortsVarargs(value: Input[String]*): Self = StObject.set(x, "instancePorts", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
    }
  }
}
