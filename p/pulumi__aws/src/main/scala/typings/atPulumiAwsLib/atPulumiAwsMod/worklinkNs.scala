package typings
package atPulumiAwsLib.atPulumiAwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "worklink")
@js.native
object worklinkNs extends js.Object {
  @js.native
  class Fleet protected ()
    extends atPulumiAwsLib.worklinkMod.Fleet {
    /**
      * Create a Fleet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.worklinkFleetMod.FleetArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.worklinkFleetMod.FleetArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  }
  
  @js.native
  class WebsiteCertificateAuthorityAssociation protected ()
    extends atPulumiAwsLib.worklinkMod.WebsiteCertificateAuthorityAssociation {
    /**
      * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: java.lang.String, args: atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationArgs) = this()
    def this(name: java.lang.String, args: atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.worklinkFleetMod.Fleet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.worklinkFleetMod.FleetState
    ): atPulumiAwsLib.worklinkFleetMod.Fleet = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.worklinkFleetMod.FleetState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.worklinkFleetMod.Fleet = js.native
    /**
      * Returns true if the given object is an instance of Fleet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/fleet.Fleet */ scala.Boolean = js.native
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
    def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationState
    ): atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    def get(
      name: java.lang.String,
      id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
      state: atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociationState,
      opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
    ): atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod.WebsiteCertificateAuthorityAssociation = js.native
    /**
      * Returns true if the given object is an instance of WebsiteCertificateAuthorityAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ scala.Boolean = js.native
  }
  
}

