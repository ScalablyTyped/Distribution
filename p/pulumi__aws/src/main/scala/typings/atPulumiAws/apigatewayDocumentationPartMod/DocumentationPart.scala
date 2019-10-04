package typings.atPulumiAws.apigatewayDocumentationPartMod

import typings.atPulumiAws.typesOutputMod.apigatewayNs.DocumentationPartLocation
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart")
@js.native
class DocumentationPart protected () extends CustomResource {
  /**
    * Create a DocumentationPart resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DocumentationPartArgs) = this()
  def this(name: String, args: DocumentationPartArgs, opts: CustomResourceOptions) = this()
  /**
    * The location of the targeted API entity of the to-be-created documentation part. See below.
    */
  val location: Output[DocumentationPartLocation] = js.native
  /**
    * A content map of API-specific key-value pairs describing the targeted API entity. The map must be encoded as a JSON string, e.g., "{ \"description\": \"The API does ...\" }". Only Swagger-compliant key-value pairs can be exported and, hence, published.
    */
  val properties: Output[String] = js.native
  /**
    * The ID of the associated Rest API
    */
  val restApiId: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/documentationPart", "DocumentationPart")
@js.native
object DocumentationPart extends js.Object {
  /**
    * Get an existing DocumentationPart resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): DocumentationPart = js.native
  def get(name: String, id: Input[ID], state: DocumentationPartState): DocumentationPart = js.native
  def get(name: String, id: Input[ID], state: DocumentationPartState, opts: CustomResourceOptions): DocumentationPart = js.native
  /**
    * Returns true if the given object is an instance of DocumentationPart.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/documentationPart.DocumentationPart */ Boolean = js.native
}

