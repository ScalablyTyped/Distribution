package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsApplicationInputsProcessingConfiguration extends js.Object {
  /**
    * The Lambda function configuration. See Lambda below for more details.
    */
  var lambda: AnalyticsApplicationInputsProcessingConfigurationLambda = js.native
}

object AnalyticsApplicationInputsProcessingConfiguration {
  @scala.inline
  def apply(lambda: AnalyticsApplicationInputsProcessingConfigurationLambda): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
}

