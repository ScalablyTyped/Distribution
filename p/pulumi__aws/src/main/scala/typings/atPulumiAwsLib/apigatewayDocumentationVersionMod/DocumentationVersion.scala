package typings
package atPulumiAwsLib.apigatewayDocumentationVersionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
@js.native
class DocumentationVersion protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a DocumentationVersion resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: DocumentationVersionArgs) = this()
  def this(name: java.lang.String, args: DocumentationVersionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The description of the API documentation version.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The version identifier of the API documentation snapshot.
    */
  val version: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/documentationVersion", "DocumentationVersion")
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState
  ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayDocumentationVersionMod.DocumentationVersion = js.native
  /**
    * Returns true if the given object is an instance of DocumentationVersion.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationVersion.DocumentationVersion */ scala.Boolean = js.native
}

