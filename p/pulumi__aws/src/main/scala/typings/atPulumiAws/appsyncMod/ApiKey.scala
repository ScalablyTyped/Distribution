package typings.atPulumiAws.appsyncMod

import typings.atPulumiAws.appsyncApiKeyMod.ApiKeyArgs
import typings.atPulumiAws.appsyncApiKeyMod.ApiKeyState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/appsync", "ApiKey")
@js.native
class ApiKey protected ()
  extends typings.atPulumiAws.appsyncApiKeyMod.ApiKey {
  /**
    * Create a ApiKey resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApiKeyArgs) = this()
  def this(name: String, args: ApiKeyArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/appsync", "ApiKey")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
  def get(name: String, id: Input[ID], state: ApiKeyState, opts: CustomResourceOptions): typings.atPulumiAws.appsyncApiKeyMod.ApiKey = js.native
  /**
    * Returns true if the given object is an instance of ApiKey.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appsync/apiKey.ApiKey */ Boolean = js.native
}

