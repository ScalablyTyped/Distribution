package typings.pulumiAws.apigatewayMod

import typings.pulumiAws.methodSettingsMod.MethodSettingsArgs
import typings.pulumiAws.methodSettingsMod.MethodSettingsState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "MethodSettings")
@js.native
class MethodSettings protected ()
  extends typings.pulumiAws.methodSettingsMod.MethodSettings {
  /**
    * Create a MethodSettings resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MethodSettingsArgs) = this()
  def this(name: String, args: MethodSettingsArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/apigateway", "MethodSettings")
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
  def get(name: String, id: Input[ID]): typings.pulumiAws.methodSettingsMod.MethodSettings = js.native
  def get(name: String, id: Input[ID], state: MethodSettingsState): typings.pulumiAws.methodSettingsMod.MethodSettings = js.native
  def get(name: String, id: Input[ID], state: MethodSettingsState, opts: CustomResourceOptions): typings.pulumiAws.methodSettingsMod.MethodSettings = js.native
  /**
    * Returns true if the given object is an instance of MethodSettings.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/methodSettings.MethodSettings */ Boolean = js.native
}

