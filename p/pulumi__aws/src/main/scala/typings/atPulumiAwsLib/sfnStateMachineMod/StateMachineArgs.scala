package typings
package atPulumiAwsLib.sfnStateMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineArgs extends js.Object {
  /**
    * The Amazon States Language definition of the state machine.
    */
  val definition: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the state machine.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
}

object StateMachineArgs {
  @scala.inline
  def apply(
    definition: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    name: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null
  ): StateMachineArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineArgs]
  }
}

