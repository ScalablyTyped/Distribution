package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsStartingPositionConfiguration extends js.Object {
  var startingPosition: js.UndefOr[Input[String]] = js.undefined
}

object AnalyticsApplicationInputsStartingPositionConfiguration {
  @scala.inline
  def apply(startingPosition: Input[String] = null): AnalyticsApplicationInputsStartingPositionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (startingPosition != null) __obj.updateDynamic("startingPosition")(startingPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsStartingPositionConfiguration]
  }
}

