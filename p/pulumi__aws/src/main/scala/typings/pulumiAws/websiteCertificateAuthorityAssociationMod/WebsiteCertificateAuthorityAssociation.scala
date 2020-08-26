package typings.pulumiAws.websiteCertificateAuthorityAssociationMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): WebsiteCertificateAuthorityAssociation = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): WebsiteCertificateAuthorityAssociation = js.native
  def get(name: String, id: Input[ID], state: WebsiteCertificateAuthorityAssociationState): WebsiteCertificateAuthorityAssociation = js.native
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
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/worklink/websiteCertificateAuthorityAssociation.WebsiteCertificateAuthorityAssociation */ Boolean = js.native
}

