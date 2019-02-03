package typings
package atPulumiAwsLib.sfnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/sfn", "StateMachine")
@js.native
class StateMachine protected ()
  extends atPulumiAwsLib.sfnStateMachineMod.StateMachine {
  /**
    * Create a StateMachine resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.sfnStateMachineMod.StateMachineArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.sfnStateMachineMod.StateMachineArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/sfn", "StateMachine")
@js.native
object StateMachine extends js.Object {
  /**
    * Get an existing StateMachine resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.sfnStateMachineMod.StateMachine = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sfnStateMachineMod.StateMachineState
  ): atPulumiAwsLib.sfnStateMachineMod.StateMachine = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.sfnStateMachineMod.StateMachineState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.sfnStateMachineMod.StateMachine = js.native
}

