package typings
package atPulumiAwsLib.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloud9", "EnvironmentEC2")
@js.native
class EnvironmentEC2 protected ()
  extends atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 {
  /**
    * Create a EnvironmentEC2 resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2Args) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2Args, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/cloud9", "EnvironmentEC2")
@js.native
object EnvironmentEC2 extends js.Object {
  /**
    * Get an existing EnvironmentEC2 resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2State
  ): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2State,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
}

