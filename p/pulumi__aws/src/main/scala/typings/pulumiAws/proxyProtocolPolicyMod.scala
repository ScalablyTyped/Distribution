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
    
    /**
      * Get an existing ProxyProtocolPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): ProxyProtocolPolicy = js.native
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ProxyProtocolPolicy = js.native
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState): ProxyProtocolPolicy = js.native
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: ProxyProtocolPolicyState, opts: CustomResourceOptions): ProxyProtocolPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of ProxyProtocolPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/proxyProtocolPolicy", "ProxyProtocolPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/proxyProtocolPolicy.ProxyProtocolPolicy */ Boolean = js.native
  }
  
  @js.native
  trait ProxyProtocolPolicyArgs extends StObject {
    
    /**
      * List of instance ports to which the policy
      * should be applied. This can be specified if the protocol is SSL or TCP.
      */
    val instancePorts: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String] = js.native
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
  
  @js.native
  trait ProxyProtocolPolicyState extends StObject {
    
    /**
      * List of instance ports to which the policy
      * should be applied. This can be specified if the protocol is SSL or TCP.
      */
    val instancePorts: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.native
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
