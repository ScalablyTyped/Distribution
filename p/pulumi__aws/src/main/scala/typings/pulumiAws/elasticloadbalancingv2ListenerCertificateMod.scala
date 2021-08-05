package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingv2ListenerCertificateMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancingv2/listenerCertificate", "ListenerCertificate")
  @js.native
  class ListenerCertificate protected () extends CustomResource {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    /** @deprecated aws.elasticloadbalancingv2.ListenerCertificate has been deprecated in favor of aws.lb.ListenerCertificate */
    def this(name: String, args: ListenerCertificateArgs) = this()
    def this(name: String, args: ListenerCertificateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the certificate to attach to the listener.
      */
    val certificateArn: Output_[String] = js.native
    
    /**
      * The ARN of the listener to which to attach the certificate.
      */
    val listenerArn: Output_[String] = js.native
  }
  /* static members */
  object ListenerCertificate {
    
    @JSImport("@pulumi/aws/elasticloadbalancingv2/listenerCertificate", "ListenerCertificate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ListenerCertificate]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerCertificate]
    inline def get(name: String, id: Input[ID], state: ListenerCertificateState): ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ListenerCertificate]
    inline def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): ListenerCertificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ListenerCertificate]
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticloadbalancingv2/listenerCertificate.ListenerCertificate */ Boolean]
  }
  
  trait ListenerCertificateArgs extends StObject {
    
    /**
      * The ARN of the certificate to attach to the listener.
      */
    val certificateArn: Input[String]
    
    /**
      * The ARN of the listener to which to attach the certificate.
      */
    val listenerArn: Input[String]
  }
  object ListenerCertificateArgs {
    
    inline def apply(certificateArn: Input[String], listenerArn: Input[String]): ListenerCertificateArgs = {
      val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerCertificateArgs]
    }
    
    extension [Self <: ListenerCertificateArgs](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListenerCertificateState extends StObject {
    
    /**
      * The ARN of the certificate to attach to the listener.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the listener to which to attach the certificate.
      */
    val listenerArn: js.UndefOr[Input[String]] = js.undefined
  }
  object ListenerCertificateState {
    
    inline def apply(): ListenerCertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerCertificateState]
    }
    
    extension [Self <: ListenerCertificateState](x: Self) {
      
      inline def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      inline def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      inline def setListenerArnUndefined: Self = StObject.set(x, "listenerArn", js.undefined)
    }
  }
}
