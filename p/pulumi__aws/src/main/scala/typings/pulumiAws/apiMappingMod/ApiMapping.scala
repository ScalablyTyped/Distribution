package typings.pulumiAws.apiMappingMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping")
@js.native
class ApiMapping protected () extends CustomResource {
  /**
    * Create a ApiMapping resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiMappingArgs) = this()
  def this(name: String, args: ApiMappingArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The API identifier.
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
    */
  val apiMappingKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
    */
  val domainName: Output_[String] = js.native
  
  /**
    * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
    */
  val stage: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigatewayv2/apiMapping", "ApiMapping")
@js.native
object ApiMapping extends js.Object {
  
  /**
    * Get an existing ApiMapping resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ApiMapping = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ApiMapping = js.native
  def get(name: String, id: Input[ID], state: ApiMappingState): ApiMapping = js.native
  def get(name: String, id: Input[ID], state: ApiMappingState, opts: CustomResourceOptions): ApiMapping = js.native
  
  /**
    * Returns true if the given object is an instance of ApiMapping.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/apiMapping.ApiMapping */ Boolean = js.native
}
