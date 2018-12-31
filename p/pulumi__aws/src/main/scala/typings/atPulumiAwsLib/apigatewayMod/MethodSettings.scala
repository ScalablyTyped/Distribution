package typings
package atPulumiAwsLib.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway", "MethodSettings")
@js.native
class MethodSettings protected ()
  extends atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings {
  /**
    * Create a MethodSettings resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsState
  ): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettingsState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayMethodSettingsMod.MethodSettings = js.native
}

