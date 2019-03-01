package typings
package atPulumiAwsLib.codecommitTriggerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TriggerState extends js.Object {
  val configurationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name for the repository. This needs to be less than 100 characters.
    */
  val repositoryName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val triggers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
    ]
  ] = js.undefined
}

object TriggerState {
  @scala.inline
  def apply(
    configurationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    repositoryName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    triggers: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_BranchesCustomData]]
    ] = null
  ): TriggerState = {
    val __obj = js.Dynamic.literal()
    if (configurationId != null) __obj.updateDynamic("configurationId")(configurationId.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    if (triggers != null) __obj.updateDynamic("triggers")(triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[TriggerState]
  }
}

