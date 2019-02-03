package typings
package atPulumiAwsLib.apigatewayResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/resource", "Resource")
@js.native
class Resource protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Resource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: ResourceArgs) = this()
  def this(name: java.lang.String, args: ResourceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ID of the parent API resource
    */
  val parentId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The complete path for this API resource, including all parent paths.
    */
  val path: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The last path segment of this API resource.
    */
  val pathPart: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/resource", "Resource")
@js.native
object Resource extends js.Object {
  /**
    * Get an existing Resource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayResourceMod.ResourceState
  ): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayResourceMod.ResourceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayResourceMod.Resource = js.native
}

