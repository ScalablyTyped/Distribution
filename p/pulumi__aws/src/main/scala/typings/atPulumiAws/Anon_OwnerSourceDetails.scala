package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OwnerSourceDetails extends js.Object {
  var owner: Input[String]
  var sourceDetails: js.UndefOr[Input[js.Array[Input[Anon_EventSourceMaximumExecutionFrequency]]]] = js.undefined
  var sourceIdentifier: Input[String]
}

object Anon_OwnerSourceDetails {
  @scala.inline
  def apply(
    owner: Input[String],
    sourceIdentifier: Input[String],
    sourceDetails: Input[js.Array[Input[Anon_EventSourceMaximumExecutionFrequency]]] = null
  ): Anon_OwnerSourceDetails = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
    if (sourceDetails != null) __obj.updateDynamic("sourceDetails")(sourceDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OwnerSourceDetails]
  }
}

