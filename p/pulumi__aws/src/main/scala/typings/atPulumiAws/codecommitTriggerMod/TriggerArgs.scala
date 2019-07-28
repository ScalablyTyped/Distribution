package typings.atPulumiAws.codecommitTriggerMod

import typings.atPulumiAws.Anon_BranchesCustomData
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: Input[String]
  val triggers: Input[js.Array[Input[Anon_BranchesCustomData]]]
}

object TriggerArgs {
  @scala.inline
  def apply(repositoryName: Input[String], triggers: Input[js.Array[Input[Anon_BranchesCustomData]]]): TriggerArgs = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TriggerArgs]
  }
}

