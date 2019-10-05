package typings.atPulumiAws.typesInputMod.kinesis

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsProcessingConfiguration extends js.Object {
  var lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]
}

object AnalyticsApplicationInputsProcessingConfiguration {
  @scala.inline
  def apply(lambda: Input[AnalyticsApplicationInputsProcessingConfigurationLambda]): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
}

