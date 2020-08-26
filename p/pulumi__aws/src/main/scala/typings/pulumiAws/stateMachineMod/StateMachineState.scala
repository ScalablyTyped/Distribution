package typings.pulumiAws.stateMachineMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateMachineState extends js.Object {
  /**
    * The ARN of the state machine.
    */
  val arn: js.UndefOr[Input[String]] = js.native
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
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object StateMachineState {
  @scala.inline
  def apply(): StateMachineState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateMachineState]
  }
  @scala.inline
  implicit class StateMachineStateOps[Self <: StateMachineState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreationDate(value: Input[String]): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDefinition(value: Input[String]): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefinition: Self = this.set("definition", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

