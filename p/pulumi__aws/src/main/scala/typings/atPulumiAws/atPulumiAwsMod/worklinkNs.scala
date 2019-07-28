package typings.atPulumiAws.atPulumiAwsMod

import typings.atPulumiAws.worklinkFleetMod.FleetArgs
import typings.atPulumiAws.worklinkFleetMod.FleetState
import typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationArgs
import typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "worklink")
@js.native
object worklinkNs extends js.Object {
  @js.native
  class Fleet protected ()
    extends typings.atPulumiAws.worklinkMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FleetArgs) = this()
    def this(name: String, args: FleetArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WebsiteCertificateAuthorityAssociation protected ()
    extends typings.atPulumiAws.worklinkMod.WebsiteCertificateAuthorityAssociation {
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
  @js.native
  object Fleet extends js.Object {
    /**
      * Get an existing Fleet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.worklinkFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState): typings.atPulumiAws.worklinkFleetMod.Fleet = js.native
    def get(name: String, id: Input[ID], state: FleetState, opts: CustomResourceOptions): typings.atPulumiAws.worklinkFleetMod.Fleet = js.native
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WebsiteCertificateAuthorityAssociation extends js.Object {
    /**
      * Get an existing WebsiteCertificateAuthorityAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(
      name: String,
      id: Input[ID],
      state: WebsiteCertificateAuthorityAssociationState,
      opts: CustomResourceOptions
    ): typings.atPulumiAws.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = js.native
  }
  
}

