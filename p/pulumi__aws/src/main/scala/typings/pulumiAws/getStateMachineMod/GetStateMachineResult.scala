package typings.pulumiAws.getStateMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStateMachineResult extends js.Object {
  /**
    * Set to the arn of the state function.
    */
  val arn: String = js.native
  /**
    * The date the state machine was created.
    */
  val creationDate: String = js.native
  /**
    * Set to the state machine definition.
    */
  val definition: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  /**
    * Set to the roleArn used by the state function.
    */
  val roleArn: String = js.native
  /**
    * Set to the current status of the state machine.
    */
  val status: String = js.native
}

object GetStateMachineResult {
  @scala.inline
  def apply(
    arn: String,
    creationDate: String,
    definition: String,
    id: String,
    name: String,
    roleArn: String,
    status: String
  ): GetStateMachineResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateMachineResult]
  }
  @scala.inline
  implicit class GetStateMachineResultOps[Self <: GetStateMachineResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: String): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: String): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

