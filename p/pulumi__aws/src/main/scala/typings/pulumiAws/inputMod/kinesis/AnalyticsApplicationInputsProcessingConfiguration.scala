package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsProcessingConfiguration extends js.Object {
  /**
    * The Lambda function configuration. See Lambda below for more details.
    */
  var lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda] = js.native
}

object AnalyticsApplicationInputsProcessingConfiguration {
  @scala.inline
  def apply(lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
}

