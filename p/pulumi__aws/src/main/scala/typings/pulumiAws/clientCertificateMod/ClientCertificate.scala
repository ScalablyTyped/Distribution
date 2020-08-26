package typings.pulumiAws.clientCertificateMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate")
@js.native
class ClientCertificate protected () extends CustomResource {
  /**
    * Create a ClientCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ClientCertificateArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ClientCertificateArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  /**
    * The date when the client certificate was created.
    */
  val createdDate: Output_[String] = js.native
  /**
    * The description of the client certificate.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: Output_[String] = js.native
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: Output_[String] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate")
@js.native
object ClientCertificate extends js.Object {
  /**
    * Get an existing ClientCertificate resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ClientCertificate = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ClientCertificate = js.native
  def get(name: String, id: Input[ID], state: ClientCertificateState): ClientCertificate = js.native
  def get(name: String, id: Input[ID], state: ClientCertificateState, opts: CustomResourceOptions): ClientCertificate = js.native
  /**
    * Returns true if the given object is an instance of ClientCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ Boolean = js.native
}

