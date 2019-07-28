package typings.atPulumiAws.apigatewayBasePathMappingMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/basePathMapping", "BasePathMapping")
@js.native
class BasePathMapping protected () extends CustomResource {
  /**
    * Create a BasePathMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BasePathMappingArgs) = this()
  def this(name: String, args: BasePathMappingArgs, opts: CustomResourceOptions) = this()
  /**
    * Path segment that must be prepended to the path when accessing the API via this mapping. If omitted, the API is exposed at the root of the given domain.
    */
  val basePath: Output[js.UndefOr[String]] = js.native
  /**
    * The already-registered domain name to connect the API to.
    */
  val domainName: Output[String] = js.native
  /**
    * The id of the API to connect.
    */
  val restApi: Output[RestApi] = js.native
  /**
    * The name of a specific deployment stage to expose at the given path. If omitted, callers may select any stage by including its name as a path element after the base path.
    */
  val stageName: Output[js.UndefOr[String]] = js.native
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
  def get(name: String, id: Input[ID]): BasePathMapping = js.native
  def get(name: String, id: Input[ID], state: BasePathMappingState): BasePathMapping = js.native
  def get(name: String, id: Input[ID], state: BasePathMappingState, opts: CustomResourceOptions): BasePathMapping = js.native
  /**
    * Returns true if the given object is an instance of BasePathMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/basePathMapping.BasePathMapping */ Boolean = js.native
}

