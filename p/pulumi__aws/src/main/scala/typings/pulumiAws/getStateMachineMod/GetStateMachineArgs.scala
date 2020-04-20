package typings.pulumiAws.getStateMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStateMachineArgs extends js.Object {
  /**
    * The friendly name of the state machine to match.
    */
  val name: String = js.native
}

object GetStateMachineArgs {
  @scala.inline
  def apply(name: String): GetStateMachineArgs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStateMachineArgs]
  }
}

