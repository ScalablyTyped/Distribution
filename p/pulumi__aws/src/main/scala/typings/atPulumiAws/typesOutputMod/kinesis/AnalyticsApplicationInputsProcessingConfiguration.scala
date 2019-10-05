package typings.atPulumiAws.typesOutputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsApplicationInputsProcessingConfiguration extends js.Object {
  var lambda: AnalyticsApplicationInputsProcessingConfigurationLambda
}

object AnalyticsApplicationInputsProcessingConfiguration {
  @scala.inline
  def apply(lambda: AnalyticsApplicationInputsProcessingConfigurationLambda): AnalyticsApplicationInputsProcessingConfiguration = {
    val __obj = js.Dynamic.literal(lambda = lambda)
  
    __obj.asInstanceOf[AnalyticsApplicationInputsProcessingConfiguration]
  }
}

