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

object websiteCertificateAuthorityAssociationMod {
  
  @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation")
  @js.native
  class WebsiteCertificateAuthorityAssociation protected () extends CustomResource {
    /**
      * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs) = this()
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The root certificate of the Certificate Authority.
      */
    val certificate: Output_[String] = js.native
    
    /**
      * The certificate name to display.
      */
    val displayName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ARN of the fleet.
      */
    val fleetArn: Output_[String] = js.native
    
    /**
      * A unique identifier for the Certificate Authority.
      */
    val websiteCaId: Output_[String] = js.native
  }
  /* static members */
  object WebsiteCertificateAuthorityAssociation {
    
    /**
      * Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: WebsiteCertificateAuthorityAssociationState,
      opts: CustomResourceOptions
    ): WebsiteCertificateAuthorityAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = js.native
  }
  
  @js.native
  trait WebsiteCertificateAuthorityAssociationArgs extends StObject {
    
    /**
      * The root certificate of the Certificate Authority.
      */
    val certificate: Input[String] = js.native
    
    /**
      * The certificate name to display.
      */
    val displayName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the fleet.
      */
    val fleetArn: Input[String] = js.native
  }
  object WebsiteCertificateAuthorityAssociationArgs {
    
    @scala.inline
    def apply(certificate: Input[String], fleetArn: Input[String]): WebsiteCertificateAuthorityAssociationArgs = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
    }
    
    @scala.inline
    implicit class WebsiteCertificateAuthorityAssociationArgsMutableBuilder[Self <: WebsiteCertificateAuthorityAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setFleetArn(value: Input[String]): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebsiteCertificateAuthorityAssociationState extends StObject {
    
    /**
      * The root certificate of the Certificate Authority.
      */
    val certificate: js.UndefOr[Input[String]] = js.native
    
    /**
      * The certificate name to display.
      */
    val displayName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ARN of the fleet.
      */
    val fleetArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A unique identifier for the Certificate Authority.
      */
    val websiteCaId: js.UndefOr[Input[String]] = js.native
  }
  object WebsiteCertificateAuthorityAssociationState {
    
    @scala.inline
    def apply(): WebsiteCertificateAuthorityAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationState]
    }
    
    @scala.inline
    implicit class WebsiteCertificateAuthorityAssociationStateMutableBuilder[Self <: WebsiteCertificateAuthorityAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      @scala.inline
      def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setFleetArn(value: Input[String]): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFleetArnUndefined: Self = StObject.set(x, "fleetArn", js.undefined)
      
      @scala.inline
      def setWebsiteCaId(value: Input[String]): Self = StObject.set(x, "websiteCaId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteCaIdUndefined: Self = StObject.set(x, "websiteCaId", js.undefined)
    }
  }
}
