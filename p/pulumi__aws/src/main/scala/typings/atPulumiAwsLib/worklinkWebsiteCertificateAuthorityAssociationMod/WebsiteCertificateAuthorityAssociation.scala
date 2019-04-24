package typings
package atPulumiAwsLib.worklinkWebsiteCertificateAuthorityAssociationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation")
@js.native
class WebsiteCertificateAuthorityAssociation protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a WebsiteCertificateAuthorityAssociation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: WebsiteCertificateAuthorityAssociationArgs) = this()
  def this(name: java.lang.String, args: WebsiteCertificateAuthorityAssociationArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The root certificate of the Certificate Authority.
    */
  val certificate: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The certificate name to display.
    */
  val displayName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ARN of the fleet.
    */
  val fleetArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * A unique identifier for the Certificate Authority.
    */
  val websiteCaId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/worklink/websiteCertificateAuthorityAssociation", "WebsiteCertificateAuthorityAssociation")
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
}

