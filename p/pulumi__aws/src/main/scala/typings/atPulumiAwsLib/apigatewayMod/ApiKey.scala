package typings
package atPulumiAwsLib.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "ApiKey")
@js.native
class ApiKey protected ()
  extends atPulumiAwsLib.apigatewayApiKeyMod.ApiKey {
  /**
    * Create a ApiKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "ApiKey")
@js.native
object ApiKey extends js.Object {
  /**
    * Get an existing ApiKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyState
  ): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayApiKeyMod.ApiKeyState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayApiKeyMod.ApiKey = js.native
}

