package typings.pulumiAws.triggerMod

import typings.pulumiAws.inputMod.codecommit.TriggerTrigger
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Input[String] = js.native
  val triggers: Input[js.Array[Input[TriggerTrigger]]] = js.native
}

object TriggerArgs {
  @scala.inline
  def apply(repositoryName: Input[String], triggers: Input[js.Array[Input[TriggerTrigger]]]): TriggerArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggerArgs]
  }
}

