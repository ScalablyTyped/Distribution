package typings.atPulumiAws.apigatewayMethodSettingsMod

import typings.atPulumiAws.Anon_CacheDataEncrypted
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings")
@js.native
class MethodSettings protected () extends CustomResource {
  /**
    * Create a MethodSettings resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodSettingsArgs) = this()
  def this(name: String, args: MethodSettingsArgs, opts: CustomResourceOptions) = this()
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: Output[String] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: Output[RestApi] = js.native
  /**
    * The settings block, see below.
    */
  val settings: Output[Anon_CacheDataEncrypted] = js.native
  /**
    * The name of the stage
    */
  val stageName: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/methodSettings", "MethodSettings")
@js.native
object MethodSettings extends js.Object {
  /**
    * Get an existing MethodSettings resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): MethodSettings = js.native
  def get(name: String, id: Input[ID], state: MethodSettingsState): MethodSettings = js.native
  def get(name: String, id: Input[ID], state: MethodSettingsState, opts: CustomResourceOptions): MethodSettings = js.native
  /**
    * Returns true if the given object is an instance of MethodSettings.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodSettings.MethodSettings */ Boolean = js.native
}

