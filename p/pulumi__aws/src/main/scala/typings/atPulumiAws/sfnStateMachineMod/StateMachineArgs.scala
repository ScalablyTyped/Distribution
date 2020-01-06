package typings.atPulumiAws.sfnStateMachineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachineArgs extends js.Object {
  /**
    * The Amazon States Language definition of the state machine.
    */
  val definition: Input[String] = js.native
  /**
    * The name of the state machine.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  val roleArn: Input[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object StateMachineArgs {
  @scala.inline
  def apply(
    definition: Input[String],
    roleArn: Input[String],
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): StateMachineArgs = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineArgs]
  }
}

