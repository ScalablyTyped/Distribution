package typings
package atPulumiAwsLib.codecommitTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerArgs extends js.Object {
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  val triggers: atPulumiPulumiLib.outputMod.Input[
    js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
  ]
}

object TriggerArgs {
  @scala.inline
  def apply(
    repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    triggers: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
    ]
  ): TriggerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerArgs]
  }
}

