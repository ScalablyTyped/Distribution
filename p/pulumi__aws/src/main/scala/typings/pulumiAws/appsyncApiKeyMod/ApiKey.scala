package typings.pulumiAws.appsyncApiKeyMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appsync/apiKey", "ApiKey")
@js.native
class ApiKey protected () extends CustomResource {
  /**
    * Create a ApiKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiKeyArgs) = this()
  def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ID of the associated AppSync API
    */
  val apiId: Output_[String] = js.native
  
  /**
    * The API key description. Defaults to "Managed by Pulumi".
    */
  val description: Output_[String] = js.native
  
  /**
    * RFC3339 string representation of the expiry date. Rounded down to nearest hour. By default, it is 7 days from the date of creation.
    */
  val expires: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The API key
    */
  val key: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appsync/apiKey", "ApiKey")
@js.native
object ApiKey extends js.Object {
  
  /**
    * Get an existing ApiKey resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ApiKey = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState): ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): ApiKey = js.native
  
  /**
    * Returns true if the given object is an instance of ApiKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
}
