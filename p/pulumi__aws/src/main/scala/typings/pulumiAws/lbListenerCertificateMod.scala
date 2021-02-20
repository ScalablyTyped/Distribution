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

object lbListenerCertificateMod {
  
  @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate")
  @js.native
  class ListenerCertificate protected () extends CustomResource {
    /**
      * Create a ListenerCertificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
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
    
    /**
      * Get an existing ListenerCertificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID]): ListenerCertificate = js.native
    @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ListenerCertificate = js.native
    @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState): ListenerCertificate = js.native
    @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate.get")
    @js.native
    def get(name: String, id: Input[ID], state: ListenerCertificateState, opts: CustomResourceOptions): ListenerCertificate = js.native
    
    /**
      * Returns true if the given object is an instance of ListenerCertificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/lb/listenerCertificate", "ListenerCertificate.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lb/listenerCertificate.ListenerCertificate */ Boolean = js.native
  }
  
  @js.native
  trait ListenerCertificateArgs extends StObject {
    
    /**
      * The ARN of the certificate to attach to the listener.
      */
    val certificateArn: Input[String] = js.native
    
    /**
      * The ARN of the listener to which to attach the certificate.
      */
    val listenerArn: Input[String] = js.native
  }
  object ListenerCertificateArgs {
    
    @scala.inline
    def apply(certificateArn: Input[String], listenerArn: Input[String]): ListenerCertificateArgs = {
      val __obj = js.Dynamic.literal(certificateArn = certificateArn.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListenerCertificateArgs]
    }
    
    @scala.inline
    implicit class ListenerCertificateArgsMutableBuilder[Self <: ListenerCertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ListenerCertificateState extends StObject {
    
    /**
      * The ARN of the certificate to attach to the listener.
      */
    val certificateArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the listener to which to attach the certificate.
      */
    val listenerArn: js.UndefOr[Input[String]] = js.native
  }
  object ListenerCertificateState {
    
    @scala.inline
    def apply(): ListenerCertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListenerCertificateState]
    }
    
    @scala.inline
    implicit class ListenerCertificateStateMutableBuilder[Self <: ListenerCertificateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateArn(value: Input[String]): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
      
      @scala.inline
      def setListenerArn(value: Input[String]): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerArnUndefined: Self = StObject.set(x, "listenerArn", js.undefined)
    }
  }
}
