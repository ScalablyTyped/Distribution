package typings.pulumiAws

import typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationArgs
import typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationState
import typings.pulumiAws.worklinkFleetMod.FleetArgs
import typings.pulumiAws.worklinkFleetMod.FleetState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object worklinkMod {
  
  @JSImport("@pulumi/aws/worklink", "Fleet")
  @js.native
  class Fleet protected ()
    extends typings.pulumiAws.worklinkFleetMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  }
  /* static members */
  object Fleet {
    
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/worklink", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.worklinkFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws/worklink", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.worklinkFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws/worklink", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState): typings.pulumiAws.worklinkFleetMod.Fleet = js.native
    @JSImport("@pulumi/aws/worklink", "Fleet.get")
    @js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): typings.pulumiAws.worklinkFleetMod.Fleet = js.native
    
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/worklink", "Fleet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean = js.native
  }
  
  @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation")
  @js.native
  class WebsiteCertificateAuthorityAssociation protected ()
    extends typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation {
    /**
      * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs) = this()
    def this(name: String, args: WebsiteCertificateAuthorityAssociationArgs, opts: CustomResourceOptions) = this()
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
    @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: WebsiteCertificateAuthorityAssociationState,
      opts: CustomResourceOptions
    ): typings.pulumiAws.websiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/worklink", "WebsiteCertificateAuthorityAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = js.native
  }
}
