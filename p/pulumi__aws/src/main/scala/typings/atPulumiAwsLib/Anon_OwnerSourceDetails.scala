package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerSourceDetails extends js.Object {
  var owner: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var sourceDetails: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[Anon_EventSourceMaximumExecutionFrequency]]
    ]
  ] = js.undefined
  var sourceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_OwnerSourceDetails {
  @scala.inline
  def apply(
    owner: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sourceIdentifier: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    sourceDetails: atPulumiPulumiLib.outputMod.Input[
      js.Array[atPulumiPulumiLib.outputMod.Input[Anon_EventSourceMaximumExecutionFrequency]]
    ] = null
  ): Anon_OwnerSourceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.updateDynamic("sourceIdentifier")(sourceIdentifier.asInstanceOf[js.Any])
    if (sourceDetails != null) __obj.updateDynamic("sourceDetails")(sourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OwnerSourceDetails]
  }
}

