package typings
package atPulumiAwsLib.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ecs", "TaskDefinition")
@js.native
class TaskDefinition protected ()
  extends atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition {
  /**
    * Create a TaskDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

@JSImport("@pulumi/aws/ecs", "TaskDefinition")
@js.native
object TaskDefinition extends js.Object {
  /**
    * Get an existing TaskDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionState
  ): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinitionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ecsTaskDefinitionMod.TaskDefinition = js.native
}

