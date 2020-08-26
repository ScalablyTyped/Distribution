package typings.pulumiAws.getTaskDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTaskDefinitionResult extends js.Object {
  /**
    * The family of this task definition
    */
  val family: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The Docker networking mode to use for the containers in this task.
    */
  val networkMode: String = js.native
  /**
    * The revision of this task definition
    */
  val revision: Double = js.native
  /**
    * The status of this task definition
    */
  val status: String = js.native
  val taskDefinition: String = js.native
  /**
    * The ARN of the IAM role that containers in this task can assume
    */
  val taskRoleArn: String = js.native
}

object GetTaskDefinitionResult {
  @scala.inline
  def apply(
    family: String,
    id: String,
    networkMode: String,
    revision: Double,
    status: String,
    taskDefinition: String,
    taskRoleArn: String
  ): GetTaskDefinitionResult = {
    val __obj = js.Dynamic.literal(family = family.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkMode = networkMode.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskDefinition = taskDefinition.asInstanceOf[js.Any], taskRoleArn = taskRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTaskDefinitionResult]
  }
  @scala.inline
  implicit class GetTaskDefinitionResultOps[Self <: GetTaskDefinitionResult] (val x: Self) extends AnyVal {
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
    def setFamily(value: String): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkMode(value: String): Self = this.set("networkMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevision(value: Double): Self = this.set("revision", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskDefinition(value: String): Self = this.set("taskDefinition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskRoleArn(value: String): Self = this.set("taskRoleArn", value.asInstanceOf[js.Any])
  }
  
}

