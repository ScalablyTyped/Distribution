package typings
package atPulumiAwsLib.apigatewayClientCertificateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/clientCertificate", "ClientCertificate")
@js.native
class ClientCertificate protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a ClientCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: ClientCertificateArgs) = this()
  def this(name: java.lang.String, args: ClientCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The date when the client certificate was created.
    */
  val createdDate: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The description of the client certificate.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The date when the client certificate will expire.
    */
  val expirationDate: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The PEM-encoded public key of the client certificate.
    */
  val pemEncodedCertificate: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState
  ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
}

