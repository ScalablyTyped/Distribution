package typings.pulumiAws

import typings.pulumiAws.outputMod.elb.SslNegotiationPolicyAttribute
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elbSslNegotiationPolicyMod {
  
  @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy")
  @js.native
  class SslNegotiationPolicy protected () extends CustomResource {
    /**
      * Create a SslNegotiationPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SslNegotiationPolicyArgs) = this()
    def this(name: String, args: SslNegotiationPolicyArgs, opts: CustomResourceOptions) = this()
    
    /**
      * An SSL Negotiation policy attribute. Each has two properties:
      */
    val attributes: Output_[js.UndefOr[js.Array[SslNegotiationPolicyAttribute]]] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Output_[Double] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Output_[String] = js.native
    
    /**
      * The name of the attribute
      */
    val name: Output_[String] = js.native
  }
  /* static members */
  object SslNegotiationPolicy {
    
    /**
      * Get an existing SslNegotiationPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID]): SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState): SslNegotiationPolicy = js.native
    @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy.get")
    @js.native
    def get(name: String, id: Input[ID], state: SslNegotiationPolicyState, opts: CustomResourceOptions): SslNegotiationPolicy = js.native
    
    /**
      * Returns true if the given object is an instance of SslNegotiationPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elb/sslNegotiationPolicy", "SslNegotiationPolicy.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elb/sslNegotiationPolicy.SslNegotiationPolicy */ Boolean = js.native
  }
  
  @js.native
  trait SslNegotiationPolicyArgs extends StObject {
    
    /**
      * An SSL Negotiation policy attribute. Each has two properties:
      */
    val attributes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]]]
      ] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: Input[Double] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: Input[String] = js.native
    
    /**
      * The name of the attribute
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object SslNegotiationPolicyArgs {
    
    @scala.inline
    def apply(lbPort: Input[Double], loadBalancer: Input[String]): SslNegotiationPolicyArgs = {
      val __obj = js.Dynamic.literal(lbPort = lbPort.asInstanceOf[js.Any], loadBalancer = loadBalancer.asInstanceOf[js.Any])
      __obj.asInstanceOf[SslNegotiationPolicyArgs]
    }
    
    @scala.inline
    implicit class SslNegotiationPolicyArgsMutableBuilder[Self <: SslNegotiationPolicyArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait SslNegotiationPolicyState extends StObject {
    
    /**
      * An SSL Negotiation policy attribute. Each has two properties:
      */
    val attributes: js.UndefOr[
        Input[js.Array[Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]]]
      ] = js.native
    
    /**
      * The load balancer port to which the policy
      * should be applied. This must be an active listener on the load
      * balancer.
      */
    val lbPort: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The load balancer to which the policy
      * should be attached.
      */
    val loadBalancer: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the attribute
      */
    val name: js.UndefOr[Input[String]] = js.native
  }
  object SslNegotiationPolicyState {
    
    @scala.inline
    def apply(): SslNegotiationPolicyState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SslNegotiationPolicyState]
    }
    
    @scala.inline
    implicit class SslNegotiationPolicyStateMutableBuilder[Self <: SslNegotiationPolicyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[js.Array[Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: Input[typings.pulumiAws.inputMod.elb.SslNegotiationPolicyAttribute]*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setLbPort(value: Input[Double]): Self = StObject.set(x, "lbPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLbPortUndefined: Self = StObject.set(x, "lbPort", js.undefined)
      
      @scala.inline
      def setLoadBalancer(value: Input[String]): Self = StObject.set(x, "loadBalancer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerUndefined: Self = StObject.set(x, "loadBalancer", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
