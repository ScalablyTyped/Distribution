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
    * id is the provider-assigned unique ID for this managed resource.
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
}

