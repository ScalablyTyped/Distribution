package typings
package atPulumiAwsLib.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "ClientCertificate")
@js.native
class ClientCertificate protected ()
  extends atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate {
  /**
    * Create a ClientCertificate resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "ClientCertificate")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState
  ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificateState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayClientCertificateMod.ClientCertificate = js.native
  /**
    * Returns true if the given object is an instance of ClientCertificate.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/clientCertificate.ClientCertificate */ scala.Boolean = js.native
}

