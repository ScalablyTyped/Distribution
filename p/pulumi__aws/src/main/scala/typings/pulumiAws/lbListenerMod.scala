package typings.pulumiAws

import typings.pulumiAws.outputMod.lb.ListenerDefaultAction
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lbListenerMod {
  
  @JSImport("@pulumi/aws/lb/listener", "Listener")
  @js.native
  class Listener protected () extends CustomResource {
    /**
      * Create a Listener resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ListenerArgs) = this()
    def this(name: String, args: ListenerArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) of the target group.
      */
    val arn: Output_[String] = js.native
    
    /**
      * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
      */
    val certificateArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val defaultActions: Output_[js.Array[ListenerDefaultAction]] = js.native
    
    /**
      * The ARN of the load balancer.
      */
    val loadBalancerArn: Output_[String] = js.native
    
    /**
      * The port on which the load balancer is listening.
      */
    val port: Output_[Double] = js.native
    
    /**
      * The protocol for connections from clients to the load balancer. Valid values are `TCP`, `TLS`, `UDP`, `TCP_UDP`, `HTTP` and `HTTPS`. Defaults to `HTTP`.
      */
    val protocol: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
      */
    val sslPolicy: Output_[String] = js.native
  }
  /* static members */
  object Listener {
    
    /**
      * Get an existing Listener resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lb/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID]): Listener = js.native
    @JSImport("@pulumi/aws/lb/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Listener = js.native
    @JSImport("@pulumi/aws/lb/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState): Listener = js.native
    @JSImport("@pulumi/aws/lb/listener", "Listener.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerState, opts: CustomResourceOptions): Listener = js.native
    
    /**
      * Returns true if the given object is an instance of Listener.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lb/listener", "Listener.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listener.Listener */ Boolean = js.native
  }
  
  @js.native
  trait ListenerArgs extends StObject {
    
    /**
      * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val defaultActions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]]] = js.native
    
    /**
      * The ARN of the load balancer.
      */
    val loadBalancerArn: Input[String] = js.native
    
    /**
      * The port on which the load balancer is listening.
      */
    val port: Input[Double] = js.native
    
    /**
      * The protocol for connections from clients to the load balancer. Valid values are `TCP`, `TLS`, `UDP`, `TCP_UDP`, `HTTP` and `HTTPS`. Defaults to `HTTP`.
      */
    val protocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
      */
    val sslPolicy: js.UndefOr[Input[String]] = js.native
  }
  object ListenerArgs {
    
    @scala.inline
    def apply(
      defaultActions: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]]],
      loadBalancerArn: Input[String],
      port: Input[Double]
    ): ListenerArgs = {
      val __obj = js.Dynamic.literal(defaultActions = defaultActions.asInstanceOf[js.Any], loadBalancerArn = loadBalancerArn.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerArgs]
    }
    
    @scala.inline
    implicit class ListenerArgsMutableBuilder[Self <: ListenerArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setDefaultActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]]]): Self = StObject.set(x, "defaultActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]*): Self = StObject.set(x, "defaultActions", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "loadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSslPolicy(value: Input[String]): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
    }
  }
  
  @js.native
  trait ListenerState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the target group.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * An Action block. Action blocks are documented below.
      */
    val defaultActions: js.UndefOr[Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]]]] = js.native
    
    /**
      * The ARN of the load balancer.
      */
    val loadBalancerArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The port on which the load balancer is listening.
      */
    val port: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The protocol for connections from clients to the load balancer. Valid values are `TCP`, `TLS`, `UDP`, `TCP_UDP`, `HTTP` and `HTTPS`. Defaults to `HTTP`.
      */
    val protocol: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
      */
    val sslPolicy: js.UndefOr[Input[String]] = js.native
  }
  object ListenerState {
    
    @scala.inline
    def apply(): ListenerState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerState]
    }
    
    @scala.inline
    implicit class ListenerStateMutableBuilder[Self <: ListenerState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setDefaultActions(value: Input[js.Array[Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]]]): Self = StObject.set(x, "defaultActions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActionsUndefined: Self = StObject.set(x, "defaultActions", js.undefined)
      
      @scala.inline
      def setDefaultActionsVarargs(value: Input[typings.pulumiAws.inputMod.lb.ListenerDefaultAction]*): Self = StObject.set(x, "defaultActions", js.Array(value :_*))
      
      @scala.inline
      def setLoadBalancerArn(value: Input[String]): Self = StObject.set(x, "loadBalancerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadBalancerArnUndefined: Self = StObject.set(x, "loadBalancerArn", js.undefined)
      
      @scala.inline
      def setPort(value: Input[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProtocol(value: Input[String]): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSslPolicy(value: Input[String]): Self = StObject.set(x, "sslPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslPolicyUndefined: Self = StObject.set(x, "sslPolicy", js.undefined)
    }
  }
}
