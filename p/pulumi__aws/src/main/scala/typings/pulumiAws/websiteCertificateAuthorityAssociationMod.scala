package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): WebsiteCertificateAuthorityAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[WebsiteCertificateAuthorityAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): WebsiteCertificateAuthorityAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebsiteCertificateAuthorityAssociation]
    inline def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): WebsiteCertificateAuthorityAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[WebsiteCertificateAuthorityAssociation]
    inline def get(
      name: String,
      id: Input[ID],
      state: WebsiteCertificateAuthorityAssociationState,
      opts: CustomResourceOptions
    ): WebsiteCertificateAuthorityAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[WebsiteCertificateAuthorityAssociation]
    
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean]
  }
  
  trait WebsiteCertificateAuthorityAssociationArgs extends StObject {
    
    /**
      * The root certificate of the Certificate Authority.
      */
    val certificate: Input[String]
    
    /**
      * The certificate name to display.
      */
    val displayName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the fleet.
      */
    val fleetArn: Input[String]
  }
  object WebsiteCertificateAuthorityAssociationArgs {
    
    inline def apply(certificate: Input[String], fleetArn: Input[String]): WebsiteCertificateAuthorityAssociationArgs = {
      val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], fleetArn = fleetArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationArgs]
    }
    
    extension [Self <: WebsiteCertificateAuthorityAssociationArgs](x: Self) {
      
      inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setFleetArn(value: Input[String]): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait WebsiteCertificateAuthorityAssociationState extends StObject {
    
    /**
      * The root certificate of the Certificate Authority.
      */
    val certificate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate name to display.
      */
    val displayName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ARN of the fleet.
      */
    val fleetArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A unique identifier for the Certificate Authority.
      */
    val websiteCaId: js.UndefOr[Input[String]] = js.undefined
  }
  object WebsiteCertificateAuthorityAssociationState {
    
    inline def apply(): WebsiteCertificateAuthorityAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebsiteCertificateAuthorityAssociationState]
    }
    
    extension [Self <: WebsiteCertificateAuthorityAssociationState](x: Self) {
      
      inline def setCertificate(value: Input[String]): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
      
      inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
      
      inline def setDisplayName(value: Input[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setFleetArn(value: Input[String]): Self = StObject.set(x, "fleetArn", value.asInstanceOf[js.Any])
      
      inline def setFleetArnUndefined: Self = StObject.set(x, "fleetArn", js.undefined)
      
      inline def setWebsiteCaId(value: Input[String]): Self = StObject.set(x, "websiteCaId", value.asInstanceOf[js.Any])
      
      inline def setWebsiteCaIdUndefined: Self = StObject.set(x, "websiteCaId", js.undefined)
    }
  }
}
