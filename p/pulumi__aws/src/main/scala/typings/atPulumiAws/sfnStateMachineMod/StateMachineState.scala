package typings.atPulumiAws.sfnStateMachineMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachineState extends js.Object {
  /**
    * The date the state machine was created.
    */
  val creationDate: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon States Language definition of the state machine.
    */
  val definition: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the state machine.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The current status of the state machine. Either "ACTIVE" or "DELETING".
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object StateMachineState {
  @scala.inline
  def apply(
    creationDate: Input[String] = null,
    definition: Input[String] = null,
    name: Input[String] = null,
    roleArn: Input[String] = null,
    status: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): StateMachineState = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineState]
  }
}

