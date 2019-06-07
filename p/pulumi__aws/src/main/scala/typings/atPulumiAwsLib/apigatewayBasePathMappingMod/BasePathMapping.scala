package typings
package atPulumiAwsLib.apigatewayBasePathMappingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping")
@js.native
class BasePathMapping protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a BasePathMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: BasePathMappingArgs) = this()
  def this(name: java.lang.String, args: BasePathMappingArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The id of the API to connect.
    */
  val restApi: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.apigatewayRestApiMod.RestApi] = js.native
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping")
@js.native
object BasePathMapping extends js.Object {
  /**
    * Get an existing BasePathMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState
  ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMappingState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayBasePathMappingMod.BasePathMapping = js.native
  /**
    * Returns true if the given object is an instance of BasePathMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/basePathMapping.BasePathMapping */ scala.Boolean = js.native
}

