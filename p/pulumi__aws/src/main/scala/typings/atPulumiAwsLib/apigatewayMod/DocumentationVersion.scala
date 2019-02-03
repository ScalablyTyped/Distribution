package typings
package atPulumiAwsLib.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "DocumentationVersion")
@js.native
class DocumentationVersion protected ()
  extends atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion {
  /**
    * Create a DocumentationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "DocumentationVersion")
@js.native
object DocumentationVersion extends js.Object {
  /**
    * Get an existing DocumentationVersion resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState
  ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
}

